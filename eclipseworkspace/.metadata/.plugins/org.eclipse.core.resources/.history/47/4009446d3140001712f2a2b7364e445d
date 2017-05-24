package com.justin.linkedlist;

public class LinkedList {
	
	LinkNode head;
	
	public LinkedList(Object data){
		head = new LinkNode(data);
	}
	
	public void add(Object data){
		LinkNode current = head;
		
		
		while (current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(new LinkNode(data));
		
	}
	
	public void remove(int index){
		LinkNode current = head;
		
		//remove head
		if (index == 0){
			if (head.getNext() != null){
				head = head.getNext();
			}else{
				head = null;
			}
		}else{
			LinkNode previous = head;
			
			for (int i = 0; i <= index; i++){
				if (current.getNext() != null){
					previous = current;
					current = current.getNext();
				}else{
					throw new IllegalStateException("Cannot remove at index. Out of bounds.");
				}
			}
			//remove end
			if (current.getNext() == null){
				previous.setNext(null);
			}else{
				//remove from middle
				previous.setNext(current.getNext());
			}
		}
	}

	public int size(){
		int numberOfNodes = 1;
		LinkNode current = head;
		while (current.getNext() != null){
			current = current.getNext();
			numberOfNodes += 1;
		}
		return numberOfNodes;
	}

	public LinkNode getHead() {
		return head;
	}

	public void setHead(LinkNode head) {
		this.head = head;
	}
	
}
