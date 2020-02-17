class Node:
    def __init__(self,n):
        self.name = n
        self.neighbors = list()

    def add_neightbor(self,v):
        if v not in self.neighbors:
            self.neighbors.append(v)
            self.neighbors.sort()
class Graph:
    nodes= {}

    def add_node(self,node):
        if isinstance(node,Node) and node.name not in self.nodes:
            self.nodes[node.name]  = node
            return True
        else:
            return False

    def add_edge(self,u,v):
        if u in self.nodes and v in self.nodes:
            for key,value in self.nodes.items():
                if key == u:
                    value.add_neightbor(v)
                if key ==v:
                    value.add_neightbor(u)

            return True
        else:
            return False

    def  print_graph (self):
        for key in sorted(list(self.nodes.keys())):
            print(key+str(self.nodes[key].neighbors))


g = Graph()

a = Node('A')
g.add_node(a)
g.add_node(Node('B'))
for i in range(ord('A'),ord('F')):
    g.add_node(Node(chr(i)))
edges =['AB','BC','AC','AD','CE','DE']
for edge in edges:
    g.add_edge(edge[:1],edge[1:])

g.print_graph()