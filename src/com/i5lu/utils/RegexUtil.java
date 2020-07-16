package com.i5lu.utils;

import java.util.regex.Pattern;

public class RegexUtil {
	/**
     * 	�ж��Ƿ�������
     * @param str
     * @return true �ǣ�false ����
     * @author admin
     * @date 2019��2��15�� ����2:11:10
     */
    public static boolean isNumeric(String str){
    	if (str == null) {
			return false;
		}
        Pattern pattern = Pattern.compile("[0-9]*"); 
        return pattern.matcher(str).matches();    
     }
    /**
     * 	��ȡ����
     *  	����: 1254as12343 ��ȡΪ1254,   12a5s1d��ȡΪ12
     * @param str
     * @return
     */
    public static String subNumeric(String str) {
    	if (str == null) {
			return "";
		}
    	str = str.trim();
    	if (isNumeric(str)) {
			return str;
		}else {
			str = str.substring(0, str.length()-1);
			return subNumeric(str);
		}
    }
    
    public static void main(String[] args) {
		System.out.println(subNumeric("123as54.ad"));
		System.out.println(subNumeric("1232434sad12"));
		System.out.println(subNumeric("  123"));
		System.out.println(subNumeric("  123  12"));
	}
}
