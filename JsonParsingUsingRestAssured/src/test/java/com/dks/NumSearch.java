package com.dks;


import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang.ArrayUtils;

public class NumSearch {
	public static int[] array=  {25,27,45,43,67,87,56,67,78};
	public int searchInt(int target) {
		
		for (int i = 0; i < array.length; i++)
	    {
	        if (array[i] == target) {
	            return i;
	        }
	    }
	 
		return-1;
	}
	public void SearchUsingTree(int target) {
		
		SortedSet<Integer> s = new TreeSet();
	  
	    for (int i = 0; i < array.length; i++) {
	        s.add(array[i]);
	    }

	    System.out.println("Number contains:"+!(s.add(target)));

	}
	
	public void usingArrayutils(int target) {
		 	        	         
	        int index = ArrayUtils.indexOf(array, target);
	         
	        System.out.println("Index of "+target+" is : "+index);
	}
	
	public static void main(String[] args) {
		// get the search string and the position of it
		//int[] array=  {25,27,45,43,67,87,56,67,78};
		NumSearch numSearch = new NumSearch();
		
		int postion= numSearch.searchInt(87);
		System.out.println("The given integer found in the " +postion +" location ");
		numSearch.usingArrayutils(87);

		
	}
}
