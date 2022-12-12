package com.mycompany.simple_crud_wildfly.controller;

import com.mycompany.simple_crud_wildfly.dto.UserDTO;
import com.mycompany.simple_crud_wildfly.service.LoginService;
import com.mycompany.simple_crud_wildfly.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService loginService;

/*    @Autowired
    Encryption encryption;

    @PostMapping(params = {"userName", "password"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil userLogin(@RequestParam String userName, String password) {

        for (UserDTO dto : loginService.fetchAllUser()) {
            String passwordEncrypt = dto.getPassword();
            String passwordDecrypt = null;
            try {
                passwordDecrypt = encryption.decrypt(passwordEncrypt);
            } catch (IllegalBlockSizeException e) {
                e.printStackTrace();
            } catch (BadPaddingException e) {
                e.printStackTrace();
            } catch (InvalidKeyException e) {
                e.printStackTrace();
            }
            if (dto.getUserName().equalsIgnoreCase(userName) & passwordDecrypt.equalsIgnoreCase(password)) {
                return new ResponseUtil(200, "Ok", null);
            }
        }

        return new ResponseUtil(400, "error", null);
    }
}*/


    @PostMapping(params = {"userName", "password"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil userLogin(@RequestParam String userName, String password) {

        for (UserDTO dto : loginService.fetchAllUser()) {
            if (dto.getUserName().equalsIgnoreCase(userName) & dto.getPassword().equalsIgnoreCase(password)) {
                return new ResponseUtil(200, "Ok", null);
            }
        }

        return new ResponseUtil(400, "error", null);
    }
}
