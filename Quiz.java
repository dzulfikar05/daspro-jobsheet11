import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            // System.out.println(number);
            do{
                System.out.println("Tebak angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);
                if(answer>number){
                    System.out.println("Angka yang anda inputkan lebih besar dari angka random");
                }else{
                    System.out.println("Angka yang anda inputkan lebih kecil dari angka random");
                }
            }while(!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = sc.nextLine().charAt(0);    
        }while(menu=='y'||menu=='Y');
    }
}
