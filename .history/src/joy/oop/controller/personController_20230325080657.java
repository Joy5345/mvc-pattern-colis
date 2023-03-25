/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joy.mvc.controller;
import joy.mvc.model.person;
import joy.mvc.view.consoleView;
       
public class personController {
    private person model;
    private consoleView view;
    
    public personController(person model, consoleView view) {
      this.model = model;
      this.view = view;
    }
    
    public void setPersonName(String name) {
      model.setName(name);
    }
    
    public void setPersonAge(int age) {
      model.setAge(age);
    }
    
    public void updateView() {
      view.displayPerson(model);
    }
    
    public void updatePerson(String name, int age) {
      setPersonName(name);
      setPersonAge(age);
      updateView();
    }
  }