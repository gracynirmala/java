package MenuProgram;
import java.util.Scanner;
class AreaOfFigures{
int area,r,h,w,b,side;double ar;
Scanner sc=new Scanner(System.in);
public void areaRectangle() {
System.out.println("Enter the height and breath");
Scanner sc=new Scanner(System.in);
b=sc.nextInt();
h=sc.nextInt();
area=b*h;
System.out.println("Area of Rectangle:"+area);
}

public void areaSquare() {
System.out.println("Enter the side");
Scanner sc=new Scanner(System.in);
side=sc.nextInt();
ar=side*side;
System.out.println("Area of Square:"+ar);
}

public void areaTriangle() {
System.out.println("Enter the height and breath");
Scanner sc=new Scanner(System.in);
b=sc.nextInt();
h=sc.nextInt();
ar=(b*h)/2;
System.out.println("Area of Triangle:"+ar);

}

public void areaCircle() {
System.out.println("Enter the radius");
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
ar=3.14159f*r*r;
System.out.println("Area of Circle:"+ar);

}


}
public class MainApp {

public static void main(String[] args) {
int ch;
AreaOfFigures ob=new AreaOfFigures();
Scanner sc=new Scanner(System.in);
System.out.println("Area of different Figures");
System.out.println("Enter your choices");
System.out.println("1.Area of Rectangle");
System.out.println("2.Area of Square");
System.out.println("3.Area of Triangle");
System.out.println("4.Area of Circle");
ch=sc.nextInt();
switch(ch) {
case 1:ob.areaRectangle();
break;
case 2:ob.areaSquare();
break;
case 3:ob.areaTriangle();
break;
case 4:ob.areaCircle();
break;
}
}

}

