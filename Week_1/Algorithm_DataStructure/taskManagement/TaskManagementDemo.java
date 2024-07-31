package taskManagement;

public class TaskManagementDemo {
	public static void main(String[] args) {
        TaskLinkedList taskLinkedList = new TaskLinkedList();

        // Adding tasks
        taskLinkedList.addTask(new Task("101", "Design Homepage", "In Progress"));
        taskLinkedList.addTask(new Task("102", "Develop Backend", "Not Started"));
        taskLinkedList.addTask(new Task("103", "Write Documentation", "Completed"));

        // Searching for a task
        Task foundTask = taskLinkedList.searchTask("102");
        if (foundTask != null) {
            System.out.println("Task found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Traversing and displaying all tasks
        System.out.println("All tasks:");
        taskLinkedList.traverseTasks();

        // Deleting a task
        taskLinkedList.deleteTask("102");

        // Traversing and displaying all tasks after deletion
        System.out.println("All tasks after deletion:");
        taskLinkedList.traverseTasks();
    }
}
