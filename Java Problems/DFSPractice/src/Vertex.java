
public class Vertex {

	private char label;
	private boolean visited;
	public Vertex(char lab) {
		// TODO Auto-generated constructor stub
	this.label = lab;
	this.visited = false;
	}
	public char getLabel() {
		return label;
	}
	public void setLabel(char label) {
		this.label = label;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	

}
