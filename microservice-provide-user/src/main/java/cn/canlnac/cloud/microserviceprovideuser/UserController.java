package cn.canlnac.cloud.microserviceprovideuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by can on 2018/5/28 16:22.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}") // @GetMapping == @RequestMapping(method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        User user = userRepository.findOne(id);
        return user;
    }
}
