package com.i5lu.utils;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 * JComboBox����Ⱦ��
 * 
 * @author monitor
 */
public class ComboBoxRenderer extends DefaultListCellRenderer {
	
	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		System.out.println(value+"=="+index);
//		if (value instanceof Object[]) {
//			this.setToolTipText(((Item) value).getTip());
//		} else {
//			System.out.println("��ָ��ѡ��");
//		}

		return this;
	}
}