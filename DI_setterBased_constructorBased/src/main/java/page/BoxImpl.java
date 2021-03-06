package page;

public class BoxImpl {
	private int length;
	private int breadth;
	private int height;
	
	public BoxImpl() {
		System.out.println("BoxImpl() called.");
	}
	public BoxImpl(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		System.out.println("BoxImpl(int,int,int) called.");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//business logic method
	public int calcVolume() {
		return this.length * this.breadth * this.height;
	}
	@Override
	public String toString() {
		return String.format("BoxImpl [length=%s, breadth=%s, height=%s]", length, breadth, height);
	}
}
