package transformation;

public class PolarToCartesian2D {
	public static double getCoordinateX(double radius, double angle) {
		return radius * Math.cos(angle);
	}
	
	public static double getCoordinateY(double radius, double angle) {
		return radius * Math.sin(angle);
	}
}
