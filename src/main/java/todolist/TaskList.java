package todolist;

import todolist.tasks.*;

import java.util.*;

public class TaskList
{
    int id;
    String name;
    List<String> tags;
    List<Task> tasks;

    public TaskList(int id, String name)
    {
        this.name = name;
        this.id = id;
        tags = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksByStatus(Class status)
    {
        List<Task> filtered = new ArrayList<>();

        for (int i = 0; i < tasks.size(); i++)
        {
            if (tasks.get(i).getClass() == status)
                filtered.add(tasks.get(i));
        }

        return filtered;
    }

    public void changeStatus(int taskId, Class newStatus)
    {

    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<String> getTags()
    {
        return tags;
    }

    public void setTags(List<String> tags)
    {
        this.tags = tags;
    }

    public List<Task> getTasks()
    {
        return tasks;
    }

    public void setTasks(List<Task> tasks)
    {
        this.tasks = tasks;
    }
}
