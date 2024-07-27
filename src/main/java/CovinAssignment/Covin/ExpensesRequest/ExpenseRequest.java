package CovinAssignment.Covin.ExpensesRequest;

import java.util.List;

import javax.validation.constraints.NotNull;

import CovinAssignment.Covin.ExpenseManagement.Entity.Split;
import lombok.Data;
@Data
public class ExpenseRequest {
	
	    @NotNull
	    private String description;

	    @NotNull
	    private Double amount;

	    @NotNull
	    private Long userId;

	    @NotNull
	    private List<Split> splits;

	  
	}

