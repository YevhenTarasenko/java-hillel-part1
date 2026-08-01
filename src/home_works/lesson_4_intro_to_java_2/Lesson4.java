package home_works.lesson_4_intro_to_java_2;

public class Lesson4 {
    // Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
    public static void printSquare(int a){
        int squareOfA = a * a;
        System.out.println("Квадрат числа " + a + " дорівнює: " + a);
    }

    //Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
    public static void cylinderVolume(double radius, double height){
        double P = 3.14;
        double volumeOfCylinder = P * radius * radius * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volumeOfCylinder);
    }

    //Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    public static double powerOfNumber(int numberOne, int numberTwo){
        double result = Math.pow(numberOne, numberTwo);
        return result;
    }

    public static void main(String[] args){
        System.out.println("Завдання 1:");
        printSquare(5);

        System.out.println("Завдання 2:");
        cylinderVolume(3.5, 10.0);

        System.out.println("Завдання 3:");
        System.out.println("Результат дорівнює: " + powerOfNumber(2, 3));


    }

}
