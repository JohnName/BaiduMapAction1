package host.msr.baidumapaction1;

import android.app.Application;
import android.content.Context;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Ymmmsick on 2016/4/25.
 */
public class BaseApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        //如果不添加这句话, mapView 会报错
        SDKInitializer.initialize(getApplicationContext());
    }

    public static Context getAppContext() {
        return mContext;
    }
}
