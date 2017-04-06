import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.06..
 */
public class ToDoList {
  String[] args;

  public ToDoList(String[] args) {
    this.args = args;
  }

  public void getToDo() {
    try {
      Path filePath = Paths.get("../files/data.txt");
      List<String> lines = Files.readAllLines(filePath);
      List<String> myList = new ArrayList<>();

      if (lines.isEmpty()) {
        System.out.println("No todos for today! :)");
      } else {
        for (String line : lines) {
          myList.add(line);
        }

        int number = 1;
        for (String line : myList) {
          System.out.println(number + " - " + line);
          number++;
        }
      }

    } catch (Exception e) {
      System.out.println("Error" + e.getClass());
    }
  }

  public void addToDo(String[] args) {
    if (args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else {
      try {
        Path filePath = Paths.get("../files/data.txt");
        List<String> newToDo;
        newToDo = Files.readAllLines(filePath);
        newToDo.add(newToDo.size(), args[1]);
        Files.write(filePath, newToDo);
      } catch (Exception e) {
        System.out.println("Error" + e.getClass());
      }
    }
  }

  public void removeToDo(String[] args){
    if (args.length == 1) {
      System.out.println("Unable to remove: no index provided");
    }
  }
}
