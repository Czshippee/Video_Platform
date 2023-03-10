package com.example.Video_Platform.Controller;

import com.example.Video_Platform.dto.Play;
import com.example.Video_Platform.dto.Video;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class testController {
    @RequestMapping("/")
    @ResponseBody
    public String t1() {
        return "Hello World";
    }
}

