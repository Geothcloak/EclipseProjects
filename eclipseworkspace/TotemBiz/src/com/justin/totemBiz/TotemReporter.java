package com.justin.totemBiz;

import com.justin.linkedlist.LinkNode;
import com.justin.linkedlist.LinkedList;

public class TotemReporter {
	
	public String printToConsole(LinkedList list){
		LinkNode current = list.getHead();
		StringBuilder stringBuilder = new StringBuilder();
		while(current != null){
			Totem currentTotem = (Totem)current.getData();
			stringBuilder.append("height: " + currentTotem.getHeight() + " ");
			stringBuilder.append("name: " + currentTotem.getName() + " ");
			stringBuilder.append("material: " + currentTotem.getMaterial() + " ");
			stringBuilder.append("number of spirits: " + currentTotem.getTotalSpirits() + "\n");
			
			current = current.getNext();
		}
		System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
	}
}
