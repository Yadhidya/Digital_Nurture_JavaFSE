package Task_Management_System;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(
                new Task(101,
                        "Design UI",
                        "Pending"));

        manager.addTask(
                new Task(102,
                        "Write Backend",
                        "In Progress"));

        manager.addTask(
                new Task(103,
                        "Testing",
                        "Pending"));

        manager.addTask(
                new Task(104,
                        "Deployment",
                        "Not Started"));

        System.out.println("Initial Tasks");
        manager.display();

        System.out.println();

        System.out.println(
                "Search Task 102: "
                + manager.searchTask(
                        new Task(102,"","")));

        System.out.println();

        manager.delete(103);

        System.out.println(
                "\nAfter Deleting Task 103");

        manager.display();
    }
}