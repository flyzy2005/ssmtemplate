package cn.edu.whu.book.controller;

import cn.edu.whu.book.dto.BookInfo;
import cn.edu.whu.book.service.BookService;
import cn.edu.whu.common.dto.ResultMessage;
import cn.edu.whu.common.entity.Book;
import cn.edu.whu.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Fly on 2017/7/19.
 */
@Controller
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping
    public ModelAndView books() {
        List<BookInfo> bookList = bookService.listBooks();
        //这里会去找views下面的books文件夹下的home.ftl
        //可以看spring-web中关于freeMarker的配置，指定了路径以及后缀名
        return new ModelAndView("books/home", "books", bookList);
    }

    @GetMapping("{name}")
    @ResponseBody
    public String book(@PathVariable String name) {
        if (StringUtils.isEmpty(name))
            return new ResultMessage(false, "书名不能为空",400).toString();
        return new ResultMessage<Book>(true, "查询成功", bookService.getBook(name), 200).toString();
    }
}
