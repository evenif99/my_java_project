package ch04_class;

public class ShapeArea {
    public void area(int radius) {
        final double PI = 3.14;
        double area = PI * (radius * radius);
        System.out.println("원의 면적 : " + area);
    }


    public void area(int width, int height) {

        double area = width*height;
        System.out.println("사각형의 면적 : " + area);
    }

    public void area(int top, int bottom, int width) {
        double area = (double) (top + bottom) * width / 2.0;
        System.out.println("사다리꼴의 면적 : " + area);
    }


    }

