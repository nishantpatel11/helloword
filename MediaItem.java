package org.capg.training;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int identificationNumber, String title, int no_copies, int runtime) {
		super(identificationNumber, title, no_copies);
		this.runtime = runtime;
	}



	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}

}
