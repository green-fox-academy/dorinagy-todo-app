/**
 * Created by Nagy Dóra on 2017.04.06..
 */
public class ArgumentHandler {
  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public boolean noArgument(String argument) {
    if(args.length == 0) {
      System.out.println();
      System.out.println("Java Todo application");
      System.out.println("=====================");
      System.out.println();
      System.out.println("Command line arguments:");
      System.out.println(" -l  Lists all the tasks");
      System.out.println(" -a  Adds a new task");
      System.out.println(" -r  Removes a task");
      System.out.println(" -c  Completes a task");
      return true;
    }
    return false;
  }

  public boolean contains(String argument) {
    if (args.length > 0) {
      for (String arg : args) {
        if (arg.startsWith("-") && arg.contains(argument))
          return true;
      }
    }
    return false;
  }
}
