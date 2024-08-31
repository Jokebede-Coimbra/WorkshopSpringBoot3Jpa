package com.jkbd.course.repositories;

import com.jkbd.course.entities.Category;
import com.jkbd.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
