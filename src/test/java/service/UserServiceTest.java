package service;


import baseTest.SpringTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pojo.UserInfo;
import com.service.UserService;

public class UserServiceTest extends SpringTestCase {
    @Autowired
    private UserService userService;
    @Test
    public void selectUserByIdTest(){
        UserInfo user = userService.selectUserById(1);
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }
}
