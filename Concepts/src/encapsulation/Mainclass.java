package encapsulation;

//Entity
class User {
	private int UID = 0;// create
	private long aadhar;// create , view
	private String name;// create , update , view
	private String email;// create , update , view
	private String pwd;// create , update
	private long mob;// create , update , view

	public User(int uID, long aadhar, String name, String email, String pwd, long mob) {
		super();
		UID = uID;
		this.aadhar = aadhar;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.mob = mob;
	}

	
	public void setUID(int uID) {
		UID = uID;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

}

public class Mainclass {
	public static void main(String[] args) {
		System.out.println("Program starts...");

		

		System.out.println("Program ends...");
	}
}
