package CovinAssignment.Covin.UserManagement.Serviceimple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import CovinAssignment.Covin.UserManagement.ServiceDAO.Userservice;
import CovinAssignment.entity.Userentity;
import CovinAssignment.jparepo.UserRepository;


@Service
@ComponentScan("Covin.UserManagement.Serviceimple")
public class Userservicesimpl implements Userservice {
	
	@Autowired
	private UserRepository userreposit;
	
	private Userentity user;

	@Override
	public void saveuserdata(Userentity user) {
		// TODO Auto-generated method stub
		
		try {
			this.userreposit.save(user);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@Override
	public Optional<Userentity> getUserbyid(Long userid) {
		// TODO Auto-generated method stub
			
		return userreposit.findById(userid);
	}

	@Override
	public Userentity deletebyid(Long userid) {
		// TODO Auto-generated method stub
		try {
			this.userreposit.deleteById(userid);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return user;
	}

	@Override
	public List<Userentity> getall() {
		// TODO Auto-generated method stub
		return userreposit.findAll();
	}
	
	
}
