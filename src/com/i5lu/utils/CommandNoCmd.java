package com.i5lu.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandNoCmd {
	/**
	 * 执行外部程序
	 * @param commandStr
	 * @return
	 * @author admin
	 * @date 2019�?3�?29�? 下午2:21:32
	 */
	public static String exeCmd(String commandStr,String[] env,String dir) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			Process p = Runtime.getRuntime().exec(commandStr,env,new File(dir));
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
	}
	/**
	 * 	 判断程序是否运行
	 * @param processName
	 * @return
	 * @author admin
	 * @date 2019�?3�?29�? 上午11:40:42
	 */
	public static boolean isRunning(String processName) {

		BufferedReader bufferedReader = null;
		try {
			Process proc = Runtime.getRuntime().exec("tasklist /FI \"IMAGENAME eq " + processName + "\"");
			bufferedReader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(processName)) // 判断是否存在
				{
					return true;
				}
			}
			return false;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception ex) {
				}
			}
		}
	}
	
	public static String dosCmd(String command) {
		String s;
		Process process;
		try {
			process = Runtime.getRuntime().exec("cmd /c " + command);
			// �ػ񱻵��ó����DOS���д��ڵı�׼���
			BufferedReader br = new BufferedReader(
					new InputStreamReader(process.getInputStream()));
			while ((s = br.readLine()) != null) {
				
			}
			process.waitFor();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		return "";
	}
}
