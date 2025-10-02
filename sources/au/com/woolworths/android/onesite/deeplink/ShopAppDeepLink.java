package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ShopAppDeepLink;", "", "Extras", "Params", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShopAppDeepLink {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ShopAppDeepLink$Extras;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Extras {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ShopAppDeepLink$Params;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Params {
    }

    public static Intent a(Screen screen, String deepLink) {
        Intrinsics.h(deepLink, "deepLink");
        Intrinsics.h(screen, "screen");
        return c(deepLink, screen.getD());
    }

    public static Intent b(String deepLink, au.com.woolworths.analytics.Screen screen) {
        Intrinsics.h(deepLink, "deepLink");
        return c(deepLink, screen.getD());
    }

    public static Intent c(String str, String str2) {
        Intent intentA;
        if (Build.VERSION.SDK_INT >= 31) {
            intentA = new Intent("android.intent.action.VIEW", Uri.parse(str));
        } else {
            intentA = ActivityNavigatorKt.a(Activities.ShopAppDeepLinkHandler.f4529a, ApplicationType.e);
            intentA.setData(Uri.parse(str));
        }
        intentA.putExtra("ShopAppDeepLink.Extras.screenName", str2);
        return intentA;
    }
}
