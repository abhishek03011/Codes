
public class DepthMain {

	public DepthMain() {
	
	}

	public static void main(String...args)
	{
		Graph g  = new Graph();
		g.addVertex('a');
		g.addVertex('b');
		g.addVertex('c');
		g.addVertex('d');
		g.addVertex('e');
		g.addVertex('f');
		g.addVertex('g');
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 6);
		g.addEdge(2, 5);
		g.addEdge(3, 4);
		g.addEdge(5, 6);
		
		g.DFS();
	}
}
