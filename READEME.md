S0C��������е�һ��survivor���Ҵ����������� (kb)
S1C��������еڶ���survivor���Ҵ����������� (kb)
S0U��������е�һ��survivor���Ҵ�����Ŀǰ��ʹ�ÿռ� (kb)
S1U��������еڶ���survivor���Ҵ�����Ŀǰ��ʹ�ÿռ� (kb)
EC���������Eden������԰�������� (kb)
EU���������Eden������԰��Ŀǰ��ʹ�ÿռ� (kb)
OC��Old�������� (kb)
OU��Old��Ŀǰ��ʹ�ÿռ� (kb)
PC��Perm(�־ô�)������ (kb)
PU��Perm(�־ô�)Ŀǰ��ʹ�ÿռ� (kb)
YGC����Ӧ�ó�������������ʱ�������gc����
YGCT����Ӧ�ó�������������ʱ�������gc����ʱ��(s)
FGC����Ӧ�ó�������������ʱold��(ȫgc)gc����
FGCT����Ӧ�ó�������������ʱold��(ȫgc)gc����ʱ��(s)
GCT����Ӧ�ó�������������ʱgc�õ���ʱ��(s)
NGCMN�������(young)�г�ʼ��(��С)�Ĵ�С (kb)
NGCMX�������(young)��������� (kb)
NGC�������(young)�е�ǰ������ (kb)
OGCMN��old���г�ʼ��(��С)�Ĵ�С (kb)
OGCMX��old����������� (kb)
OGC��old����ǰ�����ɵ����� (kb)
PGCMN��perm���г�ʼ��(��С)�Ĵ�С (kb)
PGCMX��perm����������� (kb)
PGC��perm����ǰ�����ɵ����� (kb)
S0��������е�һ��survivor���Ҵ�������ʹ�õ�ռ��ǰ�����ٷֱ�
S1��������еڶ���survivor���Ҵ�������ʹ�õ�ռ��ǰ�����ٷֱ�
E���������Eden������԰����ʹ�õ�ռ��ǰ�����ٷֱ�
O��old����ʹ�õ�ռ��ǰ�����ٷֱ�
P��perm����ʹ�õ�ռ��ǰ�����ٷֱ�
S0CMX��������е�һ��survivor���Ҵ�������������� (kb)
S1CMX ��������еڶ���survivor���Ҵ�������������� (kb)
ECMX���������Eden������԰����������� (kb)
DSS����ǰ��Ҫsurvivor���Ҵ����������� (kb)��Eden��������
TT�� ���д�������
MTT �� �����д�������





jstat��jvm��õ�����֮һ��������Գ��õļ�����������

1�� jstat -gcutil pid
ͳ��gc��Ϣͳ�ơ�

[root@AY140330215454793e81Z ~]# jstat -gcutil 5801
  S0     S1     E      O      P     YGC     YGCT    FGC    FGCT     GCT
  0.00  97.37   5.54  53.37  69.83     21    0.366     1    0.480    0.846
2�� jstat -gc pid
������ʾgc����Ϣ���鿴gc�Ĵ�������ʱ�䡣�����������ֱ���young gc�Ĵ�����young gc��ʱ�䣬full gc�Ĵ�����full gc��ʱ�䣬gc����ʱ�䡣

[root@AY140330215454793e81Z ~]# jstat -gc 5801
 S0C    S1C    S0U    S1U      EC       EU        OC         OU       PC     PU    YGC     YGCT    FGC    FGCT     GCT
15360.0 12288.0  0.0   11964.6 298496.0 16530.5   67072.0    35793.4   83968.0 58633.2     21    0.366   1      0.480    0.846
3�� jstat -gccapacity pid
������ʾ��VM�ڴ���������young,old,perm�������ʹ�ú�ռ�ô�С���磺PGCMN��ʾ������Сperm���ڴ�ʹ������PGCMX��ʾ����perm���ڴ����ʹ������PGC�ǵ�ǰ�����ɵ�perm�ڴ�ռ������PC�ǵ�ǰperm�ڴ�ռ�����������Ŀ��Ը���������ƣ� OC��old�ڴ���ռ������

[root@AY140330215454793e81Z ~]# jstat -gccapacity 5801
 NGCMN    NGCMX     NGC     S0C   S1C       EC      OGCMN      OGCMX       OGC         OC      PGCMN    PGCMX     PGC       PC     YGC    FGC
 20480.0 327168.0 327168.0 15360.0 12288.0 298496.0    40448.0   653824.0    67072.0    67072.0  21504.0  83968.0  83968.0  83968.0     21     1
4��jstat -gcnew pid
������������Ϣ��

[root@AY140330215454793e81Z ~]# jstat -gcnew 5801
 S0C    S1C    S0U    S1U   TT MTT  DSS      EC       EU     YGC     YGCT
15360.0 12288.0    0.0 11964.6  3  15 15360.0 298496.0  16563.7     21    0.366
5��jstat -gcnewcapacity pid
������������Ϣ����ռ������

[root@AY140330215454793e81Z ~]# jstat -gcnewcapacity 5801
  NGCMN      NGCMX       NGC      S0CMX     S0C     S1CMX     S1C       ECMX        EC      YGC   FGC
   20480.0   327168.0   327168.0 109056.0  15360.0 109056.0  12288.0   326144.0   298496.0    21     1
6��jstat -gcold pid
old���������Ϣ��

[root@AY140330215454793e81Z ~]# jstat -gcold 5801
   PC       PU        OC          OU       YGC    FGC    FGCT     GCT
 83968.0  58639.1     67072.0     35793.4     21     1    0.480    0.846
7��jstat -gcoldcapacity pid
old���������Ϣ����ռ������

[root@AY140330215454793e81Z ~]# jstat -gcoldcapacity 5801
   OGCMN       OGCMX        OGC         OC       YGC   FGC    FGCT     GCT
    40448.0    653824.0     67072.0     67072.0    21     1    0.480    0.846
8��jstat -gcpermcapacity pid
perm�������Ϣ����ռ������

[root@AY140330215454793e81Z ~]# jstat -gcpermcapacity 5801
  PGCMN      PGCMX       PGC         PC      YGC   FGC    FGCT     GCT
   21504.0    83968.0    83968.0    83968.0    21     1    0.480    0.846
9��jstat -class pid
��ʾ����class������������ռ�ռ����Ϣ��

[root@AY140330215454793e81Z ~]# jstat -class 5801
Loaded  Bytes  Unloaded  Bytes     Time
 10924 20744.5        0     0.0      13.11
10��jstat -compiler pid
��ʾVMʵʱ�������������Ϣ��

[root@AY140330215454793e81Z ~]# jstat -compiler 5801
Compiled Failed Invalid   Time   FailedType FailedMethod
    1452      2       0    54.32          1 java/net/URL openConnection
11��jstat -printcompilation pid
��ǰVMִ�е���Ϣ��

[root@AY140330215454793e81Z ~]# jstat -printcompilation 5801
Compiled  Size  Type Method
    1453     13    1 java/util/concurrent/atomic/AtomicBoolean get