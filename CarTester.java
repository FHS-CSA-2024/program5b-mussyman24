import java.util.Scanner;

public class CarTester {
    
    public static Car addCar() {
        
        System.out.println("Enter car name: ");
        Scanner nameScanner = new Scanner(System.in);
        String name1 = nameScanner.nextLine();
        
        System.out.println("Enter car miles: ");
        Scanner mileScanner = new Scanner(System.in);
        double miles1 = mileScanner.nextDouble();
        
        System.out.println("Enter car gallons: ");
        Scanner gallonScanner = new Scanner(System.in);
        double gallons1 = gallonScanner.nextDouble();
        
        Car car1 = new Car(name1, miles1, gallons1);
        return car1;
    }
    
    public static void main(String[] args) {
        
        Car car2 = addCar();
        System.out.println(car2);
        
        Car car3 = addCar();
        System.out.println(car3);
    }
    
    
    
    
}

/* 
Enter car name: 
mazda
Enter car miles: 
100
Enter car gallons: 
10
mazda averaged 10.0m/g
*/
