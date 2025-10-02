package com.swrve.sdk;

import android.content.Context;
import com.swrve.sdk.SwrveBase;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTClient;
import java.util.UUID;

/* loaded from: classes.dex */
class SwrveProfileManager<C extends SwrveConfigBase> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19068a;
    public final int b;
    public final String c;
    public final SwrveConfig d;
    public final RESTClient e;
    public String f;
    public String g;
    public SwrveTrackingState h;

    /* loaded from: classes6.dex */
    public class IdentifyIRESTResponseListener implements IRESTResponseListener {

        /* renamed from: a, reason: collision with root package name */
        public final SwrveIdentityResponse f19069a;

        public IdentifyIRESTResponseListener(SwrveIdentityResponse swrveIdentityResponse) {
            this.f19069a = swrveIdentityResponse;
        }

        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void a(Exception exc) throws Throwable {
            SwrveLogger.c("Error calling identity service", exc, new Object[0]);
            ((SwrveBase.AnonymousClass5) this.f19069a).b(503, exc.getMessage() == null ? "Unknown error" : exc.getMessage());
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        @Override // com.swrve.sdk.rest.IRESTResponseListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(com.swrve.sdk.rest.RESTResponse r8) throws java.lang.Throwable {
            /*
                r7 = this;
                int r0 = r8.f19107a
                java.lang.String r8 = r8.b
                java.lang.String r1 = "message"
                java.lang.String r2 = "swrve_id"
                java.lang.String r3 = "status"
                r4 = 0
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1b
                r5.<init>(r8)     // Catch: java.lang.Exception -> L1b
                boolean r6 = r5.has(r3)     // Catch: java.lang.Exception -> L1b
                if (r6 == 0) goto L1e
                java.lang.String r3 = r5.getString(r3)     // Catch: java.lang.Exception -> L1b
                goto L1f
            L1b:
                r2 = r4
                r3 = r2
                goto L39
            L1e:
                r3 = r4
            L1f:
                boolean r6 = r5.has(r2)     // Catch: java.lang.Exception -> L2a
                if (r6 == 0) goto L2c
                java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.Exception -> L2a
                goto L2d
            L2a:
                r2 = r4
                goto L39
            L2c:
                r2 = r4
            L2d:
                boolean r6 = r5.has(r1)     // Catch: java.lang.Exception -> L39
                if (r6 == 0) goto L37
                java.lang.String r8 = r5.getString(r1)     // Catch: java.lang.Exception -> L39
            L37:
                r4 = r8
                goto L42
            L39:
                java.lang.String r1 = "SwrveSDK unable to decode identity JSON : \"%s\"."
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                com.swrve.sdk.SwrveLogger.d(r1, r8)
            L42:
                r8 = 200(0xc8, float:2.8E-43)
                com.swrve.sdk.SwrveIdentityResponse r1 = r7.f19069a
                if (r0 != r8) goto L5c
                boolean r8 = com.swrve.sdk.SwrveHelper.p(r2)
                if (r8 == 0) goto L56
                java.lang.String r8 = "Swrve Id was missing from json payload"
                com.swrve.sdk.SwrveBase$5 r1 = (com.swrve.sdk.SwrveBase.AnonymousClass5) r1
                r1.b(r0, r8)
                return
            L56:
                com.swrve.sdk.SwrveBase$5 r1 = (com.swrve.sdk.SwrveBase.AnonymousClass5) r1
                r1.a(r3, r2)
                goto L65
            L5c:
                r8 = 500(0x1f4, float:7.0E-43)
                if (r0 >= r8) goto L65
                com.swrve.sdk.SwrveBase$5 r1 = (com.swrve.sdk.SwrveBase.AnonymousClass5) r1
                r1.b(r0, r4)
            L65:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveProfileManager.IdentifyIRESTResponseListener.b(com.swrve.sdk.rest.RESTResponse):void");
        }
    }

    public SwrveProfileManager(Context context, int i, String str, SwrveConfig swrveConfig, RESTClient rESTClient) {
        this.f19068a = context;
        this.b = i;
        this.c = str;
        this.d = swrveConfig;
        this.e = rESTClient;
    }

    public final String a() {
        if (this.g == null) {
            this.g = SwrveHelper.e(this.b, this.c, this.f);
        }
        return this.g;
    }

    public final SwrveTrackingState b() {
        if (this.h == null) {
            d();
        }
        return this.h;
    }

    public final String c() {
        if (this.f == null) {
            e();
        }
        return this.f;
    }

    public final synchronized void d() {
        if (this.h == null) {
            SwrveTrackingState swrveTrackingStateA = SwrveTrackingState.a(this.f19068a);
            this.h = swrveTrackingStateA;
            SwrveLogger.e("SwrveSDK: trackingState:%s", swrveTrackingStateA);
        }
    }

    public final synchronized void e() {
        try {
            if (this.f == null) {
                String string = this.f19068a.getSharedPreferences("swrve_prefs", 0).getString("userId", null);
                if (SwrveHelper.p(string)) {
                    this.f = UUID.randomUUID().toString();
                } else {
                    this.f = string;
                }
                SwrveLogger.e("SwrveSDK: userId is: %s", this.f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(SwrveTrackingState swrveTrackingState) {
        this.h = swrveTrackingState;
        if (swrveTrackingState != SwrveTrackingState.f) {
            this.f19068a.getSharedPreferences("swrve_prefs", 0).edit().putString("trackingState", swrveTrackingState.toString()).commit();
        }
        SwrveLogger.e("SwrveSDK: trackingState is set to: %s", swrveTrackingState);
    }
}
