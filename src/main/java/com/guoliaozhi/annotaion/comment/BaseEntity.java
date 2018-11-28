package com.guoliaozhi.annotaion.comment;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * 模型基类，所有实体类模型应当继承本模型
 * @author glz
 */
@MappedSuperclass
@Data
@EqualsAndHashCode(of={"id"})
public abstract class BaseEntity implements Serializable {
    /**
     * 实体ID
     */
    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid")
    @Column(length = 32,nullable = false,unique = true)
    private String id;
    /**
     * 创建日期
     */
    @CreationTimestamp
    @CreatedDate
    private Date createDate;

}
