package com.db.grad.javaapi.repository;
import com.db.grad.javaapi.model.Book_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Book_UserRepository extends JpaRepository<Book_User, Long> {
}
