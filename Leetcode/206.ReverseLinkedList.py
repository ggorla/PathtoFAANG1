#https://www.youtube.com/watch?v=xFuJI29BiDY
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node =Node(data)
        if self.head is None:
            self.head = new_node
            return
        curr_node = self.head
        while curr_node.next:
            curr_node = curr_node.next
        curr_node.next = new_node


    def prepend(self, curr_node, new_node):
        if not curr_node:
            return

        add_node = Node(new_node)
        new_node.next = curr_node.next
        curr_node.next = new_node

# a->b->c
#  c->b->a
    def print_helper(self, node, name):
        if node is None:
            print(name + ": None")
        else:
            print(name + ":" + node.data)
    

    def reverese_list(self):
        prev = None
        curr = self.head
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        self.head = prev
    

    def print(self):
        curr_node = self.head
        while curr_node:
            print(curr_node.data)
            curr_node = curr_node.next

llist = LinkedList()
llist.append("a")
llist.append("b")
llist.append("c")
#llist.print()
llist.reverese_list()
llist.print()
