package LabW_2.LabW_2_1;
import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {

        int[] array1 = new int[4];
//        String[] data = new String[4];
        int sum=0;
        Scanner sc = new Scanner(System.in, "cp1251");

        for(int i=0; i<array1.length;i++) {
            array1[i] = sc.nextInt();
//            if (data[i].matches("\\d+")!=true){
//                throw new IllegalArgumentException("¬веденн€ р€дка зам≥сть числа");
//            }else array1[i] = Integer.parseInt(data[i]);

            if (array1[i]>127 || array1[i]<-128) {
                throw new IllegalArgumentException("¬веденн€ числа за д≥апазоном байт");
            }
        }

        for(int i=0; i<array1.length;i++) {
            sum=sum+array1[i];
        }
        if (sum>127 || sum<-128) {
            throw new IllegalArgumentException("—умма виходить за д≥апазон");
        }
        System.out.println("\n-----------------------");
        System.out.println("—умма масиву байт - " + sum);
    }
}


