class Node:
	val,left,right = None,None,None
	def __init__(self,x):
		self.val = x

	def addl(self,parent,child):
		self.parent.left = child
		return Node

	def addr(self,Node,child):
		self.parent.right = child
		return Node

def order(root):
	if root:
		order(root.left)
		print(root.val)
		order(root.right)

# def minBSTc(arr):
# 	return minBST(arr,0,len(arr)-1)

def minBST(arr,start,end):
	if end<start:
		return None
	else:
		m = int((start+end)/2)
		node = Node(arr[m])
		print(arr[m])
		node.left = minBST(arr,start,m-1)
		node.right = minBST(arr,m+1,end)
		return node

a = [1,2,3,4,5,6,7]
# node = minBSTc(a)
node = minBST(a,0,len(a)-1)
order(node)

# use this algo to recurse in tree patern like merge sort
# caller function are not necessary
