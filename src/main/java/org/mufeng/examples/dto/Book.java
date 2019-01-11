package org.mufeng.examples.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by JiaZaibo on 2019/1/11
 *
 * @Author: JiaZaibo
 */
@Builder
@Data
public class Book {
    private Integer id;
    private String name;
    private Author author;
    private String publisher;
}
