1.follow steps and download two files file1, file2
https://www.oracletutorial.com/getting-started/install-oracle/

2.From file2 copy the folders from components and paste it in file1 (win32_11gR2_database_1of2\database\stage\Components) in the same parent folder.

3.Then try to install as per the url from point:1.

4.Download jdk 1.5 version(offline) from oracle website.

To open oracle db:
copy, paste the path C:\Program Files\Java\jdk1.5.0_22

service id:
sid:orcl

To recover password:
Goto -> cmd prompt
1.sqlplus /nolog
2.connect /as sysdba
3.alter user system identified by Jay12345;

---------password changed-----------