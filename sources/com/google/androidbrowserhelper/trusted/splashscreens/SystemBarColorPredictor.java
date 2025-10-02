package com.google.androidbrowserhelper.trusted.splashscreens;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import com.google.androidbrowserhelper.trusted.ChromeLegacyUtils;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
class SystemBarColorPredictor {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f14792a;

    public static class SupportedFeatures {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14793a;
        public final boolean b;

        public SupportedFeatures(boolean z, boolean z2) {
            this.f14793a = z;
            this.b = z2;
        }
    }

    public static int a(LauncherActivity launcherActivity, TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder) {
        Bundle extras = trustedWebActivityIntentBuilder.b.a().f208a.getExtras();
        Integer num = extras == null ? null : (Integer) extras.get("androidx.browser.customtabs.extra.COLOR_SCHEME");
        return (num == null || num.intValue() == 0) ? (launcherActivity.getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 1 : num.intValue();
    }

    public final SupportedFeatures b(LauncherActivity launcherActivity, String str) {
        IntentFilter intentFilter;
        IntentFilter intentFilter2;
        HashMap map = this.f14792a;
        SupportedFeatures supportedFeatures = (SupportedFeatures) map.get(str);
        if (supportedFeatures != null) {
            return supportedFeatures;
        }
        boolean z = false;
        if (!ChromeLegacyUtils.f14781a.contains(str) ? false : ChromeLegacyUtils.a(launcherActivity.getPackageManager(), str, 380900000)) {
            SupportedFeatures supportedFeatures2 = new SupportedFeatures(true, true);
            map.put(str, supportedFeatures2);
            return supportedFeatures2;
        }
        ResolveInfo resolveInfoResolveService = launcherActivity.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str), 64);
        boolean z2 = (resolveInfoResolveService == null || (intentFilter2 = resolveInfoResolveService.filter) == null || !intentFilter2.hasCategory("androidx.browser.customtabs.category.NavBarColorCustomization")) ? false : true;
        if (resolveInfoResolveService != null && (intentFilter = resolveInfoResolveService.filter) != null && intentFilter.hasCategory("androidx.browser.customtabs.category.ColorSchemeCustomization")) {
            z = true;
        }
        SupportedFeatures supportedFeatures3 = new SupportedFeatures(z2, z);
        map.put(str, supportedFeatures3);
        return supportedFeatures3;
    }
}
