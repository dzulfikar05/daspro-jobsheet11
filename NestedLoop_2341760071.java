import java.util.Scanner;

public class NestedLoop_2341760071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] myNumbers = new int[5][7];
        int[]sum = new int[5];
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Kota ke-" + (i+1));

            for (int j = 0; j < myNumbers[0].length; j++) {

                System.out.print("Hari ke-" + (j+1) + ": ");
                myNumbers[i][j] = input.nextInt();
                sum[i] += myNumbers[i][j];
            }

            System.out.println();
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Kota ke-" + (i+1) + ": ");
            int avg = sum[i]/myNumbers.length;
            System.out.println("Average suhu di kota  "+ (i+1) +" adalah "+avg);
            for (int j = 0; j < myNumbers[0].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            
            System.out.println();
        }

        // int no = 1;
        // for (int[] c : myNumbers) {
        //     System.out.print("Kota ke-" + no++ + ": ");
        //     for (int hari : c) {
        //         System.out.print(hari + " ");
        //     }
        //     System.out.println();
        // }
    }
}
