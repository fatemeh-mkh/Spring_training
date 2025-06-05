package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class FamilyService {

    @Autowired
    FamilyRepo familyRepo;


    public Page<Family> getProducts(int pageNo, int pageSize, String sortBy,String sortDir) {


        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.DESC.name())?
                 Sort.by(sortBy).descending()
                :Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(pageNo ,pageSize,sort);
        return familyRepo.findAll(pageable);
    }

    public Page<Family> getFamilyByMotherName(String motherName,int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return familyRepo.findByMotherName(motherName,pageable);
    }

    public List<Family> getFamilyOrderByFatherName(){
//        Pageable pageable1=PageRequest.of(pageNo,pageSize);
        return familyRepo.getFamilyOrderByFatherName();

    }
    public List<FamilyNameProjection> getMotherNames(String motherName) {
        return familyRepo.findFamiliesByMotherName(motherName);
    }
    public List<FamilyNameProjection> getZCharMotherName() {
        return familyRepo.getZChar("Z_h");
    }

    public List<CustomerFamilyNameProjection> getPrepareLikeQuery() {
        return familyRepo.findAllByMotherNameIsLikeIgnoreCase("%F_t%");
    }

//********************************************************************
    public List<CustomerFamilyNameProjection> getAllFamilies() {
        return familyRepo.getAllFamily();
    }
//********************************************************************


    public List<CustomerFamilyNameProjection> searchByMotherAndFather( String motherName, String fatherName) {
        if(StringUtils.hasText(motherName) && fatherName==null){
           return familyRepo.findAllByMotherName(motherName);
        }
        else if(StringUtils.hasText(fatherName) && motherName==null) {
           return familyRepo.findAllByFatherName(fatherName);
        }
        else
        return familyRepo.findAllByMotherNameAndFatherName(motherName,fatherName);

    }


}
