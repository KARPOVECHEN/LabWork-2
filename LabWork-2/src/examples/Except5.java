package examples;

public class Except5{
    public static void m (String str, double
            chislo) { if (str==null) {
        throw new IllegalArgumentException("Рядок введено неправильно");
    }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неправильне число");
        } }
    public static void main(String[]
                                    args) { m (null, 0.000001);
    }}