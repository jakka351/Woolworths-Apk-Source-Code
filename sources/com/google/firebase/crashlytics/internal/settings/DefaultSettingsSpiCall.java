package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.util.HashMap;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONObject;

/* loaded from: classes.dex */
class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* renamed from: a, reason: collision with root package name */
    public final String f15394a;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this.f15394a = str;
    }

    public static void a(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        String str = settingsRequest.f15400a;
        if (str != null) {
            httpGetRequest.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        httpGetRequest.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpGetRequest.c("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.1");
        httpGetRequest.c(RequestBuilder.ACCEPT, "application/json");
        httpGetRequest.c("X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.b);
        String str2 = settingsRequest.c;
        if (str2 != null) {
            httpGetRequest.c("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = settingsRequest.d;
        if (str3 != null) {
            httpGetRequest.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String strA = settingsRequest.e.c().a();
        if (strA != null) {
            httpGetRequest.c("X-CRASHLYTICS-INSTALLATION-ID", strA);
        }
    }

    public static HashMap b(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put("build_version", settingsRequest.h);
        map.put("display_version", settingsRequest.g);
        map.put("source", Integer.toString(settingsRequest.i));
        String str = settingsRequest.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final JSONObject c(HttpResponse httpResponse) {
        int i = httpResponse.f15386a;
        Logger logger = Logger.f15258a;
        logger.e("Settings response code was: " + i);
        String str = this.f15394a;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            logger.c(null, "Settings request failed; (status: " + i + ") from " + str);
            return null;
        }
        String str2 = httpResponse.b;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            logger.f(e, "Failed to parse settings JSON from ".concat(str));
            logger.f(null, "Settings response " + str2);
            return null;
        }
    }
}
