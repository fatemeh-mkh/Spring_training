package com.telusko.SpringJDBCDemo.Model;

import com.telusko.SpringJDBCDemo.Model.Alien;
import com.telusko.SpringJDBCDemo.Model.InterfaceSevice;
import com.telusko.SpringJDBCDemo.Model.AlienRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
//@Slf4j
@Transactional

public class Service implements InterfaceSevice {

    @Autowired
    private AlienRepo rep;

    @Override
    public void saveData(Alien alien){
        rep.saveData(alien);
    }

    @Override
    public List<Alien> returnAll() {
    return rep.returnAll();
        }

    @Override

    public int updateAlien(String id,Alien alien) {

        return rep.updateAlien(id,alien);
    }

    @Override
    public void deleteAlien(String id){
        rep.deleteAlien(id);
    }

}
