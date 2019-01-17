package com.oldguy.example.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Collections;
import java.util.List;

/**
 * @Description: 树节点
 * @Author: ren
 * @CreateTime: 2018-10-2018/10/26 0026 14:44
 */
public class BootstrapTreeNode {

    private Long id;

    private String text;

    private String sequence;

    private State state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String icon;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<BootstrapTreeNode> nodes = Collections.emptyList();

    public BootstrapTreeNode() {
    }

    public BootstrapTreeNode(Long id, String text, String sequence, String icon) {
        this.id = id;
        this.text = text;
        this.sequence = sequence;
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<BootstrapTreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<BootstrapTreeNode> nodes) {
        this.nodes = nodes;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public static class State {

        private Boolean checked = false;

        public State(Boolean checked) {
            this.checked = checked;
        }

        public Boolean getChecked() {
            return checked;
        }

        public void setChecked(Boolean checked) {
            this.checked = checked;
        }

    }
}
