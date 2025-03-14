// 1.	Create a class called Car.
// o	Define properties like make, model, and year.
// o	Add a method to display the car’s information.


import java.util.*;

  class Car {
    String make;
    String model;
    int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
        
    public void display_info(){
      System.out.println("Car was made by "+make+" and model is "+model+" in "+year);
    }
    
  }

public class Main {
    public static void main(String[] args) {
      Car car1 = new Car("Toyota", "R4", 2020);
      car1.display_info();
      
  }
}
