package com.example.Video_Platform.mapper;

import com.example.Video_Platform.dto.Play;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayMapper {
    @Select("""
            select id, title, duration, url
            from play
            where bv=#{bv}
            """)
    List<Play> findByBv(String bv);

    @Insert("""
            insert into play(id,title,duration,url,bv)
            values (#{p.id},#{p.title},#{p.duration},#{p.url},#{bv})
            """)
    void insert(@Param("p") Play play, @Param("bv") String bv);
}
