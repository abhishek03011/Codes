
public class nodeClass {
private Object data;
private nodeClass next;
	public nodeClass(Object datavalue) {
		// TODO Auto-generated constructor stub
		this.data = datavalue;
		this.next = null;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public nodeClass getNext() {
		return next;
	}
	public void setNext(nodeClass next) {
		this.next = next;
	}

	
}
