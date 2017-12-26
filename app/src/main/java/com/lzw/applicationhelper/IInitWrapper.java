package com.lzw.applicationhelper;

import android.content.Context;

/**
 * 具体的执行过程公用的一些接口方法
 * @author lzw
 * @date 2017/12/25
 */
public interface IInitWrapper {
    /**
     * 初始化传入上下文
     * @param context
     */
    void init(Context context);

    /**
     * 设置是哪个库
     * @param libName 类型 这个可以在具体的实现类里面定义
     */
    void setLib(String libName);

    /**
     * 获取库
     * @return 返回库名
     */
    String getLib();

    /**
     * 设置lib库的版本号
     * 比如v2.X就就设置层2.X
     * @param version 版本号
     */
    void setLibVersion(String version);

    /**
     * 获取库的版本号
     * 通过这个方法就可以判断当前用的库是哪个版本的
     * @return 版本号
     */
    String getLibVersion();

    /**
     * 执行库的初始化的具体操作
     */
    void onExecute();

    /**
     * 执行库的初始化的具体操作
     * @param type 类型，用于区分是什么类型的框架，比如网络框架还是数据库框架
     * @param libName 库名
     * @param versionName 库的版本号
     */
    void execute(int type,String libName,String versionName);
}
