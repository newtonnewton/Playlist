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
 * creates an iterator that plays forward in the class of SongCollection
 * 
 * @author galoi
 *
 */
public class Playlist implements java.util.Iterator<Song> {

	private DoublyLinkedNode<Song> head; // traverses the nodes in SongCollection

	/**
	 * initializes an iterator starts from this input song
	 * 
	 * @param song where the iterator starts
	 */
	public Playlist(DoublyLinkedNode<Song> song) {
		head = song; // the current position in the list
	}

	/**
	 * returns whether or not there are more elements in this list that have not
	 * been iterated over
	 * 
	 * @return true if there are more element, false otherwise
	 */
	public boolean hasNext() {
		return (head != null);

	}

	/**
	 * returns the next element of the iteration and move the current head index to
	 * the element after this one
	 * 
	 * @return the song at the current position in the list
	 * @throws NoSuchElementException if there is no more element after this one
	 */
	public Song next() throws java.util.NoSuchElementException {
		if (!this.hasNext())
			throw new java.util.NoSuchElementException("No more songs.");
		Song temp = head.getData();
		head = head.getNext();
		return temp;
	}
}
