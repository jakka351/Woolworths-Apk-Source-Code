package com.tealium.core.consent;

import android.app.Application;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.messages.iam.j;
import com.tealium.core.TealiumConfig;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/consent/b;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f19147a;
    public ConsentStatus b;
    public Set c;

    public b(TealiumConfig tealiumConfig) {
        Application application = tealiumConfig.f19129a;
        String hexString = Integer.toHexString((tealiumConfig.b + tealiumConfig.c + tealiumConfig.d.d).hashCode());
        StringBuilder sb = new StringBuilder("tealium.userconsentpreferences.");
        sb.append(hexString);
        SharedPreferences sharedPreferences = application.getSharedPreferences(sb.toString(), 0);
        Intrinsics.g(sharedPreferences, "config.application.getSh…eferencesName(config), 0)");
        this.f19147a = sharedPreferences;
        this.b = ConsentStatus.UNKNOWN;
    }

    public final ConsentStatus a() {
        String string = this.f19147a.getString("status", j.h);
        Intrinsics.e(string);
        Locale locale = Locale.ROOT;
        String strM = androidx.constraintlayout.core.state.a.m(locale, "ROOT", string, locale, "this as java.lang.String).toLowerCase(locale)");
        String lowerCase = "consented".toLowerCase(locale);
        Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (strM.equals(lowerCase)) {
            return ConsentStatus.CONSENTED;
        }
        String lowerCase2 = "notConsented".toLowerCase(locale);
        Intrinsics.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        return strM.equals(lowerCase2) ? ConsentStatus.NOT_CONSENTED : ConsentStatus.UNKNOWN;
    }
}
