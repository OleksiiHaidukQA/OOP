package Student.Aspirant;

public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Oleksii", "Haiduk", "AQA JAVA",4.7);
        Aspirant aspirant1 = new Aspirant("Ilon", "Mask", "Tesla",5,"MARS");
        Student aspirant2 = new Aspirant("Jeffrey", "Bezos","Amazon",4.9,"AWS");

        Student[] students = {student, aspirant1, aspirant2};
        for (Student s : students) {
            System.out.println(s.getScholarship());
        }

    }
}





