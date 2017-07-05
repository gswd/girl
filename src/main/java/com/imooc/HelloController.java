package com.imooc;

import com.imooc.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() throws RuntimeException{

        logger.debug("hello Controller [debug]");
        logger.info("hello Controller [info]");
        if (true) {
            throw new RuntimeException("自定义运行时异常");
        }
        return girlProperties.getCupSize();
    }

    @GetMapping("/students")
    public String getStudent(@Valid Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            logger.error("!!!---!!! 有error --- {}", bindingResult.getAllErrors());
        }
        logger.info("===> student : {}", student.toString());
        return student.getName();
    }
}
