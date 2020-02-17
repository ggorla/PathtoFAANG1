#https://www.tutorialspoint.com/python_data_structure/python_graphs.htm
class graph:
    def __init__(self,gdict=None):
        if gdict is None:
            gdict = {}
        self.gdict = gdict
    
    def getvertices(self):
        return list(self.gdict.keys())

    def getedges(self):
        edgename = []
        for edges in self.gdict:
            for edge in self.gdict[edges]:
                if {edge,edges} not in edgename:
                    edgename.append({edge,edges})
        return edgename

    def addvertix(self,node):
        if node not in self.gdict:
            self.gdict[node] = []

    def addedge(self,edge):
        edge = set(edge)
        (v1,v2) = tuple(edge)
        if v1  in self.gdict[v1]:
            self.gdict[v1].append(v2)
        else:
            self.gdict[v1] = [v2]


    def findedges(self):
        edgename = []
        for edges in self.gdict:
            for edge in self.gdict[edges]:
                if {edge,edges} not in edgename:
                    edgename.append({edge,edges})
        return edgename


graph_elements = { "a" : ["b","c"],
                "b" : ["a", "d"],
                "c" : ["a", "d"],
                "d" : ["e"],
                "e" : ["d"]
                }



g = graph(graph_elements)
#g.addedge({'a','g'})
print(g.findedges())
#print(g.getedges())