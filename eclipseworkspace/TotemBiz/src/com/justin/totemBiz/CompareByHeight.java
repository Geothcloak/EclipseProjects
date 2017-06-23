package com.justin.totemBiz;

import com.justin.linkedlist.LinkNode;

public class CompareByHeight implements LinkedListCompariter{

	@Override
	public boolean compare(LinkNode current, LinkNode next) {
		
		return ((Totem)current.getData()).getHeight() > ((Totem)current.getNext().getData()).getHeight();

	}
	//TODO make interface for sprits
	
}
