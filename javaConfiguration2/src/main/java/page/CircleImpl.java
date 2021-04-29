package page;

import org.springframework.stereotype.Component;

@Component("c1")
public class CircleImpl implements Circle {
	private double radius;

	public CircleImpl() {
		this.radius = 0;
	}
	
	public CircleImpl(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return 3.1415 * radius * radius;
	}
}
