package com.revature.erdcHibernate.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//	        String a = "{(33[{{{[hello]334}}])}";
//	        System.out.println(isValid(a));
    }
    
    
    
    public static boolean isValid(String s) {
    	//check if element is symbol x
    	//if it is ensure the next symbol that is within the remainder of the group is symbol y, where y is the matching right hand symbol, if it is not return false
    	//if it is, continue execution, if execution continues without a single false flag, it is a valid string
    	
    	Deque<Character> deque = new LinkedList<>();
    	
    	
    	
    	
    	
    	ArrayList<Character> leftSymbList = new ArrayList<>(Arrays.asList('{', '(', '['));

    	ArrayList<Character> rtSymbList = new ArrayList<>(Arrays.asList('}', ')', ']'));
  
    	for(int index = 0; index<s.length(); index++) {
    		if(leftSymbList.contains(s.charAt(index))) {
    			deque.add(s.charAt(index));//add the left operands to the queu
    		}
    		

    	}
    	while(!(deque.isEmpty())){
    		Character focus = deque.removeLast();
//    		System.out.println(s);
//    		System.out.println(focus);

			Character matching = rtSymbList.get(leftSymbList.indexOf(focus));//gets matching character
    		String tempString = s.substring(s.lastIndexOf(focus));//obtains last occurence and re-assigns a new string
    		int matchingIndice = tempString.indexOf(matching);
    		
    		for (int index =0; index<tempString.length(); index++) {
    			Character tempChar = tempString.charAt(index);
        		if(tempChar.equals((rtSymbList.get(0))) || tempChar.equals(rtSymbList.get(1)) || tempChar.equals(rtSymbList.get(2))) {
        			if (matchingIndice == index) {
        				//found matching brace before other right hand symbols
        				//cool, remove all in between elements
//        				System.out.println(s.lastIndexOf(focus));
//        				System.out.println(s.lastIndexOf(focus)+index);
        				s = s.replace(s.substring(s.lastIndexOf(focus), s.lastIndexOf(focus)+index +1), "");

//        				System.out.println("String after removing is: " + s);
        				index = tempString.length();
        			}
        			
        			
        			
        			else {
//        				System.out.println("Symbol: " + tempString.charAt(index) + "found prior to matching symbol : " + tempString.charAt(matchingIndice));
        				return false;//whole thing shot because non-matching brace found
        			}
        		}
        			
    		}

    			

    			
    		}
      	System.out.println(deque);
    	return s.isEmpty();
    	}
  
  }
    
 
