package CovinAssignment.Covin.ExpenseManagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CovinAssignment.Covin.ExpenseManagement.Entity.ExpenseManagement;
import CovinAssignment.Covin.ExpenseManagement.JpaRepo.ExpenseRepository;
import CovinAssignment.Covin.ExpenseManagement.ServiceDAO.ExpenseManagementServices;

@Service
public class ExpenseManagementServiceImpl implements ExpenseManagementServices {
	
	@Autowired
	private ExpenseRepository expenserepo;
	
	private List<ExpenseManagement>  expense;

	@Override
	public void addexpensedata(ExpenseManagement expense) {
		// TODO Auto-generated method stub
			try {
				this.expenserepo.save(expense);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		
	}

	@Override
	public List<ExpenseManagement> getExpensesByUserId(Long userId) {
		// TODO Auto-generated method stub
		try {
			this.expenserepo.findById(userId);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return expense;
	}

	@Override
	public List<ExpenseManagement> deleteExpensesByuserId(Long userId) {
		// TODO Auto-generated method stub
		try {
			this.expenserepo.deleteById(userId);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return expense;
	}

	@Override
	public List<ExpenseManagement> getAllExpenses() {
		// TODO Auto-generated method stub
		
		
		return expenserepo.findAll();
	}
	 

	   






}
