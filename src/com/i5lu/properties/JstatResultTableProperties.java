package com.i5lu.properties;

public class JstatResultTableProperties {
	/**
	 * jstat -gcutil pid <br/>
	 * ͳ��gc��Ϣͳ�ơ�
	 */
	public final static String[] JSTAT_GCUTIL_TAB = {"S0","S1","E","O","P","YGC","YGCT","FGC","FGCT","GCT"};
	/**
	 * jstat -gc pid <br/>
	 * ��ʾgc����Ϣ���鿴gc�Ĵ�������ʱ�䡣�����������ֱ���young gc�Ĵ�����young gc��ʱ�䣬full gc�Ĵ�����full
	 * gc��ʱ�䣬gc����ʱ��
	 */
	public final static String[] JSTAT_GC_TAB = {"S0C","S1C","S0U","S1U","EC","EU","OC","OU","PC","PU","YGC","YGCT","FGC","FGCT","GCT"};
	/**
	 * jstat -gccapacity pid <br/>
	 * ��ʾVM�ڴ���������young,old,perm�������ʹ�ú�ռ�ô�С���磺PGCMN��ʾ������Сperm���ڴ�ʹ������PGCMX��ʾ����perm���ڴ����ʹ������PGC�ǵ�ǰ�����ɵ�perm�ڴ�ռ������PC�ǵ�ǰperm�ڴ�ռ�����������Ŀ��Ը���������ƣ�
	 * OC��old�ڴ���ռ������
	 */
	public final static String[] JSTAT_GCCAPACITY_TAB = {"NGCMN","NGCMX","NGC","S0C","S1C","EC","OGCMN","OGCMX","OGC","OC","PGCMN","PGCMX","PGC","PC","YGC","FGC"};
	/**
	 * jstat -gcnew pid <br/>
	 * ������������Ϣ
	 */
	public final static String[] JSTAT_GCNEW_TAB = {"S0C","S1C","S0U","S1U","TT","MTT","DSS","EC","EU","YGC","YGCT"};
	/**
	 * jstat -gcnewcapacity pid <br/>
	 * ������������Ϣ����ռ����
	 */
	public final static String[] JSTAT_GCNEWCAPACITY_TAB = {"NGCMN","NGCMX","NGC","S0CMX","S0C","S1CMX","S1C","ECMX","EC","YGC","FGC"};
	/**
	 * jstat -gcold pid <br/>
	 * old���������Ϣ
	 */
	public final static String[] JSTAT_GCOLD_TAB = {"PC","PU","OC","OU","YGC","FGC","FGCT","GCT"};
	/**
	 * jstat -gcpermcapacity pid <br/>
	 * perm�������Ϣ����ռ����
	 */
	public final static String[] JSTAT_GCPERMCAPACITY_TAB = {"OGCMN","OGCMX","OGC","OC","YGC","FGC","FGCT","GCT"};
	/**
	 * jstat -gcoldcapacity pid <br/>
	 * old���������Ϣ����ռ����
	 */
	public final static String[] JSTAT_GCOLDCAPACITY_TAB = {"PGCMN","PGCMX","PGC","PC","YGC","FGC","FGCT","GCT"};
	/**
	 * jstat -class pid <br/>
	 * ��ʾ����class������������ռ�ռ����Ϣ
	 */
	public final static String[] JSTAT_CLASS_TAB = {"Loaded","Bytes","Unloaded","Bytes","Time"};
	/**
	 * jstat -compiler pid <br/>
	 * ��ʾVMʵʱ�������������Ϣ
	 */
	public final static String[] JSTAT_COMPILER_TAB = {"Compiled","Failed","Invalid","Time","FailedType","FailedMethod"};
	/**
	 * jstat -printcompilation pid <br/>
	 * ��ǰVMִ�е���Ϣ
	 */
	public final static String[] JSTAT_PRINTCOMPILATION_TAB = {"Compiled","Size","Type","Method"};
}
