import java.util.Scanner;

class B extends A{

    int y;

    public B (String hello_1) {
        super(hello_1);
    }


    public void dav_2_2_method_1() {
        Scanner n = new Scanner(System.in);
        System.out.println("შეიტანე y: ");
        y = n.nextInt();
    }

    public void dav_2_2_method_2() {
        System.out.println("ჯამი: " + (x+y));
    }


}
