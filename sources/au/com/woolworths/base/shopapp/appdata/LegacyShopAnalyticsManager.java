package au.com.woolworths.base.shopapp.appdata;

import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.analytics.adobe.data.ScreenState;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/shopapp/appdata/LegacyShopAnalyticsManager;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LegacyShopAnalyticsManager {
    void a(ScreenState screenState);

    void b(String str, String str2, String str3, String str4, CollectionMode collectionMode);

    void c(String str);

    void d(ActionData actionData);
}
