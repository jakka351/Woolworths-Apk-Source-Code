package au.com.woolworths.android.onesite.app;

import androidx.compose.runtime.internal.StabilityInferred;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.HiltAndroidApp;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/app/ShopApplication;", "Lau/com/woolworths/android/onesite/app/BaseShopApplication;", "<init>", "()V", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@HiltAndroidApp
/* loaded from: classes.dex */
public class ShopApplication extends Hilt_ShopApplication {
    @Override // au.com.woolworths.android.onesite.app.Hilt_ShopApplication, au.com.woolworths.android.onesite.app.BaseShopApplication, android.app.Application
    public final /* synthetic */ void onCreate() {
        Callback.i(this);
        super.onCreate();
    }
}
