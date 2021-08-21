//package com.validation.DtoValidation.converter;
//
//import com.validation.DtoValidation.dto.UserDto;
//import com.validation.DtoValidation.entity.User;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class Userconverter {
//    public UserDto entityToDto(User user) {
//        UserDto dto = new UserDto();
//        dto.setId(user.getId());
//        dto.setName(user.getName());
//        dto.setEmail(user.getEmail());
//        dto.setPassword(user.getPassword());
//        return dto;
//    }
//
//    public List<UserDto> entityToDto(List<User> users) {
//        return users.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
//    }
//    public User dtoToEntity(UserDto dto){
//        User ur=new User();
//        ur.setId(dto.getId());
//        ur.setName(dto.getName());
//        ur.setEmail(dto.getEmail());
//        ur.setPassword(dto.getPassword());
//        return ur;
//
//    }
//    public List<User> dtoToEntity(List<UserDto> dtos) {
//        return dtos.stream().map(x-> dtoToEntity(x)).collect(Collectors.toList());
//    }
//}
