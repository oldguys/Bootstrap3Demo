package com.oldguy.example.modal.service;

import com.oldguy.example.common.dto.BootstrapTablePage;
import com.oldguy.example.modal.dto.table.TableItem;
import com.oldguy.example.modal.dto.table.TablePageForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangrenhao
 * @date 2019/1/15
 */
@Service
public class TableService {


    public List<TableItem> getList() {

        List<TableItem> list = new ArrayList<>();

        String message = generateMessage();

        for (int i = 0; i < 100; i++) {
            int status = 1;
            String context = "context-" + i;
            if (i % 2 == 0) {
                status = 0;
                context = message;
            }
            list.add(new TableItem("table-" + i, "名称-" + i, context, status));
        }

        return list;
    }

    private String generateMessage() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 200; i++) {
            builder.append("消息").append(i).append(",");
        }
        return builder.toString();
    }


    public BootstrapTablePage getPage(TablePageForm form) {

        Integer current = form.getCurrent();
        Integer size = form.getSize();

        current = current == null ? current = 0 : current;
        size = size == null ? size = 20 : size;

        current = current * size;
        List<TableItem> list = new ArrayList<>();

        for (int offset = current; offset < current + size; offset++) {
            list.add(new TableItem("table-" + offset, "名称-" + offset, "分页", 1));
        }

        BootstrapTablePage page = new BootstrapTablePage();
        page.setRows(list);
        page.setTotal(5000L);

        return page;
    }
}
