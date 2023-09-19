package examen.u1.u2;
import java.util.Scanner;
public class ExamenU1U2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("******Bienvenido a la tienda****** ");
        
        System.out.println("Ingrese el nombre de su primer videojuego");
        String nom1=scanner.nextLine();
        
        System.out.println("Ingrese el precio del videojuego "+nom1+ ":");
        double vid1=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el nombre de su segundo videojuego");
        String nom2=scanner.nextLine();
        
        System.out.println("Ingrese el precio del videojuego "+nom2+ ":");
        double vid2=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el nombre de su tercer videojuego");
        String nom3=scanner.nextLine();
        
        System.out.println("Ingrese el precio del videojuego "+nom3+ ":");
        double vid3=scanner.nextDouble();
        scanner.nextLine();
        
        
        double desc1=vid1-((vid1*30)/100);
        double desc2=vid2-((vid2*65)/100);
        double desc3=vid3-((vid3*15)/100);
        scanner.close();
        
        System.out.println("********************************************************************");
        System.out.println("El precio final del videojuego "+nom1+" es: $"+desc1);
        System.out.println("El precio final del videojuego "+nom2+" es: $"+desc2);
        System.out.println("El precio final del videojuego "+nom3+" es: $"+desc3);
        System.out.println("********************************************************************");
    }
}
