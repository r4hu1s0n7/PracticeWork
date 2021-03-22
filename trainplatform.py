a = [900,  940, 950,  1100, 1500, 1800]
b = [910, 1200, 1120, 1130, 1900, 2000]
d = []
for i in a:
	d.append([i,1])
for i in b:
	d.append([i,0])
k=9999999;c=0;mx=0
print(d)
for i in sorted(d,key=lambda x:x[0]):
	print(i)
	if i[1]==1 and i[0]<k:
		c+=1
	elif i[1]==0:
		c-=1
	if c>mx:
		mx=c
print(mx)
