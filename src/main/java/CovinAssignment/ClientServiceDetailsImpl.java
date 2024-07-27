package CovinAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import CovinAssignment.entity.AppClient;
import CovinAssignment.jparepo.ClientRepo;
@Service("clientServiceDetailsImpl")
public class ClientServiceDetailsImpl implements ClientDetailsService {
	@Autowired
	@Qualifier("clientRepo")
	private ClientRepo clientdata;
	
	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

			AppClient appclient=		clientdata.findByUsername(clientId);
		
	BaseClientDetails base=new BaseClientDetails(appclient.getUsername(), null, "read/write", "password", "Role_client");
					base.setClientSecret("{noop}"+appclient.getPassword());
return base;
	}

}
