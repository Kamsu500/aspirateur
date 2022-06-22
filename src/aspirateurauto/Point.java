/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aspirateurauto;

/**
 *
 * @author gpg-i
 */
public class Point {
    
    private double x;
    private double y;
    public double getX() 
    {
        return x;
    }
    public void setX(double x) 
    {
        this.x=x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y) 
    {
        this.y=y;
    }
    public Point()
    {
        
    }
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public Point(Point p)
    {
        this.x=p.x;
        this.y=p.y;
    }
    public void set(double x, double y)
    {
        this.x+=x;
        this.y+=y;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Coordonnees  X = "+this.x+" , Y = "+this.y;
    }
    
}
