from collections import deque

graph = {'A': ['B'],

             'B': ['C', 'D'],
             'C': ['D'],
             'D': ['C'],
             'E': ['F'],
             'F': ['C']}

def find_all_paths(graph,start,end,path=[]):
    path = path + [start]
    if start == end:
        return [path]
    if start not in graph:
        return []
    paths = []
    for node in graph[start]:
        if node not in path:
            newpaths = find_all_paths(graph, node, end, path)
            for newpath in newpaths:
                paths.append(newpath)
    return paths

def find_path(graph, start, end, path=[]):
    path = path + [start]
    if start == end: # this is the breaking point of result
        return path
    if start not in graph:
        return None
    
    for node in graph[start]:
        if node not in path:
            newpath = find_path(graph, node, end, path)
            if newpath: return newpath
        return None

if __name__ == "__main__":
    print(find_path(graph,'A','C'))