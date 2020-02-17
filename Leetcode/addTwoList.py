
class ListNode:
    def __init__(self, x):
         self.val = x
         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        p1 = l1
        p2 = l2
        
        curr = head = ListNode(0)
        currentcarry =0
        
        while p1 or p2 or currentcarry:
            
            currentval = currentcarry
            currentval += 0 if p1 is None else p1.val
            currentval += 0 if p2 is None else p2.val
            if currentval>=10:
                currentval -=10
                currentcarry = 1
            else:
                currentcarry = 0
            
            curr.next = ListNode(currentval)
            curr = curr.next
            
            if p1 is None and p2 is None:
                break
            elif p1 is None:
                p2 = p2.next
            elif p2 is None:
                p1 = p1.next
            else:
                p1 = p1.next
                p2 = p2.next
        print(head.next)
        return head.next

def linked_list_str(l):
    if l is None:
        return ''
    return str(l.val) + '->' + linked_list_str(l.next)


l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)

l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(8)

s = Solution()
l3 = s.addTwoNumbers(l1,l2)
print(linked_list_str(l3))