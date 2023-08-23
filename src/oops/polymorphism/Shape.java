package oops.polymorphism;

import java.text.CharacterIterator;

public class Shape {
    void draw() {
        System.out.println("Drawing..");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle..");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle..");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle..");
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
    }
}
