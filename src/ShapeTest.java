class ShapeTest{
    public static void main(String[] args){

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(2,3,4);


        //pole i obwod liczone w klasie ShapeCalculator
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double squareArea = shapeCalculator.squareArea(square); //pole kwadratu
        double circleArea = shapeCalculator.circleArea(circle); //pole koła
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle); //obwód trójkata
        double rectPerimeter = shapeCalculator.rectPerimeter(rectangle); //obwód prostakata

        System.out.println("Pole kwadrat: " + squareArea + ", pole koła: " + circleArea + ", obw.trójkąta: " + trianglePerimeter + ", obw.prostokąta: " + rectPerimeter);

        //pole i obwod liczone w klasie figury
        double squArea = square.calculateArea();
        double squPeri = square.calculatePerimeter();
        System.out.println("Kwadrat: " + squArea + " " + squPeri);

        double rectArea = rectangle.calculateArea();
        double rectPeri = rectangle.calculatePerimeter();
        System.out.println("Prostokąt: "+ rectArea + " " + rectPeri);

        double cirArea = circle.calculateArea();
        double cirPeri = circle.calculatePerimeter();
        System.out.println("Koło: " + cirArea + " " + cirPeri);

        //double triArea = triangle.calculateArea();
        double triPeri = triangle.calculatePerimeter();
        System.out.println("Trójkąt: " + triPeri);
    }
}