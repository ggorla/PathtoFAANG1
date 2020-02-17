class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class linkedlist:
    def __init__(self):
        self.head = None
    
    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        curr_node = self.head
        while(curr_node.next):
            curr_node = curr_node.next
        curr_node.next = new_node

    def hascycle(self):
        current_node = self.head
        slow = current_node
        fast = current_node.next
        try:
            while slow is not fast:
                slow = slow.next
                fast = fast.next.next
            return True

        except:
            return False

    
llist = linkedlist()
llist.append("a")
llist.append("b")
llist.append("c")
#llist.print()
print(llist.hascycle())

