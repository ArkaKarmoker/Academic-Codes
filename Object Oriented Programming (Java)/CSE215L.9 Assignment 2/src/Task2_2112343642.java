public class Task2_2112343642 {
    public static void main(String[] args) {
        Person person = new Person("AB", "123, ABCD", "12333333333", "abc12@gmail.com");

        Student student = new Student("CD", "456, EFGH", "12344444444", "def34@gmail.com", Student.FRESHMAN);

        Employee employee = new Employee("EF", "789, IJKL", "12345555555", "ghi56@gmail.com", 850, 56000);

        Faculty faculty = new Faculty("GH", "101, MNOP", "12345666666", "jkl78@gmail.com", 206, 65000, "1pm to 3pm", "Professor");

        Staff staff = new Staff("IJ", "112, QRST", "12345677777", "mno91@gmail.com", 14, 70000, "Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}