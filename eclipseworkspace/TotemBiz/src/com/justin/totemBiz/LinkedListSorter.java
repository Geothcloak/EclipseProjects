package com.justin.totemBiz;
import com.justin.linkedlist.LinkNode;
import com.justin.linkedlist.LinkedList;

public class LinkedListSorter {
	
	public LinkedList sort(LinkedList list, LinkedListCompariter compariter){
		LinkNode current = list.getHead();
		LinkNode previous = null;
		
		
		LinkNode next;
		int sizeOfList = list.size() -1;
		
		for(int i = 0; i < sizeOfList; i++){
			
			for (int ii = 0; ii<sizeOfList; ii++){
				
			
				
				next = current.getNext();
				
				System.out.println("first height = " + ((Totem)current.getData()).getHeight() 
						+ "second height " + ((Totem)next.getData()).getHeight());
				
				if (compariter.compare(current, next)){
					System.out.println("flipping");
					
					if (ii == 0){
						list.setHead(next);
						System.out.println("setting head to " + ((Totem)list.getHead().getData()).getHeight() );
						current.setNext(next.getNext());
						next.setNext(current);
					}else{
						current.setNext(next.getNext());
						next.setNext(current);	
						previous.setNext(next);
					}
					
				
					previous = next;
					current = next.getNext();
					
					
				}else{
					previous = current;
					current = current.getNext();
				}
				
				System.out.println("end of for loop iteration");
			}
			System.out.println("end of while iteration");
			current = list.getHead();
			System.out.println("resetting current to head  " + ((Totem)list.getHead().getData()).getHeight() );
		}
		
		return list;
	}
	
}
