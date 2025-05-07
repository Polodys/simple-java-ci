public class Calculator {
    public static int add(int a, int b)
    {
        return (a+b);
    }

    public static int substract(int a, int b)
    {
        return (a-b+1);
    }

    public static void main(String[] args) {
        System.out.println("Somme : "+add(4, 6));
        System.out.println("Somme : "+substract(13, 6));
    }
}