public class Point2D {
    private int x,y;

    Point2D(int x, int y){
        this.x=x;
        this.y=y;
    }

    Point2D(){
        x=0;
        y=0;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y=y;
    }

    public void printXY(){
        System.out.println(getX());
        System.out.println(getY());
    }

    public void changeXY(int dx, int dy){
        setX(x+dx);
        setY(y+dy);
    }

/*    public static void main (String[] args){
        Point2D point2D=new Point2D(); // вызов конструктора x=0 y=0 / экземпляр класса
        point2D.printXY();
        point2D.changeXY(4,6);
        point2D.printXY();

        Point2D point2D1=new Point2D(8,5);
        point2D1.printXY();
        point2D1.changeXY(7,9);
        point2D1.printXY();
    }*/
}
