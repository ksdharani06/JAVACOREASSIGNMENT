class Task {
    int taskId;
    String description;
    int priority; 

    public Task(int taskId, String description, int priority) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{id=" + taskId +
               ", description='" + description + '\'' +
               ", priority=" + priority + '}';
    }
}
