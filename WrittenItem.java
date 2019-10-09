package org.capg.training;

public abstract class WrittenItem extends Item {
private String authorData;

public WrittenItem(int identificationNumber, String title, int no_copies) {
	super(identificationNumber, title, no_copies);
	this.authorData = authorData;
}

@Override
public String toString() {
	return "WrittenItem [authorData=" + authorData + "]";
}

public String getAuthorData() {
	return authorData;
}

public void setAuthorData(String authorData) {
	this.authorData = authorData;
}




}
