package cn.edu.whu.common.dao;

import cn.edu.whu.common.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Fly on 2017/7/19.
 */
public interface BookDao {
    List<Book> listBooks();

    Book getBook(@Param("name") String name);
}
