package com.example.Video_Platform.mapper;

import com.example.Video_Platform.dto.Video;
import org.apache.ibatis.annotations.*;

@Mapper
public interface VideoMapper {

    // 根据 bv 号查询视频
    @Select("""
            select bv, type, category, title, cover, introduction, publish_time, tags
            from video
            where bv=#{bv}
            """)
    Video findByBv(String bv);

    @Insert("""
            insert into video(type, category, title, cover, introduction, publish_time, tags)
            VALUES (#{type}, #{category}, #{title}, #{cover}, #{introduction}, #{publishTime}, #{tags})
            """)
    void insert(Video video);

    // 获取最近生成的自增主键值
    @Select("select last_insert_id()")
    int lastInsertId();

    // 更新 bv 号
    @Update("update video set bv=#{bv} where id=#{id}")
    void updateBv(@Param("bv") String bv, @Param("id") int id);
}
