package com.reddropforlife.reddropforlife.Controller.Service;

import com.reddropforlife.reddropforlife.DAO.CustomUserDetails;
import com.reddropforlife.reddropforlife.DAO.MemberRepository;
import com.reddropforlife.reddropforlife.Model.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserdetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Members member = repo.findByEmail(email);
        if(member == null){
            throw new UsernameNotFoundException("User Not Found!");
        }
        return new CustomUserDetails(member);
    }
}
