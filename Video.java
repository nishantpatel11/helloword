package org.capg.training;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year_released;
	

	public Video(int identificationNumber, String title, int no_copies, int runtime, String director, String genre,
			int year_released) {
		super(identificationNumber, title, no_copies, runtime);
		this.director = director;
		this.genre = genre;
		this.year_released = year_released;
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", year_released=" + year_released + "]";
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear_released() {
		return year_released;
	}

	public void setYear_released(int year_released) {
		this.year_released = year_released;
	}

	public Video(int identificationNumber, String title, int no_copies, int runtime) {
		super(identificationNumber, title, no_copies, runtime);
	}

}
