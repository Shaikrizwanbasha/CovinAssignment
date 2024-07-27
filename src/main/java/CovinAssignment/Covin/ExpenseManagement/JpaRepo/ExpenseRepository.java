package CovinAssignment.Covin.ExpenseManagement.JpaRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import CovinAssignment.Covin.ExpenseManagement.Entity.ExpenseManagement;

@Repository
@EnableJpaRepositories
public interface ExpenseRepository extends JpaRepository<ExpenseManagement, Long> {
		
	@Query("select Ex from ExpenseManagement Ex where Ex.id=?1")
	List<ExpenseManagement> FindbyExpenseManagementId(Long Id);

	//List<ExpenseManagement> findbyExpenseManagements(Long id);
	//abstract public List<ExpenseManagement> findbyuserid(Long id);
}
