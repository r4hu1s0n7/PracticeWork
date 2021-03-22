class Node:
	val,left,right = None,None,None
	def __init__(self,x):
		self.val = x

class BST:
	root = None
	def __init__(self):
		self.root = None

	def m_add(self, x, root):
		if root == None:
			return Node(x)
		if x < root.val:
			root.left = self.m_add(x,root.left)
		elif x > root.val:
			root.right = self.m_add(x,root.right)
		return root;
	def add(self, x):
		self.root = self.m_add(x, self.root);

	def m_order(self, root):
		if root:
			self.m_order(root.left)
			print(root.val)
			self.m_order(root.right)

	def order(self):
		self.m_order(self.root)


def minheight(node):
	if node == None:
		return 0
	else:
		return min(minheight(node.left),minheight(node.right)) + 1

def maxheight(node):
	if node == None:
		return 0
	else:
		return min(maxheight(node.left),maxheight(node.right)) + 1


a = [11,12,3,10,5,1,2,7,5,0,8,4,9]

something = BST()
for i in a[0:]:
	print("Adding " , i)
	something.add(i)
# i = minheight(a)
# j = maxheight(a)

something.order()