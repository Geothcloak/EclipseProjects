package com.justin.totemBiz;
import com.justin.linkedlist.LinkNode;
import com.justin.linkedlist.LinkedList;

public class TotemSort {
	
	public void byHeight(LinkedList list){
		LinkNode current = list.getHead();
		boolean didFlip = false;
		
		float firstHeight = 0;
		float secondHeight = 0;
		Totem first;
		Totem second;
		
		int sizeOfList = list.size();
		do{
			didFlip = false;
			
			for (int i = 0; i<sizeOfList; i++){
				first = (Totem) current.getData();
				second =  (Totem) current.getData();
				firstHeight = first.getHeight();
				if (current.getNext() != null){
					secondHeight = ((Totem)current.getNext().getData()).getHeight();
				}
				
				
				if (firstHeight > secondHeight){
					current.setData(secondHeight);
					current.getNext().setData(firstHeight);
					didFlip = true;
				}
				current = current.getNext();
			}
			current = list.getHead();
		}while(didFlip = true);
	}
	
	
	
	
	
	
}