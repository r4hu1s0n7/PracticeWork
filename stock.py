a = [7,6,4,3,1]
mx = 0
mi = 99999
for i in a:
	mi = min(mi,i)
	mx = max(mx, i-mi)
print(mx)