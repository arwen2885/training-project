public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    Triangle(int x1,int y1, int x2,int y2,int x3,int y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }

    public int getX1() {
        return x1;
    }
    public void setX1(int x1){
        this.x1=x1;
    }

    public int getY1(){
        return  y1;
    }

    public void setY1(int y1){
        this.y1=y1;
    }

    public int getX2(){
        return x2;
    }

    public void setX2(int x2){
        this.x2=x2;
    }

    public int getY2(){
        return y2;
    }

    public void setY2(int y2){
        this.y2=y2;
    }

    public int getX3(){
        return x3;
    }

    public void setX3(int x3){
        this.x3=x3;
    }

    public int getY3(){
        return y3;
    }

    public void setY3(int y3){
        this.y3=y3;
    }

    public void printVertex(){
        System.out.printf("%d,%d %d,%d %d,%d", x1,y1,x2,y2,x3,y3);
    }

    public void moveTriangle(int dx, int dy){
       setX1(x1+dx);
       setY1(y1+dy);
       setX2(x2+dx);
       setY2(y2+dy);
       setX3(x3+dx);
       setY3(y3+dy);
    }

    public double areaTriangle () {
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public String doteWrittenByTriangle( int x0, int y0 ){
          int a =(x1-x0)*(y2-y1)-(x2-x1)*(y1-y0);
          int b =(x2-x0)*(y3-y2)-(x3-x2)*(y2-y0);
          int c =(x3-x0)*(y1-y3)-(x1-x3)*(y3-y0);

          if ((a>=0 && b>=0 && c>=0) || (a<=0 && b<=0 && c<=0)){
          return " вписана";
          }
          return " не вписана";
    }

    public String doteWrittenByTriangle2(Point2D point2D) {
      int x = point2D.getX();
        int y = point2D.getY();
        int a = (x1-x)*(y2-y1)-(x2-x1)*(y1-y);
      int b = (x2-x)*(y3-y2)-(x3-x2)*(y2-y);
      int c = (x3-x)*(y1-y3)-(x1-x3)*(y3-y);
      if ((a>=0 && b>=0 && c>=0) || (a<=0 && b<=0 && c<=0)){
      return "вписана";
      }
      return "не вписана";
    }

  //  public String compareSideTriangle(){
  //      double a= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    //     double b= Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
  //      double c= Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
  //      if ((a=b) && (b=c)){
   //         return "триуголиник равносторонний";
     //   }
    //        return "триугольник неравносторонний";
   // }

    public boolean equals(Object o) {
               if (this==o) return true;
               if (o==null || getClass() !=o.getClass()) return  false;
               Triangle triangle=(Triangle) o ;
               return x2 == triangle.x2;
               }

               public int hashCode(){return x2;}

               public static void main(String[] args){
                Triangle triangle=new Triangle(3,1,7,11,11,1);
                double area =triangle. areaTriangle();
                System.out.println(area);
               }
          }












