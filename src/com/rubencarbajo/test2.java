package com.rubencarbajo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args){
		
		List<String> names = new ArrayList<String>();
		String  line = null;
		
		// Scanner file read
		try ( Scanner input = new Scanner(new File("names.txt")) ) {
			while (input.hasNextLine()) {
				names.add(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Buffer file read
		try ( BufferedReader br = new BufferedReader(new FileReader("names.txt")) ) {
			while ( (line = br.readLine()) != null  ) {
				names.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Iterators
		
		System.out.println("\nDelta:");
		names.forEach( (l) -> {
			System.out.println(l);
		});
				
		System.out.println("\nFor:");
		for (int i = 0 ; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
				
		System.out.println("\nIterator");
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
				
		System.out.println("\nFor in:");
		for (String l : names) {
			System.out.println(l);
			
		}
		
		
	}

}
