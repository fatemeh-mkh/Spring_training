package com.telusko.SpringJDBCDemo.Model;

import java.util.List;

public interface InterfaceSevice {
    public void saveData(Alien alien);
    public List<Alien> returnAll();
    public int updateAlien(String id,Alien alien) ;
    public void deleteAlien(String id);
}
