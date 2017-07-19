import cn.edu.whu.book.dto.BookInfo;
import cn.edu.whu.book.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Fly on 2017/7/19.
 */
public class BookTest extends BaseTest {
    @Autowired
    private BookService bookService;

    @Test
    public void listBook() {
        List<BookInfo> bookInfoList =  bookService.listBooks();
        for (BookInfo info : bookInfoList) {
            System.out.println(info.getInfo());
        }
    }
}
