package CovinAssignment.Covin.UserManagement.ServiceDAO;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import CovinAssignment.entity.Userentity;

@Repository
public interface Userservice  {

	abstract public void saveuserdata(Userentity user);

	abstract public Optional<Userentity> getUserbyid(Long userid);
	
	abstract public Userentity deletebyid(Long userid);
	
	abstract public List<Userentity> getall();

}
