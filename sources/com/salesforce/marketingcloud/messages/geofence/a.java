package com.salesforce.marketingcloud.messages.geofence;

import android.annotation.SuppressLint;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.http.c;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.location.f;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.c;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.storage.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class a implements com.salesforce.marketingcloud.messages.c, com.salesforce.marketingcloud.location.c, c.InterfaceC0362c {
    static final String k = g.a("GeofenceMessageManager");
    final f d;
    final j e;
    final c.a f;
    final com.salesforce.marketingcloud.http.c g;
    private final l h;
    AtomicBoolean i = new AtomicBoolean(false);
    private c.b j;

    /* renamed from: com.salesforce.marketingcloud.messages.geofence.a$a, reason: collision with other inner class name */
    public class C0369a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketingCloudConfig f16990a;
        final /* synthetic */ String b;
        final /* synthetic */ LatLon c;

        public C0369a(MarketingCloudConfig marketingCloudConfig, String str, LatLon latLon) {
            this.f16990a = marketingCloudConfig;
            this.b = str;
            this.c = latLon;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            a aVar = a.this;
            aVar.g.a(com.salesforce.marketingcloud.http.a.m.a(this.f16990a, aVar.e.c(), com.salesforce.marketingcloud.http.a.a(this.f16990a.applicationId(), this.b, this.c)));
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, String str2, int i) {
            super(str, objArr);
            this.b = str2;
            this.c = i;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                com.salesforce.marketingcloud.storage.l lVarT = a.this.e.t();
                Region regionA = lVarT.a(this.b, a.this.e.b());
                int i = 0;
                if (regionA == null) {
                    g.c(a.k, "Removing stale geofence from being monitored.", new Object[0]);
                    a.this.d.a(Collections.singletonList(this.b));
                    return;
                }
                int i2 = this.c;
                if (i2 == 1) {
                    a.this.f.b(regionA);
                    i = 3;
                } else if (i2 == 2) {
                    a.this.f.a(regionA);
                    i = 4;
                }
                if (i != 0) {
                    List<String> listC = lVarT.c(regionA.id(), i);
                    if (listC.isEmpty()) {
                        return;
                    }
                    k kVarS = a.this.e.s();
                    com.salesforce.marketingcloud.util.c cVarB = a.this.e.b();
                    for (String str : listC) {
                        Message messageA = kVarS.a(str, cVarB);
                        if (messageA != null) {
                            a.this.f.a(regionA, messageA);
                        } else {
                            g.a(a.k, "Message with id [%s] not found", str);
                        }
                    }
                }
            } catch (Exception e) {
                g.b(a.k, e, "Geofence (%s - %d) was tripped, but failed to check for associated message", this.b, Integer.valueOf(this.c));
            }
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            List<String> listD = a.this.e.t().d(1);
            if (!listD.isEmpty()) {
                a.this.d.a(listD);
            }
            a.this.e.t().f(1);
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ GeofenceMessageResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, GeofenceMessageResponse geofenceMessageResponse) {
            super(str, objArr);
            this.b = geofenceMessageResponse;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.storage.l lVarT = a.this.e.t();
            List<String> listD = lVarT.d(1);
            lVarT.f(1);
            k kVarS = a.this.e.s();
            com.salesforce.marketingcloud.util.c cVarB = a.this.e.b();
            if (!this.b.fences().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Region region : this.b.fences()) {
                    try {
                        boolean z = false;
                        for (Message message : region.messages()) {
                            com.salesforce.marketingcloud.messages.b.a(message, kVarS, cVarB);
                            kVarS.a(message, cVarB);
                            z = true;
                        }
                        if (z) {
                            if (!listD.remove(region.id())) {
                                arrayList.add(region);
                            }
                            lVarT.a(region, cVarB);
                        }
                    } catch (Exception e) {
                        g.b(a.k, e, "Unable to start monitoring geofence region: %s", region.id());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.this.d.a(a.a((Region) it.next()));
                }
            }
            if (!listD.isEmpty()) {
                a.this.d.a(listD);
            }
            a.this.i.set(true);
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        public e(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (a.this.i.get()) {
                g.d(a.k, "Attempt to monitor fences from DB ignored, because they're already monitored.", new Object[0]);
            }
            g.d(a.k, "monitorStoredRegions", new Object[0]);
            try {
                List<Region> listA = a.this.e.t().a(1, a.this.e.b());
                if (listA.isEmpty()) {
                    return;
                }
                Iterator<Region> it = listA.iterator();
                while (it.hasNext()) {
                    a.this.d.a(a.a(it.next()));
                }
            } catch (Exception e) {
                g.b(a.k, e, "Unable to monitor stored geofence regions.", new Object[0]);
            }
        }
    }

    public a(@NonNull j jVar, @NonNull f fVar, @NonNull com.salesforce.marketingcloud.http.c cVar, l lVar, @NonNull c.a aVar) {
        this.e = jVar;
        this.d = fVar;
        this.g = cVar;
        this.f = aVar;
        this.h = lVar;
        cVar.a(com.salesforce.marketingcloud.http.a.m, this);
    }

    private static int a(int i) {
        if (i < 100) {
            return 100;
        }
        return i;
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void b() {
        f fVar = this.d;
        if (fVar != null) {
            fVar.b(this);
            if (this.e != null) {
                this.h.b().execute(new c("disable_fence_tracking", new Object[0]));
            }
        }
        this.g.a(com.salesforce.marketingcloud.http.a.m);
        this.i.set(false);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void c() {
        this.h.b().execute(new e("monitor_stored_regions", new Object[0]));
    }

    public boolean d() {
        return this.d.a();
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a() {
        this.d.a(this);
        this.g.a(com.salesforce.marketingcloud.http.a.m, this);
    }

    public static com.salesforce.marketingcloud.location.b a(Region region) {
        return new com.salesforce.marketingcloud.location.b(region.id(), a(region.radius()), region.center().latitude(), region.center().longitude(), 3);
    }

    @VisibleForTesting
    public void a(GeofenceMessageResponse geofenceMessageResponse) {
        g.c(k, "Geofence message request contained %d regions", Integer.valueOf(geofenceMessageResponse.fences().size()));
        c.b bVar = this.j;
        if (bVar != null) {
            bVar.a(geofenceMessageResponse);
        }
        this.h.b().execute(new d("fence_response", new Object[0], geofenceMessageResponse));
    }

    @Override // com.salesforce.marketingcloud.location.c
    public void a(int i, @Nullable String str) {
        g.a(k, "Region error %d - %s", Integer.valueOf(i), str);
    }

    @Override // com.salesforce.marketingcloud.location.c
    public void a(@NonNull String str, int i, @Nullable Location location) {
        String str2 = k;
        g.d(str2, "Geofence (%s - %s) was tripped.", str, Integer.valueOf(i));
        if (i == 4) {
            g.d(str2, "Dwell transition ignore for %s", str);
        } else {
            this.h.b().execute(new b("fence_event", new Object[0], str, i));
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            g.c(k, "Request failed: %d - %s", Integer.valueOf(dVar.b()), dVar.e());
            return;
        }
        try {
            a(new GeofenceMessageResponse(new JSONObject(dVar.a())));
        } catch (Exception e2) {
            g.b(k, e2, "Error parsing response.", new Object[0]);
        }
    }

    public static void a(j jVar, f fVar, com.salesforce.marketingcloud.http.c cVar, boolean z) {
        List<String> listD = jVar.t().d(1);
        if (!listD.isEmpty()) {
            fVar.a(listD);
        }
        if (z) {
            jVar.t().f(1);
            k kVarS = jVar.s();
            kVarS.e(3);
            kVarS.e(4);
        }
        cVar.a(com.salesforce.marketingcloud.http.a.m);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, c.b bVar) {
        this.j = bVar;
        try {
            MarketingCloudSdk.requestSdk(new C0369a(marketingCloudConfig, str, latLon));
        } catch (Exception e2) {
            g.b(k, e2, "Failed to update geofence messages", new Object[0]);
        }
    }
}
