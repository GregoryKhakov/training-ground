package todolist.tasks;

import java.time.*;

public class AssignedTask extends Task
{
    LocalDateTime assignedAt;
    LocalDateTime deadline;

    public AssignedTask(int id, String name, String description)
    {
        super(id, name, description);
    }

    public LocalDateTime getAssignedAt()
    {
        return assignedAt;
    }

    public void setAssignedAt(LocalDateTime assignedAt)
    {
        this.assignedAt = assignedAt;
    }

    public LocalDateTime getDeadline()
    {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline)
    {
        this.deadline = deadline;
    }
}
