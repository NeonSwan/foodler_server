package main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
	private String itemName;

	public String getItemName() {
		return itemName;
	}

	public void setSubjectID(String subjectID) {
		this.itemName = subjectID;
	}

	
	
}
