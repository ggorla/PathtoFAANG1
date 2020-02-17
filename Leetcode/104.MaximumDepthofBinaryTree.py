from collections import deque 
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

    def pring(self,data):
        res = []
        if data:
            res.append(data.value)
            res += self.pring(data.left)
            res += self.pring(data.right)
        return res

    def maxDepth(self,root):
        depth = 0 
        level =[root] if root else []
        while level:
            depth +=1
            queue = []
            for el in level:
                if el.left:
                    queue.append(el.left)
                if el.right:
                    queue.append(el.right)
            level = queue
        return depth
    
    def maxdepth_1(self,root):
        if not root:
            return 0
        queue = deque([(root,1)])
        while queue:
            curr, val = queue.popleft()
            print(val)
            if curr.left:
                queue.append((curr.left, val+1))
            if curr.right:
                queue.append((curr.right,val+1))
        return val
        
    def maxDepth_recursion(self,root):
        if not root:
            return 0
        return 1+max(self.maxDepth_recursion(root.left), self.maxDepth(root.right))

            

root = Node(27)
root.insert(14)
root.insert(35)
root.insert(10)
root.insert(19)
root.insert(31)
root.insert(42)
print(root.maxDepth_recursion(root))
