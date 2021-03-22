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

def pre(root):
	if root:
		print(root.val)
		pre(root.left)
		pre(root.right)

def subTree(n1, n2):
	if n1 == None:
		return False
	elif n1.val == n2.val and match(n1,n2):
		return True
	return subTree(n1.left,n2) or subTree(n1.right,n2)

# to provide recurse fucntion code it both ways
# learn the way this fucntion work to get if some corner is false then whole output is false otherwise true all they way

def match(n1, n2):
	if n1 == None and n2 == None:
		return True
	elif n1 == None or n2 == None:
		return False
	elif n1.val != n2.val:
		return False
	else:
		return match(n1.left,n2.left) and match(n2.right,n2.right)


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

print(subTree(root1,root2))