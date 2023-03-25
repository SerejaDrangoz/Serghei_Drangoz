package org.example.homework_nr_2;

public class homework_nr_2 {
    public static void main(String[] args){
        int month= 13;
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Это вам не год");
        }

            //ДЗ 5
                for(int i = 100; i <=1000; i++){
                    if (i % 5 == 0){
                        System.out.println(i);
                    }
                }

                //ДЗ 6
                float sum = 0;
                int i;
                int j;
                for ( i = 1; j = 3; i <= 97 && j <= 99; i = i + 2; j = j + 2){
                        sum = i / j + sum;
               }
                System.out.println(sum);


                for (i = 1; i <= 97; i = i + 2) {
                    sum += i / (i + 2);
                }
                System.out.println(sum);


                //ДЗ 7
                String p = "";
                char e = '*';
                for(i = 1; i<10; i++){
                    p = p+e;
                    System.out.println(p);
                }









        }
}
