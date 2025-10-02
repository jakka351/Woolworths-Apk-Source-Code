package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class CustomTabColorSchemeParams {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f205a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Integer f206a;
        public Integer b;
        public Integer c;

        public final CustomTabColorSchemeParams a() {
            return new CustomTabColorSchemeParams(this.f206a, null, this.b, this.c);
        }

        public final void b(int i) {
            this.f206a = Integer.valueOf(i | (-16777216));
        }
    }

    public CustomTabColorSchemeParams(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f205a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public static CustomTabColorSchemeParams a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new CustomTabColorSchemeParams((Integer) bundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer) bundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f205a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
