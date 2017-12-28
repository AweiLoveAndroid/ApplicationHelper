package com.lzw.applicationhelper;


import android.content.Context;

/**
 * 由于开发中Application里面会有很多初始化操作，
 * 所以写了一个ApplicationHelper帮助类把这些操作隔离出来。
 * @author lzw
 * @date 2017/12/25
 */
public class ApplicationHelper implements IInitMethods{

    /**
     * 【tips】这样写可能会导致内存泄漏。。。
     * 【欢迎高手提出更好的解决方案】
     */
    private static Context mContext;
    private static ApplicationHelper mInstance;
    private static InitWrapperImpl sInstance;

    private ApplicationHelper() {
    }

    public static ApplicationHelper init(Context context) {
        if (mInstance == null) {
            mInstance = new ApplicationHelper();
        }
        mContext = context;
        sInstance = InitWrapperImpl.getInstance();
        sInstance.init(mContext);
        return mInstance;
    }

    @Override
    public IInitMethods initNetWork() {
        sInstance.execute(Contants.TYPE_NETWORK,Contants.LIB_NAME_NETWORK_OKHTTP,"2");
        return mInstance;
    }

    @Override
    public IInitMethods initDataBase() {
        sInstance.execute(Contants.TYPE_DATABASE,Contants.LIB_NAME_DATABASE_GREENDAO,"3");
        return mInstance;
    }

    @Override
    public IInitMethods initImageLoader() {
        sInstance.execute(Contants.TYPE_IMAGE,Contants.LIB_NAME_IMAGE_GLIDE,"3");
        return mInstance;
    }

    @Override
    public IInitMethods initShare() {
        return mInstance;
    }

    @Override
    public IInitMethods initPush() {
        return mInstance;
    }

    @Override
    public IInitMethods initLogin() {
        return mInstance;
    }

    @Override
    public IInitMethods initStatistics() {
        return mInstance;
    }

    @Override
    public IInitMethods initIM() {
        return mInstance;
    }

    @Override
    public IInitMethods initAnnotationsLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initInjectionLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initEventsLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initMapLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initPullRefresh() {
        return mInstance;
    }

    @Override
    public IInitMethods initRecyclerViewHelper() {
        return mInstance;
    }

    @Override
    public IInitMethods initSlideScrollMenu() {
        return mInstance;
    }

    @Override
    public IInitMethods initNoticesView() {
        return mInstance;
    }

    @Override
    public IInitMethods initCalendarView() {
        return mInstance;
    }

    @Override
    public IInitMethods initDateTimeView() {
        return mInstance;
    }

    @Override
    public IInitMethods initChartLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initLogLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initQRCodeLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initCarLicenseIdentification() {
        return mInstance;
    }

    @Override
    public IInitMethods initFaceIdentification() {
        return mInstance;
    }

    @Override
    public IInitMethods initIDCardIdentification() {
        return mInstance;
    }

    @Override
    public IInitMethods initPhoneNumberIdentification() {
        return mInstance;
    }

    @Override
    public IInitMethods initVoiceLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initVideoLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initVoiceAndVideoLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initPayLib() {
        return mInstance;
    }

    @Override
    public IInitMethods initOther() {
        return mInstance;
    }
}
