package com.mintjams.social_insight.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "content")
@Getter
@Setter
@NoArgsConstructor
public class Content {
    //컨텐트id
    @Id
    @Column(unique = true)
    private String contentId;

    @Column
    private String contentTitle;

    //채널id(외래키)
    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channel channel;

    //본문 당 댓글 개수
    @Column
    private Integer commentNum;

    @Column
    private Double sentiment = 0.0;

}


