package base;

import java.io.Serializable;
import java.util.Date;

public class Post implements Comparable<Post>, Serializable {

	private Date date;
	private String content;
	private User user;

	// constructer
	public Post(Date date, String content, User user) {
		this.date = date;
		this.content = content;
		this.user = user;
	}

	public String getcontent() {
		return content;
	}

	public void setcontent(String content) {
		this.content = content;
	}

	public Date getdate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String toString() {
		return /* user.toString() */date + "\n" + content;
	}

	public boolean contains(String str) {
		if (this.content.indexOf(str) < 0) {
			return false;
		} else {
			return true;
		}
	}

	public Post(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Post other = (Post) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public int compareTo(Post o) {
		// TODO Auto-generated method stub
		if (this.date.before(o.date)) {
			return -1;
		} else if (this.date.after(o.date)) {
			return 1;
		} else {
			return 0;
		}
	}
}
