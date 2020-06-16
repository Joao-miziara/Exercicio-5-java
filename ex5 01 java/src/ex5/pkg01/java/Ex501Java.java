
package ex5.pkg01.java;

import java.util.Scanner;


public class Ex501Java {

    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);

        System.out.println ("Digite a primeira nota: ");
        int n1 = entrada.nextInt();
        
        System.out.println ("Digite a segunda nota: ");
        int n2 = entrada.nextInt();
        
        double media = (n1+n2)/2;
        
        double medianova=0;
        
        if (media >= 7)
            {
                System.out.println("Aprovado sem exame");
            }
            else
            {
                System.out.println ("Digite a nota do exame: ");
                double ne = entrada.nextDouble();
                medianova = (media + ne) / 2;
                if (medianova >= 5)
                {
                    System.out.println("Aprovado com exame");
                }
                else
                {
                    System.out.println("Reprovado");
                }
            }
    }
    
}
    
    

