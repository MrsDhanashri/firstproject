package com.Example.demo.Controllers;

import com.Example.demo.Entities.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/controller")
public class Student_controller {
    @GetMapping("/test")
   public  String TestApl(){
        return "hello spring boot";
    }
    @GetMapping(("/get"))
   public  String Home(){
        return "hello";
   }
   @GetMapping("/info")
   public ResponseEntity<Student> Student_info(){
        Student st = new Student();
        st.setId(1);
        st.setName("dhanashri");
        st.setNumber("1236547895");
        st.setEmail("dhanu@gmail.com");
        st.setPassword("1234");
    return ResponseEntity.status(HttpStatus.CREATED).body(st);
   }

   @PostMapping("/getinfo")
           public ResponseEntity<Student> createstudent(@RequestBody Student st){
      //public Student createstudent( @RequestBody Student st){

        Student s = new Student();
        s.setId(st.getId());
        s.setName(st.getName());
        s.setNumber(st.getNumber());
        s.setEmail(st.getEmail());
        s.setPassword(st.getPassword());
        return ResponseEntity.status(HttpStatus.CREATED).body(st);
      //  return s;
   }
}
