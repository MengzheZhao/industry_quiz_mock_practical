package q1;

public class MultiCalcApp {

    public void start(){

        // TODO: Your code for Task One A here:
        double length = 12.0;
        double width = 14.0;
        double height = 13.7;
        System.out.println("The length is: " + length + " metres, the width is " + width + " metres, the height is " + height + " metres.");
        printBoxVolume(length, width, height);

        // TODO: Your code for Task Two A here:
        double sideA = 10.5;
        double sideB = 14.7;
        System.out.println("sideA is " + sideA + " metres, sideB is " + sideB + " metres.");
        printRightAngleTriangleArea(sideA, sideB);

        // TODO: Your code for Task Three A here:
        int totalDegrees = 725;
        System.out.println("The number of degrees is " + totalDegrees + ".");
        printRotations(725);

        // TODO: Your code for Task Four and Task Five here:

        double sideLength = 4.5;
        System.out.println("The length of the side is " + 24.5 + " metres.");
        printEquilateralTriangleArea(sideLength);


        double equalSidesLength = 10.4;
        double singleSideLength = 7.5;
        System.out.println("The length of the equal sides is " + equalSidesLength + " and the length of the single side is " + singleSideLength + ".");
        printIsoscelesTriangleArea(equalSidesLength, singleSideLength);

    }

    /**
     *  Calculates and prints the area of a box
     *
     * @param length the length of the box as a double
     * @param width the width of the box as a double
     * @param height the height of the box as a double
     * */
    public void printBoxVolume(double length, double width, double height){
        // TODO: Your code for Task One B here:
        double volume = length * width * height;
        System.out.println("The volume of the box is " + volume + " metres cubed.");
    }

    /**
     * Print right angle triangle area
     *
     * @param sideA the first side of the triangle as a double
     * @param sideB the first side of the triangle as a double
     * */
    public void printRightAngleTriangleArea(double sideA, double sideB){
        // TODO: Your code for Task Two B here:
        double area = sideA * sideB / 2;
        System.out.println("The area of the triangle is " + area);

    }

    /**
     * Calculates and prints rotations and degrees for a given total number of degrees
     *
     * @param totalDegrees total number of degrees as an int
     * */
    public void printRotations(int totalDegrees){
        // TODO: Your code for Task Three B here:
        int rotations = totalDegrees / 360;
        int remainingDegrees = totalDegrees % 360;
        System.out.println(totalDegrees + " degrees is " + rotations + " full rotations and " + remainingDegrees + " remaining degrees.");

    }

    // TODO: Create your method definitions for tasks four and five here:
    public void printEquilateralTriangleArea(double sideLength){
        double area = Math.sqrt(3) / 4 * Math.pow(sideLength, 2);
        System.out.println("The area of an equilateral triangle with side of " + sideLength + " metres is " + area + "metres squared.");
    }

    public void printIsoscelesTriangleArea(double equalSidesLength, double singleSideLength){
        double area = singleSideLength / 4 * (Math.sqrt((4 * Math.pow(equalSidesLength, 2)) - Math.pow(singleSideLength, 2)));
        System.out.println("The area of an isosceles triangle with two equal sides of " + equalSidesLength + " metres and a single side length of " + singleSideLength + " metres has an area of " + area + " metres squared.");
    }

    public static void main(String[] args) {
        MultiCalcApp multiCalcApp = new MultiCalcApp();
        multiCalcApp.start();
    }

}
