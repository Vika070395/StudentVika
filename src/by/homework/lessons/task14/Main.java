package by.homework.lessons.task14;
import java.util.Set;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Кирилл", "Юрьевич", "Лишай", 50, Gender.M);
        Patient p2 = new Patient(2, "Олег", "Олегович", "ГРИПП", 35, Gender.M);
        Patient p3 = new Patient(3, "Сергей", "Сергеев", "Лишай", 30, Gender.M);
        Patient p4 = new Patient(4, "Оля", "Ивановна", "ОРВИ", 33, Gender.F);
        Patient p5 = new Patient(5, "Мария", "Павловна", "ГРИПП", 28, Gender.F);
        Patient p6 = new Patient(2, "Петр", "Петрович", "ГРИПП", 25, Gender.M);

        Room room1 = new Room(11, RoomType.MALE);
        Room room2 = new Room(13, RoomType.FEMALE);

        room1.addPatient(p1);
        room1.addPatient(p2);
        room1.addPatient(p3);
        room1.addPatient(p6);

        room2.addPatient(p4);
        room2.addPatient(p5);

        Department dep = new Department("Отделение Педиатрии");
        dep.addRoom(room1);
        dep.addRoom(room2);

        room1.printPatients();
        room2.printPatients();

        System.out.println("Количество мужчин в отделении: " + dep.countGender(Gender.M));
        System.out.println("Количество женщин в отделении: " + dep.countGender(Gender.F));



    }



}
