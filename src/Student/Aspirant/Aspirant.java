package Student.Aspirant;

public class Aspirant {
    private String firstName; //Имя студента
    private String lastName; // Фамилия студента
    private String group; // Курс обучения
    private double averageMark; // Средняя оценка
    private String PhDwork; //Научная работа Аспиранта

    Aspirant aspirant = new Aspirant();

    public void getScholarship() {
        int result;
        if (averageMark == 5) {
            result = 200;
        }
        else {
            result = 180;
        }
    }
}





