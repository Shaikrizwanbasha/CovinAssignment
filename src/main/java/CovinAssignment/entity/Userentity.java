package CovinAssignment.entity;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Userentity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Userid;
	private String Useremail;
	private String Username;
	private String Usermobile;
}
