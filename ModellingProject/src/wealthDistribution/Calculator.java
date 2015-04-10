package wealthDistribution;

import java.util.Random;

public class Calculator {
	static Random random = new Random();
	public static int getLifeExpectancy(int lifeExpectancyMax,int lifeExpectancyMin){
		int lifeExpectancy = lifeExpectancyMin + random.nextInt(lifeExpectancyMax-lifeExpectancyMin+1);
		return lifeExpectancy;
	}
	public static int getAge(int lifeExpectancy){
		int age = random.nextInt(lifeExpectancy);
		return age;
	}
	public static int getMetabolism(int metabolismMax){
		int metabolism = 1 + random.nextInt(metabolismMax);
		return metabolism;
	}
	public static int getVision(int maxVision){
		int vision = 1 + random.nextInt(maxVision);
		return vision;
	}
	public static int getXLocation(int xLocationMax){
		int xLocation = random.nextInt(xLocationMax);
		return xLocation;
	}
	public static int getYLocation(int yLocationMax){
		int yLocation = random.nextInt(yLocationMax);
		return yLocation;
	}
	public static int getHeadDirection(){
		int headDirection = random.nextInt(4);
		return headDirection;
	}
	public static int getWealth(int metabolism){
		int wealth = metabolism + random.nextInt(50);
		return wealth;
	}
	public static int getGrainHere(double percentBestLand,int maxGrain){
		int grainHere = 0;
		double percent = 100*random.nextDouble();
		if(percent<=percentBestLand){
			grainHere = maxGrain;
		}
		return grainHere;
	}
	public static int[] sortWealth(int[]){
	}
}
