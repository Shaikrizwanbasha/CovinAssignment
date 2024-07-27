package CovinAssignment.Covin.ExpenseManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CovinAssignment.Covin.ExpenseManagement.Entity.ExpenseManagement;
import CovinAssignment.Covin.ExpenseManagement.ServiceImpl.ExpenseManagementServiceImpl;

@RestController
@RequestMapping("/api/Expenses")
public class ExpenseManagementController {
	
	@Autowired
	private ExpenseManagementServiceImpl ExpenseController;
	

	
	@PostMapping
	public ResponseEntity<ExpenseManagement> adddata(@RequestBody ExpenseManagement Expense){
		
		this.ExpenseController.addexpensedata(Expense);
		
		return ResponseEntity.ok(Expense);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<ExpenseManagement>>getbyid(@PathVariable Long id){
		
	List<ExpenseManagement>	li=	ExpenseController.getExpensesByUserId(id);
		
		return ResponseEntity.ok(li);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<List<ExpenseManagement>>deletebyid(@PathVariable Long id){
		
	List<ExpenseManagement>li=	ExpenseController.deleteExpensesByuserId(id);
	
	return ResponseEntity.ok(li);
	}
	@GetMapping("/{all}")
	public ResponseEntity<List<ExpenseManagement>>getall(){
	
	List<ExpenseManagement>li=	ExpenseController.getAllExpenses();
	
	return ResponseEntity.ok(li);
	}
	
}
