k = 999
s = [1,2,5,10,20,50,100,500,1000]
s = reversed(s)
c = []
for i in s:
	if i < k:
		c.append([i,int(k/i)])
		k = k%i
print(c)
