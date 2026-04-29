import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 1;

        List<String> tasks = new ArrayList<>();
        tasks.add("Looting drop");
        tasks.add("Repair items");
        tasks.add("Return to base");
        tasks.add("Save progress");

        Queue<String> queue = new ArrayDeque<>(tasks);
        int limit = 10;
        while (!queue.isEmpty() && count <= limit) {
            String task = queue.poll();
            System.out.println((count++) + ") In progress: " + task);

            if (task.equals("Looting drop")) {
                System.out.println("Nothing to loot?Kill next monster");
                queue.add("Fight with enemy");
            } else if (task.equals("Repair items")) {
                boolean repaired = false;
                if (!repaired) {
                    System.out.println("Nothing to repair");
                    queue.add("Going to some store or market");
                }
            } else if (task.equals("Return to base")) {
                System.out.println("Heading home...");
            }
            else if (task.equals("Save progress")) {
                System.out.println("Game saved!");
            }
            else if (task.equals("Fight with enemy")) {
                System.out.println("Fighting...");
            }
            else if (task.equals("Going to some store or market")) {
                System.out.println("Buying materials...");
                queue.add("Repair items");
            }
            else {
                System.out.println("Unknown task");
            }
        }
    }
}
