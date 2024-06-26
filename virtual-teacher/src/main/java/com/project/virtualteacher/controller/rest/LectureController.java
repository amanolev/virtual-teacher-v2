package com.project.virtualteacher.controller.rest;

import com.project.virtualteacher.dto.LectureBaseDto;
import com.project.virtualteacher.dto.LectureFullDto;
import com.project.virtualteacher.entity.Lecture;
import com.project.virtualteacher.entity.User;
import com.project.virtualteacher.service.contracts.LectureService;
import com.project.virtualteacher.utility.UserValidatorHelperImpl;
import com.project.virtualteacher.utility.contracts.Mapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecture")
public class LectureController {

    private final UserValidatorHelperImpl userValidatorHelperImpl;
    private final LectureService lectureService;
    private final Mapper mapper;


    public LectureController(UserValidatorHelperImpl userValidatorHelperImpl, LectureService lectureService, Mapper mapper) {
        this.userValidatorHelperImpl = userValidatorHelperImpl;
        this.lectureService = lectureService;
        this.mapper = mapper;
    }

    @GetMapping("/{lectureId}")
    public ResponseEntity<LectureFullDto> lecture(@PathVariable(name = "lectureId") int lectureId, Authentication authentication) {
        User loggedUser = userValidatorHelperImpl.extractUserFromAuthentication(authentication);
        Lecture lecture = lectureService.findById(lectureId, loggedUser);
        LectureFullDto lectureToReturn = mapper.fromLectureToLectureFullDto(lecture);
        return new ResponseEntity<>(lectureToReturn, HttpStatus.OK);
    }

    @GetMapping("/{lectureId}/public/basic")
    public ResponseEntity<LectureBaseDto> lectureBasic(@PathVariable(name = "lectureId") int lectureId) {
        Lecture lecture = lectureService.findPublicById(lectureId);
        LectureBaseDto lectureToReturn = mapper.fromLectureToLectureBaseDto(lecture);
        return new ResponseEntity<>(lectureToReturn, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Lecture> create(@RequestBody @Valid LectureBaseDto lectureBaseDto, Authentication authentication) {
        Lecture lectureToCreate = mapper.fromLectureBaseDtoToLecture(lectureBaseDto);
        User loggedUser = userValidatorHelperImpl.extractUserFromAuthentication(authentication);
        Lecture createdLecture = lectureService.create(lectureToCreate, loggedUser);
        return new ResponseEntity<>(createdLecture, HttpStatus.CREATED);
    }


    @DeleteMapping("/{lectureId}")
    public ResponseEntity<String> delete(@PathVariable(name = "lectureId") int lectureId, Authentication authentication) {
        User loggedUser = userValidatorHelperImpl.extractUserFromAuthentication(authentication);
        lectureService.delete(lectureId, loggedUser);
        return new ResponseEntity<>("Lecture with ID: " + lectureId + " was deleted", HttpStatus.OK);
    }

    @PutMapping("/{lectureId}")
    public ResponseEntity<Lecture> update(@PathVariable(name = "lectureId") int lectureId, @RequestBody @Valid LectureBaseDto lectureBaseDto, BindingResult errors, Authentication authentication) {
        User loggedUser = userValidatorHelperImpl.extractUserFromAuthentication(authentication);
        Lecture lectureUpdate = mapper.fromLectureBaseDtoToLecture(lectureBaseDto);
        lectureUpdate.setId(lectureId);
        Lecture updatedLecture = lectureService.update(lectureUpdate, loggedUser);
        return new ResponseEntity<>(updatedLecture, HttpStatus.OK);
    }

    @GetMapping("/{lectureId}/assignment")
    public ResponseEntity<String> downloadAssignment(@PathVariable(name = "lectureId") int lectureId, Authentication authentication) {
        User user = userValidatorHelperImpl.extractUserFromAuthentication(authentication);
        String assignmentUrl = lectureService.getAssignment(lectureId, user);
        return new ResponseEntity<>(assignmentUrl, HttpStatus.OK);
    }

}
