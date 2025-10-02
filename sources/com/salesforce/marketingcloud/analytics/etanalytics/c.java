package com.salesforce.marketingcloud.analytics.etanalytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.http.c;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.storage.j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
/* loaded from: classes6.dex */
public class c implements c.InterfaceC0362c, b.InterfaceC0348b {
    final MarketingCloudConfig d;
    final String e;
    final j f;
    final com.salesforce.marketingcloud.http.c g;
    final com.salesforce.marketingcloud.alarms.b h;
    private final l i;

    public class a extends g {
        public a(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            List<com.salesforce.marketingcloud.analytics.b> listC = c.this.f.m().c(c.this.f.b());
            if (listC.isEmpty()) {
                c.this.h.d(a.EnumC0346a.c);
                return;
            }
            com.salesforce.marketingcloud.http.a aVar = com.salesforce.marketingcloud.http.a.h;
            c cVar = c.this;
            MarketingCloudConfig marketingCloudConfig = cVar.d;
            com.salesforce.marketingcloud.storage.c cVarC = cVar.f.c();
            c cVar2 = c.this;
            com.salesforce.marketingcloud.http.b bVarA = aVar.a(marketingCloudConfig, cVarC, cVar2.a(cVar2.d.applicationId(), c.this.e, listC).toString());
            bVarA.a(com.salesforce.marketingcloud.analytics.c.a(listC));
            c.this.g.a(bVarA);
        }
    }

    public c(MarketingCloudConfig marketingCloudConfig, String str, j jVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.alarms.b bVar, @NonNull l lVar) {
        this.d = (MarketingCloudConfig) com.salesforce.marketingcloud.util.j.a(marketingCloudConfig, "Config is null");
        this.e = (String) com.salesforce.marketingcloud.util.j.a(str, "DeviceId is null");
        this.f = (j) com.salesforce.marketingcloud.util.j.a(jVar, "MCStorage is null");
        this.g = (com.salesforce.marketingcloud.http.c) com.salesforce.marketingcloud.util.j.a(cVar, "RequestManager is null");
        this.h = (com.salesforce.marketingcloud.alarms.b) com.salesforce.marketingcloud.util.j.a(bVar, "AlarmScheduler is null");
        this.i = lVar;
        cVar.a(com.salesforce.marketingcloud.http.a.h, this);
        bVar.a(this, a.EnumC0346a.c);
    }

    public JSONArray a(String str, String str2, List<com.salesforce.marketingcloud.analytics.b> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.salesforce.marketingcloud.analytics.b bVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("etAppId", str);
                jSONObject.put("deviceId", str2);
                jSONObject.put("eventDate", com.salesforce.marketingcloud.util.l.a(bVar.b()));
                jSONObject.put("value", bVar.g());
                jSONObject.put("analyticTypes", new JSONArray((Collection) Collections.singletonList(Integer.valueOf(bVar.a()))));
                jSONObject.put("objectIds", new JSONArray((Collection) bVar.i()));
                String strC = bVar.c();
                if (!TextUtils.isEmpty(strC)) {
                    JSONObject jSONObject2 = new JSONObject(strC);
                    String strOptString = jSONObject2.optString("requestId");
                    if (!TextUtils.isEmpty(strOptString)) {
                        jSONObject.put("requestId", strOptString);
                    }
                    JSONObject jSONObject3 = jSONObject2.optJSONObject("propertyBag") != null ? jSONObject2.getJSONObject("propertyBag") : new JSONObject();
                    jSONObject3.put(k.a.b, "Android");
                    jSONObject.put("propertyBag", jSONObject3);
                }
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Failed to update EtAnalyticItem or convert it to JSON for transmission.", new Object[0]);
            }
        }
        return jSONArray;
    }

    public void b() {
        this.g.a(com.salesforce.marketingcloud.http.a.h);
        com.salesforce.marketingcloud.alarms.b bVar = this.h;
        a.EnumC0346a enumC0346a = a.EnumC0346a.c;
        bVar.d(enumC0346a);
        this.h.e(enumC0346a);
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    public void a(@NonNull a.EnumC0346a enumC0346a) {
        if (enumC0346a == a.EnumC0346a.c) {
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            com.salesforce.marketingcloud.g.c(AnalyticsManager.TAG, "Request failed: %d - %s", Integer.valueOf(dVar.b()), dVar.e());
            this.h.b(a.EnumC0346a.c);
            return;
        }
        this.h.c(a.EnumC0346a.c);
        if (bVar.q() != null) {
            this.i.b().execute(new com.salesforce.marketingcloud.analytics.d(this.f.m(), com.salesforce.marketingcloud.analytics.c.a(bVar.q())));
        }
    }

    public void a() {
        this.i.b().execute(new a("send_analytics", new Object[0]));
    }
}
