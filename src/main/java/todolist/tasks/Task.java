package todolist.tasks;

import todolist.*;

import java.util.*;

public class Task implements HasTags
{
    int id;
    String name;
    String description;
    Attachment attachment;
    TaskType taskType;
    List<String> tags;

    public Task(int id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "ид: " + id + ", название: " + name + ", описание: " + description;
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Attachment getAttachment()
    {
        return attachment;
    }

    public void setAttachment(Attachment attachment)
    {
        this.attachment = attachment;
    }

    public TaskType getTaskType()
    {
        return taskType;
    }

    public void setTaskType(TaskType taskType)
    {
        this.taskType = taskType;
    }

    public void setTags(List<String> tags)
    {
        this.tags = tags;
    }

    @Override
    public List<String> getTags()
    {
        return tags;
    }
}
