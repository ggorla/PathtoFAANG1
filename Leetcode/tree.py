class Node:
    def __init__(self,value):
        self.value = value
        self.left = None
        self.right = None


    def insert(self,data):
        if data <self.value:
            if self.left is None:
                self.left = Node(data)
            else:
                self.left.insert(data)
        elif data >self.value:
            if self.right  is None:
                self.right = Node(data)
            else:
                self.right.insert(data)
        else:
            self.value = data

    def printtree(self):
        if self.left:
            self.left.printtree()
        print(self.value)
        if self.right:
            self.right.printtree()
        

    def inorder(self,root):
        res = []
        if root:
           res = self.inorder(root.left)
           res.append(root.value)
           res = res+self.inorder(root.right)
        return res
        
    def preorder(self,root):
        res = []
        if root:
            res.append(root.value)
            res += self.inorder(root.left)
            res += self.inorder(root.right)
        return res

    def  postorder(self,root):
        res = []
        if root:
            res = self.inorder(root.left)
            res += self.inorder(root.right)
            res.append(root.value)
        return res

    def maxDepth(self,root):
        print(root.left)

root = Node(27)
root.insert(14)
root.insert(35)
root.insert(10)
root.insert(19)
root.insert(31)
root.insert(42)
print(root.inorder(root))   