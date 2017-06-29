package cn.edu.sdut.softlab.training.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by sjj on 2015/10/24 0024.
 */
@Entity
@Table(name = "blog")
public class BlogEntity implements Serializable {

  public static final long serialVersionUID = 1L;

  private int id;
  private String title;
  private String content;
  private UserEntity userByUserid;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO) 
 public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 100)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Basic
  @Column(name = "content", nullable = true, insertable = true, updatable = true, length = 255)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    BlogEntity that = (BlogEntity) obj;

    if (id != that.id) {
      return false;
    }
    if (title != null ? !title.equals(that.title) : that.title != null) {
      return false;
    }
    if (content != null ? !content.equals(that.content) : that.content != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (content != null ? content.hashCode() : 0);
    return result;
  }

  @ManyToOne
  @JoinColumn(name = "userid", referencedColumnName = "id")
  public UserEntity getUserByUserid() {
    return userByUserid;
  }

  public void setUserByUserid(UserEntity userByUserid) {
    this.userByUserid = userByUserid;
  }
}
