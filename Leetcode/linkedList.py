class Node:
    def __init__(self,data=None,next=None):
        self.data = data
        self.next = next
    
class LinkedList:
    def __init__(self):
        self.head = None
    
    def insert(self, data):
        newNode = Node(data)
        if self.head:
            current  = self.head
            while(current.next):
                current = current.next
            current.next = newNode
        else:
            self.head = newNode

    def printll(self):
        current = self.head
        while(current):
            print(current.data)
            current = current.next

    def reverselist(self):
        if  self.head is None or self.head.next is None:
            return
        prev = None
        cur = self.head
        while cur:
            next_element = cur.next #3
            cur.next = prev         #none
            prev = cur              #1
            cur = next_element      # 3
          
        self.head = prev

ll = LinkedList()
ll.insert(1)
ll.insert(3)
ll.insert(4)
ll.printll()
ll.reverselist()
ll.printll()