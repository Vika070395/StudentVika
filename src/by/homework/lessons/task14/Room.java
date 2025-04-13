package by.homework.lessons.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Room {

    private int number;
    private RoomType type;
    private List<Patient> patients;

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
        this.patients = new ArrayList<>();
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            return false;
        }

        if (type == RoomType.MALE && patient.getGender() != Gender.M) {
            return false;
        }
        if (type == RoomType.FEMALE && patient.getGender() != Gender.F) {
            return false;
        }

        if (!patients.isEmpty()) {
            String existingDiagnosis = patients.get(0).getDiagnos();
            if (!existingDiagnosis.equals(patient.getDiagnos())) {
                return false;
            }
        }

        if (!patients.contains(patient)) {
            patients.add(patient);
            return true;
        }

        return false;
    }

    public int countByGender(Gender gender) {
        int count = 0;
        for (Patient p : patients) {
            if (p.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    public void printPatients() {
        System.out.println("Пациенты палаты " + number + ":");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    public List<Patient> getPatients() {
        return patients;  //возврат списка патиентов
    }
}
