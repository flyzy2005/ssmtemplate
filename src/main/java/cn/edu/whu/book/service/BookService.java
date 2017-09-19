package cn.edu.whu.book.service;

import cn.edu.whu.book.dto.BookInfo;
import cn.edu.whu.common.pojo.Book;

import java.util.List;

/**
 * Created by Fly on 2017/7/19.
 */
public interface BookService {
    List<BookInfo> listBooks();

    Book getBook(String name);
}
