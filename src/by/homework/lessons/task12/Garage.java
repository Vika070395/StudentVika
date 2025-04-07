package by.homework.lessons.task12;

public class Garage<T extends Vehicle> {

    private T vehicle;

    public void addVehicle(T vehicle) {
        this.vehicle = vehicle;
    }


    public boolean isEntryPermitted() {
        return vehicle.getEmissions() <= 100; // проверка разрешения на въезд. если выбросы <= 100
    }

    // получения информации о транспортном средстве
    public T getVehicle() {
        return vehicle;
    }


}