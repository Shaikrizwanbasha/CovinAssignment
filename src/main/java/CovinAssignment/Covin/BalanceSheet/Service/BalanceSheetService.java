package CovinAssignment.Covin.BalanceSheet.Service;

import static org.assertj.core.api.Assertions.entry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CovinAssignment.Covin.ExpenseManagement.Entity.ExpenseManagement;
import CovinAssignment.Covin.ExpenseManagement.Entity.Split;
import CovinAssignment.Covin.ExpenseManagement.ServiceImpl.ExpenseManagementServiceImpl;
import CovinAssignment.Covin.UserManagement.Serviceimple.Userservicesimpl;
import CovinAssignment.entity.Userentity;
@Service
public class BalanceSheetService {

	    @Autowired
	    private ExpenseManagementServiceImpl expenseService;

	    @Autowired
	    private Userservicesimpl userService;

	    public Map<Userentity, Double> generateBalanceSheet() {
	        Map<Long, Double> userBalances = new HashMap<>();
	        List<ExpenseManagement> allExpenses = expenseService.getAllExpenses();

	        for (ExpenseManagement expense : allExpenses) {
	            for (Split split : expense.getSplits()) {
	                userBalances.put(split.getUserId(), userBalances.getOrDefault(split.getUserId(), 0.0) + split.getAmount());
	            }
	        }

	        Map<Userentity, Double> balanceSheet = new HashMap<>();
	        for (Map.Entry<Long, Double> entry : userBalances.entrySet()) {
	            userService.getUserbyid(entry.getKey()).
	            ifPresent(user -> balanceSheet.put(user, entry.getValue()));
	        }

	        return balanceSheet;
	    }
	}

