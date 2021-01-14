package com.reddropforlife.reddropforlife.DAO;

import com.reddropforlife.reddropforlife.Model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Members, Long> {

    @Query("SELECT u FROM Members u WHERE u.email = ?1")
    Members findByEmail(String email);
}
