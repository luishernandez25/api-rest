package com.api.rest.web.controller;


import com.api.rest.domain.User;
import com.api.rest.domain.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usersApp")
public class UserController {

    @Autowired
    private UserService userService;





    // metodo para obtener los usuarios
    @ApiOperation("Obtener la lista de usuarios")
    @ApiResponse(code= 200, message = "OK")
    @GetMapping("/all")
    public ResponseEntity <List<User>> todos(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);


    }
    @ApiOperation("Obtener un usuario por input")
    @ApiResponse(code= 200, message = "OK")
    @GetMapping("/userApp/{userId}")
    public ResponseEntity<List <User>> obtener(@PathVariable("userId")String userId){
        return userService.getByUser(userId).map(users -> new ResponseEntity<>(users, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @ApiOperation("Crear un usuario")
    @ApiResponse(code= 200, message = "OK")
    @PostMapping("/save")
    public ResponseEntity <User> hola (@RequestBody User user){
        return new ResponseEntity<>(userService.save(user),HttpStatus.CREATED);


    }
}
