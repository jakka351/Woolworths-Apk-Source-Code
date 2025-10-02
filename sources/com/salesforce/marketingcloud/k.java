package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.analytics.l;
import com.salesforce.marketingcloud.b;
import com.salesforce.marketingcloud.http.c;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class k implements com.salesforce.marketingcloud.e, com.salesforce.marketingcloud.behaviors.b, c.InterfaceC0362c, b.InterfaceC0348b {
    private static final String n = g.a("SyncRouteComponent");
    private static final int o = 202;
    protected final MarketingCloudConfig d;
    protected final com.salesforce.marketingcloud.http.c e;
    protected final com.salesforce.marketingcloud.storage.j f;
    protected final String g;
    private final com.salesforce.marketingcloud.internal.l h;
    private final com.salesforce.marketingcloud.behaviors.c i;
    private final com.salesforce.marketingcloud.alarms.b j;
    private final com.salesforce.marketingcloud.analytics.l k;
    protected Map<d, e> l = new ArrayMap(d.values().length);
    private boolean m;

    public class a implements MarketingCloudSdk.WhenReadyListener {
        public a() {
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            k kVar = k.this;
            kVar.e.a(com.salesforce.marketingcloud.http.a.p.a(kVar.d, kVar.f.c(), com.salesforce.marketingcloud.http.a.c(k.this.d.applicationId(), k.this.g), "{}"));
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ d b;
        final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, d dVar, JSONObject jSONObject) {
            super(str, objArr);
            this.b = dVar;
            this.c = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            e eVar = k.this.l.get(this.b);
            if (eVar != null) {
                eVar.onSyncReceived(this.b, this.c);
            }
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16946a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f16946a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16946a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        blocked,
        inAppMessages,
        triggers,
        pushFeaturesInUse,
        appConfig
    }

    public interface e {
        @WorkerThread
        void onSyncReceived(@NonNull d dVar, @NonNull JSONObject jSONObject);
    }

    public k(String str, MarketingCloudConfig marketingCloudConfig, com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.behaviors.c cVar2, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.l lVar2) {
        this.g = str;
        this.d = marketingCloudConfig;
        this.f = jVar;
        this.i = cVar2;
        this.e = cVar;
        this.j = bVar;
        this.h = lVar;
        this.k = lVar2;
    }

    private void a() {
        if (c()) {
            MarketingCloudSdk.requestSdk(b());
        }
    }

    private boolean c() {
        return !this.m;
    }

    @VisibleForTesting
    public MarketingCloudSdk.WhenReadyListener b() {
        return new a();
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "SyncRoute";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        return null;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i) {
        if (com.salesforce.marketingcloud.b.a(i, b.c.RTBF.f16854a)) {
            this.i.a(this);
            this.e.a(com.salesforce.marketingcloud.http.a.p);
            com.salesforce.marketingcloud.alarms.b bVar = this.j;
            a.EnumC0346a enumC0346a = a.EnumC0346a.g;
            bVar.e(enumC0346a);
            this.j.d(enumC0346a);
            this.m = true;
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i) {
        if (com.salesforce.marketingcloud.b.a(i, b.c.RTBF.f16854a)) {
            this.m = true;
            return;
        }
        this.e.a(com.salesforce.marketingcloud.http.a.p, this);
        this.i.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED));
        this.j.a(this, a.EnumC0346a.g);
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        int i = c.f16946a[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (!bundle.containsKey("_sync")) {
                if (bundle.containsKey("_nodes")) {
                    a(bundle.getString("_nodes"));
                    return;
                }
                return;
            }
        }
        a();
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        this.i.a(this);
        this.e.a(com.salesforce.marketingcloud.http.a.p);
        com.salesforce.marketingcloud.alarms.b bVar = this.j;
        a.EnumC0346a enumC0346a = a.EnumC0346a.g;
        bVar.e(enumC0346a);
        if (z) {
            this.j.d(enumC0346a);
        }
    }

    private void a(String str) {
        if (str != null) {
            try {
                a(new JSONArray(str));
            } catch (Exception e2) {
                g.b(n, e2, "Failed to parse sync push message", new Object[0]);
            }
        }
    }

    private void a(@NonNull JSONArray jSONArray) throws JSONException {
        a(jSONArray, 202);
    }

    private void a(@NonNull JSONArray jSONArray, int i) throws JSONException {
        String strOptString;
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            try {
                strOptString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            } catch (Exception unused) {
                strOptString = null;
            }
            try {
                d dVarValueOf = d.valueOf(strOptString);
                if (i != 202 || dVarValueOf == d.appConfig || dVarValueOf == d.blocked) {
                    this.h.a().execute(new b(strOptString + "-sync_node_process", new Object[0], dVarValueOf, jSONObject));
                }
            } catch (Exception unused2) {
                g.a(n, "Failed to process node %s sync route", strOptString);
            }
        }
    }

    @RestrictTo
    public static boolean a(@NonNull Map<String, String> map) {
        return map.containsKey("_sync") || map.containsKey("_nodes");
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    public void a(@NonNull a.EnumC0346a enumC0346a) {
        if (enumC0346a == a.EnumC0346a.g) {
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) throws JSONException {
        if (!dVar.g()) {
            this.j.b(a.EnumC0346a.g);
            g.b(n, "Sync route request failed with message: %s", dVar.e());
            return;
        }
        this.j.d(a.EnumC0346a.g);
        com.salesforce.marketingcloud.http.a.a(dVar.d(), this.f.c());
        a(dVar.h());
        try {
            JSONArray jSONArray = new JSONObject(dVar.a()).getJSONArray("nodes");
            if (jSONArray != null) {
                a(jSONArray, dVar.b());
            }
        } catch (Exception e2) {
            g.b(n, e2, "Failed to parse /sync route response", new Object[0]);
        }
    }

    public void a(d dVar, e eVar) {
        e eVar2 = this.l.get(dVar);
        if (eVar2 == null || eVar == null || eVar2 == eVar) {
            this.l.put(dVar, eVar);
        } else {
            g.e(n, "Node %s already assigned to listener %s.  %s was not added for the Node.", dVar, eVar2, eVar);
        }
    }

    public void a(@NonNull EnumSet<d> enumSet, e eVar) {
        Iterator<d> it = enumSet.iterator();
        while (it.hasNext()) {
            a(it.next(), eVar);
        }
    }

    private void a(long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            l.a aVar = l.a.SYNC_API;
            jSONObject.put(aVar.b(), j);
            if (com.salesforce.marketingcloud.config.a.e() == null || !com.salesforce.marketingcloud.config.a.e().l()) {
                return;
            }
            this.k.a(aVar, jSONObject);
        } catch (JSONException e2) {
            g.b(n, e2, "Failed to log TelemetryEvent for Sync Route", new Object[0]);
        }
    }
}
