
/* Create a Package Named com.codewithharry.shape
 * This package should have indivisual classes for "Rectangle, Square, Circle, Cylinder, Sphere";
 * These classes should use inheritance to proprerly manage code  
 * Include Methods like Volumem, Surface area, Getters/ Setters for dimensions
 * 
 */

package com.cwh.shape;

class Rectangle{
    public int Perimeter(int height, int width){
        return 2*(height+ width);
    }
    public double Area(int height, int width){
        return height*width;
    }
} 
class Square extends Rectangle{
    public int sqPerimeter(int side){
        return 4*side;
    }
    public int sqArea(int side){
        return side*side;
    }
}
class Circle{

}
class Cylinder{
    public void 
}


public class Exercise5 {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Square sq =new Square();
        sq.Perimeter(4, 5);
        System.out.println(rect.Area(4, 5));
    }
}
