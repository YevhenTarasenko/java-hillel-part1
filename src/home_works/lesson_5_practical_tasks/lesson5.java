package home_works.lesson_5_practical_tasks;

public class lesson5 {
    /*
    ДЗ 5.1. Чи ти дорослий?
    Напишіть програму, яка приймає вік користувача та виводить повідомлення, чи він є дорослим (вік 18 і більше) чи ні.
    checkAge(18) → "Ви доросла особа"
    checkAge(0) → "Ви не є дорослою особою"
    checkAge(99) → "Ви доросла особа"
    Готові задачі додайте на git на нову гілку з назвою aqa/lection5-warmup. До лмс додайте посилання до вашого репозиторію. Не забудьте додати права доступу для вашого викладача.
     */
    public static String checkAge(int age) {
        if(age >= 18 && age <= 99){
            return "Ви доросла особа";
        } else if (age >= 1 && age <= 17) {
            return  "Ви не є дорослою особою";
        } else {
            return "Ви ввели невірний вік";
        }
    }

    /*
    ДЗ 5.2. Квадрат числа
    Напишіть програму, яка приймає ціле число від користувача та перевіряє, чи є воно квадратом цілого числа.
    isPerfectSquare(25) → true
    isPerfectSquare(20) → false
    isPerfectSquare(9) → true
    Готові задачі додайте на git на нову гілку з назвою aqa/lection5-warmup. До лмс додайте посилання до вашого репозиторію. Не забудьте додати права доступу для вашого викладача.
     */
    public static boolean isPerfectSquare(int number){
        double sqrtResult = Math.sqrt(number);
        if(  sqrtResult == (int) sqrtResult) {
            return true;
        } else {
            return false;
        }
    }

    /*
    ДЗ 5.3. Числовий ряд
    Напишіть програму, яка приймає число N та виводить суму всіх чисел від 1 до N.
    calculateSumUpToN(1) → “1”
    calculateSumUpToN(3) → “1 2 3”
    calculateSumUpToN(0) → “Хибні вхідні параметри”
    Готові задачі додайте на git на нову гілку з назвою aqa/lection5-warmup. До лмс додайте посилання до вашого репозиторію. Не забудьте додати права доступу для вашого викладача.
     */
    public static String calculateSumUpToN(int number){
        String result = "";
        if(number >= 1){
            for (int i = 1; i <= number; i++) {
                result = result + " " + i;
            }
        } else {
            return "Хибні вхідні параметри";
        }
        return result.trim();

    }

    /*
    ДЗ 5.4. Оцінка студента
    Напишіть програму, яка приймає числове значення від 1 до 5 та виводить відповідну оцінку студента.
    getGrade(5) → "Відмінно"
    getGrade(1) → "Погано"
    getGrade(-3) → "Неправильна оцінка"
    Готові задачі додайте на git на нову гілку з назвою aqa/lection5-warmup. До лмс додайте посилання до вашого репозиторію. Не забудьте додати права доступу для вашого викладача.
     */
    public static String getGrade(int grade) {
        switch (grade){
            case 0:
                return "Дуже Погано";
            case 1:
                return "Погано";
            case 2:
                return "Погано";
            case 3:
                return "Вже краше але погано!";
            case 4:
                return "Майже Відмінно!";
            case 5:
                return "Відмінно!";
            default:
                return "Неправильна оцінка";
        }
    }

    /*
    ДЗ 5.5. Просте число
    Напишіть програму, яка приймає число N та перевіряє, чи є воно простим числом.
    isPrime(0) → false
    isPrime(8) → false
    isPrime(7) → true
    Готові задачі додайте на git на нову гілку з назвою aqa/lection5-warmup. До лмс додайте посилання до вашого репозиторію. Не забудьте додати права доступу для вашого викладача.
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("----- Завдання 1 -----");
        System.out.println("Вік = 17: " + checkAge(17));
        System.out.println("Вік = 18: " + checkAge(18));
        System.out.println("Вік = 19: " + checkAge(19));
        System.out.println("Вік = 98: " + checkAge(98));
        System.out.println("Вік = 99: " + checkAge(99));
        System.out.println("Вік = 100: " + checkAge(100));
        System.out.println("Вік = -10: " + checkAge(-10));
        System.out.println("Вік = 0: " + checkAge(0));

        System.out.println("----- Завдання 2 -----");
        System.out.println("Число 25: " + isPerfectSquare(25));
        System.out.println("Число 20: " + isPerfectSquare(20));
        System.out.println("Число 9: " + isPerfectSquare(9));

        System.out.println("----- Завдання 3 -----");
        System.out.println("Число 1: " + calculateSumUpToN(0));
        System.out.println("Число 1: " + calculateSumUpToN(1));
        System.out.println("Число 1: " + calculateSumUpToN(3));
        System.out.println("Число 1: " + calculateSumUpToN(5));

        System.out.println("----- Завдання 4 -----");
        System.out.println("Число 5: " + getGrade(5));
        System.out.println("Число 1: " + getGrade(1));
        System.out.println("Число -1: " + getGrade(-1));
        System.out.println("Число 10: " + getGrade(10));

        System.out.println("----- Завдання 5 -----");
        System.out.println("Число 0: " + isPrime(0));
        System.out.println("Число 8: " + isPrime(8));
        System.out.println("Число 7: " + isPrime(7));


    }
}
