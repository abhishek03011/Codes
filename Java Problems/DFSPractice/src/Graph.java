import java.util.Stack;

public class Graph {

	private Vertex[] vertexList;
	private int adjMatrix[][];
	private int vertexCount;
	private final int maxvertex = 20;
	private Stack<Integer> thestack;
	public Graph() 
	{
	vertexList = new Vertex[maxvertex];
	adjMatrix = new int[maxvertex][maxvertex];
	vertexCount = 0;
	for(int i =0 ;i<maxvertex;i++)
		for(int j = 0; j<maxvertex;j++)
			adjMatrix[i][j]= 0;
	
	thestack = new Stack<Integer>();
	}
	
	
	public void addVertex(char lab)
	{
		vertexList[vertexCount++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end)
	{
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].getLabel());
	}
	
	public int getAdjUnvisitedmatrix(int v)
	{
		for(int i = 0; i<vertexCount;i++)
		{
			if(adjMatrix[v][i] == 1 && vertexList[i].isVisited() == false)
				return i;
		}
	return -1;	
	}
	
	public void DFS()
	{
		vertexList[0].setVisited(true);
		displayVertex(0);
		thestack.push(0);
		while(!thestack.isEmpty())
		{
			int v = getAdjUnvisitedmatrix(thestack.peek());
			if(v==-1)
				thestack.pop();
			else
			{
				vertexList[v].setVisited(true);
				displayVertex(v);
				thestack.push(v);
			}
		}
		for(int i = 0; i<vertexCount;i++)
		{
			vertexList[i].setVisited(false);
		}
	}
	
}
