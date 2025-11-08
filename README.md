import java.until.Scanner;
public class Main {
    public static void main() {
        int age = 5
                if (age >= 2 && age <= 6) {
                    System.out.println("если возрасть человека равен " + age + ", то ему надо ходить в сад");
                }
                    if (age >= 7 && age <= 17){
                        System.out.println("если возрасть человека равен " + age + ", то ему надо ходить в школу");
                }
                    if (age >= 16 && age <= 24){
                        System.out.println("если возрасть человека равен " + age + ", то ему надо ходить в универ");
                    }
                    if (age > 24){
                        System.out.println("если возрасть человека больше " + age + ", то ему надо ходить на работу");
                    }

        }
                    //задание 2
    int pasengers = scanner.nextInt();
    int sitSeats = 60;
    int trainCarriage = 102;
    if (pasengers < sitSeats) {
        System.out.println("в вагоне есть сидячие места");
    }
    else if (pasengers < trainCarriage) {
        System.out.println("в вагоне есть только стоячие места");
    }
    else if (pasengers == trainCarriage){
        System.out.println("вагон заполнен");
    }
                //задание 3
                int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " год високосный");
    } else {
        System.out.println(year + " год не високосный");
    }
                //задание 4
                int month = scanner.nextInt();

        if (month > 12 || month < 1) {
        System.out.println("неверный номер месяца");
    } else {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + " зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + " весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + " осенний месяц");
                break;
        }
    }

        scanner.close();
}
}
}
