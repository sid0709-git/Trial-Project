package javaPackage;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Summer");
		ht.put(2, "mansoon");
		ht.put(3, "winter");
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
		System.out.println(ht);

	}

}
