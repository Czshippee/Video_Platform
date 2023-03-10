package com.example.Video_Platform.Controller;

import com.example.Video_Platform.dto.Play;
import com.example.Video_Platform.dto.Video;
import com.example.Video_Platform.service.VideoService1;
import com.example.Video_Platform.service.VideoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Controller
public class VideoController {

//    @RequestMapping("/video/1")
//    @ResponseBody
//    public Video t1() {
//        List<Play> plays = List.of(
//                new Play("P1", "二分查找-演示", LocalTime.parse("00:05:46"), "1_1.mp4"),
//                new Play("P2", "二分查找-实现", LocalTime.parse("00:06:47"), "1_2.mp4")
//        );
//        return new Video("1", "面试专题-基础篇", LocalDateTime.now(), "1.png", "祝你面试游刃有余！",
//                List.of("面试", "Java", "计算机技术"), plays, "自制", "科技->计算机技术");
//    }
//    @RequestMapping("/video/2")
//    @ResponseBody
//    public Video t2() {
//        List<Play> plays = List.of(
//                new Play("P1", "Java中的线程状态", LocalTime.parse("00:09:45"), "2_1.mp4"),
//                new Play("P2", "代码演示1", LocalTime.parse("00:07:05"), "2_2.mp4"),
//                new Play("P3", "代码演示2", LocalTime.parse("00:05:01"), "2_3.mp4")
//        );
//        return new Video("2", "面试专题-并发篇", LocalDateTime.now(), "2.png", "祝你面试游刃有余！",
//                List.of("面试", "Java", "计算机技术"), plays, "自制", "科技->计算机技术");
//    }

    // 路径参数
    // 1. @RequestMapping("/video/{bv}")
    // 2. @PathVariable String bv, @PathVariable 表示该方法参数要从路径中获取
    @RequestMapping("/video/{bv}") // 1, 2, 3...
    @ResponseBody
    public Video t(@PathVariable String bv) {
        // return videoService1.find(bv);
        return videoService2.find(bv);
    }

    @Autowired
    private VideoService1 videoService1;
    @Autowired
    private VideoService2 videoService2;
//
//    @RequestMapping("/publish")
//    @ResponseBody
//    public Map<String,String> publish(@RequestBody Video video) {
//        String bv = videoService2.publish(video);
//        return Map.of("bv", bv);
//    }
}
