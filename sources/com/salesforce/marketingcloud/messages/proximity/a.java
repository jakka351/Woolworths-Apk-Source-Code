package com.salesforce.marketingcloud.messages.proximity;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.http.c;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.c;
import com.salesforce.marketingcloud.proximity.e;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.storage.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public final class a implements com.salesforce.marketingcloud.messages.c, e.a, c.InterfaceC0362c {
    static final String j = g.a("ProximityMessageManager");
    final j d;
    final com.salesforce.marketingcloud.proximity.e e;
    final c.a f;
    final com.salesforce.marketingcloud.http.c g;
    private final l h;
    private c.b i;

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.a$a, reason: collision with other inner class name */
    public class C0372a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketingCloudConfig f17018a;
        final /* synthetic */ String b;
        final /* synthetic */ LatLon c;

        public C0372a(MarketingCloudConfig marketingCloudConfig, String str, LatLon latLon) {
            this.f17018a = marketingCloudConfig;
            this.b = str;
            this.c = latLon;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            a aVar = a.this;
            aVar.g.a(com.salesforce.marketingcloud.http.a.n.a(this.f17018a, aVar.d.c(), com.salesforce.marketingcloud.http.a.a(this.f17018a.applicationId(), this.b, this.c)));
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            a.this.d.t().f(3);
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ com.salesforce.marketingcloud.proximity.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, com.salesforce.marketingcloud.proximity.c cVar) {
            super(str, objArr);
            this.b = cVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                com.salesforce.marketingcloud.storage.l lVarT = a.this.d.t();
                Region regionA = lVarT.a(this.b.f(), a.this.d.b());
                if (regionA == null) {
                    g.a(a.j, "BeaconRegion [%s] did not have matching Region in storage.", this.b);
                    return;
                }
                if (com.salesforce.marketingcloud.internal.j.a(regionA)) {
                    g.a(a.j, "Ignoring entry event.  Already inside Region [%s]", regionA);
                    return;
                }
                g.d(a.j, "Region [%s] was entered.  Will attempt to show associated message.", regionA.id());
                com.salesforce.marketingcloud.internal.j.a(regionA, true);
                lVarT.a(regionA.id(), true);
                a.this.f.b(regionA);
                List<String> listC = lVarT.c(regionA.id(), 5);
                if (listC.isEmpty()) {
                    return;
                }
                k kVarS = a.this.d.s();
                com.salesforce.marketingcloud.util.c cVarB = a.this.d.b();
                for (String str : listC) {
                    Message messageA = kVarS.a(str, cVarB);
                    if (messageA != null) {
                        a.this.f.a(regionA, messageA);
                    } else {
                        g.a(a.j, "Message with id [%s] not found", str);
                    }
                }
            } catch (Exception e) {
                g.b(a.j, e, "Proximity region (%s) was entered, but failed to check for associated message", this.b.f());
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.proximity.c f17019a;

        public d(com.salesforce.marketingcloud.proximity.c cVar) {
            this.f17019a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.salesforce.marketingcloud.storage.l lVarT = a.this.d.t();
            Region regionA = lVarT.a(this.f17019a.f(), a.this.d.b());
            if (regionA == null) {
                g.a(a.j, "BeaconRegion [%s] did not have matching Region in storage.", this.f17019a);
            } else {
                if (!com.salesforce.marketingcloud.internal.j.a(regionA)) {
                    g.a(a.j, "Ignoring exit event.  Was not inside BeaconRegion [%s]", this.f17019a);
                    return;
                }
                com.salesforce.marketingcloud.internal.j.a(regionA, false);
                a.this.f.a(regionA);
                lVarT.a(regionA.id(), false);
            }
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ ProximityMessageResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, ProximityMessageResponse proximityMessageResponse) {
            super(str, objArr);
            this.b = proximityMessageResponse;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.util.c cVarB = a.this.d.b();
            com.salesforce.marketingcloud.storage.l lVarT = a.this.d.t();
            List<Region> listA = lVarT.a(3, a.this.d.b());
            if (!listA.isEmpty()) {
                Collections.sort(listA);
            }
            lVarT.f(3);
            k kVarS = a.this.d.s();
            if (!this.b.beacons().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Region region : this.b.beacons()) {
                    try {
                        boolean z = false;
                        for (Message message : region.messages()) {
                            com.salesforce.marketingcloud.messages.b.a(message, kVarS, cVarB);
                            kVarS.a(message, cVarB);
                            z = true;
                        }
                        if (z) {
                            int iBinarySearch = Collections.binarySearch(listA, region);
                            if (iBinarySearch >= 0) {
                                com.salesforce.marketingcloud.internal.j.a(region, com.salesforce.marketingcloud.internal.j.a(listA.remove(iBinarySearch)));
                            }
                            lVarT.a(region, cVarB);
                            arrayList.add(new com.salesforce.marketingcloud.proximity.c(region));
                        }
                    } catch (Exception e) {
                        g.b(a.j, e, "Unable to start monitoring proximity region: %s", region.id());
                    }
                }
                g.a(a.j, "Monitoring beacons from request [%s]", arrayList);
                a.this.e.a(arrayList);
            }
            if (listA.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(listA.size());
            Iterator<Region> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.salesforce.marketingcloud.proximity.c(it.next()));
            }
            g.a(a.j, "Unmonitoring beacons [%s]", arrayList2);
            a.this.e.b(arrayList2);
        }
    }

    public a(@NonNull j jVar, @NonNull com.salesforce.marketingcloud.proximity.e eVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull l lVar, @NonNull c.a aVar) {
        this.d = jVar;
        this.e = eVar;
        this.g = cVar;
        this.h = lVar;
        this.f = aVar;
        cVar.a(com.salesforce.marketingcloud.http.a.n, this);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a() {
        this.e.a(this);
        this.g.a(com.salesforce.marketingcloud.http.a.n, this);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void b() {
        this.e.c();
        this.e.b(this);
        this.g.a(com.salesforce.marketingcloud.http.a.n);
        this.h.b().execute(new b("disable_beacon_tracking", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void c() {
        g.c(j, "monitorStoredRegions", new Object[0]);
        try {
            List<Region> listA = this.d.t().a(3, this.d.b());
            if (listA.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator<Region> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.salesforce.marketingcloud.proximity.c(it.next()));
            }
            g.a(j, "Monitoring beacons [%s]", arrayList);
            this.e.a(arrayList);
        } catch (Exception unused) {
            g.b(j, "Unable to monitor stored proximity regions.", new Object[0]);
        }
    }

    public boolean d() {
        return this.e.b();
    }

    @VisibleForTesting
    public void a(ProximityMessageResponse proximityMessageResponse) {
        g.c(j, "Proximity message request contained %d regions", Integer.valueOf(proximityMessageResponse.beacons().size()));
        c.b bVar = this.i;
        if (bVar != null) {
            bVar.a(proximityMessageResponse);
        }
        this.h.b().execute(new e("beacon_response", new Object[0], proximityMessageResponse));
    }

    @Override // com.salesforce.marketingcloud.proximity.e.a
    public void b(@NonNull com.salesforce.marketingcloud.proximity.c cVar) {
        g.d(j, "Proximity region (%s) entered.", cVar.f());
        this.h.b().execute(new c("", new Object[0], cVar));
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            g.c(j, "Request failed: %d - %s", Integer.valueOf(dVar.b()), dVar.e());
            return;
        }
        try {
            a(new ProximityMessageResponse(new JSONObject(dVar.a())));
        } catch (Exception e2) {
            g.b(j, e2, "Error parsing response.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e.a
    public void a(@NonNull com.salesforce.marketingcloud.proximity.c cVar) {
        g.d(j, "Proximity region (%s) exited.", cVar.f());
        this.h.b().execute(new d(cVar));
    }

    public static void a(j jVar, com.salesforce.marketingcloud.proximity.e eVar, com.salesforce.marketingcloud.http.c cVar, boolean z) {
        eVar.c();
        if (z) {
            jVar.t().f(3);
            jVar.s().e(5);
        }
        cVar.a(com.salesforce.marketingcloud.http.a.n);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, c.b bVar) {
        this.i = bVar;
        try {
            MarketingCloudSdk.requestSdk(new C0372a(marketingCloudConfig, str, latLon));
        } catch (Exception e2) {
            g.b(j, e2, "Failed to update proximity messages", new Object[0]);
        }
    }
}
