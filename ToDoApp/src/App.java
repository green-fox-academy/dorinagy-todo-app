
/**
 * Created by Nagy Dóra on 2017.04.06..
 */
public class App {
  public static void main(String[] args) {
    ToDoList myToDo = new ToDoList();
    ArgumentHandler handler = new ArgumentHandler(args);
    if(handler.contains("l")) {
      myToDo.getFile();
    }
    handler.noArgument("");

  }
}
