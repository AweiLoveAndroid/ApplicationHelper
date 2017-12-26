package com.lzw.applicationhelper;

/**
 * 初始化的所有方法的顶层接口
 * @author lzw
 * @date 2017/12/25
 */
public interface IInitMethods {
    /**
     * 初始化网络框架的库
     */
    IInitMethods initNetWork();
    /**
     * 初始化数据库框架的库
     */
    IInitMethods initDataBase();
    /**
     * 初始化图片加载框架的库
     */
    IInitMethods initImageLoader();
    /**
     * 初始化分享有关的
     */
    IInitMethods initShare();
    /**
     * 初始化推送有关的
     */
    IInitMethods initPush();
    /**
     * 初始化第三方登录有关的
     */
    IInitMethods initLogin();
    /**
     * 初始化统计有关的
     */
    IInitMethods initStatistics();
    /**
     * 初始化即时通讯
     */
    IInitMethods initIM();
    /**
     * 初始化注解框架
     */
    IInitMethods initAnnotationsLib();
    /**
     * 初始化依赖注入框架
     */
    IInitMethods initInjectionLib();
    /**
     * 初始化事件有关的库
     */
    IInitMethods initEventsLib();
    /**
     * 初始化地图
     */
    IInitMethods initMapLib();
    /**
     * 初始化下拉刷新的库
     */
    IInitMethods initPullRefresh();
    /**
     * 初始化RecyclerView的库
     */
    IInitMethods initRecyclerViewHelper();
    /**
     * 初始化侧滑菜单的库
     */
    IInitMethods initSlideScrollMenu();
    /**
     * 初始化的吐司，弹窗，进度条等提醒性的控件
     */
    IInitMethods initNoticesView();
    /**
     * 初始日历的库
     */
    IInitMethods initCalendarView();
    /**
     * 初始化日期时间的库
     */
    IInitMethods initDateTimeView();
    /**
     * 初始化图表的库
     */
    IInitMethods initChartLib();
    /**
     * 初始化打log的库
     */
    IInitMethods initLogLib();
    /**
     * 初始化二维码的库
     */
    IInitMethods initQRCodeLib();
    /**
     * 初始化车牌识别的库
     */
    IInitMethods initCarLicenseIdentification();
    /**
     * 初始化人脸识别的库
     */
    IInitMethods initFaceIdentification();
    /**
     * 初始化身份证识别的库
     */
    IInitMethods initIDCardIdentification();
    /**
     * 初始化手机号码识别的库
     */
    IInitMethods initPhoneNumberIdentification();
    /**
     * 初始化声音有关的库
     */
    IInitMethods initVoiceLib();
    /**
     * 初始化视频有关的库
     */
    IInitMethods initVideoLib();
    /**
     * 初始化音视频有关的库
     */
    IInitMethods initVoiceAndVideoLib();
    /**
     * 初始化支付有关的库
     */
    IInitMethods initPayLib();
    /**
     * 初始化其他的库，这里没有列举的可以在这里做初始化操作
     */
    IInitMethods initOther();
}
