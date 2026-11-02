import heapq

def dijkstra(graph, start, vertices):
    distances = {vertex: float('infinity') for vertex in range(vertices)}
    distances[start] = 0
    priority_queue = [(0, start)]

    while priority_queue:
        current_distance, current_vertex = heapq.heappop(priority_queue)

        if current_distance > distances[current_vertex]:
            continue

        for neighbor, weight in graph[current_vertex]:
            distance = current_distance + weight
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(priority_queue, (distance, neighbor))

    return distances

# Input from the programmer
vertices = int(input("Enter the number of vertices: "))
edges = int(input("Enter the number of edges: "))

graph = {i: [] for i in range(vertices)}

print("Enter the edges in the format: source destination weight")
for _ in range(edges):
    source, destination, weight = map(int, input().split())
    graph[source].append((destination, weight))

start_vertex = int(input("Enter the starting vertex: "))
distances = dijkstra(graph, start_vertex, vertices)

print("Shortest distances from the starting vertex:")
for vertex, distance in distances.items():
    print(f"Vertex {vertex}: {distance}")
