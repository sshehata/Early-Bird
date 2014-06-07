package engine.journal;

import java.util.Date;

/**
 * @author Samy Shihata 
 * @author Ali Said  
 *
 */
public class Dream {
	
	private String name;
	private String url;
	private byte type;
			// 0 - VIDEO
			// 1 - AUDIO
			// 2 - TEXT
	private Date date;
	
	public Dream() {
		name = "";
		url = "";
		type = -1;
		date = new Date();
	}
	
	public Dream(Date date) {
		this.date = new Date(date.getTime());
	}
	
	public String getName() { 
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String u) {
		url = u;
	}
	
	public Date getDate() {
		return date;
	}
			
	public byte getType() {
		return type;
	}
}
