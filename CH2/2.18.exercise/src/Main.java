public class Main {

    public static void main(String[] args) {
	// write your code here
        double x1,x2,y1,y2;
        x1=0;
        x2=2;
        y1=0;
        y2=1;
        System.out.println("  A                 B               Middle point");
        System.out.println("(0,0)             (2,1)"+"              ("+(x1+x2)/2+","+(y1+y2)/2+")");
        x1=1;  x2=4; y1=4; y2=2;
        System.out.println("(1,4)             (4,2)"+"              ("+(x1+x2)/2+","+(y1+y2)/2+")");
        x1=2; y1=7; x2=6; y2=3;
        System.out.println("(2,7)             (6,3)"+"              ("+(x1+x2)/2+","+(y1+y2)/2+")");
        x1=3; y1=9; x2=10; y2=5;
        System.out.println("(3,9)             (10,5)"+"             ("+(x1+x2)/2+","+(y1+y2)/2+")");
        x1=4; y1=11;x2=12;y2=7;
        System.out.println("(4,11)            (12,7)"+"             ("+(x1+x2)/2+","+(y1+y2)/2+")");

    }
}
