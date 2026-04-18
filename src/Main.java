//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        int age = 17;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2
        System.out.println("Task 2");

        int temperature = 4;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Task 3
        System.out.println("Task 3");

        int speed = 58;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Task 4
        System.out.println("Task 4");

        age = 100;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }

        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }

        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }

        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //Task 5
        System.out.println("Task 5");

        age = 15;

        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }

        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то можно кататься на аттракционе в сопровождении");
        }

        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то можно кататься на аттракционе без сопровождения взрослого");
        }

        //Task 6
        System.out.println("Task 6");

        int peopleInCarriage = 105;
        int allCapaciryOfTheCarriage = 102;
        int seating = 60;

        if (peopleInCarriage < seating) {
            int seatsLeft = seating - peopleInCarriage;
            System.out.println("В вагоне осталось " + seatsLeft + " сидячих мест");
        } else {
            if (peopleInCarriage < allCapaciryOfTheCarriage) {
                int stayLeft = allCapaciryOfTheCarriage - peopleInCarriage;
                System.out.println("В вагоне осталось " + stayLeft + " стоячих мест");
            } else {
                System.out.println("В вагоне не осталось свободного места");
            }
        }

        //Task 7
        System.out.println("Task 7");

        int one = 5;
        int two = 4;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Самое большое число one - " + one);
        } else {
            if (two > three && two > one) {
                System.out.println("Самое большое число two - " + two);
            } else {
                System.out.println("Самое большое число three - " + three);
            }
        }
    }
}