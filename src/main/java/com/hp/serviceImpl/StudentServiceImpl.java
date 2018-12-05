package com.hp.serviceImpl;

import com.hp.dao.StudentDao;
import com.hp.entity.Student;
import com.hp.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    public int create(Student student) {
        return studentDao.create(student);
    }

    public Student loadById(Integer id) {
        return studentDao.loadById(id);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void deleteById(Integer id) {
        studentDao.deleteById(id);
    }

    public List<Student> fuzzySearch(String keyword, Integer start, Integer limit) {
        return studentDao.fuzzySearch(keyword, start, limit);
    }

    public int fuzzySearchCount(String keyword, Integer start, Integer limit) {
        return studentDao.fuzzySearchCount(keyword, start, limit);
    }
}
