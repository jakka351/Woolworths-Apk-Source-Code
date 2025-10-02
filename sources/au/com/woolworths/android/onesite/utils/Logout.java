package au.com.woolworths.android.onesite.utils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.d;
import au.com.woolworths.shop.auth.ShopAccountInteractor;

/* loaded from: classes3.dex */
public class Logout {
    public static void a(AppCompatActivity appCompatActivity, ShopAccountInteractor shopAccountInteractor) {
        if (shopAccountInteractor.b.b.getBoolean("forced_logged_out", false)) {
            androidx.constraintlayout.core.state.a.v(shopAccountInteractor.b.b, "forced_logged_out", false);
            if (appCompatActivity == null || appCompatActivity.isFinishing()) {
                return;
            }
            appCompatActivity.runOnUiThread(new d(appCompatActivity, 16));
        }
    }
}
