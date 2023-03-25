import joy.mvc.view.consoleView;

import java.util.Scanner;

import joy.mvc.controller.personController;
import joy.mvc.model.person;

public class Main {
  public static void main(String[] args) {
    boolean x = true;
    Scanner scan = new Scanner(System.in);
    person model = new person("Marry Joy", 21);
    consoleView view = new consoleView();
    personController controller = new personController(model, view);
    controller.updateView();
    while (x == true) {
      System.out.println("Do you want to add new Person?");
      System.out.println("Enter: 'Y' for yes and 'N' for no");
      String ans = scan.nextLine();

      if (ans.equalsIgnoreCase("Y")) {
        person newPerson = view.getPersonInput();
        controller.updatePerson(newPerson.getName(), newPerson.getAge());
      } else if (ans.equalsIgnoreCase("N")) {
        System.out.println("Program Ended");
        x = false;
      } else {
        System.out.println("Y and N is only a valid options");
      }
    }
  }
}
  
 