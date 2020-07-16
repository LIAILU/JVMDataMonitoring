package com.i5lu.utils;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceFileFiled {
	/**
	 * �滻�ı��ļ��е� �Ƿ��ַ���
	 * 
	 * @param path
	 * @param srcStr     ԭ�е�����
	 * @param replaceStr Ҫ�滻������
	 * @throws IOException
	 */
	public static boolean replacTextContent(String path, String srcStr, String replaceStr) throws IOException {
		// ��
		File file = new File(path);
		if (!file.exists()) {
			return false;
		}
		FileReader in = new FileReader(file);
		BufferedReader bufIn = new BufferedReader(in);
		// �ڴ���, ��Ϊ��ʱ��
		CharArrayWriter tempStream = new CharArrayWriter();
		// �滻
		String line = null;
		while ((line = bufIn.readLine()) != null) {
			// �滻ÿ����, �����������ַ���
			line = line.replaceAll(srcStr, replaceStr);
			// ������д���ڴ�
			tempStream.write(line);
			// ��ӻ��з�
			tempStream.append(System.getProperty("line.separator"));
		}
		// �ر� ������
		bufIn.close();
		// ���ڴ��е��� д�� �ļ�
		FileWriter out = new FileWriter(file);
		tempStream.writeTo(out);
		out.close();
		return true;

	}
}
