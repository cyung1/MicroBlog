package base;

import java.util.Comparator;

public class PostSortByContentLength implements Comparator<Post>{

	@Override
	public int compare(Post p0, Post p1) {
		// TODO Auto-generated method stub
		if(p0.getcontent().length() > p1.getcontent().length()){
			return 1;
		}else if(p0.getcontent().length() < p1.getcontent().length()){
			return -1;
		}else{
			return 0;
		}
	}

}
