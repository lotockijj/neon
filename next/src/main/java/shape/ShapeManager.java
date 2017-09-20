package shape;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
	
	public void serializeRectangles(List<Rectangle> rectangles){
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("rectangles.txt"))){
			for (int i = 0; i < rectangles.size(); i++) {
				oos.writeObject(rectangles.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Rectangle> deSerializeRectangles(){
		List<Rectangle> rectangles = new ArrayList<>();
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("rectangles.txt"))){
			Rectangle rect = null;
			do {
				rect = (Rectangle) ois.readObject();
				if(rect != null){
					rectangles.add(rect);
				} 
			} while (rect != null); 
		} catch (EOFException e){
			System.out.println(e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rectangles;
	}

	public Rectangle getRectangleWithMaxSquare(List<Rectangle> rectangles){
		Rectangle rect = rectangles.get(0);
		for (int i = 1; i < rectangles.size(); i++) {
			if(rectangles.get(i).getSuare() > rect.getSuare()){
				rect = rectangles.get(i);
			}
		}
		return rect;
	}
	
	public Rectangle getRectangleWithMaxPerimeter(List<Rectangle> rectangles){
		Rectangle rect = rectangles.get(0);
		for (int i = 1; i < rectangles.size(); i++) {
			if(rectangles.get(i).getPerimeter() > rect.getPerimeter()){
				rect = rectangles.get(i);
			}
		}
		return rect;
	}
}
