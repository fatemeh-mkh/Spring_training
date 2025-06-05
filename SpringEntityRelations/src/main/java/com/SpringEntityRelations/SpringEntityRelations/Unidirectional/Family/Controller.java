package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    FamilyService familyService;

    @GetMapping("/getFamilyList")

    public ResponseEntity<Page<Family>> getProducts(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "3") int pageSize,
            @RequestParam(required = false,defaultValue = "id") String sortBy,
            @RequestParam(required = false,defaultValue = "ascending") String sortDir
    ) {

        Page<Family> products = familyService.getProducts(pageNo, pageSize,sortBy,sortDir);
        return ResponseEntity.ok(products);
    }




    @GetMapping("/getByMotherName")
    public ResponseEntity <Page<Family>> getProductsByMotherName(String motherName,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "1") int pageSize

    ) {
        Page<Family> products = familyService.getFamilyByMotherName(motherName,pageNo, pageSize);
        return ResponseEntity.ok(products);
    }
    @GetMapping("/by_motherName")
    public ResponseEntity<Page<Family>> getFamiliesByNameAndRelation(
            @RequestParam String motherName,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize) {

        Page<Family> families = familyService.getFamilyByMotherName(motherName,pageNo,pageSize);
        return ResponseEntity.ok(families);
    }

    @GetMapping("/byFatherName")
    public ResponseEntity<List<Family>> getByFatherName(){
        List<Family> families=familyService.getFamilyOrderByFatherName();
        return ResponseEntity.ok(families);
    }
    //****************************************************************************
    //projections


    @GetMapping("/name")
    @ResponseBody
    public List<FamilyNameProjection> getCustomerNames(@RequestParam String motherName) {
        return familyService.getMotherNames(motherName);
    }


    @GetMapping("/nameZ")
    @ResponseBody
    public List<FamilyNameProjection> getChar() {
        return familyService.getZCharMotherName();
    }


    @GetMapping("/searchNameF")
    @ResponseBody
    public List<CustomerFamilyNameProjection> getName() {
        return familyService.getPrepareLikeQuery();
    }

    @GetMapping("/searchAll")
    @ResponseBody
    public List<CustomerFamilyNameProjection> getMotherAndFather(
            @RequestParam(required = false) String motherName,
            @RequestParam(required = false) String fatherName)
    {
        return familyService.searchByMotherAndFather(motherName,fatherName);
    }

    @GetMapping("/allFamilies")
    @ResponseBody
    public List<CustomerFamilyNameProjection> getFamilies(){
        return familyService.getAllFamilies();
    }
}
