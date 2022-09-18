public class Student {
    private String name;
    private int ID = 1;
    private int marks = 0;

    String JUNIOR;
    String SOPHOMORE;
    String SENIOR;

    private String status = JUNIOR;

    public Student() {
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Student(String name, int ID, String status) {
        this.name = name;
        this.ID = ID;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getMarks() {
        return marks;
    }

    public String getJUNIOR() {
        return JUNIOR;
    }

    public String getSOPHOMORE() {
        return SOPHOMORE;
    }

    public String getSENIOR() {
        return SENIOR;
    }

    public String getStatus() {
        return status;
    }

    public void addMarks(int marks){

    }
    public String toString(){
        return "Student name is "+this.name+", his id is "+Integer.toString(this.ID)+ ", marks is " + Integer.toString(this.marks)+ ", status is " + Integer.toString(this.status);
    }
}
