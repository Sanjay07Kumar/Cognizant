package DSA.TaskManagementSystem;


public class TaskManagementSystem {

    private TaskNode head;

    public void addTask(Task task) {

        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
            return;
        }

        TaskNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Task searchTask(int taskId) {

        TaskNode current = head;

        while (current != null) {

            if (current.task.taskId == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    public void traverseTasks() {

        TaskNode current = head;

        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task List Empty");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        TaskNode current = head;

        while (current.next != null &&
               current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task Not Found");
        } else {
            current.next = current.next.next;
            System.out.println("Task Deleted");
        }
    }
}