package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.analytics.i;
import com.salesforce.marketingcloud.analytics.l;
import com.salesforce.marketingcloud.config.b;
import com.salesforce.marketingcloud.http.c;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.j;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class c extends i implements c.InterfaceC0362c, b.InterfaceC0348b {
    static final String k = com.salesforce.marketingcloud.g.a("DeviceStats");
    private static final int l = 1000;
    private static final int m = 1;
    final String d;
    final j e;
    final com.salesforce.marketingcloud.http.c f;
    final MarketingCloudConfig g;
    final com.salesforce.marketingcloud.alarms.b h;
    protected final l i;

    @VisibleForTesting
    public final boolean j;

    public class a extends com.salesforce.marketingcloud.internal.g {
        public a(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.storage.d dVarN = c.this.e.n();
            com.salesforce.marketingcloud.util.c cVarB = c.this.e.b();
            List<com.salesforce.marketingcloud.analytics.stats.b> listJ = dVarN.j(cVarB);
            if (!listJ.isEmpty()) {
                Date date = new Date();
                for (com.salesforce.marketingcloud.analytics.stats.b bVar : listJ) {
                    try {
                        bVar.a(date);
                        dVarN.a(bVar, cVarB);
                    } catch (Exception e) {
                        com.salesforce.marketingcloud.g.b(c.k, e, "Unable to update sync event analytic [%s]", Integer.valueOf(bVar.d()));
                    }
                }
            }
            com.salesforce.marketingcloud.g.c(c.k, "Handling app close and sending stats.", new Object[0]);
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ InAppMessage b;
        final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, InAppMessage inAppMessage, JSONObject jSONObject) {
            super(str, objArr);
            this.b = inAppMessage;
            this.c = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().h()) {
                com.salesforce.marketingcloud.g.c(c.k, "InAppMessage throttled event stat for message id %s", this.b.id());
                Date date = new Date();
                try {
                    c.this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.e.n(), c.this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(106, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.g.applicationId(), c.this.d, date, this.b.id(), com.salesforce.marketingcloud.internal.a.a(this.b), this.c), true)));
                } catch (JSONException e) {
                    com.salesforce.marketingcloud.g.b(c.k, e, "Failed to record iam throttled event stat.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.stats.c$c, reason: collision with other inner class name */
    public class C0352c extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0352c(String str, Object[] objArr, JSONObject jSONObject) {
            super(str, objArr);
            this.b = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().h()) {
                try {
                    Date date = new Date();
                    c.this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.e.n(), c.this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(106, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.g.applicationId(), c.this.d, date, (String) null, (String) null, this.b), true)));
                } catch (Exception e) {
                    com.salesforce.marketingcloud.g.b(c.k, e, "Failed to record syncGateTimeOut Event stat.", new Object[0]);
                }
            }
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, JSONObject jSONObject) {
            super(str, objArr);
            this.b = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().h()) {
                try {
                    Date date = new Date();
                    c.this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.e.n(), c.this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(106, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.g.applicationId(), c.this.d, date, (String) null, (String) null, this.b), true)));
                } catch (JSONException e) {
                    com.salesforce.marketingcloud.g.b(c.k, e, "Failed to record onInvalidConfig Event stat.", new Object[0]);
                }
            }
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ JSONObject b;
        final /* synthetic */ l.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, JSONObject jSONObject, l.a aVar) {
            super(str, objArr);
            this.b = jSONObject;
            this.c = aVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().l()) {
                    Date date = new Date();
                    c.this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.e.n(), c.this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(107, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.g.applicationId(), c.this.d, date, this.b), true)));
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(c.k, e, "Failed to record onTelemetryEvent stat. %s", this.c.name());
            }
        }
    }

    public class f extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ Event[] b;
        final /* synthetic */ Date c;
        final /* synthetic */ com.salesforce.marketingcloud.analytics.e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, Event[] eventArr, Date date, com.salesforce.marketingcloud.analytics.e eVar) {
            super(str, objArr);
            this.b = eventArr;
            this.c = date;
            this.d = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[Catch: Exception -> 0x0048, PHI: r5 r6 r7 r8
  0x0089: PHI (r5v6 java.lang.Boolean) = 
  (r5v4 java.lang.Boolean)
  (r5v2 java.lang.Boolean)
  (r5v2 java.lang.Boolean)
  (r5v2 java.lang.Boolean)
  (r5v2 java.lang.Boolean)
 binds: [B:40:0x0085, B:35:0x0073, B:30:0x0061, B:25:0x004f, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0089: PHI (r6v3 java.lang.Boolean) = 
  (r6v1 java.lang.Boolean)
  (r6v4 java.lang.Boolean)
  (r6v1 java.lang.Boolean)
  (r6v1 java.lang.Boolean)
  (r6v1 java.lang.Boolean)
 binds: [B:40:0x0085, B:35:0x0073, B:30:0x0061, B:25:0x004f, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0089: PHI (r7v3 java.lang.Boolean) = 
  (r7v1 java.lang.Boolean)
  (r7v1 java.lang.Boolean)
  (r7v4 java.lang.Boolean)
  (r7v1 java.lang.Boolean)
  (r7v1 java.lang.Boolean)
 binds: [B:40:0x0085, B:35:0x0073, B:30:0x0061, B:25:0x004f, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0089: PHI (r8v3 java.lang.Boolean) = 
  (r8v1 java.lang.Boolean)
  (r8v1 java.lang.Boolean)
  (r8v1 java.lang.Boolean)
  (r8v4 java.lang.Boolean)
  (r8v1 java.lang.Boolean)
 binds: [B:40:0x0085, B:35:0x0073, B:30:0x0061, B:25:0x004f, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0048, blocks: (B:8:0x0018, B:11:0x0024, B:42:0x0089, B:21:0x003f, B:24:0x004b, B:28:0x0055, B:29:0x005d, B:33:0x0067, B:34:0x006f, B:38:0x0079, B:39:0x0081), top: B:47:0x0018 }] */
        @Override // com.salesforce.marketingcloud.internal.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.analytics.stats.c.f.a():void");
        }
    }

    public class g extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ com.salesforce.marketingcloud.http.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, com.salesforce.marketingcloud.http.a aVar) {
            super(str, objArr);
            this.b = aVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() throws JSONException {
            com.salesforce.marketingcloud.http.a aVar = this.b;
            com.salesforce.marketingcloud.http.a aVar2 = com.salesforce.marketingcloud.http.a.r;
            if (aVar == aVar2 && !com.salesforce.marketingcloud.http.a.a(c.this.e)) {
                c.this.h.d(a.EnumC0346a.j);
                return;
            }
            com.salesforce.marketingcloud.http.a aVar3 = this.b;
            com.salesforce.marketingcloud.http.a aVar4 = com.salesforce.marketingcloud.http.a.q;
            List<com.salesforce.marketingcloud.analytics.stats.b> listK = aVar3 == aVar4 ? c.this.e.n().k(c.this.e.b()) : c.this.e.n().p(c.this.e.b());
            if (listK.isEmpty()) {
                com.salesforce.marketingcloud.http.a aVar5 = this.b;
                if (aVar5 == aVar4) {
                    c.this.h.d(a.EnumC0346a.i);
                    return;
                } else {
                    if (aVar5 == aVar2) {
                        c.this.h.d(a.EnumC0346a.j);
                        return;
                    }
                    return;
                }
            }
            com.salesforce.marketingcloud.g.c(c.k, "Preparing payload for device statistics.", new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("applicationId", c.this.g.applicationId());
                jSONObject.put("deviceId", c.this.d);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONArray.put(jSONObject2);
                jSONObject.put("nodes", jSONArray);
                jSONObject2.put("version", 1);
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "event");
                Integer numE = 1000;
                String strF = null;
                if (this.b == aVar2) {
                    com.salesforce.marketingcloud.config.b bVarA = com.salesforce.marketingcloud.config.a.e() != null ? com.salesforce.marketingcloud.config.a.e().a(c.this.e, b.EnumC0356b.f16874a.name()) : null;
                    if (bVarA != null) {
                        strF = bVarA.f();
                        if (bVarA.e() != null) {
                            numE = bVarA.e();
                        }
                    }
                }
                for (Map.Entry<String, JSONArray> entry : c.this.a(listK, numE.intValue()).entrySet()) {
                    jSONObject2.put("items", entry.getValue());
                    com.salesforce.marketingcloud.http.a aVar6 = this.b;
                    c cVar = c.this;
                    com.salesforce.marketingcloud.http.b bVarA2 = aVar6.a(cVar.g, cVar.e.c(), jSONObject.toString(), strF);
                    bVarA2.a(entry.getKey());
                    c.this.f.a(bVarA2);
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(c.k, e, "Failed to start sync events request.", new Object[0]);
            }
        }
    }

    public static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16852a;

        static {
            int[] iArr = new int[Event.Category.values().length];
            f16852a = iArr;
            try {
                iArr[Event.Category.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16852a[Event.Category.ENGAGEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16852a[Event.Category.IDENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16852a[Event.Category.SYSTEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull String str, boolean z, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        this.g = marketingCloudConfig;
        this.d = str;
        this.j = z;
        this.e = jVar;
        this.f = cVar;
        this.h = bVar;
        this.i = lVar;
        cVar.a(com.salesforce.marketingcloud.http.a.q, this);
        cVar.a(com.salesforce.marketingcloud.http.a.r, this);
        bVar.a(this, a.EnumC0346a.i, a.EnumC0346a.j);
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(long j) {
        this.i.b().execute(new a("stats_app_close", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void b(@NonNull InAppMessage inAppMessage) {
        if (!this.j) {
            com.salesforce.marketingcloud.g.a(k, "Track user is false.  Ignoring onInAppMessageDownloaded event.", new Object[0]);
            return;
        }
        try {
            com.salesforce.marketingcloud.g.c(k, "Creating download event stat for message id %s", inAppMessage.id());
            Date date = new Date();
            this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.e.n(), this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(101, date, com.salesforce.marketingcloud.analytics.stats.d.b(this.g.applicationId(), this.d, date, inAppMessage.id(), com.salesforce.marketingcloud.internal.a.a(inAppMessage)), true)));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to record analytic event for In App Message Downloaded", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    public void a(@NonNull a.EnumC0346a enumC0346a) {
        if (enumC0346a == a.EnumC0346a.i) {
            com.salesforce.marketingcloud.g.c(k, "Handling alarm to send stats", new Object[0]);
        } else if (enumC0346a != a.EnumC0346a.j) {
            return;
        } else {
            com.salesforce.marketingcloud.g.c(k, "Handling alarm to send stats", new Object[0]);
        }
        a();
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.m
    public void b(@NonNull JSONObject jSONObject) {
        try {
            this.i.b().execute(new C0352c("onSyncGateTimedOutEvent", new Object[0], jSONObject));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to track syncGateTimeOut Event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.n
    public void a(@NonNull com.salesforce.marketingcloud.analytics.e eVar, @NonNull Event... eventArr) {
        try {
            this.i.b().execute(new f("track_events", new Object[0], eventArr, new Date(), eVar));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to record iam displayed event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage) {
        try {
            com.salesforce.marketingcloud.g.c(k, "InAppMessage displayed event stat for message id %s", inAppMessage.id());
            Date date = new Date();
            this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.e.n(), this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(104, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.g.applicationId(), this.d, date, inAppMessage.id(), com.salesforce.marketingcloud.internal.a.a(inAppMessage)), true)));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to record iam displayed event stat.", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(@androidx.annotation.NonNull com.salesforce.marketingcloud.messages.iam.InAppMessage r17, @androidx.annotation.NonNull com.salesforce.marketingcloud.messages.iam.j r18) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1.j
            r2 = 0
            if (r0 != 0) goto L11
            java.lang.String r0 = com.salesforce.marketingcloud.analytics.stats.c.k
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Track user is false.  Ignoring onInAppMessageCompleted event."
            com.salesforce.marketingcloud.g.a(r0, r3, r2)
            return
        L11:
            java.lang.String r0 = com.salesforce.marketingcloud.analytics.stats.c.k     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = "Creating display event stat for message id %s"
            java.lang.String r4 = r17.id()     // Catch: java.lang.Exception -> L42
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.g.c(r0, r3, r4)     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Button r0 = r18.a()     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = r18.d()     // Catch: java.lang.Exception -> L42
            int r4 = r3.hashCode()     // Catch: java.lang.Exception -> L42
            r5 = -935167046(0xffffffffc8427bba, float:-199150.9)
            r6 = 1
            if (r4 == r5) goto L45
            r5 = 2117198997(0x7e31e495, float:5.9115055E37)
            if (r4 == r5) goto L38
            goto L4f
        L38:
            java.lang.String r4 = "buttonClicked"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L42
            if (r3 == 0) goto L4f
            r3 = r6
            goto L50
        L42:
            r0 = move-exception
            goto Lb8
        L45:
            java.lang.String r4 = "autoDismissed"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L42
            if (r3 == 0) goto L4f
            r3 = r2
            goto L50
        L4f:
            r3 = -1
        L50:
            r4 = 0
            if (r3 == 0) goto L56
            if (r3 == r6) goto L59
            r6 = 3
        L56:
            r15 = r4
            r14 = r6
            goto L61
        L59:
            if (r0 == 0) goto L5f
            java.lang.String r4 = r0.id()     // Catch: java.lang.Exception -> L42
        L5f:
            r6 = 2
            goto L56
        L61:
            java.util.Date r9 = new java.util.Date     // Catch: java.lang.Exception -> L42
            java.util.Date r0 = r18.c()     // Catch: java.lang.Exception -> L42
            long r3 = r0.getTime()     // Catch: java.lang.Exception -> L42
            long r5 = r18.b()     // Catch: java.lang.Exception -> L42
            long r3 = r3 + r5
            r9.<init>(r3)     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.MarketingCloudConfig r0 = r1.g     // Catch: java.lang.Exception -> L42
            java.lang.String r7 = r0.applicationId()     // Catch: java.lang.Exception -> L42
            java.lang.String r8 = r1.d     // Catch: java.lang.Exception -> L42
            java.lang.String r10 = r17.id()     // Catch: java.lang.Exception -> L42
            java.lang.String r11 = com.salesforce.marketingcloud.internal.a.a(r17)     // Catch: java.lang.Exception -> L42
            long r3 = r18.b()     // Catch: java.lang.Exception -> L42
            double r3 = (double) r3     // Catch: java.lang.Exception -> L42
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            double r3 = java.lang.Math.ceil(r3)     // Catch: java.lang.Exception -> L42
            long r12 = (long) r3     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.analytics.stats.d r0 = com.salesforce.marketingcloud.analytics.stats.d.a(r7, r8, r9, r10, r11, r12, r14, r15)     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.internal.l r3 = r1.i     // Catch: java.lang.Exception -> L42
            java.util.concurrent.ExecutorService r3 = r3.b()     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.analytics.stats.a r4 = new com.salesforce.marketingcloud.analytics.stats.a     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.storage.j r5 = r1.e     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.storage.d r5 = r5.n()     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.storage.j r6 = r1.e     // Catch: java.lang.Exception -> L42
            com.salesforce.marketingcloud.util.c r6 = r6.b()     // Catch: java.lang.Exception -> L42
            r7 = 100
            com.salesforce.marketingcloud.analytics.stats.b r0 = com.salesforce.marketingcloud.analytics.stats.b.a(r7, r9, r0, r2)     // Catch: java.lang.Exception -> L42
            r4.<init>(r5, r6, r0)     // Catch: java.lang.Exception -> L42
            r3.execute(r4)     // Catch: java.lang.Exception -> L42
            return
        Lb8:
            java.lang.String r3 = com.salesforce.marketingcloud.analytics.stats.c.k
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Failed to record analytic event for In App Message Displayed"
            com.salesforce.marketingcloud.g.b(r3, r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.analytics.stats.c.a(com.salesforce.marketingcloud.messages.iam.InAppMessage, com.salesforce.marketingcloud.messages.iam.j):void");
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull JSONObject jSONObject) {
        try {
            this.i.b().execute(new b("onInAppMessageThrottled", new Object[0], inAppMessage, jSONObject));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to track iam throttled event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        com.salesforce.marketingcloud.g.c(k, "Creating message validation error event stat for message id %s", str);
        try {
            Date date = new Date();
            this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.e.n(), this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(103, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.g.applicationId(), this.d, date, str, str2, list), true)));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to record validation event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull JSONObject jSONObject) {
        try {
            this.i.b().execute(new d("onInvalidConfigEvent", new Object[0], jSONObject));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to track onInvalidConfig Event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(@NonNull com.salesforce.marketingcloud.http.b bVar, @NonNull com.salesforce.marketingcloud.http.d dVar) {
        if (dVar.g()) {
            if (bVar.p() == com.salesforce.marketingcloud.http.a.q) {
                this.h.c(a.EnumC0346a.i);
            } else if (bVar.p() == com.salesforce.marketingcloud.http.a.r) {
                this.h.c(a.EnumC0346a.j);
            }
            if (bVar.q() != null) {
                String[] strArrA = com.salesforce.marketingcloud.analytics.c.a(bVar.q());
                com.salesforce.marketingcloud.g.c(k, "Removing events %s from DB", Arrays.toString(strArrA));
                this.e.n().c(strArrA);
                return;
            }
            return;
        }
        com.salesforce.marketingcloud.g.c(k, "Request failed: %d - %s", Integer.valueOf(dVar.b()), dVar.e());
        if (bVar.p() == com.salesforce.marketingcloud.http.a.q) {
            this.h.b(a.EnumC0346a.i);
        } else if (bVar.p() == com.salesforce.marketingcloud.http.a.r) {
            this.h.b(a.EnumC0346a.j);
        }
        if (bVar.q() != null) {
            this.e.n().d(com.salesforce.marketingcloud.analytics.c.a(bVar.q()));
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.l
    public void a(@NonNull l.a aVar, @NonNull JSONObject jSONObject) {
        l.a aVar2;
        try {
            aVar2 = aVar;
            try {
                this.i.b().execute(new e("onTelemetryEvent", new Object[0], jSONObject, aVar2));
            } catch (Exception e2) {
                e = e2;
                com.salesforce.marketingcloud.g.b(k, e, "Failed to track onTelemetryEvent stat. %s", aVar2.name());
            }
        } catch (Exception e3) {
            e = e3;
            aVar2 = aVar;
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        if (!this.j) {
            com.salesforce.marketingcloud.g.a(k, "Track user is false.  Ignoring onTriggerSuccessEvent event.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.g.c(k, "Creating trigger event stat for message id %s", str);
        try {
            Date date = new Date();
            this.i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.e.n(), this.e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(102, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.g.applicationId(), this.d, date, str2, str4, str, str3), true)));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(k, e2, "Failed to record device stat for successful trigger event", new Object[0]);
        }
    }

    public Map<String, JSONArray> a(List<com.salesforce.marketingcloud.analytics.stats.b> list, int i) throws JSONException {
        boolean z;
        int size = list.size();
        int iCeil = (int) Math.ceil(size / i);
        ArrayMap arrayMap = new ArrayMap(iCeil);
        for (int i2 = 0; i2 < iCeil; i2++) {
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray = new JSONArray();
            int i3 = i2 * i;
            boolean z2 = true;
            int i4 = i3;
            while (i4 < size && i4 < i3 + i) {
                com.salesforce.marketingcloud.analytics.stats.b bVar = list.get(i4);
                if (z2) {
                    z = false;
                } else {
                    sb.append(',');
                    z = z2;
                }
                sb.append(bVar.b());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventType", bVar.d());
                    jSONObject.put("event", bVar.c().f16853a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    com.salesforce.marketingcloud.g.b(k, e2, "Unable to add device stats to payload.", new Object[0]);
                }
                i4++;
                z2 = z;
            }
            arrayMap.put(sb.toString(), jSONArray);
        }
        return arrayMap;
    }

    public void a() {
        a(com.salesforce.marketingcloud.http.a.q);
        a(com.salesforce.marketingcloud.http.a.r);
    }

    @VisibleForTesting
    public void a(com.salesforce.marketingcloud.http.a aVar) {
        this.i.b().execute(new g("send_stats", new Object[0], aVar));
    }

    public static void a(@NonNull j jVar, boolean z) {
        if (z) {
            jVar.n().f();
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z) {
        this.f.a(com.salesforce.marketingcloud.http.a.q);
        this.f.a(com.salesforce.marketingcloud.http.a.r);
        com.salesforce.marketingcloud.alarms.b bVar = this.h;
        a.EnumC0346a enumC0346a = a.EnumC0346a.i;
        a.EnumC0346a enumC0346a2 = a.EnumC0346a.j;
        bVar.e(enumC0346a, enumC0346a2);
        if (z) {
            this.h.d(enumC0346a, enumC0346a2);
        }
    }
}
