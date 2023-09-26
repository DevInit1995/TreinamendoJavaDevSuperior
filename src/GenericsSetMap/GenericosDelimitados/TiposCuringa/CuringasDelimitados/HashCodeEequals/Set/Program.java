package GenericsSetMap.GenericosDelimitados.TiposCuringa.CuringasDelimitados.HashCodeEequals.Set;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		/*
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);*/
		
		//aula 244. Como Set testa igualdade
		//aula 245. Como TreeSet compara os elementos
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for(Product p : set) {
			System.out.println(p);
		}
	}

}





























