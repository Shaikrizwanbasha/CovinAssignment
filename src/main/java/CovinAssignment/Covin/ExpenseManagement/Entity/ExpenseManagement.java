package CovinAssignment.Covin.ExpenseManagement.Entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import CovinAssignment.entity.Userentity;
import lombok.Data;
@Entity
@Data
public class ExpenseManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private Double amount;
	
	@ManyToOne
	private Userentity users;
	
	@ElementCollection
	private List<Split> splits;

	
}
