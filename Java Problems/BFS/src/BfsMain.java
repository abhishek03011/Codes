
public class BfsMain {

	public static void main(String...args) 
	{
		Graph bfs = new Graph();
		bfs.addVertex('0');
		bfs.addVertex('1');
		bfs.addVertex('2');
		bfs.addVertex('3');
		bfs.addVertex('4');
		bfs.addVertex('5');
		bfs.addVertex('6');
		bfs.addVertex('7');
		bfs.addVertex('8');
		
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 3);
		bfs.addEdge(0, 8);
		bfs.addEdge(1, 7);
		bfs.addEdge(2, 3);
		bfs.addEdge(2, 5);
		bfs.addEdge(2, 7);
		bfs.addEdge(4, 3);
		bfs.addEdge(4, 8);
		bfs.addEdge(5, 6);

		bfs.BFS();
	}

}
