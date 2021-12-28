package com.AutomateTestScripts;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Jyoti");
		list.add("Jagwar");
		list.add("Jogur");
		list.add("Mulagund");
		//Filter the result and it acts as if()
		List<String> list2 = list.stream().filter(str->str.startsWith("J")).collect(Collectors.toList());//
		list2.forEach(System.out::println); 
	
	} 

}
