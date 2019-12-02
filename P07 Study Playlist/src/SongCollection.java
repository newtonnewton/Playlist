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

import java.util.Iterator;

/**
 * creates a DoublyLinkedNode list that stores the song objects at each node,
 * provides a few mutator and accessor method to set or find the song as well as
 * a remove/add method to alter the list, allows play forward/backward through
 * the list using the iterators
 * 
 * @author Niudun
 *
 */
public class SongCollection implements java.lang.Iterable<Song> {

	private DoublyLinkedNode<Song> head; // the song where the list starts
	private DoublyLinkedNode<Song> tail; // the song where the list ends
	private boolean playDirectionForward; // the direction that the list is being played

	/**
	 * initialize a song list with head and tail set to be null and forwardPlaylist
	 * set to be true
	 */
	public SongCollection() {
		this.head = null;
		this.tail = null;
		this.playDirectionForward = true;
	}

	/**
	 * adds song to the end/tail of this doubly linked list and when the song is
	 * null, throws a NullPointerException
	 * 
	 * @param song
	 * @throws NullPointerException if the list is empty
	 */
	public void add(Song song) throws java.lang.NullPointerException {
		if (song == null)
			throw new java.lang.NullPointerException("Please add a valid song.");
		// case 1: the list is empty
		if (this.head == null) {
			// creates a head node which contains this song
			DoublyLinkedNode<Song> copy = new DoublyLinkedNode<Song>(song);
			// updates this list accordingly
			this.head = copy;
			this.tail = copy;
		}

		else {
			// case 2: this list is not empty
			DoublyLinkedNode<Song> runner = this.head; // irritates through the list
			while (runner.getNext() != null) {
				runner = runner.getNext(); // finds the last node in the list
			}

			// creates a new node which stores this song
			DoublyLinkedNode<Song> copy = new DoublyLinkedNode<Song>(song);

			// updates this list
			runner.setNext(copy);
			copy.setPrevious(runner);
			this.tail = copy;
		}

	}

	/**
	 * removes the song from the front/head of this list and when list is empty,
	 * throws a NoSuchElementException
	 * 
	 * @return the song removed
	 * @throws NoSuchElementException if the list is empty
	 */
	public Song remove() throws java.util.NoSuchElementException {
		// makes sure the list is non-empty
		if (tail == null)
			throw new java.util.NoSuchElementException("The list is empty. Nothing can be removed.");

		// stores the head and then updates the list
		DoublyLinkedNode<Song> temp = this.head;
		// case 1: the list has only 1 element
		if (temp.getNext() == null) {
			this.head = null;
			this.tail = null;
			return temp.getData();
		}

		// case 2: the list has more than 1 element
		temp.getNext().setPrevious(null);
		this.head = temp.getNext();
		return temp.getData();
	}

	/**
	 * the mutator method to set the forwardPlaylist field
	 */
	public void setPlayDirection(boolean isForward) {
		this.playDirectionForward = isForward;
	}

	/**
	 * creates an iterator based on the forwardPlaylist field
	 * 
	 * @param song where the iterator starts
	 * @return an iterator in accordance with the specified playing direction
	 */
	public Iterator<Song> iterator() {
		if (this.playDirectionForward == true)
			return new Playlist(this.head);
		return new ReversePlaylist(this.tail);
	}

	public static void analysisMethodA(SongCollection songs) {
		songs.add(new Song("C is for Cookie.", "Cookie Monster"));
		songs.add(new Song("Rubber Duckie.", "Ernie"));
		songs.add(new Song("Elmo's Song.", "Elmo"));

	}

	public static void analysisMethodB(SongCollection songs) {
		SongCollection copy = new SongCollection();
		int i = 1;

		for (Song song : songs) {
			// System.out.println("I have been executed " + i++ + " times.");
			System.out.println(song);
		}

	}

	public static void analysisMethodC(SongCollection songs) {
		Iterator<Song> playlist = songs.iterator();
		for (int i = 0; i < 1000; i++)
			if (playlist.hasNext())
				System.out.println(playlist.next());
	}

}

///////////////////////////////////////////////////////////////////////////////////
//For each of the following big-O time complexity analyses, consider the problem
//size to be the number of Songs that are stored within the argument songs, when
//the method is first called.
//
//For analysisMethodA, the big-O time complexity is ____O(1)________.
//
//For analysisMethodB, the big-O time complexity is ____O(n)______.
//
//For analysisMethodC, the big-O time complexity is ____O(1)_______.
//
///////////////////////////////////////////////////////////////////////////////////
