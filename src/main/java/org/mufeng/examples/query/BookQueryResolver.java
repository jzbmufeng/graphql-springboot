package org.mufeng.examples.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.mufeng.examples.dto.Author;
import org.mufeng.examples.dto.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiaZaibo on 2019/1/11
 */
@Component
public class BookQueryResolver implements GraphQLQueryResolver {


    public List<Book> findBooks() {

        Author author = Author.builder()
                .id(1)
                .name("Bill Venners")
                .age(40)
                .build();


        Book b = Book.builder()
                .id(1)
                .name("scala编程第三版")
                .author(author)
                .publisher("电子工业出版社")
                .build();

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(b);
        return bookList;
    }


}
