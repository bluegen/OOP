package ru.mirea.gibo1.pr3;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
/* Circle a = new Circle(4,5,6);
a.setY(15);
a.getLength();
a.getS();
        System.out.println(a);
        System.out.println("Длина окружности = " + a.getLength());
        System.out.println("Площадь окружности = " + a.getS());
     */
        /*Circle[] arr = new Circle[3];
        arr[0] = new Circle(4,5,8);
        arr[1] = new Circle(12,34,47);
        arr[2] = new Circle(56,34,23);
        */
            Circle[] arr = new Circle[3];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length;i++) {
                int xx,yy,rr;
                System.out.println("Введите x");
                xx = sc.nextInt();
                System.out.println("Введите y");
                yy = sc.nextInt();
                System.out.println("Введите rr");
                rr = sc.nextInt();
                arr[i] = new Circle(xx,yy,rr);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].toString());
                System.out.println("Длина круга = " + arr[i].getLength() + "," + "Площадь круга = " + arr[i].getS());
            }
            int min = arr[0].getR();
            for(int i = 1; i < arr.length;i++) {
                if (min > arr[i].getR()) {
                    min = arr[i].getR();
                }
            }
            System.out.println("Минимальное значение радиуса = " + min);
            int max = arr[0].getR();
            for(int i = 1; i < arr.length;i++) {
                if(max < arr[i].getR()) {
                    max = arr[i].getR();
                }
            }
            System.out.println("Максимальное значение радиуса = " + max);
         /*
         //Я исправила ваш код, но он работает неправильно- у вас алгоритм неверный

            int count;

            do {
                count = 0;
                for(int i = 0; i < arr.length - 1; i++) {
                    if(arr[i].getR() > arr[i + 1].getR()) {
                        Circle temp = arr[i];
                        //int temp = arr[i].getR();
                        //arr[i + 1].getR()= arr[i].getR();
                        temp = arr[i];
                        arr[i + 1]= arr[i];
                        arr[i] = temp;
                        //temp = arr[i + 1].getR();
                        count ++;

                    }
                }
            }
            while(count > 0);
            System.out.println();

          */
            System.out.println("\nCircle were sorted by max radius: ");
            Circle temp;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j].getR() > arr[j + 1].getR()) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }


    }

