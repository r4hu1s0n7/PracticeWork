a = [[1,3],[2,4],[5,7],[6,8]]
a.sort(key = lambda x: x[0])
l = a[0][0]
r = a[0][1]
f= []
for i in a:
	if i[0] <= r:
		if i[1] > r:
			r = i[1]
	else:
		f.append([l,r])
		l = i[0]
		r = i[1]
f.append([l,r])
print(f)


# sort based on left part
# now add if in range else skip
