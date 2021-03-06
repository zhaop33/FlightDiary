package org.ramer.diary.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by caipeijun on 2017/5/29.
 */

@Cacheable
@Entity
@Data
public class Tags{

    private static final long serialVersionUID = 1L;

    /** UID. */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签热度
     */
    private Integer hot;
    /**
     * 对应topic
     */
    @ManyToOne
    @JoinColumn(name = "topic")
    private Topic topic;
    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;

    public Date getCreateTime() {
        return (Date) createTime.clone();
    }

    public Date getUpdateTime() {
        return (Date) updateTime.clone();
    }

    public void setCreateTime(Date createTime) {
        this.createTime = new Date(createTime.getTime());
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = new Date(updateTime.getTime());
    }
}
