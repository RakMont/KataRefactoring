package main.java.parrot;

public class NorwegianBlueVelocity implements ParrotVelocity{
	public double getParrotSpeed(int numberOfCoconuts, double voltage, boolean isNailed) {	
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	 }
	private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }
	private double getBaseSpeed() {
        return 12.0;
    }
}
