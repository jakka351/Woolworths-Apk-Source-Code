package au.com.woolworths.android.onesite.extensions;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.app.ActivityOptionsCompat;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.foundation.internallinks.NavigationInterceptor;
import com.woolworths.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContextExtKt {
    public static final int a(float f, Context context) {
        Intrinsics.h(context, "<this>");
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final AppCompatActivity b(Context context) {
        Intrinsics.h(context, "<this>");
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            throw new ClassCastException("Please ensure that the provided Context is a valid Activity");
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.g(baseContext, "getBaseContext(...)");
        return b(baseContext);
    }

    public static final String c(Context context) {
        Intrinsics.h(context, "<this>");
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        return str == null ? "" : str;
    }

    public static final boolean d(Context context) {
        Intrinsics.h(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        Intrinsics.g(((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(4), "getEnabledAccessibilityServiceList(...)");
        return !r1.isEmpty();
    }

    public static final void e(Context context, String url) {
        Intrinsics.h(context, "<this>");
        Intrinsics.h(url, "url");
        NavigationInterceptor.f8537a.getClass();
        if (NavigationInterceptor.Companion.a(context, url)) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(url));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.no_browser_installed_message, 0).show();
        }
    }

    public static final void f(Context context) {
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        Intrinsics.g(intentPutExtra, "putExtra(...)");
        context.startActivity(intentPutExtra);
    }

    public static final void g(Context context, String appPackageName) {
        Intrinsics.h(context, "<this>");
        Intrinsics.h(appPackageName, "appPackageName");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(appPackageName))));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(appPackageName))));
        }
    }

    public static final void h(Context context, String url) {
        Intrinsics.h(url, "url");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(url));
            intent.setPackage("com.android.vending");
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.generic_server_error_subtitle, 0).show();
        }
    }

    public static final void i(Context context) {
        Intrinsics.h(context, "<this>");
        Intent intent = new Intent("android.settings.SYSTEM_UPDATE_SETTINGS");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void j(Context context, String url, Map headers, Pair pair, Pair pair2, int i) {
        if ((i & 2) != 0) {
            headers = EmptyMap.d;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        if ((i & 8) != 0) {
            pair2 = null;
        }
        int i2 = (i & 32) != 0 ? 0 : 1;
        Intrinsics.h(context, "<this>");
        Intrinsics.h(url, "url");
        Intrinsics.h(headers, "headers");
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            Intent intent = builder.f209a;
            if (pair != null) {
                builder.c = ActivityOptions.makeCustomAnimation(context, ((Number) pair.d).intValue(), ((Number) pair.e).intValue());
            }
            if (pair2 != null) {
                intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptionsCompat.a(context, ((Number) pair2.d).intValue(), ((Number) pair2.e).intValue()).c());
            }
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", i2);
            builder.b.b(Extensions.a(android.R.attr.colorBackground, context));
            CustomTabsIntent customTabsIntentA = builder.a();
            Intent intent2 = customTabsIntentA.f208a;
            Bundle bundle = new Bundle();
            for (Map.Entry entry : headers.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            intent2.putExtra("com.android.browser.headers", bundle);
            intent2.addFlags(1073741824);
            customTabsIntentA.b(context, Uri.parse(url));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.no_browser_installed_message, 0).show();
        }
    }

    public static final void k(Context context, long j, Integer num) {
        Intrinsics.h(context, "<this>");
        Vibrator vibrator = (Vibrator) context.getSystemService(Vibrator.class);
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createOneShot(j, num != null ? num.intValue() : -1));
    }
}
