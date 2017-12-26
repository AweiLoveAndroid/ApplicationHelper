package com.lzw.applicationhelper;

import android.app.Application;

/**
 * 自定义的Application
 * @author lzw
 * @date 2017/12/25
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initThirdLibs();

    }

    /**
     * 这里对三方库的进行初始化
     * 比如网络框架、图片加载、即时通讯、数据库框架等
     * 很简单的几行代码搞定，维护起来也很方便。
     */
    private void initThirdLibs() {
        ApplicationHelper.init(this)
                .initNetWork()
                .initImageLoader()
                .initIM()
                .initDataBase();
    }
}
