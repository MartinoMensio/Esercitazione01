/**
 * 
 */
package it.polito.ai.businesslogic;

import java.util.Calendar;

/**
 *
 */
public class TravelDocument {
	private String id, name, description, recap;
	private Calendar duration;
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param recap
	 * @param duration
	 */
	public TravelDocument(String id, String name, String description, String recap, Calendar duration) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.recap = recap;
		this.duration = duration;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the recap
	 */
	public String getRecap() {
		return recap;
	}
	/**
	 * @param recap the recap to set
	 */
	public void setRecap(String recap) {
		this.recap = recap;
	}
	/**
	 * @return the duration
	 */
	public Calendar getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Calendar duration) {
		this.duration = duration;
	}
	
}
