package com.i5lu.app;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import com.i5lu.img.ImageHelper;
import com.i5lu.panel.RightPanel;

public class SelfIconOfTreeCellRender extends DefaultTreeCellRenderer {

	private static final long serialVersionUID = 2344671202446510668L;
	/** 
     * ��д����DefaultTreeCellRenderer�ķ��� 
     */  
    @Override  
    public Component getTreeCellRendererComponent(JTree tree, Object value,  
            boolean sel, boolean expanded, boolean leaf, int row,  
            boolean hasFocus)  
    {  
  
        //ִ�и���ԭ�Ͳ���  
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,  
                row, hasFocus);  
  
        setText(value.toString());  
          
        if (sel)  
        {  
            setForeground(getTextSelectionColor());  
        }  
        else  
        {  
            setForeground(getTextNonSelectionColor());  
        }  
          
        //�õ�ÿ���ڵ��TreeNode  
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;  
          
        //�õ�ÿ���ڵ��text  
        String str = node.toString();         
          
        //�ж����ĸ��ı��Ľڵ����ö�Ӧ��ֵ����������ڵ㴫�����һ��ʵ��,����Ը���ʵ�������һ��������������ʾ��Ӧ��ͼ�꣩  
        if (RightPanel.JSTAT_COMMAND.equals(str) ) 
        {  
            this.setIcon(ImageHelper.loadImage("port.png"));  
        }  
  
        return this;  
    }  
}
