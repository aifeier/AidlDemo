package com.example.ai.iservice;
import com.example.ai.iservice.bean.User;
/*支持的数据类型：
    Java基本数据类型
    List和Map
        元素必须是AIDL支持的类型
        服务端具体的类必须是ArrayList和HashMap
    其他AIDL的接口
    实现Parcelable的实体*/

// 除基本类型外都需要导入，并在aidl下新建与所在类同包名的同名aidl文件，类如：
//                                                                  package com.example.ai.iservice.bean;
//                                                                    parcelable User;
// 除基本类型外作为参数都需要添加 in：输入；out：输出；inout：输入输出
interface ITest{
  User getUser();
  void setUser(in User user);
}