package CovinAssignment.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import CovinAssignment.entity.Userentity;
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<Userentity, Long> {

}
