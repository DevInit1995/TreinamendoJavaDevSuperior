package GenericsSetMap.GenericosDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\tmp\\in.txt";

		try (BufferedReader br = BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationServico.max(list);
			System.out.println("Most expensive: ");
			System.out.println(x);
		
		} catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}

	}

	private static BufferedReader BufferedReader(FileReader fileReader) {
		// TODO Auto-generated method stub
		return null;
	}

}
