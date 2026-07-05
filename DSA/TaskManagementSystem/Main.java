package DSA.TaskManagementSystem;

public class Main {

    public static void main(String[] args) {

        TaskManagementSystem taskList =new TaskManagementSystem();

        taskList.addTask(new Task(101,"Design Database","Pending"));

        taskList.addTask(new Task(102,"Develop API","In Progress"));

        taskList.addTask(new Task(103,"Testing","Pending"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch Task:");
        Task task = taskList.searchTask(102);

        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println("\nDeleting Task 102");
        taskList.deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        taskList.traverseTasks();
    }
}