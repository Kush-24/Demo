package Java.techmojo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;



public class TweetHandler {

	
 public static Map<String ,Integer> getTweetDS(List<String> list){
	 Map<String ,Integer> map=new HashMap<>();
	String st=new String();
	 for(String str:list) { 
		 for(int i=0;i<str.length();i++){ // check for string.
			 char ch=str.charAt(i);
			if(ch=='#'){ // take all character after this #
				int start=i;
				while(start < str.length() && str.charAt(start)!=' ') {
					st+=str.charAt(start); // adding char in stringbuffer
					start++;
				}
				// maintain freq in map for hastags.
				map.put(st, map.getOrDefault(st, 0)+1);
				st="";
			} 
		 
		 }
		 
	 }
	map.forEach((k,v)-> System.out.println(k+" - "+v));
	 
	 return map;
 }
 
 public static List<String> getTopNHashtag(Map<String,Integer> map,int n){
	 List<String> ans=new ArrayList<>();
	 PriorityQueue<Integer> minHeap=new PriorityQueue<>();
	
	 // get top n values of hastag from map
	 for(int value:map.values()) {
		 minHeap.add(value);
		 if(minHeap.size() > n)
			 minHeap.remove();
	 }
	// minHeap.forEach(val-> System.out.print(val+" "));
	 
	// Iterate map and get top n keys wrt top n values which is present in minHeap. 
	 Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();
     while(it.hasNext()) {
     	Map.Entry<String, Integer> entry=it.next();
     	if(minHeap.contains(entry.getValue())) {
     		ans.add(entry.getKey());
     		minHeap.remove(entry.getValue()); // deals with same freq content.
     	}
     }
	
	 return ans;
 }
	
}
