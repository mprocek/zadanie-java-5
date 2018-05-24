class Triangle{
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    //double calculateArea(){
    //double p = (a+b+c)/2;
    //return a*a;
    //}

    double calculatePerimeter(){
        return a+b+c;
    }

}