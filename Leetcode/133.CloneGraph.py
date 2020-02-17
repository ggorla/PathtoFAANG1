from collections import deque
graph ={}
def dfs(start):
    explored = []
    queue = [start]
    while queue:
        node =queue.pop(0)
        if node not in explored:
            explored.append(node)
            neighbours = graph[node]
            for neibh in neighbours:
                queue.append(neibh)
        return explored


# Definition for a Node.
class Node:
    def __init__(self, val, neighbors):
        self.val = val
        self.neighbors = neighbors

from collections import deque
class Solution:
    def cloneGraph(self, node: 'Node') -> 'Node':
        q = deque([node])
        mapping ={node : Node(node.val,[])}
        while q:
            n =q.popleft()
            for i in n.neighbors:
                if i not in mapping:
                    mapping[i] = Node(i.val,[])
                    q.append(i)
                mapping[n].neighbors.append(mapping[i])
        return mapping[node]