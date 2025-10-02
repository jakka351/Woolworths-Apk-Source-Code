package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.shop.auth.ShopAccountInteractor;

/* loaded from: classes3.dex */
public class TrolleyUrlUtil {
    public static String a(ShopAccountInteractor shopAccountInteractor, AppBuildConfig appBuildConfig) {
        if (shopAccountInteractor.S() && !Strings.b(shopAccountInteractor.n().getTrolleyUrl())) {
            return shopAccountInteractor.n().getTrolleyUrl();
        }
        return appBuildConfig.a() + "/trolley";
    }
}
