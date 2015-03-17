package base;

import java.util.Date;

public class Friendpost extends Post{

	public Friendpost(Date date, String content, User user) {
		super(date, content, user);
		// TODO Auto-generated constructor stub
		this.setcontent(content);
		this.setDate(date);
		this.setUser(user);
	}

}
