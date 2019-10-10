package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: Hellowoeld <br/>
 * Description: <br/>
 * date: 2019/10/10 10:10<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@RestController
public class Hellowoeld {
    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String  hello(){
        return "hello,world!";
    }

}
