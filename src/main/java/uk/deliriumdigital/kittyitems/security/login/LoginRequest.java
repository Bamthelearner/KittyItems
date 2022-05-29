package uk.deliriumdigital.kittyitems.security.login;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

	private String username;	
	private String password;
	private String flowAddress;
	private String privateKey;
}
