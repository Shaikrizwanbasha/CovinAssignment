package CovinAssignment.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CovinAssignment.entity.AppUser;
@Repository
public interface UserRepo extends JpaRepository<AppUser, Integer> {
	
	abstract public AppUser findByUsername(String username);
	
	/*
	 * @Query("from AppUser au join AppRole ar where au.username=?1") abstract
	 * public List<AppUser> SettingAnRole(String name);
	 */
}
