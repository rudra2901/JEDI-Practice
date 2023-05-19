/**
 * 
 */
package com.flipkart.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author rudra.tiwari
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		System.out.println("Size of collection before allocation : " + list.size());
		
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Bhopal");
		list.add(2901);
		
		System.out.println("Size of collection after allocation : " + list.size());
		
		list.remove(2);
		System.out.println("Size of collection after removal : " + list.size());
		
		
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String var = it.next();
//		}
	}

}
