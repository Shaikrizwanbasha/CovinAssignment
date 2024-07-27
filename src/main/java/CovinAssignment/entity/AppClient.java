package CovinAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AppClient {
		@Id
		@GeneratedValue
	private Integer id;
	private String username;
	private String password;
}
