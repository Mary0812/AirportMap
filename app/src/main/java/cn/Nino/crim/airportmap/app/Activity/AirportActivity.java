package cn.Nino.crim.airportmap.app.Activity;

import android.app.Fragment;
import android.os.Bundle;
import cn.Nino.crim.airportmap.app.Fragment.AirportFragment;

public class AirportActivity extends SingleFragmentActivity {
    public static Boolean flagDraw = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        flagDraw = true;
        super.onCreate(savedInstanceState);
    }

    protected int mFinishClick = 0; //单击Back键的次数，设置成单击两次才退出

    @Override
    protected Fragment creatFragment() {
        return new AirportFragment();
    }

    @Override
    public void finish() {
        mFinishClick++;
        if (mFinishClick == 1) {
            // Toast.makeText(this, "按两次退出键退出", Toast.LENGTH_SHORT).show();
        } else if (mFinishClick == 2) {
            super.finish();
        }
    }

    @Override
    public void onBackPressed() {
        if (mFinishClick == 2) {
            flagDraw = false;
        }
        super.onBackPressed();
    }
}
