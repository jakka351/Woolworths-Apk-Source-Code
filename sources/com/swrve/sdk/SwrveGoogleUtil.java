package com.swrve.sdk;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import org.json.JSONObject;

/* loaded from: classes.dex */
class SwrveGoogleUtil implements SwrvePlatformUtil {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19055a;
    public final SwrveTrackingState b;
    public String c;

    public SwrveGoogleUtil(Application application, SwrveTrackingState swrveTrackingState) {
        this.f19055a = application;
        this.b = swrveTrackingState;
    }

    public final void a(JSONObject jSONObject) {
        int iIsGooglePlayServicesAvailable;
        if (!SwrveHelper.p(this.c)) {
            jSONObject.put("swrve.gcm_token", this.c);
        }
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f19055a);
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK getGooglePlayServicesAvailable exception.", e, new Object[0]);
            iIsGooglePlayServicesAvailable = -1000;
        }
        if (iIsGooglePlayServicesAvailable != 0) {
            jSONObject.put("swrve.play_services_available", iIsGooglePlayServicesAvailable);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void b(SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage, String str, String str2) {
        String str3 = this.c;
        if (str3 == null || !str3.equals(str2)) {
            this.c = str2;
            swrveMultiLayerLocalStorage.g(str, "RegistrationId", str2);
        }
        if (this.b == SwrveTrackingState.d) {
            SwrveSDKBase.a();
            if (!((SwrveConfig) SwrveSDKBase.f19075a.getConfig()).j) {
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            a(jSONObject);
            EventHelper.j(this.f19055a, str, jSONObject);
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK exception in saveAndSendRegistrationId", e, new Object[0]);
        }
    }
}
