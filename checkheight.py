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

def order(root):
	if root:
		order(root.left)
		print(root.val)
		order(root.right)

def minheight(node):
	if node == None:
		return 0
	else:
		return min(minheight(node.left),minheight(node.right)) + 1

def maxheight(node):
	if node == None:
		return 0
	else:
		return max(maxheight(node.left),maxheight(node.right)) + 1

a = [1,2,3,4,5,6,7,8,9]

root = None
root = Node(a[0])

for i in a[1:]:
	root = add(i,root)
	
i = minheight(root)
j = maxheight(root)

print("left",i,"right",j)
order(root)