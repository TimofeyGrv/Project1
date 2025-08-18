public class Lesson2 {
    public void section1() {
//        if (условие1) {
//            действие при условии 1;
//        }
//        else if (условие2){
//            действие при условии 2;
//        }
//        else if (условие 3){
//            действие при условии 3;
//        }
//        else{
//            если ничего из условий не подошло;
//        }

//        or - ||       and - &&

        int age = 18;
        boolean inAdult = true;
        if (age >= 18 || inAdult) {
            System.out.println("человек совершеннолетний");
        }
        else {
            System.out.println("человек несовершеннолетний");
        }
    }

    public void section2(){
//        switch (переменная) {
//            case значение1;
//                действие1;
//                break;
//            case значение2;
//                действие2;
//                break;
//            case значение3;
//                действие3;
//                break;
//            default:
//                действие по умолчанию;
//                break;
//        }
        int dayOfWeek = 1;
        switch(dayOfWeek){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("неизвестный день недели");
                break;
        }
    }
///
    public void section3() {
        //        ТЕРНАРНЫЕ ОПЕРАТОРЫ
        int age = 18;
        String answer = (age >= 18) ? "ты совершеннолетнийй" : "ты НЕ совершеннолетьний";
        System.out.printf(answer);

//        if (age >= 18) {
//            answer = "ты совершеннолетний";
//        }
//        else {
//            answer = "ты НЕ совершеннолетний";
//        }
    }
}
