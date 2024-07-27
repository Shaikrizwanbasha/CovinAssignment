package CovinAssignment.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CovinAssignment.entity.AppClient;
@Repository
public interface ClientRepo extends JpaRepository<AppClient, Integer> {

	abstract public AppClient findByUsername(String username);
	
}
