package Model;

public class Microscope extends LabEquipment {
    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        this.magnification = magnification;
    }
    public  Microscope(Microscope source){
        super(source);
        setMagnification(source.magnification);
    }
    public LabEquipment clone(){
        return new Microscope(this);
    }

    public static final int MIN_MAG = 1;
    private int magnification;

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        if(magnification< MIN_MAG){
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }
    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

}
