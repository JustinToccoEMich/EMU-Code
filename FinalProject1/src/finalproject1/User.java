package finalproject1;

public class User 
{
	private String userid;
	private String email;
	private String name;
	
	public User(String theUserid, String theEmail, String theName)
	{
		this.userid = theUserid;
		this.email = theEmail;
		this.name = theName;
	}
	
	public String getUserid() {return this.userid;}
	public String getEmail() {return this.email;}
	public String getName() {return this.name;}
	
	public void setUserid(String uid) {this.userid = uid;}
	public void setEmail(String eml) {this.email = eml;}
	public void setName(String nm) {this.name = nm;}
	
}
