package test.question1;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<merchandise> list = new ArrayList<>();

		File file = new File("saurabh.txt");
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(file));
			String s = null;
			while ((s = br.readLine()) != null) {
				String str[] = s.split(" ");
				merchandise i = new merchandise(str[0], Integer.parseInt(str[1]), Double.parseDouble(str[2]));
				list.add(i);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		Collections.sort(list);
		System.out.println("the list in the sorted order of names is :");
		for (merchandise m : list) {
			System.out.println(m);
		}

		Collections.sort(list, new priceComparator());
		System.out.println("the list in the descending order of prices is:");
		for (merchandise m : list) {
			System.out.println(m);
		}
	}

}
