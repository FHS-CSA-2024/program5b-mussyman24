public class Car {
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car() {
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
        
        
        
        
    }
    
    public Car(String name, double miles, double gallons) {
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
        
    }
    
    public String getName() {
        String n1 = carName;
        
        return n1;
    }
    
    public double getMiles() {
        double m1 = milesDriven;
        
        return m1;
    }
    
    public double getGallons() {
        double g1 = gallonsUsed;
        
        return g1;
    }
    
    public void setName(String newName) {
        carName = newName;
    }
    
    public void setMiles(double newMiles) {
        milesDriven = newMiles;
    }
    
    public void setGallons(double newGallons) {
        gallonsUsed = newGallons;
    }
    
    public double calculateAverage() {
        double avg = milesDriven / gallonsUsed ;
        
        
        return avg;
    }
    
    public String toString() {
        return carName + " averaged " + calculateAverage() + "m/g" ;
    }
    
    
}

