package com.lzw.applicationhelper;

import android.content.Context;

/**
 * 操作逻辑写在这里
 * 【注意】这里只是提供一种思路，具体的初始化逻辑需要你自己去写上去，我就不一一去写了。
 * @author lzw
 * @date 2017/12/25
 */
public class InitWrapperImpl implements IInitWrapper{

    private static InitWrapperImpl mInstance;
    private String mLibName = Contants.LIB_NAME_NETWORK_OKHTTP;
    private String mVersionName = "3";
    public Context mContext;

    private InitWrapperImpl(){}

    public static InitWrapperImpl getInstance(){
        if(mInstance == null){
            mInstance = new InitWrapperImpl();
        }
        return mInstance;
    }

    @Override
    public void init(Context context) {
        mContext = context;
    }

    @Override
    public void setLib(String libName) {
        mLibName = libName;
    }

    @Override
    public String getLib() {
        return mLibName;
    }

    @Override
    public void setLibVersion(String version) {
        mVersionName = version;
    }

    @Override
    public String getLibVersion() {
        return mVersionName;
    }

    @Override
    public void onExecute() {

    }

    /**
     * 这样就可以针对不用版本的api可以同时做一些操作了，代码维护起来很方便
     */
    @Override
    public void execute(int type, String libName, String versionName) {
        //如果是网络框架
        if(type == Contants.TYPE_NETWORK){
           initNewWorkWrapper(libName,versionName);
        }else if(type == Contants.TYPE_DATABASE){
            initDataBaseWrapper(libName,versionName);
        }else if(type == Contants.TYPE_IMAGE){
            initImageWrapper(libName,versionName);
        }else if(type == Contants.TYPE_SHARE){
            initShareWrapper(libName,versionName);
        }else if(type == Contants.TYPE_PUSH){
            initPushWrapper(libName,versionName);
        }else if(type == Contants.TYPE_LOGIN){
            initLoginWrapper(libName,versionName);
        }else if(type == Contants.TYPE_STATISTICS){
            initStaticsWrapper(libName,versionName);
        }else if(type == Contants.TYPE_IM){
            initIMWrapper(libName,versionName);
        }else if(type == Contants.TYPE_ANNOTATIONS){
            initAnnotationsWrapper(libName,versionName);
        }else if(type == Contants.TYPE_INJECTION){
            initInjectionWrapper(libName,versionName);
        }else if(type == Contants.TYPE_EVENT){
            initEventWrapper(libName,versionName);
        }else if(type == Contants.TYPE_MAP){
            initMapWrapper(libName,versionName);
        }else if(type == Contants.TYPE_PULLREFERSH){
            initPullRefreshWrapper(libName,versionName);
        }else if(type == Contants.TYPE_RECYCLERVIRE_HELPER){
            initRecyclerViewHelperWrapper(libName,versionName);
        }else if(type == Contants.TYPE_SLIDESCROLLMENU){
            initSlideScrollMenuWrapper(libName,versionName);
        }else if(type == Contants.TYPE_NOTICESVIEW){
            initNoticesViewWrapper(libName,versionName);
        }else if(type == Contants.TYPE_CALENDARVIEW){
            initCalendarViewWrapper(libName,versionName);
        }else if(type == Contants.TYPE_DATETIMEVIEW){
            initDateTimeViewWrapper(libName,versionName);
        }else if(type == Contants.TYPE_CHART){
            initChartWrapper(libName,versionName);
        }else if(type == Contants.TYPE_LOG){
            initLogWrapper(libName,versionName);
        }else if(type == Contants.TYPE_QRCODE){
            initQRCodeWrapper(libName,versionName);
        }else if(type == Contants.TYPE_CARLICENSE_IDENTIFICATION){
            initCarLicenseIdentificationWrapper(libName,versionName);
        }else if(type == Contants.TYPE_FACE_IDENTIFICATION){
            initFaceIdentificationWrapper(libName,versionName);
        }else if(type == Contants.TYPE_IDCARD_IDENTIFICATION){
            initIDCardIdentificationWrapper(libName,versionName);
        }else if(type == Contants.TYPE_PHONENUM_IDENTIFICATION){
            initPhoneNumberIdentificationWrapper(libName,versionName);
        }else if(type == Contants.TYPE_VOICE){
            initVoiceLibWrapper(libName,versionName);
        }else if(type == Contants.TYPE_VIDEO){
            initVideoLibWrapper(libName,versionName);
        }else if(type == Contants.TYPE_VOICEANDVIDEO){
            initVoiceAndVideoLibWrapper(libName,versionName);
        }else if(type == Contants.TYPE_PAY){
            initPayLibWrapper(libName,versionName);
        }else if(type == Contants.TYPE_OTHER){
            initOtherLibWrapper(libName,versionName);
        }else{
           throw new IllegalArgumentException("type类型输入有误。");
        }
    }


    private void initNewWorkWrapper(String libName, String versionName){
       if(libName.equals(Contants.LIB_NAME_NETWORK_OKHTTP)){
           if(versionName.startsWith("2")){
               //对okhttp做初始化操作
           }
       }
       if(libName.equals(Contants.LIB_NAME_NETWORK_OKGO)){
           //对OkGo做初始化操作
       }
    }


    private void initDataBaseWrapper(String libName, String versionName) {

    }

    private void initImageWrapper(String libName, String versionName) {

    }

    private void initShareWrapper(String libName, String versionName) {

    }

    private void initPushWrapper(String libName, String versionName) {

    }

    private void initLoginWrapper(String libName, String versionName) {

    }

    private void initStaticsWrapper(String libName, String versionName) {

    }

    private void initIMWrapper(String libName, String versionName) {

    }

    private void initAnnotationsWrapper(String libName, String versionName) {

    }

    private void initInjectionWrapper(String libName, String versionName) {

    }

    private void initEventWrapper(String libName, String versionName) {

    }

    private void initMapWrapper(String libName, String versionName) {

    }

    private void initPullRefreshWrapper(String libName, String versionName) {

    }

    private void initRecyclerViewHelperWrapper(String libName, String versionName) {

    }

    private void initSlideScrollMenuWrapper(String libName, String versionName) {

    }

    private void initNoticesViewWrapper(String libName, String versionName) {

    }

    private void initCalendarViewWrapper(String libName, String versionName) {

    }

    private void initDateTimeViewWrapper(String libName, String versionName) {

    }

    private void initChartWrapper(String libName, String versionName) {

    }

    private void initLogWrapper(String libName, String versionName) {

    }

    private void initQRCodeWrapper(String libName, String versionName) {

    }

    private void initCarLicenseIdentificationWrapper(String libName, String versionName) {

    }

    private void initFaceIdentificationWrapper(String libName, String versionName) {

    }

    private void initIDCardIdentificationWrapper(String libName, String versionName) {

    }

    private void initPhoneNumberIdentificationWrapper(String libName, String versionName) {

    }

    private void initVoiceLibWrapper(String libName, String versionName) {

    }

    private void initVideoLibWrapper(String libName, String versionName) {

    }

    private void initVoiceAndVideoLibWrapper(String libName, String versionName) {

    }

    private void initPayLibWrapper(String libName, String versionName) {

    }

    private void initOtherLibWrapper(String libName, String versionName) {

    }








}
