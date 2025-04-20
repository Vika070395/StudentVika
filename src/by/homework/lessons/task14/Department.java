package by.homework.lessons.task14;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Department {

    private String name;
    private Set<Room> rooms;

    public Department(String name) {
        this.name = name;
        this.rooms = new HashSet<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }


    //  подсчет пациентов по полу в одной комнате
    public  int countPatientsByGender(List<Patient> patients, Gender gender) {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    // подсчет общего количества пациентов по полу
    public int countGender(Gender gender) {
        int totalCount = 0;

        for (Room room : rooms) {
            List<Patient> patients = room.getPatients(); // Получение пациентов из палаты
            totalCount += countPatientsByGender(patients, gender);
        }

        return totalCount;
    }
}

