package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    public BreadcrumbHandler d;

    public static String c(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void a(BreadcrumbHandler breadcrumbHandler) {
        this.d = breadcrumbHandler;
        Logger.f15258a.b("Registered Firebase Analytics event receiver for breadcrumbs", null);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public final void b(Bundle bundle, String str) {
        BreadcrumbHandler breadcrumbHandler = this.d;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.a("$A$:" + c(bundle, str));
            } catch (JSONException unused) {
                Logger.f15258a.f(null, "Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
