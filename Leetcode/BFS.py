def bfs_connected(graph,start):
    explored = []
    queue = [start]

    while queue:
        node = queue.pop(0)
        
        if node not in explored:
            explored.append(node)
            neighbours = graph[node]
            
            for neighbours in neighbours:
                queue.append(neighbours)

    return explored


if __name__ == "__main__":
    graph = {'A': ['B', 'C', 'E'],
         'B': ['A','D', 'E'],
         'C': ['A', 'F', 'G'],
         'D': ['B'],
         'E': ['A', 'B','D'],
         'F': ['C'],
         'G': ['C']}
    print(bfs_connected(graph,'A'))
    