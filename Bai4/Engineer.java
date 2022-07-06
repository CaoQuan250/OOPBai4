package OOP.Bai4;

public class Engineer extends Office{
    private String branch;
    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer\n" +
                "Branch: " + branch +
                " - Name: " + name +
                " - Age: " + age +
                " - Gender: " + gender +
                " - Address: " + address ;
    }
}
