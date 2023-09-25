package TrabalhandoArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * //aula 214 File file = new File("C:\\tmp\\in.txt"); Scanner sc = null; try {
		 * sc = new Scanner(file); while (sc.hasNextLine()) {
		 * System.out.println(sc.nextLine()); } } catch(IOException e ) {
		 * System.out.println("Error: " + e.getMessage()); } finally { if(sc != null){
		 * sc.close(); } }
		 */

		/*
		 * //aula 215 String path = "C:\\tmp\\in.txt"; BufferedReader br = null;
		 * FileReader fr = null;
		 * 
		 * try { fr = new FileReader(path); br = new BufferedReader(fr);
		 * 
		 * String line = br.readLine();
		 * 
		 * while(line != null) { System.out.println(line); line = br.readLine(); }
		 * }catch (IOException e) { System.out.println("Error: " + e.getMessage());
		 * }finally { try { if(br != null) br.close(); if(fr != null) fr.close();
		 * }catch(IOException e ) { e.printStackTrace(); } }
		 */
		
		/*
		// aula 216
		String path = "C:\\tmp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		*/
		
		/*
		//aula 217
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\tmp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
		}
		*/
		
		/*
		//aula 218
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File :: isDirectory);
		System.out.println("FOLDERS");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created succesfully: " + success);
		*/
		
		/*
		// aula 219
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		*/
		
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}
	
}




















