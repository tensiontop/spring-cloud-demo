package com.tension.cloud.study.repository;

import com.tension.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhangli
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

