package OOP.Bai4;

public class Staff extends Office{
    private String task;

    public Staff(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff\n" +
                "Task: " + task +
                " - Name: " + name +
                " - Age: " + age +
                " - Gender: " + gender +
                " - Address: " + address ;
    }
}
