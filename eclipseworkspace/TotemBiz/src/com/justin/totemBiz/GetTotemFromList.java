package com.justin.totemBiz;

import com.justin.linkedlist.LinkNode;
import com.justin.linkedlist.LinkedList;

public class GetTotemFromList {
	
	public Totem byName(LinkedList linkedList, String name){
		int count = linkedList.size() - 1;
		LinkNode current = linkedList.getHead();
		Totem data = (Totem) current.getData();
		
		for (int i = 0; i < count; i++){
			if (data.getName().equals(name)){
				return (data);
			}
			current = current.getNext();
			data = (Totem) current.getData();
		}
			//deal with no name
			//deal with duplicate names
			//deal with just one name
		return null;
	}
}
