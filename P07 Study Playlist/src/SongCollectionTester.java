import java.util.NoSuchElementException;

public class SongCollectionTester {

	public static boolean testRemove() {
		boolean passed = true;
		SongCollection song = new SongCollection();
		try {
			Song s = song.remove();
			passed = false;
		}catch(NoSuchElementException e) {
			passed = true;
		}
		catch(Exception e2) {
			passed = false;
		}
		return passed;
	}
	
	public static boolean testPlaylist() {
		SongCollection a = new SongCollection();
		SongCollection.analysisMethodA(a);
		SongCollection.analysisMethodB(a);
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("testRemove(): " + testRemove());
		System.out.println("testPlaylist(): " + testPlaylist());
	}
}
