package com.oldguy.example.modal.controllers;

import com.oldguy.example.modal.dto.table.TablePageForm;
import com.oldguy.example.modal.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangrenhao
 * @date 2019/1/15
 */
@RestController
@RequestMapping("table")
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping("list")
    public Object list(){
     return tableService.getList();
    }

    @GetMapping("page")
    public Object page(TablePageForm form){
        return tableService.getPage(form);
    }
}
