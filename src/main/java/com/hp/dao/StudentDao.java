package com.hp.dao;

import com.hp.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    int create(Student student);

    Student loadById(@Param("id") Integer id);

    void update(Student student);

    void deleteById(@Param("id") Integer id);

    List<Student> fuzzySearch(@Param("keyword")String keyword, @Param("start")Integer start, @Param("limit")Integer limit);

    int fuzzySearchCount(@Param("keyword")String keyword, @Param("start")Integer start, @Param("limit")Integer limit);
}
