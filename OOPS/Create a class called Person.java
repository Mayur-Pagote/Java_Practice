// 2.	Create a class called Person.
// o	Define properties like name, age, and address.
// o	Create a method to print the person’s details.
// o	Create an instance of the Person class and display their details.


class Person{
  String name;
  int age;
  String address;
  
  public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
  
  public void details(){
    System.out.println("Name is "+name+" and age is "+age+" and address is "+address);
  }
  
}

public class Main{
  public static void main(String [] args){
    Person p1 = new Person("Nam-soo",34,"Korean Road");
    p1.details();
  }
}
