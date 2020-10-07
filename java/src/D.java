import java.util.Scanner;


public class D {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter value of a:");
        int a = n.nextInt();

        System.out.print("Enter value of b:");
        int b = n.nextInt();

        if(a > b) {
            int c = a;

            a = b;
            b = c;

            int f = 0,d = 0;
            int k = 0,t = 0;


            for(int i=0; i < 40; i++) {
                int rand = (int) (Math.random() * (b - a + 1) + a);


                if(rand % 2 == 0) {
                    f += 1;
                    d += rand;
                }
                else {
                    k += 1;
                    t += rand;
                }
                System.out.println(rand);
            }

            }


        }

    }
}


