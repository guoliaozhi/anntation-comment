package com.guoliaozhi.annotaion.comment;



import com.ingo.zhuniu.annotation.Comment;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ads")
public class Ads extends BaseEntity {
    @Column
    @Comment("sssss")
    private String url;
    @Column
    @Comment("aaaaa")
    private String img;
    @Column
    @Comment("广告是否展示 true 展示;false 不展示")
    private boolean isDisplayed;
}
