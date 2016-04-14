package oblig9;
//import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Finhandtering fil = new Filhandtering("testText.txt");
		String[] s = fil.hentData();
		ArrayList<String[]> arrayList = new ArrayList<>();
		
		//if(s.length % Integer.parseInt(args[0]) == 0){
			int lengde = s.length / Integer.parseInt(args[0]);
			
			for(int j = 0; j < s.length; j += lengde){
				if(j +lengde > s.length){
					arrayList.add(Arrays.copyOfRange(s, j, s.length));
				}else{
					arrayList.add(Arrays.copyOfRange(s, j, (j + lengde)));
				}	
			}
			
			//Slaa sammen array1 og array2
			if(arrayList.size() % 2 != 0){
				String[] array1 = arrayList.get(arrayList.size() -2);
				String[] array2 = arrayList.get(arrayList.size() -1);
				//String[] ferdig = (String[])ArrayUtils.addAll(array1, array2);

			}
		//}
		
			//lager rett antall traader
		for(int i = 0; i < Integer.parseInt(args[0]); i+2){
				
			Runnable traad = new Runnable(arrayList.get(i), arrayList.get(i+1));
			Thread traaden = new Thread(traad);
		}
		
		
		//gi traadene 2 String[]er hver
		
		

	}

}
