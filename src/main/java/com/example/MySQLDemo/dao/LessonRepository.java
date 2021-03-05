package com.example.MySQLDemo.dao;
import com.example.MySQLDemo.model.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface LessonRepository extends CrudRepository<Lesson, Long> {
}
