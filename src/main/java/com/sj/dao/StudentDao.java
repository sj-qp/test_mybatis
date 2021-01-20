package com.sj.dao;


import com.sj.entity.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 添加学生
     * @param student
     * @return
     */
    public int insertStudent(Student student);
    /**
     * 删除学生
     * @param id 学生id
     * @return
     */
    public int deleteStudent(Integer id);
    /**
     * 修改学生信息
     * @param student
     * @return
     */
    public int updateStudent(Student student);
    /**
     * 查询所有学生信息
     * @return
     */
    public List<Student> selectAllStudents();
}