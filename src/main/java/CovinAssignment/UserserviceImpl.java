package CovinAssignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import CovinAssignment.entity.AppRole;
import CovinAssignment.entity.AppUser;
import CovinAssignment.jparepo.UserRepo;
import lombok.extern.slf4j.Slf4j;
@Service("userserviceImpl")
@Slf4j
public class UserserviceImpl implements UserDetailsService {

	@Autowired
	@Qualifier("userRepo")
	private UserRepo userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
			AppUser user=	userrepo.findByUsername(username);
				log.info(user.toString());
				
				
				  List<AppRole> rolelist=user.getApproles();
				  
				  String[] roles=new String[(rolelist.size())];
				  
				  for(int i=0; i<rolelist.size(); i++) {
				  
				  roles[i]=rolelist.get(i).getName(); }
				 
			
		
		return User.builder().username(user.getUsername())
				.password("{noop}"+user.getPassword()).roles().build();
	}

}
