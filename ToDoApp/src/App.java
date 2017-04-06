import java.util.Arrays;

/**
 * Created by Nagy Dóra on 2017.04.06..
 */
public class App {
  public static void main(String[] args) {
    ToDoList myToDo = new ToDoList(args);
    ArgumentHandler handler = new ArgumentHandler(args);
    if(args.length == 0) {
      printUsage();
    }

    if(handler.contains("l")) {
      myToDo.getToDo();
    }

    if(handler.contains("a")) {
      myToDo.addToDo(args);
    }

    if(handler.contains("r")) {
      myToDo.removeToDo(args);
    }
  }

  public static void printUsage() {
    System.out.println("Java Todo application");
    System.out.println("=====================");
    System.out.println();
    System.out.println("Command line arguments:");
    System.out.println(" -l   Lists all the tasks");
    System.out.println(" -a   Adds a new task");
    System.out.println(" -r   Removes an task");
    System.out.println(" -c   Completes an task");
  }
}
