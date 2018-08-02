package tn.sofrecom.firstproject.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BlogCategory
 *
 */
@Entity
@Table(name="blog_category")

public class BlogCategory implements Serializable {

	
	private Integer id;
	private String category;
	private String title;
	private static final long serialVersionUID = 1L;

	public BlogCategory() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
   
}
