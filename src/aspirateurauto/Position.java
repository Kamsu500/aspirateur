/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aspirateurauto;

/**
 *
 * @author gpg-i
 */

public class Position 
{
    private Point point;

    public enum orientation
    {
      N,E,W,S
    }
    private orientation orientation;

    public Point getPoint()
    {
        return point;
    }
    public void setPoint(Point point) 
    {
        this.point=point;
    }
    
    public orientation getOrientation()
    {
        return this.orientation;
    }
    public void setOrientation(String val) 
    {
        orientation orien=orientation.valueOf(val);
        this.orientation=orien;
    }
    
    public Position()
    {
        
    }
    public Position(Point point,String val)
    {
        this.point=point;
       orientation orien=orientation.valueOf(val);
        this.orientation=orien;
    }
    public Position(Position p)
    {
        this.point=p.point;
        this.orientation=p.orientation;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.point.toString()+ "\nOrientation: "+this.getOrientation().name();
    }
}

