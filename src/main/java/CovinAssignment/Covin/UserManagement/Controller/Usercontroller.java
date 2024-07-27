package CovinAssignment.Covin.UserManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CovinAssignment.Covin.UserManagement.Serviceimple.Userservicesimpl;
import CovinAssignment.entity.Userentity;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {
	
	@Autowired
	private Userservicesimpl userservices;
	
	
	
	@PostMapping
	public ResponseEntity<Userentity>savedata(@RequestBody Userentity userentity){
				
				userservices.saveuserdata(userentity);
		
	return ResponseEntity.ok(userentity);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Userentity> getbyid(@PathVariable Long Userid){
		Optional<Userentity>		user	=	userservices.getUserbyid(Userid);
							
		return userservices.getUserbyid(Userid)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Userentity>deletebyid(@PathVariable Long Userid){
		
			Userentity	user	=	userservices.deletebyid(Userid);
		
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/{all}")
	public ResponseEntity<List<Userentity>>getall(){
		
		List<Userentity>	li=	 userservices.getall();
		
		return ResponseEntity.ok(li);
	
	}






}
