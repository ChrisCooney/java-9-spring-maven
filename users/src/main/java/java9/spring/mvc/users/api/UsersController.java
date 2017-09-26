package java9.spring.mvc.users.api;

import java9.spring.mvc.users.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/users")
@RestController
public class UsersController {

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public User getUser(@PathVariable("id") String id) {
        System.out.println(String.format("Got request for user with id %s", id));
        return new User(id, "Chris", "His social life is so poor he spends his time talking about himself in code");
    }

}
