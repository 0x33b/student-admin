# 项目笔记
    记录搭建过程中遇到的所有问题以及解决方案
## 1. 项目启动报错——org.apache.ibatis.binding.BindingException
    org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.student.manager.service.StudentInfoService.getStudentInfoList
### 解决方案
- 方法一
```
//在启动类中添加注解：
@MapperScan(basePackages = "com.***.mapper");
```
- 方案二
```
在application.yml中配置mybatis.mapper-location:classpath:com/***/mapper/*.Mapper.xml
```
## 2. 解决端口占用
```shell script
//查询所有端口
netstat -ano
//查询指定端口
netstat -ano|findstr "8080"
//查询结果
  TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       7280
  TCP    192.168.2.2:2462       101.91.37.18:8080      ESTABLISHED     4316
  TCP    [::]:8080              [::]:0                 LISTENING       7280

//查询PID
tasklist|find "7280"
java.exe                      7280 Console                    1    204,688 K

//终止进程以及子进程
taskkill /T /F /PID 7280
成功: 已终止 PID 7944 (属于 PID 7280 子进程)的进程
成功: 已终止 PID 7280 (属于 PID 11048 子进程)的进程
```    
## 3. Spring Boot API Controller方法正常执行，但是返回404
```
经过排查，Controller层用的注解是@Controller，换成@RestController后成功解决
```
