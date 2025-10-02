package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.analytics.l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.EnumSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class h implements com.salesforce.marketingcloud.e, com.salesforce.marketingcloud.behaviors.b, j, RegionMessageManager.RegionTransitionEventListener, AnalyticsManager, g, f, m, n, l {
    private static final String s = "ETAnalyticsEnabled";
    private static final String t = "PIAnalyticsEnabled";
    private static final Object u = new Object();
    private final com.salesforce.marketingcloud.behaviors.c d;
    private final EnumSet<com.salesforce.marketingcloud.behaviors.a> e;
    final com.salesforce.marketingcloud.storage.j f;
    private final com.salesforce.marketingcloud.http.c g;
    private final String h;
    private final MarketingCloudConfig i;
    private final com.salesforce.marketingcloud.alarms.b j;
    private com.salesforce.marketingcloud.analytics.etanalytics.c k;
    com.salesforce.marketingcloud.analytics.etanalytics.b l;
    com.salesforce.marketingcloud.analytics.etanalytics.a m;
    com.salesforce.marketingcloud.analytics.piwama.i n;

    @VisibleForTesting
    com.salesforce.marketingcloud.analytics.stats.c o;
    private com.salesforce.marketingcloud.internal.l p;
    private com.salesforce.marketingcloud.toggles.a q;
    private com.salesforce.marketingcloud.toggles.a r;

    public class a extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ InboxMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, InboxMessage inboxMessage) {
            super(str, objArr);
            this.b = inboxMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (this.b == null || !h.this.f.q().e(this.b.id())) {
                com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InboxMessage is a Legacy message, null or unknown.  Call to trackInboxOpenEvent() ignored.", new Object[0]);
                return;
            }
            com.salesforce.marketingcloud.analytics.etanalytics.a aVar = h.this.m;
            if (aVar != null) {
                aVar.trackInboxOpenEvent(this.b);
            }
            com.salesforce.marketingcloud.analytics.etanalytics.b bVar = h.this.l;
            if (bVar != null) {
                bVar.trackInboxOpenEvent(this.b);
            }
            com.salesforce.marketingcloud.analytics.piwama.i iVar = h.this.n;
            if (iVar != null) {
                iVar.trackInboxOpenEvent(this.b);
            }
            com.salesforce.marketingcloud.analytics.stats.c cVar = h.this.o;
            if (cVar != null) {
                cVar.trackInboxOpenEvent(this.b);
            }
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16842a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f16842a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16842a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16842a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16842a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @RestrictTo
    public h(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar, @NonNull String str, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, com.salesforce.marketingcloud.analytics.etanalytics.a aVar, com.salesforce.marketingcloud.analytics.etanalytics.b bVar2, com.salesforce.marketingcloud.analytics.piwama.i iVar, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.stats.c cVar3, com.salesforce.marketingcloud.analytics.etanalytics.c cVar4) {
        this(marketingCloudConfig, jVar, str, bVar, cVar, cVar2, lVar);
        this.m = aVar;
        this.l = bVar2;
        this.n = iVar;
        this.o = cVar3;
        this.k = cVar4;
    }

    private void a(Bundle bundle) {
        long j = bundle.getLong("timestamp", 0L);
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(j);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(j);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(j);
            this.n.c();
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(j);
            this.o.a();
        }
        com.salesforce.marketingcloud.analytics.etanalytics.c cVar2 = this.k;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    private void b(Bundle bundle) {
        long j = bundle.getLong("timestamp", System.currentTimeMillis());
        com.salesforce.marketingcloud.analytics.etanalytics.c cVar = this.k;
        if (cVar != null) {
            cVar.a();
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(j);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.b(j);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.c();
            this.n.b(j);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar2 = this.o;
        if (cVar2 != null) {
            cVar2.a();
            this.o.b(j);
        }
    }

    private void c(Bundle bundle) {
        long j = bundle.getLong("timestamp", 0L);
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.c(j);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.c(j);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.c(j);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.c(j);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public boolean areAnalyticsEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f.o()), 256)) {
            return false;
        }
        if (this.q == null) {
            this.q = a(s, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.q;
        if (aVar != com.salesforce.marketingcloud.toggles.a.b) {
            return aVar == com.salesforce.marketingcloud.toggles.a.f17068a && this.i.analyticsEnabled();
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public boolean arePiAnalyticsEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f.o()), 512)) {
            return false;
        }
        if (this.r == null) {
            this.r = a(t, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.r;
        if (aVar != com.salesforce.marketingcloud.toggles.a.b) {
            return aVar == com.salesforce.marketingcloud.toggles.a.f17068a && this.i.piAnalyticsEnabled();
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.d
    public String componentName() {
        return "AnalyticsManager";
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bet_analytics", this.m != null);
            jSONObject.put("et_analytics", this.l != null);
            jSONObject.put("pi_analytics", this.n != null);
            jSONObject.put("device_stats", this.o != null);
            com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
            if (iVar != null) {
                jSONObject.put("predictive_intelligence_identifier", iVar.getPiIdentifier());
            }
            jSONObject.put("analyticsEnabled", areAnalyticsEnabled());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i) {
        boolean zA = com.salesforce.marketingcloud.b.a(i, 256);
        if (com.salesforce.marketingcloud.b.a(i, 2048)) {
            com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
            if (aVar != null) {
                aVar.a(false);
                this.m = null;
            }
            com.salesforce.marketingcloud.analytics.etanalytics.a.a(this.f, this.p, com.salesforce.marketingcloud.b.c(i, 2048));
            com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
            if (cVar != null) {
                cVar.a(false);
                this.o = null;
            }
            com.salesforce.marketingcloud.analytics.stats.c.a(this.f, com.salesforce.marketingcloud.b.c(i, 2048));
        } else {
            this.m = new com.salesforce.marketingcloud.analytics.etanalytics.a(this.f, this.p);
            MarketingCloudConfig marketingCloudConfig = this.i;
            this.o = new com.salesforce.marketingcloud.analytics.stats.c(marketingCloudConfig, this.h, marketingCloudConfig.analyticsEnabled() && !zA, this.f, this.g, this.j, this.p);
        }
        if (zA) {
            com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
            if (bVar != null) {
                bVar.a(false);
                this.l = null;
            }
            com.salesforce.marketingcloud.analytics.etanalytics.b.a(this.f, this.p, com.salesforce.marketingcloud.b.c(i, 256));
        } else if (this.l == null && this.i.analyticsEnabled()) {
            this.l = new com.salesforce.marketingcloud.analytics.etanalytics.b(this.f, this.p);
        }
        if (com.salesforce.marketingcloud.b.a(i, 512)) {
            com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
            if (iVar != null) {
                iVar.a(false);
                this.n = null;
            }
            com.salesforce.marketingcloud.analytics.piwama.i.a(this.f, this.g, this.p, com.salesforce.marketingcloud.b.c(i, 512));
        } else if (this.n == null && this.i.piAnalyticsEnabled()) {
            this.n = new com.salesforce.marketingcloud.analytics.piwama.i(this.i, this.f, this.g, this.p);
        }
        if (this.m != null || this.l != null) {
            if (this.k == null) {
                this.k = new com.salesforce.marketingcloud.analytics.etanalytics.c(this.i, this.h, this.f, this.g, this.j, this.p);
            }
        } else {
            this.j.d(a.EnumC0346a.c);
            com.salesforce.marketingcloud.analytics.etanalytics.c cVar2 = this.k;
            if (cVar2 != null) {
                cVar2.b();
                this.k = null;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void disableAnalytics() {
        synchronized (u) {
            try {
                this.q = com.salesforce.marketingcloud.toggles.a.c;
                this.f.f().edit().putString(s, this.q.name()).apply();
                com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
                if (bVar != null) {
                    bVar.a(true);
                    this.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void disablePiAnalytics() {
        synchronized (u) {
            try {
                this.r = com.salesforce.marketingcloud.toggles.a.c;
                this.f.f().edit().putString(t, this.r.name()).apply();
                com.salesforce.marketingcloud.g.a(AnalyticsManager.TAG, "Pi Analytics runtime toggle set to " + this.r.name(), new Object[0]);
                com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
                if (iVar != null) {
                    iVar.a(true);
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void enableAnalytics() {
        synchronized (u) {
            try {
                if (!com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f.o()), 256)) {
                    this.q = com.salesforce.marketingcloud.toggles.a.b;
                    this.f.f().edit().putString(s, this.q.name()).apply();
                    this.l = new com.salesforce.marketingcloud.analytics.etanalytics.b(this.f, this.p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void enablePiAnalytics() {
        synchronized (u) {
            try {
                if (!com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f.o()), 512)) {
                    this.r = com.salesforce.marketingcloud.toggles.a.b;
                    this.f.f().edit().putString(t, this.r.name()).apply();
                    com.salesforce.marketingcloud.g.a(AnalyticsManager.TAG, "Pi Analytics runtime toggle set to " + this.r.name(), new Object[0]);
                    this.n = new com.salesforce.marketingcloud.analytics.piwama.i(this.i, this.f, this.g, this.p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    @Nullable
    public String getPiIdentifier() {
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            return iVar.getPiIdentifier();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i) {
        boolean zA = a(i, a(s, this.q));
        if (com.salesforce.marketingcloud.b.b(i, 2048)) {
            this.m = new com.salesforce.marketingcloud.analytics.etanalytics.a(this.f, this.p);
            this.o = new com.salesforce.marketingcloud.analytics.stats.c(this.i, this.h, zA, this.f, this.g, this.j, this.p);
        }
        b(i, a(t, this.r));
        if (this.m != null || this.l != null) {
            this.k = new com.salesforce.marketingcloud.analytics.etanalytics.c(this.i, this.h, this.f, this.g, this.j, this.p);
        }
        this.d.a(this, this.e);
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        int i = b.f16842a[aVar.ordinal()];
        if (i == 1) {
            a(bundle);
            return;
        }
        if (i == 2) {
            b(bundle);
        } else if (i == 3 || i == 4) {
            c(bundle);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager.RegionTransitionEventListener
    public void onTransitionEvent(int i, @NonNull Region region) {
        if (i == 1) {
            com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
            if (aVar != null) {
                aVar.a(region);
            }
            com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
            if (bVar != null) {
                bVar.a(region);
            }
            com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
            if (iVar != null) {
                iVar.a(region);
            }
            com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
            if (cVar != null) {
                cVar.a(region);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.b(region);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar2 = this.l;
        if (bVar2 != null) {
            bVar2.b(region);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar2 = this.n;
        if (iVar2 != null) {
            iVar2.b(region);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar2 = this.o;
        if (cVar2 != null) {
            cVar2.b(region);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void setPiIdentifier(@Nullable @Size String str) {
        if (str != null && TextUtils.getTrimmedLength(str) == 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Call to setPiIdentifier() ignored. Predictive Intelligence Identifier contained only whitespace.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.setPiIdentifier(str);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        this.d.a(this);
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(z);
            this.m = null;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(z);
            this.l = null;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.c cVar = this.k;
        if (cVar != null) {
            cVar.b();
            this.k = null;
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar2 = this.o;
        if (cVar2 != null) {
            cVar2.a(z);
            this.o = null;
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(z);
            this.n = null;
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartContents(@NonNull PiCart piCart) {
        if (piCart == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "PiCart may not be null.  We could not complete your trackCartContents() request.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.trackCartContents(piCart);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.trackCartContents(piCart);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.trackCartContents(piCart);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.trackCartContents(piCart);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartConversion(@NonNull PiOrder piOrder) {
        if (piOrder == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "PiOrder may not be null.  We could not complete your trackCartConversion() request.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.trackCartConversion(piOrder);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.trackCartConversion(piOrder);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.trackCartConversion(piOrder);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.trackCartConversion(piOrder);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackInboxOpenEvent(@NonNull InboxMessage inboxMessage) {
        this.p.b().execute(new a("track_inbox_open", new Object[0], inboxMessage));
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size String str) {
        trackPageView(str, null, null, null);
    }

    public h(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar, @NonNull String str, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        this.e = EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE);
        this.f = (com.salesforce.marketingcloud.storage.j) com.salesforce.marketingcloud.util.j.a(jVar, "MCStorage may not be null.");
        this.d = (com.salesforce.marketingcloud.behaviors.c) com.salesforce.marketingcloud.util.j.a(cVar, "BehaviorManager may not be null.");
        this.g = cVar2;
        this.h = str;
        this.i = marketingCloudConfig;
        this.j = bVar;
        this.p = lVar;
    }

    private void b(int i, com.salesforce.marketingcloud.toggles.a aVar) {
        if (com.salesforce.marketingcloud.b.a(i, 512)) {
            return;
        }
        this.r = aVar;
        if (aVar == com.salesforce.marketingcloud.toggles.a.b || (this.i.piAnalyticsEnabled() && aVar == com.salesforce.marketingcloud.toggles.a.f17068a)) {
            this.n = new com.salesforce.marketingcloud.analytics.piwama.i(this.i, this.f, this.g, this.p);
        }
    }

    @VisibleForTesting
    public boolean a(int i, com.salesforce.marketingcloud.toggles.a aVar) {
        boolean z = false;
        if (com.salesforce.marketingcloud.b.a(i, 256)) {
            return false;
        }
        this.q = aVar;
        if (aVar == com.salesforce.marketingcloud.toggles.a.b || (this.i.analyticsEnabled() && aVar == com.salesforce.marketingcloud.toggles.a.f17068a)) {
            z = true;
        }
        if (z) {
            this.l = new com.salesforce.marketingcloud.analytics.etanalytics.b(this.f, this.p);
        }
        return z;
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size String str, @Nullable String str2) {
        trackPageView(str, str2, null, null);
    }

    private com.salesforce.marketingcloud.toggles.a a(String str, com.salesforce.marketingcloud.toggles.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        String string = this.f.f().getString(str, null);
        return string == null ? com.salesforce.marketingcloud.toggles.a.f17068a : com.salesforce.marketingcloud.toggles.a.valueOf(string);
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void b(@NonNull InAppMessage inAppMessage) {
        if (inAppMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InAppMessage is null.  Call to onInAppMessageDownloaded() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.b(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.b(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.b(inAppMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size String str, @Nullable String str2, @Nullable String str3) {
        trackPageView(str, str2, str3, null);
    }

    @Override // com.salesforce.marketingcloud.analytics.n
    public void a(@NonNull e eVar, @NonNull Event... eventArr) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(eVar, eventArr);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(eVar, eventArr);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(eVar, eventArr);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(eVar, eventArr);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void b(@NonNull JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Information not valid. Call to onSyncGateTimeOutEvent() ignored", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.b(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.b(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.b(jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "url may not be null or empty.  We could not complete your trackPageView() request.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.trackPageView(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.trackPageView(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.trackPageView(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.trackPageView(str, str2, str3, str4);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage) {
        if (inAppMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InAppMessage is null.  Call to onIamDisplayed() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(inAppMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void b(@NonNull NotificationMessage notificationMessage) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.b(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.b(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.b(notificationMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.messages.iam.j jVar) {
        if (inAppMessage == null || jVar == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InAppMessage or MessageCompletedEvent is null.  Call to onInAppMessageCompleted() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inAppMessage, jVar);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(inAppMessage, jVar);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(inAppMessage, jVar);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(inAppMessage, jVar);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull JSONObject jSONObject) {
        if (inAppMessage == null || jSONObject == null || jSONObject.length() <= 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Message and/or Information not valid. Call to onInAppMessageThrottled() ignored", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inAppMessage, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(inAppMessage, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(inAppMessage, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(inAppMessage, jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        if (str == null || str2 == null || list == null || list.isEmpty()) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "messageId, activityInstanceId or reasons is null.  Call to onInAppMessageValidationError() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(str, str2, list);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(str, str2, list);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(str, str2, list);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(str, str2, list);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Information not valid. Call to onInvalidConfigEvent() ignored", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.g
    public void a(@NonNull InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InboxMessage is null.  Call to onMessageDownloaded() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inboxMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(inboxMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(inboxMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(inboxMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.l
    public void a(@NonNull l.a aVar, @NonNull JSONObject jSONObject) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(aVar, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(aVar, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(aVar, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(aVar, jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        if (str == null || str2 == null || str3 == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "triggerId, outcomeId or outcomeType is null.  Call to onTriggerSuccessEvent() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(str, str2, str3, str4);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.o;
        if (cVar != null) {
            cVar.a(notificationMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage, boolean z) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(notificationMessage, z);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.l;
        if (bVar != null) {
            bVar.a(notificationMessage, z);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.n;
        if (iVar != null) {
            iVar.a(notificationMessage, z);
        }
    }
}
