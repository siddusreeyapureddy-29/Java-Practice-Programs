import heapq

class Graph:
    def __init__(self):
        self.nodes = {}

    def add_edge(self, u, v, weight):
        if u not in self.nodes:
            self.nodes[u] = []
        if v not in self.nodes:
            self.nodes[v] = []
        self.nodes[u].append((v, weight))
        self.nodes[v].append((u, weight))  

    def dijkstra(self, start):
        pq = [(0, start)]  
        distances = {node: float('inf') for node in self.nodes}
        distances[start] = 0

        while pq:
            current_distance, current_node = heapq.heappop(pq)

            if current_distance > distances[current_node]:
                continue

            for neighbor, weight in self.nodes[current_node]:
                distance = current_distance + weight
                if distance < distances[neighbor]:
                    distances[neighbor] = distance
                    heapq.heappush(pq, (distance, neighbor))

        return distances


graph = Graph()
num_edges = int(input("Enter number of edges: "))

print("Enter edges in format: node1 node2 weight")
for _ in range(num_edges):
    u, v, w = input().split()
    graph.add_edge(u, v, int(w))

start_node = input("Enter the starting node: ")
shortest_paths = graph.dijkstra(start_node)


print(f"Shortest distances from {start_node}:")
for node, distance in shortest_paths.items():
    print(f"{node}: {distance}")
