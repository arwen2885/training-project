import org.junit.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
public class RectangleTest {

    @Test
    public void constructor1Rectangle() throws Exception {
        Rectangle rectangle= new Rectangle(6,8,10,2);

        assertThat(rectangle.getLonger(), is(4));
        assertThat(rectangle.getWidth(),is(6));
        assertThat(rectangle.getUpperLeftX1(), is(6));
        assertThat(rectangle.getUpperLeftY1(), is(8));
        assertThat(rectangle.getUpperRightX2(), is(10));
        assertThat(rectangle.getUpperRightY2(), is(8));
        assertThat(rectangle.getLowerLeftX3(), is(6));
        assertThat(rectangle.getLowerLeftY3(), is(2));
        assertThat(rectangle.getLowerRightX4(), is(10));
        assertThat(rectangle.getLowerRightY4(), is(2));
    }

    @Test
    public void constructor2Rectangle() throws Exception {
        Rectangle rectangle= new Rectangle(10,6);

        assertThat(rectangle.getLonger(), is(10));
        assertThat(rectangle.getWidth(),is(6));
        assertThat(rectangle.getUpperLeftX1(), is(0));
        assertThat(rectangle.getUpperLeftY1(), is(6));
        assertThat(rectangle.getUpperRightX2(), is(10));
        assertThat(rectangle.getUpperRightY2(), is(6));
        assertThat(rectangle.getLowerLeftX3(), is(0));
        assertThat(rectangle.getLowerLeftY3(), is(0));
        assertThat(rectangle.getLowerRightX4(), is(10));
        assertThat(rectangle.getLowerRightY4(), is(0));
    }

    @Test
    public void constructor3Rectangle() throws Exception {
        Rectangle rectangle= new Rectangle();

        assertThat(rectangle.getLonger(), is(1));
        assertThat(rectangle.getWidth(),is(1));
        assertThat(rectangle.getUpperLeftX1(), is(0));
        assertThat(rectangle.getUpperLeftY1(), is(1));
        assertThat(rectangle.getUpperRightX2(), is(1));
        assertThat(rectangle.getUpperRightY2(), is(1));
        assertThat(rectangle.getLowerLeftX3(), is(0));
        assertThat(rectangle.getLowerLeftY3(), is(0));
        assertThat(rectangle.getLowerRightX4(), is(1));
        assertThat(rectangle.getLowerRightY4(), is(0));
    }

    @Test
    public void areaRectangleCheck() throws Exception {
        Rectangle rectangle= new Rectangle();
        assertThat(rectangle.areaRectangle(), is(1));
    }

    @Test
    public void decreaseRectangleSides() throws Exception {
        Rectangle rectangle= new Rectangle(10,6);
        rectangle.changeSideRectangle(2);

        assertThat(rectangle.getLonger(), is(5));
        assertThat(rectangle.getWidth(),is(3));
        assertThat(rectangle.getUpperLeftX1(), is(0));
        assertThat(rectangle.getUpperLeftY1(), is(3));
        assertThat(rectangle.getUpperRightX2(), is(5));
        assertThat(rectangle.getUpperRightY2(), is(3));
        assertThat(rectangle.getLowerLeftX3(), is(0));
        assertThat(rectangle.getLowerLeftY3(), is(0));
        assertThat(rectangle.getLowerRightX4(), is(5));
        assertThat(rectangle.getLowerRightY4(), is(0));
    }

    @Test
    public void decreaseRectangleCoordinates() throws Exception {
        Rectangle rectangle= new Rectangle(10,6);
        rectangle.changeCoordinatesCorner(5,4);

        assertThat(rectangle.getLonger(), is(10));
        assertThat(rectangle.getWidth(),is(6));
        assertThat(rectangle.getUpperLeftX1(), is(5));
        assertThat(rectangle.getUpperLeftY1(), is(10));
        assertThat(rectangle.getUpperRightX2(), is(15));
        assertThat(rectangle.getUpperRightY2(), is(10));
        assertThat(rectangle.getLowerLeftX3(), is(5));
        assertThat(rectangle.getLowerLeftY3(), is(4));
        assertThat(rectangle.getLowerRightX4(), is(15));
        assertThat(rectangle.getLowerRightY4(), is(4));
    }


    @Test
    public void dotePoint2DWrittenInsideRectangle() throws Exception {
        Rectangle rectangle= new Rectangle(15,8);
        Point2D point2D= new Point2D(10,4);

        assertThat(rectangle.doteWrittenBy2(point2D), is("вписана"));
    }

    @Test
    public void dotePoint2DWrittenNotInsideRectangle() throws Exception {
        Rectangle rectangle= new Rectangle(15,8);
        Point2D point2D= new Point2D(20,18);

        assertThat(rectangle.doteWrittenBy2(point2D), is("не вписана"));
    }

    @Test
    public void equals() throws Exception {
        Rectangle rectangle= new Rectangle(15,8);

        assertEquals(true, rectangle.equals(new Rectangle(15,8)));
    }
}
