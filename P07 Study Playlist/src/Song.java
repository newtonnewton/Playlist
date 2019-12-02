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
import java.lang.*;

/**
 * An instance of this class represents a single song
 * 
 * @author Niudun
 *
 */
public class Song {

	private String title; // stores the name of this new song
	private String artist; // stores the musician who performs this song

	/**
	 * Initializes a new song with the specified information
	 * 
	 * @param title  or name of this new song
	 * @param artist or musician who performs the song
	 */
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	/**
	 * Returns a string representation of this song. This string should be formatted
	 * as follows: "TITLE by ARTIST", where this song's title and artist are used in
	 * place of the TITLE and ARTIST place holders.
	 * 
	 * @return string representation of this song
	 */
	@Override
	public String toString() {
		return this.title + " by " + this.artist;
	}

	/**
	 * Returns true when this song's title and artist strings contain the same
	 * contents as the other song's title and artist strings, and false otherwise.
	 * 
	 * @param song object to compare this object to
	 * @return true when the two songs have matching tile and artist
	 */
	@Override
	public boolean equals(Object other) {
		return (other instanceof Song && this.artist.equals(((Song) other).artist)
				&& this.title.equals(((Song) other).title));
	}
}
