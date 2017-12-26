# ApplicationHelper

----

#### 快速解耦Application的逻辑，教你实现Application的隔离型框架

----

###### 【前言】很多人在开发中使用了大量的第三放的库，或者自己封装的库，很多库都是需要在Application里面配置的，如果配置过多，导致Application过于臃肿，代码不好维护，可读性比较差。下面是我写的一个简单的库，帮你快速解耦Application，让你的Application显得更简洁，更好维护。

----

>###### 1.首先来一张调用的图，如下，是不是很简单：

![调用方式](http://upload-images.jianshu.io/upload_images/6098829-2f6045c5208edb0e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

----

>###### 2.下面看一下ApplicationHelper这个类做了什么事情：

这是一个单例的类，调用init方法传入上下文，然后调用init开头的方法，比如initNetWork()就表示初始化网络操作的一些逻辑。

![ApplicationHelper这个类简单介绍](http://upload-images.jianshu.io/upload_images/6098829-724ff551f0cb1e2e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


----

>###### 3.ApplicationHelper实现了IInitMethods接口，这个接口主要用来规范有哪些逻辑要处理，它是初始化的所有方法的顶层接口，用于规范有哪些逻辑需要做，比如网络库，图片库等。

![IInitMethods接口](http://upload-images.jianshu.io/upload_images/6098829-60d9d78ee254bd46.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


----

>###### 4.ApplicationHelper类调用了InitWrapperImpl这个类，通过InitWrapperImpl.getInstance()返回一个实例对象，然后调用了init(mContext)方法，传入一个上下文，最后调用execute(XX,XX,XX)执行库的初始化的具体操作。

![InitWrapperImpl这个类的一个简单说明](http://upload-images.jianshu.io/upload_images/6098829-e276da4ce3138d7c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


 
----

>###### 5.InitWrapperImpl这个类里面用到了常量类Contants，主要保存type类型，和库的名字的信息。

![常量类Contants](http://upload-images.jianshu.io/upload_images/6098829-625be7b2eafac0d4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

----

>###### 6.InitWrapperImpl这个类它是实现了IInitWrapper接口，规范了具体的执行过程公用的一些接口方法。

![IInitWrapper接口](http://upload-images.jianshu.io/upload_images/6098829-4762fbb9b33ebecd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

----
###### 到此，这个库基本就介绍完了，是不是很简单？赶紧用起来吧。


----

# 觉得不错的朋友们 ，给个`star`支持一下吧。