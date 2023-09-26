package ProgramacaoFuncionalExpressaoLambda;

import java.util.Objects;

import GenericsSetMap.GenericosDelimitados.TiposCuringa.CuringasDelimitados.HashCodeEequals.Set.ExerciciosResolvidoSet.Map.Products;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + price + "]";
	}

}
