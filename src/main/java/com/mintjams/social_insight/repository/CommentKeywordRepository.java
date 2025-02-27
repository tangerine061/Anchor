package com.mintjams.social_insight.repository;

import com.mintjams.social_insight.entity.Channel;
import com.mintjams.social_insight.entity.CommentKeyword;
import com.mintjams.social_insight.entity.Content;
import com.mintjams.social_insight.entity.ContentKeyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentKeywordRepository extends JpaRepository<CommentKeyword, Long> {

    //누적
    Optional<CommentKeyword> findByCommentKeyAndChannelAndContent(String contentKey, Channel channel, Content content);

    @Query(value = "SELECT ck.comment_Key, ck.found FROM comment_keyword ck" +
            " WHERE ck.content_id = :contentId ORDER BY ck.found " +
            "DESC LIMIT 8", nativeQuery = true)
    List<Object[]> findTopKeywordsByContentId(@Param("contentId") String contentId);

}
