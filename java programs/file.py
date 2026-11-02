e=[]
p=[]
ut=0
n=int(input("enter no.of processes:"))
for i in range(n):
    e.append(float(input("enter execution time for p"+str(i+1)+":")))
    p.append(float(input("enter the period time p"+str(i+1)+":")))
y=n
y=y*((pow(2.0,1/y))-1)
u=y
if(ut<u):
    print(ut,"<",u)
    print("system can be schedulable")
else:
    print("cannot be schedulable")
    
