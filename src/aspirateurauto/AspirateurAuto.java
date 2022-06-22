/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aspirateurauto;

/**
 *
 * @author gpg-i
 */
public class AspirateurAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             Aspirateur asp=new Aspirateur(new Position(new Point(5,5),"N"),Aspirateur.commande.D);
             System.out.println(asp.toString());
             asp.Commande(Aspirateur.commande.A);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.D);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.A);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.D);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.A);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.D);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.A);
             System.out.println(asp.toString());
              asp.Commande(Aspirateur.commande.A);
             System.out.println(asp.toString());
    }
    
}
