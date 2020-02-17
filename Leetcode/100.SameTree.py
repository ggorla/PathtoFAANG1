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

    def inorder(self,root):
        
        result = []
        if root:
            result = self.inorder(root.left)
            result.append(root.value)
            result += self.inorder(root.right)
        return result

    def sametree(self,tree1,tree2):
        if  tree1== tree2:
            return True
        else:
            return False



    def isSameTree2(self, p, q):
        #q and p are toot trees with root
        stack = [(p, q)]
        while stack:
            
            node1, node2 = stack.pop()
            print(node1.value)
            if not node1 and not node2:
                continue
            elif None in [node1, node2]:
                return False
            else:
                if node1.value != node2.value:
                    return False
                stack.append((node1.right, node2.right))
                stack.append((node1.left, node2.left))
        return True

root = Node(27)
root.insert(14)
root.insert(35)
root.insert(10)
root.insert(19)
root.insert(31)
root.insert(42)
list2 = root.inorder(root)


root1 = Node(27)
root1.insert(14)
root1.insert(35)
root1.insert(10)
root1.insert(19)
root1.insert(31)
root1.insert(42)

list1 = root1.inorder(root1)
print(root.isSameTree2(root,root1))