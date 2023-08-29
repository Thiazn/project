package com.mat.academyproject.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mat.academyproject.model.Amministratore;
import com.mat.academyproject.repository.AmministratoreRepository;

public class AmministratoreDetailsService implements UserDetailsService{
	private AmministratoreRepository amministratoreRepository;
	
	public AmministratoreDetailsService(AmministratoreRepository amministratoreRepository) {
		this.amministratoreRepository = amministratoreRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			Amministratore amministratore = amministratoreRepository.findByUsername(username).get() ;
			if(amministratore != null) {
				return User.withUsername(amministratore.getUsername())
						.accountLocked(!amministratore.isEnabled())
						.password(amministratore.getPassword())
						.roles(amministratore.getRole())
						.build();
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		throw new UsernameNotFoundException(username);
	}

}
