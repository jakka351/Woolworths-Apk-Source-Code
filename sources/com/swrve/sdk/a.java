package com.swrve.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTResponse;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                InAppMessageHandler inAppMessageHandler = (InAppMessageHandler) this.e;
                JSONArray jSONArray = (JSONArray) this.f;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.g;
                inAppMessageHandler.getClass();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                            JSONArray jSONArray2 = new JSONArray();
                            if (jSONObject.has("payload")) {
                                jSONArray2 = jSONObject.getJSONArray("payload");
                            }
                            HashMap map = new HashMap();
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                inAppMessageHandler.a(map, SwrveHelper.a(jSONArray2.getJSONObject(i2)));
                            }
                            inAppMessageHandler.f19034a.E(string, map);
                        } catch (Exception e) {
                            SwrveLogger.c("Could not queue custom events associated with this button", e, new Object[0]);
                        }
                    } catch (Throwable th) {
                        scheduledExecutorService.shutdownNow();
                        throw th;
                    }
                }
                scheduledExecutorService.shutdownNow();
                return;
            case 1:
                Swrve swrve = (Swrve) this.e;
                swrve.q0.b(swrve.s, (String) this.f, (String) this.g);
                return;
            default:
                final SwrveDeeplinkManager swrveDeeplinkManager = (SwrveDeeplinkManager) this.e;
                final String str = (String) this.f;
                final String str2 = (String) this.g;
                try {
                    swrveDeeplinkManager.b.b(swrveDeeplinkManager.d.b + "/api/1/ad_journey_campaign", swrveDeeplinkManager.f19048a, new IRESTResponseListener() { // from class: com.swrve.sdk.SwrveDeeplinkManager.1
                        @Override // com.swrve.sdk.rest.IRESTResponseListener
                        public final void a(Exception exc) {
                            SwrveLogger.c("Error downloading ad campaign", exc, new Object[0]);
                        }

                        @Override // com.swrve.sdk.rest.IRESTResponseListener
                        public final void b(RESTResponse rESTResponse) {
                            try {
                                SwrveDeeplinkManager.this.a(str, str2, rESTResponse);
                            } catch (Exception e2) {
                                SwrveLogger.c("SwrveSDK: Error displaying ad campaign", e2, new Object[0]);
                            }
                        }
                    });
                    return;
                } catch (Exception e2) {
                    SwrveLogger.c("Could not update ad campaign, invalid parameters", e2, new Object[0]);
                    return;
                }
        }
    }
}
