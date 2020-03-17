package main.java.parrot;

public class AfricanVelocity implements ParrotVelocity{
	 public double getParrotSpeed(int numberOfCoconuts, double voltage, boolean isNailed) {	
		 return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	 }
	 private double getBaseSpeed() {
	        return 12.0;
	    }
	 private double getLoadFactor() {
	        return 9.0;
	    }
}