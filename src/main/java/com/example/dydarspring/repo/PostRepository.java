package com.example.dydarspring.repo;

import com.example.dydarspring.models.Post;
import org.springframework.data.repository.CrudRepository; //добавить удалить и тд запись в табличку

public interface PostRepository extends CrudRepository<Post,Long> {

}
