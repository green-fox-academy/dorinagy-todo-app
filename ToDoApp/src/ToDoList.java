import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nagy Dóra on 2017.04.06..
 */
public class ToDoList {

    public void getFile() {
    try {
      Path filePath = Paths.get("../files/data.txt");
      List<String> lines = Files.readAllLines(filePath);
      List<String> myList = new ArrayList<>();

      if(lines.isEmpty()) {
        System.out.println("No todos for today! :)");
      } else {
        for (String line : lines) {
          myList.add(line);
        }

        int number = 1;
        for(String line : myList) {
          System.out.println(number + " - " + line);
          number++;
        }
      }

    } catch(Exception e) {
      System.out.println("Error" + e.getClass());
    }
  }
  public void addNewTask(String inputString) {
    ToDoList newToDo = new ToDoList();
    try {
      Path filePath = Paths.get("../files/data.txt");
      List<String> lines2 = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    List<String> newList = new ArrayList<>();
    newList.add(3, inputString);
  }
}
