
public class Rectangle {
    private int upperLeftX1;
    private int upperRightX2;
    private int lowerLeftX3;
    private int lowerRightX4;
    private int upperLeftY1;
    private int upperRightY2;
    private int lowerLeftY3;
    private int lowerRightY4;
    private int longer;
    private int width;

    Rectangle(int upperLeftX1, int upperLeftY1, int lowerRightX4, int lowerRightY4) {
        this.upperLeftX1 = upperLeftX1;
        this.upperLeftY1 = upperLeftY1;
        this.lowerRightX4 = lowerRightX4;
        this.lowerRightY4 = lowerRightY4;
        lowerLeftX3 = upperLeftX1;
        lowerLeftY3 = lowerRightY4;
        upperRightX2 = lowerRightX4;
        upperRightY2 = upperLeftY1;
        longer = lowerRightX4 -upperLeftX1;
        width = upperLeftY1 - lowerRightY4;
    }

    Rectangle(int longer, int width) {
        this.longer = longer;
        this.width = width;
        lowerLeftX3= 0;
        lowerLeftY3 = 0;
        upperRightX2 = longer;
        upperRightY2 = width;
        upperLeftX1 = 0;
        upperLeftY1 = width;
        lowerRightX4 = longer;
        lowerRightY4=0;
    }

    Rectangle() {
        this.lowerLeftX3 = 0;
        this.lowerLeftY3=0;
        upperLeftX1 = 0;
        upperLeftY1 = 1;
        upperRightX2 =1;
        upperRightY2 = 1;
        lowerRightX4 = 1;
        lowerRightY4 = 0;
        longer=1;
        width=1;
    }

    public int getUpperLeftX1() {
        return upperLeftX1;
    }

    public void setUpperLeftX1(int upperLeftX1) {
        this.upperLeftX1 = upperLeftX1;
    }

    public int getUpperLeftY1() {
        return upperLeftY1;
    }

    public void setUpperLeftY1(int upperLeftY1) {
        this.upperLeftY1 = upperLeftY1;
    }

    public int getUpperRightX2() {
        return upperRightX2;
    }

    public void setUpperRightX2(int upperRightX2) {
        this.upperRightX2 = upperRightX2;
    }

    public int getUpperRightY2() {
        return upperRightY2;
    }

    public void setUpperRightY2(int upperRightY2) {
        this.upperRightY2 = upperRightY2;
    }

    public int getLowerLeftX3() {
        return lowerLeftX3;
    }

    public void setLowerLeftX3(int lowerLeftX3) {
        this.lowerLeftX3 = lowerLeftX3;
    }

    public int getLowerLeftY3() {
        return lowerLeftY3;
    }

    public void setLowerLeftY3(int lowerLeftY3) {
        this.lowerLeftY3 = lowerLeftY3;
    }

    public int getLowerRightX4() {
        return lowerRightX4;
    }

    public void setLowerRightX4(int lowerRightX4) {
        this.lowerRightX4 = lowerRightX4;
    }

    public int getLowerRightY4() {
        return lowerRightY4;
    }

    public void setLowerRightY4(int lowerRightY4) {
        this.lowerRightY4 = lowerRightY4;
    }

    public int getLonger() {
        return longer;
    }

    public void setLonger(int longer) {
        this.longer = longer;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void printCoordinatesCorner(){
    System.out.println(getUpperLeftX1());
    System.out.println(getUpperLeftY1());
    System.out.println(getUpperRightX2());
    System.out.println(getUpperRightY2());
    System.out.println(getLowerLeftX3());
    System.out.println(getLowerLeftY3());
    System.out.println(getLowerRightX4());
    System.out.println(getLowerRightY4());
    }

    public void changeCoordinatesCorner(int dx, int dy){
     setUpperLeftX1(upperLeftX1 + dx);
     setUpperLeftY1(upperLeftY1 + dy);
     setUpperRightX2(upperRightX2 + dx);
     setUpperRightY2(upperRightY2 + dy);
     setLowerLeftX3(lowerLeftX3 + dx);
     setLowerLeftY3(lowerLeftY3 + dy);
     setLowerRightX4(lowerRightX4 + dx);
     setLowerRightY4(lowerRightY4 + dy);
    }

    public void changeSideRectangle(int nx, int ny){
        setLonger(longer/ny);
        setWidth(width/nx);
        setLowerLeftX3(lowerLeftX3);
        setLowerLeftY3(lowerLeftY3);
    }

    public int  areaRectangle(){
        return width * longer;
    }

    public String doteWrittenBy( int pointX, int pointY ){
        int beforeX = lowerLeftX3;
        int beforeY = lowerLeftY3;
        if (pointX>longer + beforeY){
        return "не вписана";}
        else {
            if (pointY>width + beforeX){
                return "не вписана";
            }
            else {
                return "вписана";
            }
        }
    }

     public String doteWrittenBy2(Point2D point2D){
        int x = point2D.getX();
        int y = point2D.getY();

        if (x>longer){
            return "не вписана";
        }
        else {
            if (y>width){
                return "не  вписана";
            }
            else {
                return "вписана";
            }
        }
     }

     public void newRectangle(int n){
        setWidth(width*n);
        setLonger(longer*n);
     }

     public String  crossRectangles (int x1m, int y1m, int x2m, int y2m,int x3m, int y3m, int x4m, int y4m ){
        if (y1m<upperLeftY1 && x1m>lowerLeftX3 && x1m<lowerRightX4 && y1m>lowerLeftY3)
            return "прямоугольник вписан";
        else {
            return "прямоугольник не вписан";
        }
     }

     public boolean equals(Object o){
        if (this==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Rectangle rectangle=(Rectangle) o;
        return longer == rectangle.longer;
     }

     public int hashCode(){
        return longer;
     }

     public static void main(String[] args){
        Rectangle rectangle=new Rectangle();
        rectangle.printCoordinatesCorner();
        rectangle.changeCoordinatesCorner(10, 8);
        rectangle.changeSideRectangle(3, 5);
        rectangle.printCoordinatesCorner();
        System.out.println (rectangle.doteWrittenBy(7,8));

         Point2D point2D = new Point2D(4,5);
         System.out.println (rectangle.doteWrittenBy2(point2D));
         Rectangle rectanglMini= new Rectangle();
         System.out.println(rectanglMini. crossRectangles(3,10,12,10, 3,3,10, 3 ));
     }
}