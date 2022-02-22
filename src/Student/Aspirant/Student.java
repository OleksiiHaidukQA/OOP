package Student.Aspirant;

public abstract class Student {

    private String firstName; //Имя студента
    private String lastName; // Фамилия студента
    private String group; // Курс обучения
    private double averageMark; // Средняя оценка
    static Student student;

    public static Student getStudent() {
        return student;
    }

    public abstract Student getAspirant();

    {
        student = new Student() {
            @Override
            public Student getAspirant() {
                return null;
            }
        };
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        int result;
        if (averageMark == 5) {
            result = 100;
        } else {
            result = 80;
        }
    }
}