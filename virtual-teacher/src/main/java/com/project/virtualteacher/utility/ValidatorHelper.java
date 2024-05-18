package com.project.virtualteacher.utility;

import com.project.virtualteacher.dto.UserCreateDto;
import com.project.virtualteacher.entity.Course;
import com.project.virtualteacher.entity.User;
import com.project.virtualteacher.exception_handling.error_message.ErrorMessage;
import com.project.virtualteacher.exception_handling.exceptions.EntityExistException;
import com.project.virtualteacher.exception_handling.exceptions.IncorrectInputException;
import com.project.virtualteacher.exception_handling.exceptions.UnAuthorizeException;
import org.springframework.stereotype.Component;

import static com.project.virtualteacher.exception_handling.error_message.ErrorMessage.INCORRECT_CONFIRM_PASSWORD;

@Component
public class ValidatorHelper {

    public void validatePassAndConfirmPass(UserCreateDto user) {
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            throw new IncorrectInputException(INCORRECT_CONFIRM_PASSWORD);
        }
    }

    public boolean isTeacher(User loggedUser) {
        if (loggedUser == null) {
            return false;
        }
        return loggedUser.getRole().getValue().equalsIgnoreCase("ROLE_TEACHER");
    }

    public boolean isAdmin(User loggedUser) {
        if (loggedUser == null) {
            return false;
        }
        return loggedUser.getRole().getValue().equalsIgnoreCase("ROLE_ADMIN");
    }

    public boolean isStudent(User loggedUser) {
        if (loggedUser == null) {
            return false;
        }
        return loggedUser.getRole().getValue().equalsIgnoreCase("ROLE_STUDENT");

    }

    public boolean isTeacherOrAdmin(User loggedUser) {
        return (isAdmin(loggedUser) || isTeacher(loggedUser));
    }

    public void isCreatorOfCourse(Course course, User loggedUser) {
        if (!course.getTeacher().getUsername().equals(loggedUser.getUsername())) {
            throw new UnAuthorizeException(ErrorMessage.NOT_COURSE_CREATOR_ERROR);
        }
    }

    public boolean isUserEnrolledForCourse(User user, Course course) {
        return course.getEnrolledStudents().contains(user);
    }

    public void isLectureTitleExistInCourse(Course course, String title) {
        boolean titleExist = course.getLectures().stream().anyMatch(lecture -> lecture.getTitle().equalsIgnoreCase(title));
        if (titleExist) {
            throw new EntityExistException(ErrorMessage.LECTURE_TITLE_EXIST, title);
        }
    }

    public void throwIfNotTeacherOrAdmin(User user) {
        if (!isTeacherOrAdmin(user)) {
            throw new UnAuthorizeException(ErrorMessage.ADMIN_TEACHER_PERMISSION);
        }
    }

    public void throwIfNotAdmin(User user) {
        if (!isAdmin(user)) {
            throw new UnAuthorizeException(ErrorMessage.ADMIN_PERMISSION_REQUIREMENT);
        }
    }

}
