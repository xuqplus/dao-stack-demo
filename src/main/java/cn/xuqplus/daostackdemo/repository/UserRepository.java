package cn.xuqplus.daostackdemo.repository;

import cn.xuqplus.daostackdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
