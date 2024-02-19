package com.signify.OnlineSystemApplication.repository;
import com.signify.OnlineSystemApplication.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long>{
}
