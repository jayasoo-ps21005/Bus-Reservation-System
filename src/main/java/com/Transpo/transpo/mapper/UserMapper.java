package com.Transpo.transpo.mapper;

import com.Transpo.transpo.dto.UserDTO;
import com.Transpo.transpo.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole());
    }
}
