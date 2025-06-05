package com.telusko.spring_boot_rest;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {


    @Autowired
    JobService service;

    @GetMapping(path="jobPosts",produces = {"application/json"})//the request is for this url
    // @ResponseBody //this annotation say I want to return data not page,don't search for jsp file for return page.instead we can use RestController on the top

    public List<JobPost> getAllJobs(){ //return data not page

        return service.getAllJobs();
    }


//get data from server
    @GetMapping("jobPosts/{postId}")
    public JobPost getOneJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }


    //send data to server
    @PostMapping(path="jobPost",consumes = "application/xml")
    public void addjob(@RequestBody JobPost jp){
         service.addJobPost(jp);
    }

    @PutMapping("jobPostss")
    public JobPost updateJob(@RequestBody JobPost jp){

        service.updateJob(jp);
        return service.getJob(jp.getPostId());
    }

//    @GetMapping("jobPost/{Id}")
//    public JobPost getjob(@PathVariable("Id") int Id){
//        return service.getJob(Id);
//    }
}
