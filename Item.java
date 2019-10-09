package org.capg.training;

public abstract class Item 
{
private int identificationNumber;
private String title;
private int no_copies;
public int getIdentificationNumber() {
	return identificationNumber;
}
public void setIdentificationNumber(int identificationNumber) {
	this.identificationNumber = identificationNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNo_copies() {
	return no_copies;
}
public void setNo_copies(int no_copies) {
	this.no_copies = no_copies;
}
@Override
public String toString() {
	return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", no_copies=" + no_copies
			+ ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()=" + getTitle()
			+ ", getNo_copies()=" + getNo_copies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	if (identificationNumber != other.identificationNumber)
		return false;
	if (no_copies != other.no_copies)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}
public Item(int identificationNumber, String title, int no_copies) {
	super();
	this.identificationNumber = identificationNumber;
	this.title = title;
	this.no_copies = no_copies;
}
public Item() {
	super();
}



}
