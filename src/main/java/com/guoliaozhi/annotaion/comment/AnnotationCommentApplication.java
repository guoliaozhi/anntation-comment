package com.guoliaozhi.annotaion.comment;

import com.ingo.zhuniu.annotation.EnableIngoAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableIngoAnnotation
public class AnnotationCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationCommentApplication.class, args);
    }
}
