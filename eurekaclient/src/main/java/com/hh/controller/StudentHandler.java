package com.hh.controller;

import com.hh.repository.StudentReposiyory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.hh.entity.Student;
import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentReposiyory studentReposiyory;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentReposiyory.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentReposiyory.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student stu){
        studentReposiyory.SaveOrUpdate(stu);

    }
    @PutMapping("/update")
    public void update(@RequestBody Student stu){
        studentReposiyory.SaveOrUpdate(stu);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentReposiyory.deleteById(id);
    }
    @GetMapping("/index")
    public String getPort(){
        return "当前端口是："+this.port;
    }
}
