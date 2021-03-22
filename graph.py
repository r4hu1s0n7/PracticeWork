graph = {'0': set(['1', '2']),
         '1': set(['0', '3', '4']),
         '2': set(['0']),
         '3': set(['1']),
         '4': set(['2', '3'])}
graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}

def dfs(graph,start,visited):
	print(start)
	visited.add(start)
	for i in graph[start]:
		if i not in visited:
			dfs(graph,i,visited)



def bfs(graph, start):

    visited, queue = set(), [start]
    visited.add(start)

    while queue:

        vertex = queue.pop(0)
        print(str(vertex) + " ", end="")

        for neighbour in graph[vertex]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)
	



visited = set()
#dfs(graph,'0',visited)
bfs(graph,0)




