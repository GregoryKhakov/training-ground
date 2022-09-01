package todolist.tasks;

import java.time.*;

public class DraftTask extends Task
{
    LocalDateTime createdAt;

    public DraftTask(int id, String name, String description)
    {
        super(id, name, description);
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }
}
