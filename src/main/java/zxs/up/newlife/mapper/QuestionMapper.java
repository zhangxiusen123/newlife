package zxs.up.newlife.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import zxs.up.newlife.model.Question;

/**
 * @auther ZhangXiusen
 * @title
 * @date 2020/01/29 16:19
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, tag, gmt_create, gmt_modified, creator, comment_count, view_count, like_count) values (#{title}, #{description}, #{tag}, #{gmtCreate}, #{gmtModified}, #{creator}, #{commentCount}, #{viewCount}, #{likeCount})")
    void insert(Question question);
}