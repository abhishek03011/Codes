import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	public static int counter = 0;
	private Vertex[] vertexList;
	private int adjMatrix[][];
	private int vertexCount;
	private int maxVertices = 20;
	private Queue<Integer> theQueue;
	
	public Graph() 
	{
	vertexCount = 0;
	vertexList = new Vertex[maxVertices];
	adjMatrix = new int[maxVertices][maxVertices];
	for(int i = 0;i<maxVertices;i++)
		for(int j = 0; j< maxVertices;j++)
			adjMatrix[i][j] = 0;
	
	theQueue = new LinkedList<Integer>();
	}
	
	public void addVertex(char lab)
	{
		vertexList[vertexCount++] = new Vertex(lab);
	}
	
	public void addEdge(int start,int end)
	{
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public int adjMatrixUnvisitedElement(int v){
		for(int i=0;i<vertexCount;i++)
			if(adjMatrix[v][i]==1 && vertexList[i].visited==false)
				return i;
		return -1;
	}

	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label + ",");
	}
	void BFS()
	{
		vertexList[0].visited = true;
		displayVertex(0);
		theQueue.offer(0);
		int v2;
		while(!theQueue.isEmpty())
		{
			int v1 = theQueue.remove();
			while((v2= adjMatrixUnvisitedElement(v1))!=-1)
			{
				vertexList[v2].visited = true;
				displayVertex(v2);
				theQueue.offer(v2);
			}
					
		}
		
		for(int j = 0; j<vertexCount;j++ )
				vertexList[j].visited= false;
	}
	
	public void count()
	{
		System.out.println();
		System.out.println(vertexCount);
	}
}
