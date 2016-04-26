package host.msr.baidumapaction1;

import android.util.Log;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;

/**
 * Created by John on 2016/4/26.
 */
public class MyLocation implements BDLocationListener {
    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        bdLocation.getLatitude();
        bdLocation.getLongitude();
        bdLocation.getCity();
        Log.i("aaaaaaaaa",bdLocation.getCity());
    }
}
