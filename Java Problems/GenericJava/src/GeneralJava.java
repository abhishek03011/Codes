
public class GeneralJava<T1,T2> 
{   
	T1 t; 
	T2 m;
	public GeneralJava(T1 t, T2 m) {
		this.t = t;
		this.m= m;
	}
	public T1 getT() {
		return t;
	}
	public void setT(T1 t) {
		this.t = t;
	}
	public T2 getM() {
		return m;
	}
	public void setM(T2 m) {
		this.m = m;
	}

	public String toString() {
		return "GeneralJava [t=" + t + ", m=" + m + "]";
	}
	
	
	
}
