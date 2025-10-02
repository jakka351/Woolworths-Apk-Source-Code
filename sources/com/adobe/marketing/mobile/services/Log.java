package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.services.ServiceProvider;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes.dex */
public class Log {
    public static void a() {
        Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
    }

    public static void b(String str, String str2, String str3, Object... objArr) {
        if (ServiceProvider.ServiceProviderSingleton.f13239a.e != null) {
            try {
                android.util.Log.e("AdobeExperienceSDK", (str + q2.c + str2) + " - " + String.format(str3, objArr));
            } catch (Exception unused) {
                android.util.Log.e("AdobeExperienceSDK", str2 + " - " + str3);
            }
        }
    }

    public static void c() {
        Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
    }

    public static void d() {
        Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
    }
}
