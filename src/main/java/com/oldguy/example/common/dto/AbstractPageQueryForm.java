package com.oldguy.example.common.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author huangrenhao
 * @date 2019/1/9
 */
public abstract class AbstractPageQueryForm<T> extends AbstractQueryForm {

    /**
     * 当前页
     */
    private Integer current;

    /**
     * 单页记录数
     */
    private Integer size;

    /**
     * 创建时间 > 开始时间
     */
    @DateTimeFormat
    private Date startTime;

    /**
     * 创建时间 < 结束时间
     */
    @DateTimeFormat
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
