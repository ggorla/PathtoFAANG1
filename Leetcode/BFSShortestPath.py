
def bfs_shortest_path(graph,start,goal):
    explored = []
    queue = [start]

    if start == goal:
        return "that was easy"
    while queue:
        print(queue)
        path = queue.pop(0)
        print(path)
        node = path[-1]
        print(path[-1])
        if node not in explored:
            neighbours = graph[node]
            for nebhour  in neighbours:
                new_path = list(path)
                
                new_path.append(nebhour)
                #print(new_path)
                queue.append(new_path)
                #print(queue)
                if nebhour == goal:
                    return new_path
                
            
            explored.append(node)
            

if __name__ == "__main__":
    graph = {'A': ['B', 'C', 'E'],
         'B': ['A','D', 'E'],
         'C': ['A', 'F', 'G'],
         'D': ['B'],
         'E': ['A', 'B','D'],
         'F': ['C'],
         'G': ['C']}
    print(bfs_shortest_path(graph,'A','G'))
    