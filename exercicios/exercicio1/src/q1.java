// Enio Ramos
import java.util.Scanner;
public class q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("o valor:");
        int s = scanner.nextInt();

        if (s <= 0) {
            System.out.println("Min Volume");

        } else if (s > 0 && s <= 25) {
            System.out.println("low Volume");
        } else if (s > 25 && s <= 75) {
            System.out.println("Medium Volume");
        }else if(s > 75 && s < 100){
            System.out.println("High Volume");
        
    }else if(s >= 100){
        System.out.println("Maxi Volume");

}
}
}

