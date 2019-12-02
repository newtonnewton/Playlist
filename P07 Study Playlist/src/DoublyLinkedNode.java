//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           Doubly LinkedList
// Files:           DoublyLinkedNode.java, Playlist.java, ReservePlaylist.java, Song.java, SongCollection.java
// Course:          CS-300, Fall 2019
//
// Author:          (Niudun Wang)
// Email:           (nwang66@wisc.edu)
// Lecturer's Name: (Mouna Kacem)
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates, 
// strangers, and others do.  If you received no outside help from either type
//  of source, then please explicitly indicate NONE.
//
// Persons:         NONE  
// Online Sources:  NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
/**
 * An instance of this class represents a single node within a doubly linked list
 * @author Niudun
 *
 * @param <T> the data to be stored within this node
 */
public class DoublyLinkedNode <T> extends java.lang.Object {

	private DoublyLinkedNode<T> previous;
	private DoublyLinkedNode<T> next;
	private T data;
	
	/**
	 * initialize a new node with the specified infomation
	 * @param previous node, which comes before this node in a doubly linked list
	 * @param data T to be stored within this node
	 * @param next node, which comes after this node in a doubly linked list
	 */
	public DoublyLinkedNode(DoublyLinkedNode<T> previous, T data, DoublyLinkedNode<T> next) 
	throws java.lang.IllegalArgumentException {
		if(data == null) throw new java.lang.IllegalArgumentException("Data cannot be null.");
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	/**
	 * initializes a new node with the specified data, and null next and previous reference
	 * @param data T to be stored within this node
	 */
	public DoublyLinkedNode(T data) throws java.lang.IllegalArgumentException {
		if (data == null) throw new java.lang.IllegalArgumentException("Data cannot be null.");
		this.previous = null;
		this.next = null;
		this.data = data;
	}
	
	/**
	 * Accessor method for this node's data
	 * @return
	 */
	public T getData() {
		return this.data;
	 
	}
	
	/**
	 * Accessor method for this node's next node reference
	 * @return reference to the node that comes after this one in the list,
	 * or null when this is the last node in that list
	 */
	public DoublyLinkedNode<T> getNext(){
		return this.next;
	}
	
	/**
	 * mutator method for this node's next node reference
	 * @param next node, which comes after this node in a doubly linked list
	 */
	public void setNext(DoublyLinkedNode<T> next) {
		this.next = next;
	}
	
	/**
	 * Accessor method for this node's previous node reference
	 * @return reference to the node that comes before this one in the list or null
	 * when this is the first node in that list
	 */
	public DoublyLinkedNode<T> getPrevious(){
		return this.previous;
	}
	
	/**
	 * mutator method for this node's previous node reference
	 * @param previous node, which comes before this node in a doubly linked list
	 */
	public void setPrevious(DoublyLinkedNode<T> previous) {
		this.previous = previous;
	}
	
	
}
