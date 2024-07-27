package CovinAssignment.Covin.ExpenseManagement.Entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Split {
	
	 	private Long userId;
	    private Double amount;
	    private Double percentage;
		    
}
