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
 * creates an iterator that plays backward in the class of SongCollection
 * 
 * @author Niudun
 *
 */
public class ReversePlaylist implements java.util.Iterator<Song> {
	private DoublyLinkedNode<Song> tail; // traverses the list from here

	/**
	 * initializes the iterator that starts from the input song
	 * 
	 * @param song where the iterator starts
	 */
	public ReversePlaylist(DoublyLinkedNode<Song> song) {
		this.tail = song;
	}

	/**
	 * returns whether or not there are more elements in this list that have not
	 * been iterated over
	 * 
	 * @return true if there are more element, false otherwise
	 */
	public boolean hasNext() {
		if (tail != null)
			return true;
		return false;
	}

	/**
	 * returns the previous element of the iteration and move the current tail index
	 * to the element before this one
	 * 
	 * @return the song at the current position in the list
	 * @throws NoSuchElementException if there is no more element before this one
	 */
	public Song next() throws java.util.NoSuchElementException {
		if (!this.hasNext())
			throw new java.util.NoSuchElementException("No more songs.");
		DoublyLinkedNode<Song> temp = this.tail;
		this.tail = this.tail.getPrevious();
		return temp.getData();
	}
}
