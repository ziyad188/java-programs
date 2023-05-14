package Model;

public class Centrifuge extends LabEquipment{
    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        this.maxRPM = maxRPM;
    }
    public Centrifuge(Centrifuge source){
        super(source);
        setMaxRPM(source.maxRPM);
    }
    public LabEquipment clone(){
        return new Centrifuge(this);
    }

    public static final int MAX_RPM = 500;
    private int maxRPM;

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM<MAX_RPM){
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }
    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

}
