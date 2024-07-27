package CovinAssignment.entity;

 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import CovinAssignment.Covin.ExpenseManagement.Entity.ExpenseManagement;
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
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<ExpenseManagement> expenses;
}
