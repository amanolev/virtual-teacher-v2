package com.project.virtualteacher.dao.contracts;

import com.project.virtualteacher.entity.Course;
import com.project.virtualteacher.entity.EnrollStudent;
import com.project.virtualteacher.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CourseDao {

    Course createCourse(Course course);

    Optional<Course> getCourseByTitle(String title);

    Optional<Course> getCourseById(int id);

    boolean isCourseTitleExist(String title);

    void delete(Course course);

    Course update(Course course);

    Optional<Course> getPublicCourseById(int courseId);

    Optional<Course> getPublicCourseByTitle(String title);

    Set<Course> getAllPublic();

    Set<Course> getAll(int page,int size);

    void enrollUserForCourse(EnrollStudent student);

    Optional<Course> getCourseByLectureId(int lectureId);

    List<Course> getCoursesByTopic(String topic);
}

