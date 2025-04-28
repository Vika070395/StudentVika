package by.homework.lessons.task17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();

        Car car = new Car("BMW", 400, "Germany");
        System.out.println("\nСоздан объект автомобиля: " + car);
        serializeCar(car);

        Car deserializedCar = deserializeCar("Car.ser");
        System.out.println("Десериализованный объект автомобиля: " + deserializedCar);
    }

    private static void first() {
        new File("Homework17File").mkdirs(); // Создание директории если не существует
        File file = new File("Homework17File\\Text1.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow.\n" +"The old count had money enough that year, as all his estates had been remortgaged,and so Nicholas, acquiring a trotter of his own, very stylish riding breeches\n" +
                    "of the latest cut, such as no one else yet had in Moscow, and boots of thelatest fashion, with extremely pointed toes and small silver spurs, passed his\n" +
                    "time very gaily. After a short period of adapting himself to the old conditionsof life, Nicholas found it very pleasant to be at home again. He felt that he\n" +
                    "had grown up and matured very much. His despair at failing in a Scriptureexamination, his borrowing money from Gavríl to pay a sleigh driver, his\n" +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had leftimmeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with\n" +
                    "silver, and wearing the Cross of St. George, awarded to soldiers for bravery inaction, and in the company of well-known, elderly, and respected racing men was\n" +
                    "training a trotter of his own for a race. He knew a lady on one of theboulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’\n" +
                    "ball, talked about the war with Field Marshal Kámenski, visited the EnglishClub, and was on intimate terms with a colonel of forty to whom Denísov had\n" +
                    "introduced him.");

            System.out.println("Файл Text1.txt успешно записан.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла с относительным путём: " + e.getMessage());
        }
    }

    private static void second() {
        File file = new File("C:\\Users\\viktoriya.kochergo\\Desktop\\Kochergo_V\\Java new\\StudentVika\\Homework17File", "Text2.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow.\n" +"The old count had money enough that year, as all his estates had been remortgaged,and so Nicholas, acquiring a trotter of his own, very stylish riding breeches\n" +
                    "of the latest cut, such as no one else yet had in Moscow, and boots of thelatest fashion, with extremely pointed toes and small silver spurs, passed his\n" +
                    "time very gaily. After a short period of adapting himself to the old conditionsof life, Nicholas found it very pleasant to be at home again. He felt that he\n" +
                    "had grown up and matured very much. His despair at failing in a Scriptureexamination, his borrowing money from Gavríl to pay a sleigh driver, his\n" +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had leftimmeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with\n" +
                    "silver, and wearing the Cross of St. George, awarded to soldiers for bravery inaction, and in the company of well-known, elderly, and respected racing men was\n" +
                    "training a trotter of his own for a race. He knew a lady on one of theboulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’\n" +
                    "ball, talked about the war with Field Marshal Kámenski, visited the EnglishClub, and was on intimate terms with a colonel of forty to whom Denísov had\n" +
                    "introduced him.");

            System.out.println("Файл Text2.txt успешно записан.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла с абсолютным путём: " + e.getMessage());
        }
    }

    private static void third() {
        File file = new File("Homework17File\\Text1.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            System.out.println("Содержимое файла Text\\Text1.txt:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла Text\\Text1.txt: " + e.getMessage());
        }
    }

    private static void fourth() {
        File file = new File("C:\\Users\\viktoriya.kochergo\\Desktop\\Kochergo_V\\Java new\\StudentVika\\Homework17File", "Text2.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            System.out.println("Содержимое файла Text2.txt:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла C:\\Users\\viktoriya.kochergo\\Desktop\\Kochergo_V\\Java new\\StudentVika\\Homework17File: " + e.getMessage());
        }
    }

    public static void serializeCar(Car car) {
        String fileName = "Car.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(car);
            System.out.println("\nОбъект автомобиля успешно сериализован в файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации объекта автомобиля: " + e.getMessage());
        }
    }

    public static Car deserializeCar(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации объекта автомобиля: " + e.getMessage());
            return null; // Возвращаем null в случае ошибки
        }
    }
}
