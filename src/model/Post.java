package model;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Post {
	
	private String postId;
    private String content;
    private String image;
    private Integer likes;
    private String email;
    private String date;
    
    public Post(String postId, String email, String content, String image, String date) {
    	this.postId = postId;
    	this.content = content;
		this.image = image;
		this.email = email;
		this.date = date;
	}
    
    public Post(String email, String content, String image) {
    	SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
 
		this.content = content;
		this.date = SDF.format(new Date());
		this.image = image;
		this.email = email;
	}
    
    public String getPostId() {
		return this.postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}


}
