s = [75250, 50074, 43659, 8931, 11273,27545, 50879, 77924]
f = [112960, 114515, 81825, 93424, 54316,35533, 73383, 160252]
d = []
for i,j in zip(s,f):
	d.append([i,j,(j-i)])
k = sorted(d, key=lambda x:x[2])
cs=0
cf=0
z=0
print(k)
for i in k:
	if i[0]>cf:
		cs=i[0]
		cf=i[1]
		z+=1

print(z)
	

