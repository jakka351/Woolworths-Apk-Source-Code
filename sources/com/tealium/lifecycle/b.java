package com.tealium.lifecycle;

import android.app.Application;
import android.content.SharedPreferences;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.tealium.core.TealiumConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f19192a;
    public final SimpleDateFormat b;
    public final Date c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    public static final class a {
    }

    public b(TealiumConfig tealiumConfig) {
        Application application = tealiumConfig.f19129a;
        String hexString = Integer.toHexString((tealiumConfig.b + tealiumConfig.c + tealiumConfig.d.d).hashCode());
        StringBuilder sb = new StringBuilder("tealium.lifecycle.");
        sb.append(hexString);
        SharedPreferences sharedPreferences = application.getSharedPreferences(sb.toString(), 0);
        Intrinsics.g(sharedPreferences, "config.application.getSh…eferencesName(config), 0)");
        this.f19192a = sharedPreferences;
        this.b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        this.c = new Date(Long.MIN_VALUE);
    }

    public final void a(String str) {
        c.v(this.f19192a, "last_event", str);
    }

    public final void b() {
        SharedPreferences sharedPreferences = this.f19192a;
        sharedPreferences.edit().putInt("count_wake", sharedPreferences.getInt("count_wake", 0) + 1).apply();
        sharedPreferences.getInt("count_wake", 0);
        sharedPreferences.edit().putInt("count_total_wake", sharedPreferences.getInt("count_total_wake", 0) + 1).apply();
        sharedPreferences.getInt("count_total_wake", 0);
    }
}
