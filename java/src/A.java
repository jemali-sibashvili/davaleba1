import java.util.Scanner;



public class A {
    int x;
    String hello;

    public A (String hello_1) {
        hello = hello_1;
    }

    public static void main(String[] args) {
        B obj = new B("Hello");
        System.out.println(obj.hello);

        obj.method_1();
        obj.method_2();
        obj.method_3();
        obj.dav_2_2_method_1();
        obj.dav_2_2_method_2();
    }

    public void method_1() {
        Scanner n = new Scanner(System.in);
        System.out.println("შემოტანა x: ");
        x = n.nextInt();
    }

    public void method_2() {
        System.out.println(x+12);
    }

    public void method_3() {
        if (x % 2 == 0) {
            System.out.println("X არი ლუწი");
        } else {
            System.out.println("X არის კენტი");
        }
    }
}