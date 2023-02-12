package com.cs4296.project.Service;

import com.cs4296.project.Entity.User;
import com.cs4296.project.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getUserIntro(Integer id){
        String message=null;
        Optional<User> optional= userRepository.findById(id);
        if(!optional.isEmpty()){
            message= optional.get().getIntro();
        }
        return message;
    }
}
