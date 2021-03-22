class Node:
	val,left,right = None,None,None
	def __init__(self,x):
		self.val = x

def add( x, root):
	if root == None:
		return Node(x)
	if x < root.val:
		root.left = add(x,root.left)
	elif x > root.val:
		root.right = add(x,root.right)
	return root;

def pre(root, s):
	if root:
		# s+=str(root.val)
		print(root.val)
		pre(root.left,s)
		pre(root.right,s)
	else:
		s+="x"


a = [1,2,3,4,5,6,7,8,9]

root1 = None
root1 = Node(a[0])

for i in a[1:]:
	root1 = add(i,root1)

b = [6,7,8]

root2 = None
root2 = Node(b[0])

for i in b[1:]:
	root2 = add(i,root2)
s=""
s1 = pre(root1,s)
s2 = pre(root2,s)
print(s1,s2)
if s1.contains(s2):
	print(True)
else:
	print(False)
