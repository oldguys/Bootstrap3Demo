package com.oldguy.example.modal.controllers;

import com.oldguy.example.modal.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangrenhao
 * @date 2019/1/16
 */
@RestController
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @GetMapping("simple")
    public Object simpleTree(){
        return treeService.getTree();
    }

}
