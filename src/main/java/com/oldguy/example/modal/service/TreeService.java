package com.oldguy.example.modal.service;

import com.oldguy.example.common.dto.BootstrapTreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangrenhao
 * @date 2019/1/16
 */
@Service
public class TreeService {

    private String icon = "glyphicon glyphicon-leaf";

    public List<BootstrapTreeNode> getTree() {

        List<BootstrapTreeNode> treeNodes = new ArrayList<>();

        for (long i = 0; i < 10; i++) {
            BootstrapTreeNode node = new BootstrapTreeNode(i, "名称-" + i, "sequence-" + i, icon);
            treeNodes.add(node);
            List<BootstrapTreeNode> nodeList = new ArrayList<>();
            node.setNodes(nodeList);
            for (long j = 1; j < 5; j++) {
                BootstrapTreeNode temp = new BootstrapTreeNode(j, node.getText() + "-" + j, node.getSequence() + "-" + j, icon);
                nodeList.add(temp);
                if (j % 2 == 0) {
                    List<BootstrapTreeNode> itemList = new ArrayList<>();
                    temp.setNodes(itemList);
                    for (long z = 1; z < 10; z++) {
                        itemList.add(new BootstrapTreeNode(z, temp.getText() + "-" + z, temp.getSequence() + "-" + z, icon));
                    }
                }
            }
        }

        return treeNodes;
    }
}
