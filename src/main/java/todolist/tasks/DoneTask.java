package todolist.tasks;

import java.time.*;

public class DoneTask extends AssignedTask
{
    LocalDateTime finishedAt;

    public DoneTask(int id, String name, String description)
    {
        super(id, name, description);
    }

    public LocalDateTime getFinishedAt()
    {
        return finishedAt;
    }

    public void setFinishedAt(LocalDateTime finishedAt)
    {
        this.finishedAt = finishedAt;
    }
}
