package joy.oop.view;

import java.util.Scanner;
import joy.oop.model.person;
public class consoleView {
    
  public void displayPerson(person p) {
    System.out.println("Name: " + p.getName());
    System.out.println("Age: " + p.getAge());
  }
  
  public person getPersonInput() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    
    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    
    return new person(name, age);
  }
}