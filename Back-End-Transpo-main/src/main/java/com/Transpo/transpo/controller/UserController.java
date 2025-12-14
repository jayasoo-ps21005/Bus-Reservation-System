// package com.Transpo.transpo.controller;

// import com.Transpo.transpo.dto.UserDTO;
// import com.Transpo.transpo.mapper.UserMapper;
// import com.Transpo.transpo.model.Role;
// import com.Transpo.transpo.model.User;
// import com.Transpo.transpo.service.UserService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.stream.Collectors;

// @RestController
// @RequestMapping("/users")
// public class UserController {

//     private final UserService userService;

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     @PostMapping
//     public UserDTO createUser(@RequestBody User user) {
//         return UserMapper.toDTO(userService.createUser(user));
//     }

//     @GetMapping
//     public List<UserDTO> getAllUsers() {
//         return userService.getAllUsers()
//                 .stream()
//                 .map(UserMapper::toDTO)
//                 .collect(Collectors.toList());
//     }

//     @GetMapping("/{id}")
//     public UserDTO getUser(@PathVariable String id) {
//         return UserMapper.toDTO(userService.getUserById(id));
//     }

//     @PutMapping("/{id}/role")
//     public UserDTO updateRole(@PathVariable String id, @RequestParam Role role) {
//         return UserMapper.toDTO(userService.updateUserRole(id, role));
//     }

//     @DeleteMapping("/{id}")
//     public void deleteUser(@PathVariable String id) {
//         userService.deleteUser(id);
//     }
// }
