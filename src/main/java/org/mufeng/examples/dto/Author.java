package org.mufeng.examples.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by JiaZaibo on 2019/1/12
 * @Author: JiaZaibo
 */
@Builder
@Data
public class Author {

    private Integer id;
    private String name;
    private Integer age;

}
