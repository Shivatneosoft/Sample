package com.user.service;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long userId){
        return userRepository.findById(userId);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

    public User getContact(Long contactId) {
        return userRepository.findByContactContactId(contactId);
    }

    public User getContactDepartment(Long contactId, Long departmentId) {
        return userRepository.findByContactContactIdAndDepartmentDepartmentId(contactId, departmentId);
    }
}
