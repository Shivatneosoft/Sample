package com.user.repository;

import com.user.entity.Contact;
import com.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByContactContactId(Long contactId);

    User findByContactContactIdAndDepartmentDepartmentId(Long contactId, Long departmentId);

}
