
import java.util.Scanner;
//Enio Ramos 
public class q2 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro número inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro  número inteiro: ");
        num3 = entrada.nextInt();

        if ((num1 > num2) && (num2 > num3)) {
            System.out.print("escreva a ordem é: " + num1 + ">=" + num2 + ">=" + num3);
        }
         else if ( num1 > num3 && num3 > num2){
            System.out.print("escreva a ordem é: " + num1 + ">=" + num3 + ">=" + num2);   
         }else if( num2 >num1 && num1 > num3){
            System.out.print("escreva a ordem é: " + num2 + ">=" + num1 + ">=" + num3);   

         }else if(num2 > num3 && num3 > num1){
            System.out.print("escreva a ordem é: " + num2 + ">=" + num3 + ">=" + num1);

         }else if(num3 > num1 && num1 > num2){
            System.out.print("escreva a ordem é: " + num3 + ">=" + num1 + ">=" + num2);
         }else {
            System.out.print("escreva a ordem é: " + num3 + ">=" + num2 + ">=" + num1);
         }
           
        }

    }


    

           
        

    

