/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aspirateurauto;


/**
 *
 * @author gpg-i
 */

public class Aspirateur
{
    public Position position;
    public enum commande
    {
        A,D,G
    }
    public commande cmd;

    public Aspirateur()
    {
       
        this.position=new Position(new Point(0,0),"N");
        this.cmd=null;

    }
    public Aspirateur(Position position,commande cmd)
    {
        this.position=position;
        if(cmd==Enum.valueOf(commande.class, "A"))
        {
            if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "N"))
                    this.position.getPoint().set(0,1);
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "E"))
                    this.position.getPoint().set(1,0);
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "S"))
                    this.position.getPoint().set(0,-1);
            else
                    this.position.getPoint().set(0-1,0);
        }
        else if(cmd==Enum.valueOf(commande.class, "D"))
        {
            if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "N"))
                     this.position.setOrientation("E");
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "E"))
                     this.position.setOrientation("S");
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "S"))
                     this.position.setOrientation("W");
            else
                     this.position.setOrientation("N");
        }
        else if(cmd==Enum.valueOf(commande.class, "G"))
        {
            if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "N"))
                    this.position.setOrientation("W");
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "W"))
                    this.position.setOrientation("S");
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "S"))
                    this.position.setOrientation("E");
            else
                    this.position.setOrientation("N");
        }
        else 
        {
            this.position.setOrientation("N");
        }

      
    }
    public Aspirateur(Aspirateur asp)
    {
        this.position=asp.position;
        this.cmd=asp.cmd;
    }
    public Position Commande(commande cmd)
    {
        if(cmd==Enum.valueOf(commande.class, "A"))
        {
            if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "N"))
                    this.position.getPoint().set(0,1);
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "E"))
                    this.position.getPoint().set(1,0);
            else if( position.getOrientation()==Enum.valueOf(Position.orientation.class, "S"))
                    this.position.getPoint().set(0,-1);
            else
                    this.position.getPoint().set(0-1,0);
            
        }
        else if(cmd==Enum.valueOf(commande.class, "D"))
        {
            if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "N"))
                     this.position.setOrientation("E");
            else if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "E"))
                     this.position.setOrientation("S");
            else if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "S"))
                     this.position.setOrientation("W");
            else
                     this.position.setOrientation("N");
        }
        else if(cmd==Enum.valueOf(commande.class, "G"))
        {
            if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "N"))
                    this.position.setOrientation("W");
            else if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "W"))
                    this.position.setOrientation("S");
            else if( this.position.getOrientation()==Enum.valueOf(Position.orientation.class, "S"))
                    this.position.setOrientation("E");
            else
                    this.position.setOrientation("N");
        }
        else 
        {
            this.position.setOrientation("N");
        }
        return this.position;
 
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if(this.cmd!=null)
        return "Aspirateur\nCommande: "+this.cmd.name()+"\n"+this.position.toString();
        return  "Aspirateur\n"+this.position.toString();

    }
    
}