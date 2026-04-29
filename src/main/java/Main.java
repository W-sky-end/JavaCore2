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

        while (!queue.isEmpty()) {
            String task = queue.poll();
            System.out.println((count++)+ ")In progress: " + task);
        }
    }
}
