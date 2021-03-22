a = [['a', 2, 100],  
       ['b', 1, 19], 
       ['c', 2, 27], 
       ['d', 1, 25], 
       ['e', 3, 15]]
s = set()
job = []
mx = 0
for i in sorted(a,key=lambda x:x[2],reverse=True):
	if i[1] not in s:
		s.add(i[1])
		job.append([i[0],i[2]])
		mx += i[2]


print(mx)
print(job)