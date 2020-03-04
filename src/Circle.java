public class Circle {
    private int x;
    private int y;
    private int r;

    Circle(int x,int y, int r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public int getX() {
        return x;
    }
    public void setX(int x){this.x=x;}

    public int getY(){
        return y;
    }
    public void setY(int y){this.y=y;}

    public int getR(){
        return r;
    }
    public void setR(int r){this.r=r;}

    public void printCoordinateCircle(){
        System.out.printf("%d,%d,%d", x,y,r);
    }

    public void moveCircle(int dx, int dy){
        setX(x+dx);
        setY(y+dy);
    }

    public void areaCircle(){
        double area= Math.PI*(r*r);

    }

    public void lengthCircle(){
        double length=Math.PI*2*r;
    }

    public String doteWrittenByCircle(int x0, int y0){
        if (((x0-x)*(x0-x)+(y0-y)*(y0-y))<r*r){
            return "точка пренадлежит окружности";
        }
        if (((x0-x)*(x0-x)+(y0-y)*(y0-y))==r*r){
            return "точка лежит на окружности";
        }
        return "точка не пренадлежит окружности";
    }

    public String doteWrittenByCircle(Point2D point2D){
        int x0 = point2D.getX();
        int y0 = point2D.getY();
        if (((x0-x)*(x0-x)+(y0-y)*(y0-y))<r*r){
            return "точка пренадлежит окружности";
        }
        if (((x0-x)*(x0-x)+(y0-y)*(y0-y))==r*r){
            return "точка лежит на окружности";
        }
        return "точка не пренадлежит окружности";

    }

    public boolean equals(Object o){
        if (this==o) return true;
        if(o==null || getClass() !=o.getClass()) return false;
        Circle circle=(Circle) o;
        return r ==circle.r;
    }

    public int hasCode(){return r;}
}
