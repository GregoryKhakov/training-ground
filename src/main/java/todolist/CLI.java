package todolist;

import todolist.tasks.*;

import java.util.*;

public class CLI
{
    Scanner scanner;
    List<TaskList> taskListsList;

    public CLI()
    {
        this.scanner = new Scanner(System.in);

        // DEBUG

        DraftTask draftTask1 = new DraftTask(1, "черновик 1", "сделать что-то");
        DraftTask draftTask2 = new DraftTask(2, "черновик 2", "сделать что-то");
        DraftTask draftTask3 = new DraftTask(3, "черновик 3", "сделать что-то");

        AssignedTask assignedTask1 = new AssignedTask(4, "назаченная 1", "приступать");
        AssignedTask assignedTask2 = new AssignedTask(5, "назаченная 2", "приступать");
        AssignedTask assignedTask3 = new AssignedTask(6, "назаченная 3", "приступать");

        TaskList taskList = new TaskList(1, "общие задачи");

        taskList.addTask(draftTask1);
        taskList.addTask(draftTask2);
        taskList.addTask(draftTask3);
        taskList.addTask(assignedTask1);
        taskList.addTask(assignedTask2);
        taskList.addTask(assignedTask3);

        taskListsList = new ArrayList<>();
        taskListsList.add(taskList);
    }

    public void menu()
    {
        System.out.println("""
                Выберите команду:
                1. Добавить список
                2. Добавить задачу в список
                3. Вывести задачи из списка по статусу
                4. изменить статус задачи
                """);


        String command = scanner.nextLine();

        switch (command)
        {
            case "3":
                readValuesForPrintTaskCommand();
                break;
            default:
                break;
        }

        menu();
    }

    private void addList(TaskList taskList)
    {

    }

    private void addTask(int listId, Task task)
    {

    }

    private void readValuesForPrintTaskCommand()
    {
        System.out.println("введите id списка");
        int id = scanner.nextInt();

        System.out.println("""
                введите статус задач
                1 - черновики
                2 - назначенные
                3 - выполненные
                """);
        int status = scanner.nextInt();

        Class statusClass = null;

        switch (status)
        {
            case 1:
                statusClass = DraftTask.class;
                break;
            case 2:
                statusClass = AssignedTask.class;
                break;
            case 3:
                statusClass = DoneTask.class;
                break;
            default:
                break;
        }

        printTasksByStatus(id, statusClass);

    }

    private void printTasksByStatus(int listId, Class status)
    {
        TaskList taskList = null;
        for (int i = 0; i < taskListsList.size(); i++)
        {
            if (taskListsList.get(i).id == listId)
                taskList = taskListsList.get(i);
        }

        List<Task> tasksFromList = taskList.getTasksByStatus(status);

        for (int i = 0; i < tasksFromList.size(); i++)
        {
            System.out.println(tasksFromList.get(i).toString());
        }

    }

    private void changeStatus(int listId, int taskId, Class newStatus)
    {

    }
}
