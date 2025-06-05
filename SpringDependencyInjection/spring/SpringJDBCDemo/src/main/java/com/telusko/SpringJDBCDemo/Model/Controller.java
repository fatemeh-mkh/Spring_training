package com.telusko.SpringJDBCDemo.Model;

import com.telusko.SpringJDBCDemo.Model.Alien;
import com.telusko.SpringJDBCDemo.Model.InterfaceSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/alien")
public class Controller {

    @Autowired
    private InterfaceSevice Is;

//    @GetMapping("/allAlien")
//    public void saveData(Alien alien){
//        Is.saveData(alien);
//    }

    @GetMapping("/allAlien")
    public List<Alien> returnAll() {
        return Is.returnAll();
    }

    @PostMapping
    public void saveData(@RequestBody Alien alien){
        Is.saveData(alien);
    }

    @PutMapping("/updateAliens{id}")
    public int updateAlien(@PathVariable String id,@RequestBody Alien alien){
        alien.setId(id);
        return Is.updateAlien(id,alien);
    }

    @DeleteMapping("/deleteAlien{id}")
    public void deleteAlien(@PathVariable String id){
        Is.deleteAlien(id);
    }


}
