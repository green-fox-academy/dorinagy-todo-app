
/**
 * Created by Nagy Dóra on 2017.04.06..
 */
public class App {
  public static void main(String[] args) {
    ToDoList myToDo = new ToDoList();
    ArgumentHandler handler = new ArgumentHandler(args);
    handler.noArgument("");
    if(handler.contains("l")) {
      myToDo.getFile();
    }
    if(handler.contains("a") && args.length < 3) {
      System.out.println("Unable to add: no task provided");
    }
  }
}
