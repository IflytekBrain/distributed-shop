package com.ele.me.shop.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回的实体类
 *
 * @author jt
 */
public class PageResult implements Serializable {
    /**
     * 总记录数
     */
    private long total;
    /**
     * 每页的数据集合
     */
    private List rows;

    public PageResult(long total, List rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

}
