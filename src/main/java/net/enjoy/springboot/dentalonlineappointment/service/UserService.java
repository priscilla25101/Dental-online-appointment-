package net.enjoy.springboot.dentalonlineappointment.service;

import net.enjoy.springboot.dentalonlineappointment.dto.UserDto;
import net.enjoy.springboot.dentalonlineappointment.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<User> findAllUsers();
    UserDto getUserById(Long id);
    void updateUser(UserDto userDto);
    void deleteUser(Long id);
}