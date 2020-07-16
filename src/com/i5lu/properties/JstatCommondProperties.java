package com.i5lu.properties;

public class JstatCommondProperties {
	/**
	 * jstat -gcutil pid <br/>
	 * ͳ��gc��Ϣͳ�ơ�
	 */
	public final static String JSTAT_GCUTIL = "jstat -gcutil ";
	/**
	 * jstat -gc pid <br/>
	 * ��ʾgc����Ϣ���鿴gc�Ĵ�������ʱ�䡣�����������ֱ���young gc�Ĵ�����young gc��ʱ�䣬full gc�Ĵ�����full
	 * gc��ʱ�䣬gc����ʱ��
	 */
	public final static String JSTAT_GC = "jstat -gc ";
	/**
	 * jstat -gccapacity pid <br/>
	 * ��ʾVM�ڴ���������young,old,perm�������ʹ�ú�ռ�ô�С���磺PGCMN��ʾ������Сperm���ڴ�ʹ������PGCMX��ʾ����perm���ڴ����ʹ������PGC�ǵ�ǰ�����ɵ�perm�ڴ�ռ������PC�ǵ�ǰperm�ڴ�ռ�����������Ŀ��Ը���������ƣ�
	 * OC��old�ڴ���ռ������
	 */
	public final static String JSTAT_GCCAPACITY = "jstat -gccapacity ";
	/**
	 * jstat -gcnew pid <br/>
	 * ������������Ϣ
	 */
	public final static String JSTAT_GCNEW = "jstat -gcnew ";
	/**
	 * jstat -gcnewcapacity pid <br/>
	 * ������������Ϣ����ռ����
	 */
	public final static String JSTAT_GCNEWCAPACITY = "jstat -gcnewcapacity ";
	/**
	 * jstat -gcold pid <br/>
	 * old���������Ϣ
	 */
	public final static String JSTAT_GCOLD = "jstat -gcold ";
	/**
	 * jstat -gcpermcapacity pid <br/>
	 * perm�������Ϣ����ռ����
	 */
	public final static String JSTAT_GCPERMCAPACITY = "jstat -gpermcapacity ";
	/**
	 * jstat -gcoldcapacity pid <br/>
	 * old���������Ϣ����ռ����
	 */
	public final static String JSTAT_GCOLDCAPACITY = "jstat -gcoldcapacity ";
	/**
	 * jstat -class pid <br/>
	 * ��ʾ����class������������ռ�ռ����Ϣ
	 */
	public final static String JSTAT_CLASS = "jstat -class ";
	/**
	 * jstat -compiler pid <br/>
	 * ��ʾVMʵʱ�������������Ϣ
	 */
	public final static String JSTAT_COMPILER = "jstat -compiler ";
	/**
	 * jstat -printcompilation pid <br/>
	 * ��ǰVMִ�е���Ϣ
	 */
	public final static String JSTAT_PRINTCOMPILATION = "jstat -printcompilation ";
}
