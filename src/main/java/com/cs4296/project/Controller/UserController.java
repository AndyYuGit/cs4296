package com.cs4296.project.Controller;

import com.cs4296.project.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/userIntro")
    @Operation(summary = "getting user's introduction")
    @ResponseBody
    public String getAdminEmailPhoneNum(@RequestParam Integer id) throws Exception {
        return userService.getUserIntro(id);
    }
}
