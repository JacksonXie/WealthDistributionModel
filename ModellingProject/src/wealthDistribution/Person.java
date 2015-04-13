package wealthDistribution;

public class Person {
	private int age;
    private int wealth;
	private int lifeExpectancy;
	private int metabolism;
	private int vision;
	private int xLocation;
	private int yLocation;
	private int headDirection;
	private int nextXLocation;
	private int nextYLocation;
	
	public Person(int age,int wealth,int lifeExpectancy,int metabolism,int vision,int xLocation,int yLocation,int headDirection,int nextXLocation,int nextYLocation){
		this.setAge(age);
		this.setWealth(wealth);
		this.setLifeExpectancy(lifeExpectancy);
		this.setMetabolism(metabolism);
		this.setVision(vision);
		this.setxLocation(xLocation);
		this.setyLocation(yLocation);
		this.setHeadDirection(headDirection);
		this.setNextXLocation(nextXLocation);
		this.setNextYLocation(nextYLocation);
	}
	public int getWealth() {
		return wealth;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public int getMetabolism() {
		return metabolism;
	}
	public void setMetabolism(int metabolism) {
		this.metabolism = metabolism;
	}
	public int getVision() {
		return vision;
	}
	public void setVision(int vision) {
		this.vision = vision;
	}
	public int getxLocation() {
		return xLocation;
	}
	public void setxLocation(int xLocation) {
		this.xLocation = xLocation;
	}
	public int getyLocation() {
		return yLocation;
	}
	public void setyLocation(int yLocation) {
		this.yLocation = yLocation;
	}
	public int getHeadDirection() {
		return headDirection;
	}

	public void setHeadDirection(int headDirection) {
		this.headDirection = headDirection;
	}
	public int getNextXLocation() {
		return nextXLocation;
	}
	public void setNextXLocation(int nextXLocation) {
		this.nextXLocation = nextXLocation;
	}
	public int getNextYLocation() {
		return nextYLocation;
	}
	public void setNextYLocation(int nextYLocation) {
		this.nextYLocation = nextYLocation;
	}
}