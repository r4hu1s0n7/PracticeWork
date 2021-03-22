class Node:
	def __init__(self,key):
		self.left = None
		self.right = None
		self.val = key

def order(root):
	if root:
		order(root.left)
		print(root.val)
		order(root.right)

def pre(root):
	if root:
		print(root.val)
		pre(root.left)
		pre(root.right)

def post(root):
	if root:
		post(root.left)
		post(root.right)
		print(root.val)

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

order(root)
print("-")
pre(root)
print("-")
post(root)