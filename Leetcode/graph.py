class graph:
    graph_dict={}

    def addEdge(self, node, nei):
        if node not in self.graph_dict:
            self.graph_dict[node] = [nei]
        else:
           self.graph_dict[node].append(nei)

    def show_edges(self):
        for node in self.graph_dict:
            for nei in self.graph_dict[node]:
                print( node, nei)

    def bfs(self,node):
        explored = []
        queue = [node]
        while(queue):
            node = queue.pop(0)
            explored.append[node]
            for nei in graph[node]
        
                
UndirectedGraphNode 


g= graph()
g.addEdge('1', '2')
g.addEdge('1', '3')
g.addEdge('2', '3')
g.addEdge('2', '1')
g.addEdge('3', '1')
g.addEdge('3', '2')
g.addEdge('3', '4')
g.addEdge('4', '3')
g.show_edges()
g.bfs('1')