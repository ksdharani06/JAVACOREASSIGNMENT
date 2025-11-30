import java.util.*;

public class TaskManager {
    public static void main(String[] args) {

        
        PriorityQueue<Task> queue = new PriorityQueue<>(
            new Comparator<Task>() {
                @Override
                public int compare(Task t1, Task t2) {
                    return t1.priority - t2.priority;
                }
            }
        );

        
        queue.add(new Task(1, "Fix login bug", 1));
        queue.add(new Task(2, "Write documentation", 3));
        queue.add(new Task(3, "Code review", 2));
        queue.add(new Task(4, "Deploy application", 1));
        queue.add(new Task(5, "Team meeting", 2));

     
        ArrayList<Task> processedTasks = new ArrayList<>();

      
        while (!queue.isEmpty()) {
            Task task = queue.poll(); 
            processedTasks.add(task);
        }

        System.out.println("Tasks processed in completion order:");
        for (Task t : processedTasks) {
            System.out.println(t);
        }
    }
}
