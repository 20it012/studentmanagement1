package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.model.User;
import in.ac.charusat.studentmgmtsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

//    @GetMapping("/user")
//    public List<User> getAllUsers(){
//        public List<User> getAllUsers(){
//            return userRepository.findAll();
//        }
//    }

    @PostMapping("/user")
    public List<User> addUsers(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }
}
