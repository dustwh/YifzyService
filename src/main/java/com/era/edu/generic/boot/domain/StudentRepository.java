package com.era.edu.generic.boot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Integer> {

    @Query(value = "select * from student where stu_tel = ?", nativeQuery = true)
    public List<Student> queryByTel(String userTel);
    @Query(value = "select * from student where user_id = ?", nativeQuery = true)
    public List<Student> queryById(Integer userId);
    @Query(value = "select * from student where stu_tel = ? and stu_password = ?", nativeQuery = true)
    public List<Student> queryByTelPwd(String userTel, String password);
//    stuId,stuTel,stu_name,stu_subject_code,stu_sex,stuPoint,stuPoint_rank,stu_status
    @Query(value = "select * from student where stu_tchr_id = ?", nativeQuery = true)
    public List<Student> queryByTchrid(String tchr_id);
    @Query(value = "select stu_id from student order by stu_id desc limit 1", nativeQuery = true)
    public String queryLastStuid();

    public Student findStudentByStuTel(String stuTel);

    public Student findStudentByTmpPlace(String tmpPlace);
//    @Query(value = "insert into student(name,uid) value(?1,?2)", nativeQuery = true)
//    @Modifying
//    public void insertStudent(String stuId, String stuTel, String stu_name, String stuPassword, String stu_exam_code, String stu_subject_code, String stu_sex, String stu_race, String stu_highschool_code, String stu_height, String stu_email, String stu_qq, String stu_activate_status, Date stu_activate_validity_deadline, String stu_language_code, String stuPoint, String stuPointPolicy_addpoint, String stuPoint_rank, String stuPoint_equal_num, String stuProvince_code, String stu_city_code, String stu_district_code, String stu_eyesight, String stu_colour_weakness, Date stu_register_date, String stuPoint_changeTimes, String stu_highschool_name, String stu_highschool_class, String stuTchrId, String stu_status);
}
