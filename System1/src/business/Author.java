package business;

import java.io.Serializable;

final public class Author extends Person implements Serializable {
	private String bio;
	private String credentials;
	public String getBio() {
		return bio;
	}

	public Author()
	{
		
	}
	public Author(String f, String l, String t, Address a, String bio) {
		super(f, l, t, a);
		this.bio = bio;
		//this.credentials=cred;
		
	}
	public Author(String f, String l, String t, Address a, String bio,String cred) {
		super(f, l, t, a);
		this.bio = bio;
		this.credentials=cred;
		
	}

	private static final long serialVersionUID = 7508481940058530471L;

}
