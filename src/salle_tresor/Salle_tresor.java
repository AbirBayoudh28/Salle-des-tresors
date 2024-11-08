 package salle_tresor;
 import java.util.Scanner;

 public class Salle_tresor {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         // Demander le nombre total de trésors
         
         System.out.print("Entrez le nombre total de trésors à comptabiliser : ");
         int nombreTotalTresors = scanner.nextInt();

         // Boucle pour compter les trésors
         
         for (int i = 1; i <= nombreTotalTresors; i++) {
        	 
             // Si la position est un multiple de 3
             if (i % 3 == 0) {
                 System.out.println("Trésor n°" + i + " - Ce trésor est spécial (multiple de 3) !");
             } else {
                 System.out.println("Trésor n°" + i + " compté.");
             }
         }

         scanner.close();
     }
 }