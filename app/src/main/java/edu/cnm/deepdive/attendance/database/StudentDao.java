package edu.cnm.deepdive.attendance.database;

import java.util.List;

@Dao
public interface StudentDao {

  @insert(onConflict = onConflictStategy.FAIL)
  long insert(Student student);

  @insert(onConflict = onConflictStategy.FAIL)
  List<Long> insert(Student...students);

  @insert(onConflict = onConflictStategy.FAIL)
  List<Long> insert(List<Student> student);

  //TODO add update/delete/select

}
