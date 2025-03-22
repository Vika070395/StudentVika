package by.homework.lessons.task7;

public class StudentMain {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(1, "Иван", "Иванов", "Физика", 1, "Группа A", 85);
        students[1] = new Student(2, "Светлана", "Петрова", "Математика", 2, "Группа B", 90);
        students[2] = new Student(3, "Алексей", "Сидоров", "Химия", 1, "Группа A", 75);
        students[3] = new Student(4, "Мария", "Кузнецова", "Информатика", 3, "Группа C", 95);
        students[4] = new Student(5, "Дмитрий", "Федоров", "Биология", 2, "Группа B", 80);

        System.out.println("Информация о студентах:");
        for (Student student : students) {
            student.info();
        }
        System.out.println ("");

        System.out.println("Текущая группа студента 3: " + students[2].getGroup());



    }


}
