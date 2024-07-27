package CovinAssignment.Covin.ExpenseManagement.ServiceDAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import CovinAssignment.Covin.ExpenseManagement.Entity.ExpenseManagement;

@Repository
public interface ExpenseManagementServices {
	
	abstract public  void addexpensedata(ExpenseManagement expense);
	 
	abstract public List<ExpenseManagement> getExpensesByUserId(Long userId);
	
	abstract public List<ExpenseManagement> deleteExpensesByuserId(Long userId);
	
	abstract public List<ExpenseManagement> getAllExpenses();
}
