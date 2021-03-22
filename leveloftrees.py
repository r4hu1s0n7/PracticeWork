class Node:
	val,left,right,rightside = None,None,None,None

	def __init__(self,x):
		self.val = x

def add( x, root):
	if root == None:
		return Node(x)
	if x < root.val:
		root.left = add(x,root.left)
	elif x > root.val:
		root.right = add(x,root.right)
	return root

def bfs(root):
	queue = []
	queue.append(root)
	queue.append(None)
	while queue:
		k = queue.pop(0)
		
		if k:
			k.rightside = queue[0]
			if k.left:
				queue.append(k.left)	
			if k.right:
				queue.append(k.right)
		elif queue:
			queue.append(None)


def order(root):
	if root:
		order(root.left)
		print(root.val)
		order(root.right)

a = [5,6,4,0,7,8,1,2,3,9]

root = None
root = Node(a[0])

for i in a[1:]:
	root = add(i,root)
bfs(root)
order(root)





# can binary tree handle repeated input
