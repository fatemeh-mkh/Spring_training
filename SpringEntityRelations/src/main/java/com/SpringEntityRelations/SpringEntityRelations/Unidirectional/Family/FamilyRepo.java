package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyRepo extends JpaRepository<Family,Integer> {

    @Query("SELECT f FROM Family f WHERE f.motherName = :motherName")
    Page<Family>findByMotherName(@Param("motherName") String motherName, Pageable pageable);

    @Query("SELECT e FROM Family e ORDER BY e.fatherName DESC")
    List<Family> getFamilyOrderByFatherName();
//**********************************************************
    //interface projection
//@Query("SELECT FROM Family f, WHERE f.motherName :motherName")
//    List<FamilyNameProjection> findFamiliesByMotherName(String motherName);

    List<CustomerFamilyNameProjection> findAllByFatherName(String fatherName);
    List<CustomerFamilyNameProjection> findAllByMotherName(String motherName);
    List<CustomerFamilyNameProjection> findAllByMotherNameAndFatherName(String motherName,String fatherName);

    List<CustomerFamilyNameProjection> findAllByMotherNameIsLikeIgnoreCase(String motherName);
    @Query("SELECT new com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family.FamilyNameProjection(f.id,f.motherName,f.fatherName)" +
            "FROM Family f WHERE f.motherName = :motherName")
    List<FamilyNameProjection> findFamiliesByMotherName(@Param("motherName") String motherName);

    @Query("Select new com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family.FamilyNameProjection(f.id,f.motherName,f.fatherName)" +
            "From Family f WHERE f.motherName LIKE %:motherName%")
    List<FamilyNameProjection> getZChar( String motherName);

//*******************************************

    //jpql
    @Query(" From Family f ")
    List<CustomerFamilyNameProjection> getAllFamily();

}
