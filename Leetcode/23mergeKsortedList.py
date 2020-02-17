#https://www.youtube.com/watch?v=xjgev8Z-HeE

from heapq import heapify,heappush,heappop

class Node:
    def __init__(self,val,next = None):
        self.val = val
        self.next = next
 


def merge_list(lists):
    d = {}
    for node in lists:
        cur = node
        while cur:
            if cur.val not in d:
                # head, tail
                d[cur.val] = [cur,cur]
            else:
                d[cur.val][1].next = cur
                d[cur.val][1] = cur
            cur = cur.next
    sorted_keys = sorted(list(d.keys()))
        
    for k in range(len(sorted_keys)-1):
        d[sorted_keys[k]][1].next = d[sorted_keys[k+1]][0]
    if sorted_keys:
        return d[sorted_keys[0]][0]
    else:
        return None 
 
 


five = Node(5)
four = Node(4,five)
one = Node(1,four)

four_2 = Node(4)
three = Node(3,four_2)
one_2 = Node(1,three)

six = Node(6)
two = Node(2,six)
merged = merge_list([one,one_2,two])
print(merge_list(merged))