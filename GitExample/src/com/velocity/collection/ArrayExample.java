package com.velocity.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample {

	public static void main(String[] args) {
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(101);
al.add(104);
al.add(102);
al.add(105);
al.add(103);

Iterator<Integer> itr = al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
