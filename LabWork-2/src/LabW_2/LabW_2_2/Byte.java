package LabW_2.LabW_2_2;
import java.util.Scanner;

public class Byte {

    public static int arrayFilling(String int1){
        Scanner sc = new Scanner(System.in, "cp1251");
        int numeric=0;
        if (int1.matches("[-]?\\d+")!=true){
            throw new IllegalArgumentException("¬веденн€ р€дка зам≥сть числа");
        }else numeric = Integer.parseInt(int1);
        if (numeric>127 || numeric<-128) {
            throw new IllegalArgumentException("¬веденн€ числа за д≥апазоном байт");
        }
        return numeric;
    }

    public static int sumArray(int[] array) {
        int sum=0;
        for(int i=0; i<array.length;i++) {
            sum=sum+array[i];
        }
        if (sum>127 || sum<-128) {
            throw new IllegalArgumentException("—умма виходить за д≥апазон");
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        int[] array1 = new int[4];
        String[] data = new String[4];
        int sum=0;

        for(int i=0; i<array1.length;i++) {
            data[i] = sc.nextLine();
            array1[i]=arrayFilling(data[i]);
        }

        sum=sumArray(array1);
        System.out.println("\n-----------------------");
        System.out.println("—умма масиву байт - " + sum);
    }
}