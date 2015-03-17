package base;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable {
	private int id;
	private String username;
	private String useremail;
	
	//constructer
	public User(int id, String username, String useremail){
		this.id = id;
		this.useremail = useremail;
		this.username = username;
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	public int getid(){
		return id;
	}
	
	public String getUsername(){
		return username;	
	}
	
	public void setUsername(String name){
		username = name;
	}
	
	public String getUseremail(){
		return useremail;
	}
	
	public void setUseremail(String email){
		useremail = email;
	}
	
	public String toString(){
		return "ID: " + id + "\nUsername: " + username + "\nUseremail: " + useremail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((useremail == null) ? 0 : useremail.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (useremail == null) {
			if (other.useremail != null)
				return false;
		} else if (!useremail.equals(other.useremail))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		if (this.id > u.id){
			return 1;
		}else if(this.id < u.id){
			return -1;
		}else{
			return 0;
		}
		
	}
}
