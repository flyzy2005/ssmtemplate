package cn.edu.whu.book.service.impl;

import cn.edu.whu.book.dto.BookInfo;
import cn.edu.whu.book.service.BookService;
import cn.edu.whu.common.dao.BookDao;
import cn.edu.whu.common.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fly on 2017/7/19.
 */
@Service
public class BookServiceImpl implements BookService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);
    @Autowired
    private BookDao bookDao;
    public List<BookInfo> listBooks() {
        List<Book> books = bookDao.listBooks();
        List<BookInfo> infos = new ArrayList<BookInfo>();
        for (Book book : books) {
            BookInfo info = new BookInfo();
            info.setName(book.getName());
            info.setInfo("由" + book.getAuthor() + "编写，由" + book.getPublisher() + "发行");
            infos.add(info);
        }
        LOGGER.error("测试错误，会记录到文件中");
        return infos;
    }

    public Book getBook(String name) {
        return bookDao.getBook(name);
    }
}
