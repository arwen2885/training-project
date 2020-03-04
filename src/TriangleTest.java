import org.junit.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
public class TriangleTest {
    @Test
    public void constructorTriangle () throws Exception {
        Triangle triangle=new Triangle(3,1,7,11,11,1);

        assertThat(triangle.getX1(), is(3));
        assertThat(triangle.getY1(), is(1));
        assertThat(triangle.getX2(), is(7));
        assertThat(triangle.getY2(), is(11));
        assertThat(triangle.getX3(), is(11));
        assertThat(triangle.getY3(), is(1));

    }
    @Test

    public void decreaseTriangleCoordinates() throws Exception {
        Triangle triangle = new Triangle(3,1,7,11,11,1);
        triangle.moveTriangle(5,4);

        assertThat(triangle.getX1(), is(8));
        assertThat(triangle.getY1(), is(5));
        assertThat(triangle.getX2(), is(12));
        assertThat(triangle.getY2(), is(15));
        assertThat(triangle.getX3(), is(16));
        assertThat(triangle.getY3(), is(5));
    }

    @Test
    public void areaTriangleChec() throws Exception {
        Triangle triangle= new Triangle(3,1,7,11,11,1);
        assertThat( triangle.areaTriangle() , is(40.0));
    }

  // @Test
    public void dotePoint2DWrittenInsideTriangle() throws Exception {
        Triangle triangle= new Triangle(3,1,7,11,11,1);


        assertThat(triangle.doteWrittenByTriangle(10,8), is("не вписана"));
    }

    @Test
    public void doteWrittenInsideTriangle() throws Exception {
        Triangle triangle= new Triangle(3,1,7,11,11,1);
        Point2D point2D= new Point2D(10,4);

        assertThat(triangle.doteWrittenByTriangle2(point2D), is("не вписана"));
    }

























}



