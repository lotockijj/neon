package shape;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ShapeManagerTest {
	private ShapeManager manager;
	private List<Rectangle> rectangles;
	private Rectangle rect1;
	private Rectangle rect2;
	private Square square1;
	private Square square2;
	
	@Before
	public void setUp() throws Exception {
		manager = new ShapeManager();
		rectangles = new ArrayList<>();
		rect1 = new Rectangle(3, 4);
		rect2 = new Rectangle(5, 10);
		square1 = new Square(5);
		square2 = new Square(8);
		rectangles.add(rect1);
		rectangles.add(rect2);
		rectangles.add(square1);
		rectangles.add(square2);
		
		manager.serializeRectangles(rectangles);
	}

	@Test
	public void testDeSerializeCar() {
		List<Rectangle> list = manager.deSerializeRectangles();
		Assert.assertEquals(4, list.size());
	}

	@Test
	public void testGetRectangleWithMaxSquare() {
		Rectangle rect = manager.getRectangleWithMaxPerimeter(rectangles);
		Assert.assertEquals(32.0, rect.getPerimeter());
	}

	@Test
	public void testGetRectangleWithMaxPerimeter() {
		Rectangle rect = manager.getRectangleWithMaxSquare(rectangles);
		Assert.assertEquals(64.0, rect.getSuare());
	}

}
