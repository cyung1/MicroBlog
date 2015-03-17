package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import base.Friendpost;
import base.Post;
import base.User;

public class main {
	public String getInput(){
		String line = "";
		System.out.println("Enter the prompt: ");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return line;
	}
	
	public static void main(String[] args) {
		User user = new User(0, "Zoe", "zoecy3@hotmail.com");
		Date date = new Date();
		String content = "Hello!!I am Derek!!";
		Post post = new Post(date, content, user);
		System.out.println(post.toString());
		
		
		User user01 = new User(1, "COMP3021", "COMP3021@cse.ust.hk");
		Date d = new Date();
		String content01 = "This is my first post";
		Friendpost postfromfriend = new Friendpost(d, content01, user01);
		System.out.println(postfromfriend.toString());
		System.out.println(postfromfriend.contains("first"));
		System.out.println(postfromfriend.contains("HKUST"));
		
		
		
		
	}
}
