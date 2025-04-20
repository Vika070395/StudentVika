package by.homework.lessons.task13;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Иван", "Юрьевич", "01.01.2000", "Минск", 9.5);
        Student s2 = new Student("Андрей", "Славомиров", "05.06.2001", "Витебск", 8.7);
        Student s3 = new Student("Галя", "Ивановна", "03.03.2005", "Витебск", 8.0);

        Group group1 = new Group("1");
        group1.addStudent(s1);
        group1.addStudent(s2);

        Group group2 = new Group("2");
        group2.addStudent(s3);

        Faculty faculty = new Faculty("Факультет Информатика");
        faculty.addGroup(group1);
        faculty.addGroup(group2);

        group1.removeStudentsByMark(8.0);
        group2.transferToGroup(group1);

        System.out.println("Средний балл группы: " + group1.calculateAverageMark());
    }
}
