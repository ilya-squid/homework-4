public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");
        int age = 23;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он несовершенолетний");}
        //task 2
        System.out.println("Задача 2");
        int aСap = 6;
        if (aСap < 5) {
            System.out.println("На улице " + aСap + " градусов нужно надеть шапку" );
        } else {
            System.out.println("На улице " + aСap + " градусов можно идти без шапки" );
        }
        //task 3
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //task 4
        System.out.println("Задача 4");
        age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
        //task 5
        System.out.println("Задача 5");
        age = 6;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if (age > 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else if (age >= 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
        //task 6
        System.out.println("Задача 6");
        int capacity = 102;
        int seatPlaces = 60;
        int people = 76;
        if (people >= capacity ) {
            System.out.println("нет мест");
        }
        else if (people < capacity && people >= seatPlaces) {
            System.out.println("только стоячие");
        }
        else if (people < seatPlaces) {
            System.out.println("только сидячие");
        }
        //task 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println( one);
        }
        else if (two > three){
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}