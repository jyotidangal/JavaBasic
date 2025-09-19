package com.task2.shape;

public class RectangleFunction {
    Rectangle rectangle= new Rectangle();
    void calculateArea(Rectangle rectangle)
    {
        float area=rectangle.getLength()*rectangle.getWidth();
    }
    void calculatePerimeter(Rectangle rectangle)
    {
        float perimeter=2*(rectangle.getLength()+rectangle.getWidth());
    }
}