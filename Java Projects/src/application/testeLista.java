package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testeLista {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		
		for(String x : list) {
			System.out.println(x);
		}
		

		
		
		sc.close();
	}

}
