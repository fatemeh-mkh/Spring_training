package com.telusko.Springboot.service;

import com.telusko.Springboot.Dto.UserLocationDTO;
import com.telusko.Springboot.model.User;
import com.telusko.Springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository Ur;

    public List<UserLocationDTO> getAllUsersLocation(){
        return Ur.findAll() //get all the data from repo
                .stream()//convert to stream object for mapping
                .map(this ::convertEntityToDTO) // convert your entity to userlocdto
                .collect(Collectors.toList());//collect all elements in one list

    }

    private UserLocationDTO convertEntityToDTO(User user){
        UserLocationDTO uldto = new UserLocationDTO();
        uldto.setUserId(user.getId());
        uldto.setEmail(user.getEmail());
        uldto.setPlace(user.getLoc().getPlace());
        uldto.setLatitude(user.getLoc().getLatitude());
        uldto.setLongitude(user.getLoc().getLongitude());

        return uldto;
    }
}

