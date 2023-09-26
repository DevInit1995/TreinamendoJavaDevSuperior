package GenericsSetMap.GenericosDelimitados.TiposCuringa.CuringasDelimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		/*
		 * List<IShape> myShapes = new ArrayList<>();
		 * 
		 * myShapes.add(new Rectangle(3.0, 2.0)); myShapes.add(new Circle(2.0));
		 * 
		 * List<Circle> myCircles = new ArrayList<>(); myCircles.add(new Circle(2.0));
		 * myCircles.add(new Circle(3.0));
		 * 
		 * System.out.println("Total area: " + totalArea(myShapes)); }
		 * 
		 * public static double totalArea(List<? extends IShape> list) {
		 * 
		 * double sum = 0.0;
		 * 
		 * for (IShape s : list) { sum += s.area(); }
		 * 
		 * return sum; }
		 */

		/*
		// Princípio get/put - covariância
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");

		List<? super Number> myNums = myObjs;

		myNums.add(10);
		myNums.add(3.14);
		*/
		
		// Princípio get/put - contravariância
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);	
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj + " ");
		}
		
		System.out.println();
	}
}






































