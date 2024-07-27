package CovinAssignment.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class AppUser {
@Id
@GeneratedValue
private Integer id;
private String username;
private String password;
@ManyToMany(fetch = FetchType.EAGER)
@JoinTable
			(name="User_Role",
			joinColumns = {  @JoinColumn(name="userId")},
			inverseJoinColumns = { @JoinColumn(name="roleId")}
				)
private List<AppRole> approles; 
}
