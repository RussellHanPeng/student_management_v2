package com.hp.service;

import com.hp.entity.Student;

import java.util.List;

public interface StudentService {

    int create(Student student);

    Student loadById(Integer id);

    void update(Student student);

    void deleteById(Integer id);

    List<Student> fuzzySearch(String keyword, Integer start, Integer limit);

    int fuzzySearchCount(String keyword, Integer start, Integer limit);
}
