package com;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: HelloAplication <br/>
 * Description: <br/>
 * date: 2019/10/10 10:00<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@SpringBootApplication

public class HelloAplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloAplication.class,args);
    }
}
