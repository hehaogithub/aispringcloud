package com.hh.repository;

import com.hh.entity.Student;

import java.util.Collection;

public interface StudentReposiyory {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void SaveOrUpdate(Student stu);
    public void deleteById(long id);
}
