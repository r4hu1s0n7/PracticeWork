graph = {0: [1, 3], 1: [2,3], 2: [], 3: [4], 4:[]}

def bfs(graph, start,dest):

    visited, queue = set(), [start]
    visited.add(start)

    while queue:

        vertex = queue.pop(0)
        print(str(vertex) + " ", end="")

        for neighbour in graph[vertex]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)
    if dest in visited:
    	print("yes")
    else:
    	print("no")

bfs(graph,3,2)
