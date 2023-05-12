public class Car {
    public static final int MAX_YEAR = 1900;
    public static final int MAX_PRICE = 200000;
    public static final int MIN_PRICE = 0;

    private String make;
    private String model;
    private BodyType bodyType;  // Should this really be a String.
    private int productionYear;
    private double price;

    public Car(Car source){
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
    }


    public enum BodyType{
        SEDAN, COUPE, HATCHBACK, SUV, TRUCK,VAN
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()){
            throw new IllegalArgumentException("make is null or blank");
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()){
            throw new IllegalArgumentException("model is null or blank");
        }
        this.model = model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if(bodyType == null){
            throw new IllegalArgumentException("bodytype is null");
        }
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if(productionYear < MAX_YEAR){
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year.");
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public void setPrice(double price) {
        if(price<MIN_PRICE || price>MAX_PRICE){
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }
}
