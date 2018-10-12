package exp798;

public class Fan {

	private int speed = 1;
	private  boolean on;//by default is false  
	private double raduis = 5;
	private String color = "blue";
	
	public static final int SLOW = 1;
	public static final int MEDUIM = 2;
	public static final int FAST = 3;
	
	public Fan() {

	}

	public Fan(int speed, boolean on, double raduis, String color) {
		this.speed = speed;
		this.on = on;
		this.raduis = raduis;
		this.color = color;
	}



	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", on=" + on + ", raduis=" + raduis + ", color=" + color + "]";
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		
		this.speed = speed;
	}



	public boolean isOn() {
		return on;
	}



	public void setOn(boolean on) {
		this.on = on;
	}



	public double getRaduis() {
		return raduis;
	}



	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	
	
	
	
}