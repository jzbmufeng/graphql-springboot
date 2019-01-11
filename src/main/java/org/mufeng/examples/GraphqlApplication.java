package org.mufeng.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by JiaZaibo on 2019/1/11
 *
 * @Author: JiaZaibo
 */
@SpringBootApplication
public class GraphqlApplication {

    public static void main(String [] args ) {
        new SpringApplication(GraphqlApplication.class).run(args);
    }

}
