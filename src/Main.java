// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] massivInt = new int[]{1, 2, 3};
        double[] massivDouble = {1.57, 7.654, 9.986};
        int[] massivMy = new int[3];
        massivMy[0] = 2;
        massivMy[1] = 4;
        massivMy[2] = 6;
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int[] massivInt = new int[]{1, 2, 3};
        double[] massivDouble = {1.57, 7.654, 9.986};
        int[] massivMy = new int[3];
        massivMy[0] = 2;
        massivMy[1] = 4;
        massivMy[2] = 6;
        for (int i = 0; i < massivInt.length; i++) {
            if (i==massivInt.length-1) {
                System.out.println(massivInt[massivInt.length-1]);
                //return;
            }
            else System.out.print(massivInt[i] + ", ");
        }
        for (int j = 0; j < massivDouble.length; j++) {
            if (j==massivDouble.length-1) {
                System.out.println(massivDouble[massivDouble.length-1]);
                //return;
            }
            else System.out.print(massivDouble[j] + ", ");
        }
        for (int i = 0; i < massivMy.length; i++) {
            if (i==massivMy.length-1) {
                System.out.println(massivMy[massivMy.length-1]);
            }
            else System.out.print(massivMy[i] + ", ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3:");
        int[] massivInt = new int[]{1, 2, 3};
        double[] massivDouble = {1.57, 7.654, 9.986};
        int[] massivMy = new int[3];
        massivMy[0] = 2;
        massivMy[1] = 4;
        massivMy[2] = 6;
        for (int i = massivInt.length-1; i >=0; i--) {
            if (i==0) {
                System.out.println(massivInt[0]);
            }
            else System.out.print(massivInt[i] + ", ");
        }
        for (int i = massivDouble.length-1; i >=0; i--) {
            if (i==0) {
                System.out.println(massivDouble[0]);
            }
            else System.out.print(massivDouble[i] + ", ");
        }
        for (int i = massivMy.length-1; i >=0; i--) {
            if (i==0) {
                System.out.println(massivMy[0]);
            }
            else System.out.print(massivMy[i] + ", ");
        }
    }
    public static void task4() {
        System.out.println("Задача 4:");
        int[] massivInt = new int[]{1, 2, 3};
        for (int i = 0; i < massivInt.length; i++) {
            if (massivInt[i]%2!=0) {
                massivInt[i] ++;
            }
            if (i==massivInt.length-1) {
                System.out.println(massivInt[massivInt.length-1]);
            }
            else System.out.print(massivInt[i] + ", ");
        }
    }

}