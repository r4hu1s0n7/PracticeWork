class Node:
	val,left,right,parent = None,None,None,None

	def __init__(self,x):
		self.val = x

def add( x, root):
	if root == None:
		return Node(x)
	if x < root.val:
		kid = add(x,root.left)
		root.left = kid
		kid.parent = root
	elif x > root.val:
		kid = add(x,root.right)
		root.right = kid
		kid.parent = root
	return root

def order(root):
	if root:
		order(root.left)
		print(root.val)
		order(root.right)

def leftmost(n):
	if n:
		while(n.left != None):
			n = n.left
	return n

def nextsuccesor(n):
	if n:
		if n.right is not None:
			return leftmost(n.right)
		else:
			q = n
			x = q.parent
			while x!= None and x.left != q:
				q = x
				x = x.parent
			return x

a = [7,6,4,0,5,8,1,2,3,9]

root = None
root = Node(a[0])

for i in a[1:]:
	root = add(i,root)
print(nextsuccesor(root).val)

# freecodecamp.org
# iterative approach is way in cs
# roadmap.now.sh
