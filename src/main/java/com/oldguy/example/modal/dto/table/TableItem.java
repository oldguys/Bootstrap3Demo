package com.oldguy.example.modal.dto.table;

import lombok.Data;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author huangrenhao
 * @date 2019/1/15
 */
@Data
public class TableItem {

    private String id;

    private String name;

    private String context;

    private Integer status;

    private Date time = new Date();

    private List<ItemInfo> itemInfoList = Collections.emptyList();


    public TableItem() {
    }

    public TableItem(String id, String name, String context, Integer status) {
        this.id = id;
        this.name = name;
        this.context = context;
        this.status = status;
    }

    @Data
    public static class ItemInfo {

        private String id;

        private String name;

    }
}
