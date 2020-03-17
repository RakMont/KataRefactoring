package main.java.parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	ParrotVelocity parrotVelocity = null;
    	switch(type) {
        case EUROPEAN:
        	parrotVelocity=new EuropeanVelocity();
        	break;
        case AFRICAN:
        	parrotVelocity=new AfricanVelocity();
        	break;
        case NORWEGIAN_BLUE:
        	parrotVelocity=new NorwegianBlueVelocity();
        	break;
    	}
    	return parrotVelocity.getParrotSpeed(numberOfCoconuts, voltage, isNailed);

    }

}
