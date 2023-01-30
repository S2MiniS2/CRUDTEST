package com.anyang.wru.domain.image.service;

import com.anyang.wru.domain.image.dto.mapper.UserDTO;
import com.anyang.wru.domain.image.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserService {
    @Autowired
    UserRepository
    public UserDTO insertUser(UserDTO user){
        users.add(user);
        return user;
    }
    //read code
    public static List<UserDTO> getAllUsers(){
        return UserRepository.getAllUsers();
    }
    public static UserDTO getUserByUserID(String userid){
        return UserRepository.getUserByUserID(userid);
    }

    public static UserDTO UpdateUserID(String userid){
        return UserRepository.UpdateUserID(userid);
    }

    public void deleteUser(String userid){
        return UserRepository.deleteUser(userid);
    }
}
