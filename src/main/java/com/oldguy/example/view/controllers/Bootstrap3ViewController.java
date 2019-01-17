package com.oldguy.example.view.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangrenhao
 * @date 2019/1/15
 */
@RequestMapping("view")
@Controller
public class Bootstrap3ViewController {

    /**
     * table
     *
     * @return
     */
    @RequestMapping("table/simple")
    public String SimpleTableList() {
        return "table/SimpleTableList";
    }

    @RequestMapping("table/complex")
    public String ComplexTableList() {
        return "table/ComplexTableList";
    }

    @RequestMapping("table/server")
    public String ServerTableList() {
        return "table/ServerTableList";
    }

    /**
     * tree-view
     *
     * @return
     */
    @RequestMapping("tree/simple")
    public String SimpleTree() {
        return "tree/SimpleTree";
    }

    @RequestMapping("tree/check")
    public String CheckTree() {
        return "tree/CheckTree";
    }

    @RequestMapping("tree/search")
    public String SearchTree() {
        return "tree/SearchTree";
    }


    /**
     *  file-input
     * @return
     */
    @RequestMapping("file/input")
    public String fileInput() {
        return "file/fileInput";
    }

    @RequestMapping("datetime/picker")
    public String datetimePicker() {
        return "datetime/picker";
    }


    /**
     *  Basic
     * @return
     */
    @RequestMapping("basic/modal")
    public String basicModal() {
        return "basic/modal";
    }

    @RequestMapping("basic/panel")
    public String basicPanel() {
        return "basic/panel";
    }


}
