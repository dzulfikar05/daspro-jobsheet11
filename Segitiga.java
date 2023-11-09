import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = input.nextInt();
        for (int x = 0; x <= n; x++) {
            for (int y = n; y > x; y--) { 
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print(n);
                } else if (j == 1 || j == (n - 2)) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
