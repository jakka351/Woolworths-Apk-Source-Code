package com.braintreepayments.api;

import android.content.Context;
import android.util.Base64;
import com.braintreepayments.api.ConfigurationCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoader;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfigurationLoader {

    /* renamed from: a, reason: collision with root package name */
    public final BraintreeHttpClient f13717a;
    public final ConfigurationCache b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoader$Companion;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final String a(Authorization authorization, String str) {
            StringBuilder sbS = YU.a.s(str);
            sbS.append(authorization.getC());
            byte[] bytes = sbS.toString().getBytes(Charsets.f24671a);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.g(strEncodeToString, "encodeToString(\"$configU…earer}\".toByteArray(), 0)");
            return strEncodeToString;
        }
    }

    public ConfigurationLoader(Context context, BraintreeHttpClient braintreeHttpClient) {
        Intrinsics.h(context, "context");
        ConfigurationCache.Companion companion = ConfigurationCache.b;
        ConfigurationCache configurationCache = ConfigurationCache.d;
        if (configurationCache == null) {
            synchronized (companion) {
                configurationCache = ConfigurationCache.d;
                if (configurationCache == null) {
                    BraintreeSharedPreferences braintreeSharedPreferencesA = BraintreeSharedPreferences.a(context);
                    Intrinsics.g(braintreeSharedPreferencesA, "getInstance(context)");
                    configurationCache = new ConfigurationCache(braintreeSharedPreferencesA);
                    ConfigurationCache.d = configurationCache;
                }
            }
        }
        this.f13717a = braintreeHttpClient;
        this.b = configurationCache;
    }
}
