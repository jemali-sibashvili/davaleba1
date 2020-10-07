import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        int a, b, c;

        Scanner n = new Scanner(System.in);


        System.out.println("მეთოდი 1");
        System.out.println("შეიყვანეთ A: ");
        a = n.nextInt();

        System.out.println("შეიყვანეთ B: ");
        b = n.nextInt();

        System.out.println("შეიყვანეთ C: ");
        c = n.nextInt();


        int B_1 = a%10;
        System.out.println("მეთოდი 2: " + B_1);


        int B_2 = b;
        while (B_2 > 9) {
            B_2 /= 10;
        }
        System.out.println("მეთოდი 3: " + B_2);


        int k, i, jami = 0;
        k = c;
        if ((k / 10) == 0) {
            jami = c;
        } else {
            while (k > 0) {
                i = k%10;
                jami = jami+i;
                k = k/10;
            }
        }
        System.out.println("მეთოდი 4: " + jami);


        int me_5 = a*b*c*B_1;
        System.out.println("მეთოდი 5: " + me_5);


        System.out.println("მეთოდი 6: " + B_2 +  me_5);

    }
}

