package cn.edu.sdut.softlab.training.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by sjj on 2015/10/24 0024.
 */
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
  
  public static final long serialVersionUID = 1L;

  private int id;
  private String firstName;
  private String lastName;
  private String password;
  private Collection<BlogEntity> blogsById;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "firstName", nullable = true, insertable = true, updatable = true, length = 45)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Basic
  @Column(name = "lastName", nullable = true, insertable = true, updatable = true, length = 45)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Basic
  @Column(name = "password", nullable = true, insertable = true, updatable = true, length = 45)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    UserEntity that = (UserEntity) obj;

    if (id != that.id) {
      return false;
    }
    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) {
      return false;
    }
    if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) {
      return false;
    }
    if (password != null ? !password.equals(that.password) : that.password != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
    return result;
  }

  @OneToMany(mappedBy = "userByUserid")
  public Collection<BlogEntity> getBlogsById() {
    return blogsById;
  }

  public void setBlogsById(Collection<BlogEntity> blogsById) {
    this.blogsById = blogsById;
  }
}
