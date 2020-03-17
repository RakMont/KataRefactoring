package main.java.parrot;

public class EuropeanVelocity implements ParrotVelocity{
	public double getParrotSpeed(int numberOfCoconuts, double voltage, boolean isNailed) {	
		return getBaseSpeed();
	 }
	private double getBaseSpeed() {
        return 12.0;
    }
}
