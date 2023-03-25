import joy.mvc.view.consoleView;
import joy.oop.controller.personController;
import joy.oop.model.person;
public class Main {
    public static void main(String[] args) {
      person model = new person("John Doe", 30);
      consoleView view = new consoleView();
      personController controller = new personController(model, view);
      
      controller.updateView();
      
      person newPerson = view.getPersonInput();
      controller.updatePerson(newPerson.getName(), newPerson.getAge());
    }
  }
  
 