package com.usc.Video_Platform.service;

import com.usc.Video_Platform.dto.Play;
import com.usc.Video_Platform.dto.Video;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 从文件中获取视频数据
 */
@Service
public class VideoService1 {

    public VideoService1() {}

//    @PostConstruct // 这是一个初始化方法，在对象创建之后，只会调用一次
    public void init() { // 初始化
        try {

            List<String> data = Files.readAllLines(Path.of("data", "p.csv"));

            for (String line : data) {
                String[] s = line.split(",");
                String[] tags = s[7].split("_");
                Video video = new Video(s[0], s[3], LocalDateTime.parse(s[6]), s[4], s[5], List.of(tags), getPlayList(s[0]), s[1], s[2]);
                map.put(s[0], video);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Map<String, Video> map = new HashMap<>();

    // 调用多次
    // 查询方法，根据视频编号，查询 Video 对象
    public Video find(String bv) { // bv 参数代表视频编号 1
        return map.get(bv);
    }

    // 读取选集文件 v_1.csv
    private List<Play> getPlayList(String bv) {
        try {
            List<String> vdata = Files.readAllLines(Path.of("data", "v_" + bv + ".csv"));
            List<Play> list = new ArrayList<>();
            for (String vline : vdata) {
                String[] ss = vline.split(",");
                list.add(new Play(ss[0], ss[1], LocalTime.parse(ss[3]), ss[2]));
            }
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
