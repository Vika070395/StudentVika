package by.homework.lessons.task7;

public class Student {

    // поля класса
    public int id;
    public String name;
    public String surname;
    public String faculty;
    public int course;
    public String group;
    public int averageRating;

    // Конструктор с параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int averageRating) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageRating = averageRating;
    }
//  Конструктор без

    public Student() {
    }

    // Метод для вывода информации о студенте
    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + averageRating);
    }

    public void changeGroup(String newGroup) {
        group = newGroup;
        System.out.println("Новая группа: " + newGroup);
    }

    public String getGroup() {
        return group;
    }

    public void changeRatingAndGroup(int newRating, String newGroup) {
        averageRating = newRating;
        group = newGroup;
        System.out.println("Rating: " + newRating + "group: " + newGroup);
    }

    public Student[] getStudent(Student[] studentArray, int Rating) {
        int count = 0;
        for (Student studentWithHigherRating : studentArray) {
            if (studentWithHigherRating.averageRating > Rating) {
                count++;
            }}


            Student[] result = new Student[count];
            int index = 0;
            for (Student studentWithHigherRating : studentArray) {
                if (studentWithHigherRating.averageRating > Rating) {
                    result[index] = studentWithHigherRating;
                    index++;
                }
            }


            return result;
        }
    }