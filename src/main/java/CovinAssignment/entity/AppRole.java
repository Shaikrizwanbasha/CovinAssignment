package CovinAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AppRole {
@Id
@GeneratedValue
private Integer roleid;
private String name;

}
