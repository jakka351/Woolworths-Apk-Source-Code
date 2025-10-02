package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.support.customtabs.ICustomTabsCallback;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CustomTabsIntent {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f208a;
    public final Bundle b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ActivityHeightResizeBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ActivitySideSheetDecorationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ActivitySideSheetPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        @Nullable
        @DoNotInline
        public static Locale a(Intent intent) {
            String stringExtra = intent.getStringExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG");
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        @DoNotInline
        public static void b(Intent intent, Locale locale) {
            intent.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", locale.toLanguageTag());
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @Nullable
        @DoNotInline
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    @RequiresApi
    public static class Api34Impl {
        @DoNotInline
        public static void a(ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface CloseButtonPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ShareState {
    }

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.f208a = intent;
        this.b = bundle;
    }

    public static CustomTabColorSchemeParams a(int i, Intent intent) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException(YU.a.d(i, "Invalid colorScheme: "));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return CustomTabColorSchemeParams.a(null);
        }
        CustomTabColorSchemeParams customTabColorSchemeParamsA = CustomTabColorSchemeParams.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) {
            return customTabColorSchemeParamsA;
        }
        CustomTabColorSchemeParams customTabColorSchemeParamsA2 = CustomTabColorSchemeParams.a(bundle);
        Integer num = customTabColorSchemeParamsA2.f205a;
        if (num == null) {
            num = customTabColorSchemeParamsA.f205a;
        }
        Integer num2 = customTabColorSchemeParamsA2.b;
        if (num2 == null) {
            num2 = customTabColorSchemeParamsA.b;
        }
        Integer num3 = customTabColorSchemeParamsA2.c;
        if (num3 == null) {
            num3 = customTabColorSchemeParamsA.c;
        }
        Integer num4 = customTabColorSchemeParamsA2.d;
        if (num4 == null) {
            num4 = customTabColorSchemeParamsA.d;
        }
        return new CustomTabColorSchemeParams(num, num2, num3, num4);
    }

    public final void b(Context context, Uri uri) {
        Intent intent = this.f208a;
        intent.setData(uri);
        context.startActivity(intent, this.b);
    }

    public static final class Builder {
        public ActivityOptions c;
        public SparseArray d;
        public Bundle e;

        /* renamed from: a, reason: collision with root package name */
        public final Intent f209a = new Intent("android.intent.action.VIEW");
        public final CustomTabColorSchemeParams.Builder b = new CustomTabColorSchemeParams.Builder();
        public int f = 0;
        public final boolean g = true;

        public Builder() {
        }

        public final CustomTabsIntent a() {
            Intent intent = this.f209a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.g);
            intent.putExtras(this.b.a().b());
            Bundle bundle2 = this.e;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            if (this.d != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.d);
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
            int i = Build.VERSION.SDK_INT;
            String strA = Api24Impl.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (i >= 34) {
                if (this.c == null) {
                    this.c = Api23Impl.a();
                }
                Api34Impl.a(this.c, false);
            }
            ActivityOptions activityOptions = this.c;
            return new CustomTabsIntent(intent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b(CustomTabsSession customTabsSession) {
            String packageName = customTabsSession.d.getPackageName();
            Intent intent = this.f209a;
            intent.setPackage(packageName);
            IBinder iBinderAsBinder = ((ICustomTabsCallback.Stub) customTabsSession.c).asBinder();
            PendingIntent pendingIntent = customTabsSession.e;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }

        public Builder(CustomTabsSession customTabsSession) {
            if (customTabsSession != null) {
                b(customTabsSession);
            }
        }
    }
}
