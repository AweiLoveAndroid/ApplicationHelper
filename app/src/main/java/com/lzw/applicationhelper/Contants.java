package com.lzw.applicationhelper;

/**
 * 常量类，主要保存type类型，和库的名字的信息
 * @author lzw
 * @date 2017/12/25
 */
public class Contants {

    public static final int TYPE_NETWORK = 0x0001;
    public static final int TYPE_DATABASE = 0x0002;
    public static final int TYPE_IMAGE = 0x0003;
    public static final int TYPE_SHARE = 0x0004;
    public static final int TYPE_PUSH = 0x0005;
    public static final int TYPE_LOGIN = 0x0006;
    public static final int TYPE_STATISTICS = 0x0007;
    public static final int TYPE_IM = 0x0008;
    public static final int TYPE_ANNOTATIONS = 0x0009;
    public static final int TYPE_INJECTION = 0x0010;
    public static final int TYPE_EVENT = 0x0011;
    public static final int TYPE_MAP = 0x0012;
    public static final int TYPE_PULLREFERSH = 0x0013;
    public static final int TYPE_RECYCLERVIRE_HELPER = 0x0014;
    public static final int TYPE_SLIDESCROLLMENU = 0x0015;
    public static final int TYPE_NOTICESVIEW = 0x0016;
    public static final int TYPE_CALENDARVIEW = 0x0017;
    public static final int TYPE_DATETIMEVIEW = 0x0018;
    public static final int TYPE_CHART = 0x0019;
    public static final int TYPE_LOG = 0x0020;
    public static final int TYPE_QRCODE = 0x0021;
    public static final int TYPE_CARLICENSE_IDENTIFICATION = 0x0022;
    public static final int TYPE_FACE_IDENTIFICATION = 0x0023;
    public static final int TYPE_IDCARD_IDENTIFICATION = 0x0024;
    public static final int TYPE_PHONENUM_IDENTIFICATION = 0x0025;
    public static final int TYPE_VOICE = 0x0026;
    public static final int TYPE_VIDEO = 0x0027;
    public static final int TYPE_VOICEANDVIDEO = 0x0028;
    public static final int TYPE_PAY = 0x0029;
    public static final int TYPE_OTHER = 0x0030;

    /**
     * 网络框架
     */
    public static final String LIB_NAME_NETWORK_VOLLEY = "Volley";
    public static final String LIB_NAME_NETWORK_OKHTTP = "OkHttp";
    public static final String LIB_NAME_NETWORK_OKGO = "OkGo";
    public static final String LIB_NAME_NETWORK_RETROFIT = "Retrofit";

    /**
     * 图片加载框架
     */
    public static final String LIB_NAME_IMAGE_IMAGELOADER = "ImageLoader";
    public static final String LIB_NAME_IMAGE_PICASSO = "Picasso";
    public static final String LIB_NAME_IMAGE_GLIDE = "Glide";
    /**
     * 数据库框架
     */
    public static final String LIB_NAME_DATABASE_GREENDAO = "GreenDao";
    public static final String LIB_NAME_DATABASE_ORMLITE = "OrmLite";


}
