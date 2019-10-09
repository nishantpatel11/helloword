package org.capg.training;

public class CD extends MediaItem{
	private String artist;
	private String genre;

	public CD(int identificationNumber, String title, int no_copies, int runtime) {
		super(identificationNumber, title, no_copies, runtime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}

	public CD(int identificationNumber, String title, int no_copies, int runtime, String artist, String genre) {
		super(identificationNumber, title, no_copies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
