import java.util.*;

public class FullPyramid {
    public static void main(String srg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n ;i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
