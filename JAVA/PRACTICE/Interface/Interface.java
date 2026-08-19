import java.util.*;

interface drivable{
  void drive();
}

class Vehicle{
  String brand;
  int speed;

  Vehicle(){
    System.out.println("Constructor vehicle");
  }
  void move(){
    System.out.println("moving");
  }
}

class Car extends Vehicle implements drivable{
  int seats;

  Car(){
    System.out.println("Constructor Car");
  }

  public void drive(){
    System.out.println("driving");
  }
  void display(){
    System.out.println("Displayed");
  }
}
public class Interface {
    public static void main(String[] args) {
      Car obj = new Car();
      obj.move();
      obj.drive();
      obj.display();
    }
}
