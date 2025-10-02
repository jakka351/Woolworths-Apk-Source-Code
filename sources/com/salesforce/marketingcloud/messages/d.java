package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.c;
import com.salesforce.marketingcloud.messages.geofence.GeofenceMessageResponse;
import com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.notifications.a;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.h;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class d implements com.salesforce.marketingcloud.e, RegionMessageManager, b.InterfaceC0348b, com.salesforce.marketingcloud.location.e, com.salesforce.marketingcloud.behaviors.b, c.b, c.a, com.salesforce.marketingcloud.location.c {
    private static final float B = 0.8f;

    @VisibleForTesting
    static final String w = "et_geo_enabled_key";

    @VisibleForTesting
    static final String x = "et_region_message_toggled_key";

    @VisibleForTesting
    static final String y = "et_proximity_enabled_key";

    @VisibleForTesting
    static final int z = 5000;
    final j d;
    private final com.salesforce.marketingcloud.alarms.b e;
    private final com.salesforce.marketingcloud.location.f f;
    private final com.salesforce.marketingcloud.proximity.e g;
    private final MarketingCloudConfig h;
    private final String i;
    private final Context j;
    private final com.salesforce.marketingcloud.notifications.a k;
    private final com.salesforce.marketingcloud.behaviors.c l;
    private final com.salesforce.marketingcloud.http.c m;
    private final Set<RegionMessageManager.GeofenceMessageResponseListener> n = new ArraySet(0);
    private final Set<RegionMessageManager.ProximityMessageResponseListener> o = new ArraySet(0);
    private final Set<RegionMessageManager.RegionTransitionEventListener> p;
    private final AtomicBoolean q;
    private final l r;
    private com.salesforce.marketingcloud.messages.geofence.a s;
    private com.salesforce.marketingcloud.messages.proximity.a t;
    private com.salesforce.marketingcloud.toggles.a u;
    private com.salesforce.marketingcloud.toggles.a v;
    private static final String A = "RegionMessageManager";
    static final String C = com.salesforce.marketingcloud.g.a(A);

    public class a extends com.salesforce.marketingcloud.internal.g {
        public a(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            LatLon latLonF;
            j jVar = d.this.d;
            if (jVar == null || (latLonF = jVar.r().f(d.this.d.b())) == null) {
                return;
            }
            d.this.a(latLonF);
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            LatLon latLonF;
            j jVar = d.this.d;
            if (jVar == null || (latLonF = jVar.r().f(d.this.d.b())) == null) {
                return;
            }
            d.this.b(latLonF);
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            d.this.d.t().l();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$d, reason: collision with other inner class name */
    public class C0368d extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ LatLon b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0368d(String str, Object[] objArr, LatLon latLon) {
            super(str, objArr);
            this.b = latLon;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                d dVar = d.this;
                boolean zA = dVar.a(this.b, dVar.d.t().m(d.this.d.b()));
                d.this.d.r().a(this.b, d.this.d.b());
                if (zA) {
                    d.this.a(this.b, d.z);
                    d.this.a(this.b);
                    d.this.b(this.b);
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(d.C, e, "Unable to store last location", new Object[0]);
            }
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ Region b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, Region region) {
            super(str, objArr);
            this.b = region;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                d.this.d.t().a(this.b, d.this.d.b());
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(d.C, e, "Unable to set magic region", new Object[0]);
            }
        }
    }

    public class f implements a.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Message f16987a;

        public f(Message message) {
            this.f16987a = message;
        }

        @Override // com.salesforce.marketingcloud.notifications.a.b
        public void a(int i) {
            if (i != -1) {
                try {
                    com.salesforce.marketingcloud.internal.f.a(this.f16987a, i);
                    d.this.d.s().a(this.f16987a, d.this.d.b());
                } catch (Exception e) {
                    com.salesforce.marketingcloud.g.b(d.C, e, "Unable to update message id with notification id.", new Object[0]);
                }
            }
        }
    }

    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16988a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            b = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[a.EnumC0346a.values().length];
            f16988a = iArr2;
            try {
                iArr2[a.EnumC0346a.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RestrictTo
    public d(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull String str, @NonNull com.salesforce.marketingcloud.location.f fVar, @NonNull com.salesforce.marketingcloud.proximity.e eVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull com.salesforce.marketingcloud.notifications.a aVar, l lVar, RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        ArraySet arraySet = new ArraySet(0);
        this.p = arraySet;
        this.q = new AtomicBoolean(false);
        this.j = context;
        this.d = jVar;
        this.f = fVar;
        this.g = eVar;
        this.k = aVar;
        this.e = bVar;
        this.l = cVar;
        this.m = cVar2;
        this.i = str;
        this.h = marketingCloudConfig;
        arraySet.add(regionTransitionEventListener);
        this.r = lVar;
    }

    private boolean a(boolean z2) {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.d.o()), 32)) {
            return false;
        }
        if (!z2 && isGeofenceMessagingEnabled()) {
            com.salesforce.marketingcloud.g.a(C, "Geofence messaging is already enabled", new Object[0]);
            return false;
        }
        com.salesforce.marketingcloud.messages.geofence.a aVar = this.s;
        if (aVar != null && !aVar.d()) {
            com.salesforce.marketingcloud.g.a(C, "Geofence messaging was not enabled due to device limitation.", new Object[0]);
            return false;
        }
        if (h.b(this.j)) {
            return true;
        }
        f();
        return false;
    }

    private boolean b(boolean z2) {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.d.o()), 64)) {
            return false;
        }
        if (!z2 && isProximityMessagingEnabled()) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging is already enabled.", new Object[0]);
            return false;
        }
        if (this.t == null) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging was not enabled while configuring the SDK.  Messaging will not be enabled.", new Object[0]);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31 && this.h.proximityNotificationCustomizationOptions() == null) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging configuration is not passed while configuring the SDK.  Messaging will not be enabled.", new Object[0]);
            return false;
        }
        if (!this.t.d() || !this.f.a()) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging was not enabled due to device limitation.", new Object[0]);
            return false;
        }
        if (!h.b(this.j)) {
            f();
            return false;
        }
        if (h.c(this.j)) {
            return true;
        }
        e();
        return false;
    }

    private synchronized boolean c(boolean z2) {
        if (!com.salesforce.marketingcloud.util.d.b()) {
            com.salesforce.marketingcloud.g.e(C, "GooglePlayServices Location dependency missing from build.", new Object[0]);
            return false;
        }
        if (!a(z2)) {
            return false;
        }
        com.salesforce.marketingcloud.g.d(C, "Enabling geofence messaging", new Object[0]);
        if (!z2) {
            this.d.f().edit().putBoolean(w, true).apply();
            this.d.f().edit().putBoolean(x, true).apply();
            this.u = com.salesforce.marketingcloud.toggles.a.b;
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, true);
            com.salesforce.marketingcloud.behaviors.c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, bundle);
        }
        this.s.a();
        return c();
    }

    private boolean d(boolean z2) {
        if (!com.salesforce.marketingcloud.util.d.a()) {
            com.salesforce.marketingcloud.g.e(C, "If you wish to use proximity messenger then you need to add the AltBeacon dependency.", new Object[0]);
            return false;
        }
        if (!b(z2)) {
            return false;
        }
        com.salesforce.marketingcloud.g.d(C, "Enabling proximity messaging.", new Object[0]);
        if (z2) {
            this.t.c();
        } else {
            j jVar = this.d;
            if (jVar != null) {
                jVar.f().edit().putBoolean(y, true).apply();
                this.d.f().edit().putBoolean(x, true).apply();
            }
            this.v = com.salesforce.marketingcloud.toggles.a.b;
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, true);
            com.salesforce.marketingcloud.behaviors.c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, bundle);
        }
        this.t.a();
        return c();
    }

    private void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            com.salesforce.marketingcloud.g.a(C, "Missing %s or %s", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT");
        }
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 29) {
            com.salesforce.marketingcloud.g.a(C, "Missing %s", "android.permission.ACCESS_FINE_LOCATION");
        } else {
            com.salesforce.marketingcloud.g.a(C, "Missing %s or %s", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
    }

    private void g() {
        if (isGeofenceMessagingEnabled() && a(true)) {
            this.s.c();
        }
        if (isProximityMessagingEnabled() && b(true)) {
            this.t.c();
        }
    }

    private void h() {
        this.r.b().execute(new c("reset_flags", new Object[0]));
    }

    private void i() {
        if (isGeofenceMessagingEnabled()) {
            this.r.b().execute(new a("update_geofence", new Object[0]));
        }
    }

    private void j() {
        if (isProximityMessagingEnabled()) {
            this.r.b().execute(new b("update_proximity", new Object[0]));
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return A;
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("geofenceMessagingEnabled", isGeofenceMessagingEnabled());
            jSONObject.put("proximityMessagingEnabled", isProximityMessagingEnabled());
            com.salesforce.marketingcloud.storage.l lVarT = this.d.t();
            com.salesforce.marketingcloud.util.c cVarB = this.d.b();
            if (lVarT != null) {
                Region regionM = lVarT.m(cVarB);
                if (regionM != null) {
                    jSONObject.put("magic_fence", regionM);
                }
                jSONObject.put("geofence_regions", lVarT.a(1, cVarB));
                jSONObject.put("geofence_region_messages", this.d.s().a(cVarB));
                jSONObject.put("proximity_regions", lVarT.a(3, cVarB));
                jSONObject.put("proximity_region_messages", this.d.s().b(cVarB));
                jSONObject.put("boot_complete_permission", h.a(this.j, "android.permission.RECEIVE_BOOT_COMPLETED"));
            }
            return jSONObject;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.a(C, e2, "Error creating RegionMessageManager state.", new Object[0]);
            return jSONObject;
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public final synchronized void controlChannelInit(int i) {
        try {
            if (com.salesforce.marketingcloud.b.a(i, 32)) {
                disableGeofenceMessaging();
                this.s = null;
                com.salesforce.marketingcloud.messages.geofence.a.a(this.d, this.f, this.m, com.salesforce.marketingcloud.b.c(i, 32));
            } else if (this.s == null && this.h.geofencingEnabled()) {
                a((InitializationStatus.a) null, i);
            }
            if (com.salesforce.marketingcloud.b.a(i, 64)) {
                disableProximityMessaging();
                this.t = null;
                com.salesforce.marketingcloud.messages.proximity.a.a(this.d, this.g, this.m, com.salesforce.marketingcloud.b.c(i, 64));
            } else if (this.t == null && this.h.proximityEnabled()) {
                b(null, i);
            }
            if (com.salesforce.marketingcloud.b.a(i, 96)) {
                this.f.b((com.salesforce.marketingcloud.location.c) this);
                this.f.b((com.salesforce.marketingcloud.location.e) this);
                this.l.a(this);
                this.d.r().g();
                com.salesforce.marketingcloud.alarms.b bVar = this.e;
                a.EnumC0346a enumC0346a = a.EnumC0346a.d;
                bVar.e(enumC0346a);
                this.e.d(enumC0346a);
            } else {
                this.l.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
                this.f.a((com.salesforce.marketingcloud.location.c) this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final synchronized void disableGeofenceMessaging() {
        try {
            com.salesforce.marketingcloud.g.a(C, "Disabling geofence messaging", new Object[0]);
            if (isGeofenceMessagingEnabled()) {
                j jVar = this.d;
                if (jVar != null) {
                    jVar.f().edit().putBoolean(w, false).apply();
                }
                this.u = com.salesforce.marketingcloud.toggles.a.c;
                Bundle bundle = new Bundle();
                bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, false);
                com.salesforce.marketingcloud.behaviors.c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, bundle);
                com.salesforce.marketingcloud.messages.geofence.a aVar = this.s;
                if (aVar != null) {
                    aVar.b();
                }
            }
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final synchronized void disableProximityMessaging() {
        try {
            com.salesforce.marketingcloud.g.a(C, "Disabling proximity messaging", new Object[0]);
            if (isProximityMessagingEnabled()) {
                j jVar = this.d;
                if (jVar != null) {
                    jVar.f().edit().putBoolean(y, false).apply();
                }
                this.v = com.salesforce.marketingcloud.toggles.a.c;
                Bundle bundle = new Bundle();
                bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, false);
                com.salesforce.marketingcloud.behaviors.c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, bundle);
                com.salesforce.marketingcloud.messages.proximity.a aVar = this.t;
                if (aVar != null) {
                    aVar.b();
                }
            }
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    @SuppressLint
    public final synchronized boolean enableGeofenceMessaging() {
        return c(false);
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    @SuppressLint
    public final synchronized boolean enableProximityMessaging() {
        return d(false);
    }

    @Override // com.salesforce.marketingcloud.e
    public final synchronized void init(@NonNull InitializationStatus.a aVar, int i) {
        try {
            a(aVar, i);
            b(aVar, i);
            if (this.s != null || this.t != null) {
                this.l.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
                this.f.a((com.salesforce.marketingcloud.location.c) this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final boolean isGeofenceMessagingEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.d.o()), 32)) {
            return false;
        }
        if (this.u == null) {
            this.u = a(w, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.u;
        if (aVar != com.salesforce.marketingcloud.toggles.a.b) {
            return aVar == com.salesforce.marketingcloud.toggles.a.f17068a && this.h.geofencingEnabled();
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final boolean isProximityMessagingEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.d.o()), 64)) {
            return false;
        }
        if (this.v == null) {
            this.v = a(y, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.v;
        if (aVar != com.salesforce.marketingcloud.toggles.a.b) {
            return aVar == com.salesforce.marketingcloud.toggles.a.f17068a && this.h.proximityEnabled();
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    @RestrictTo
    public final void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        if (aVar == null) {
            return;
        }
        int i = g.b[aVar.ordinal()];
        if (i == 1) {
            h();
        } else if (i != 2) {
            if (i == 3) {
                h();
                return;
            }
            if (i != 4) {
                return;
            }
            i();
            j();
            if (isGeofenceMessagingEnabled() || isProximityMessagingEnabled()) {
                com.salesforce.marketingcloud.alarms.b bVar = this.e;
                a.EnumC0346a enumC0346a = a.EnumC0346a.d;
                bVar.d(enumC0346a);
                this.e.b(enumC0346a);
                return;
            }
            return;
        }
        g();
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void registerGeofenceMessageResponseListener(@NonNull RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener) {
        if (geofenceMessageResponseListener != null) {
            synchronized (this.n) {
                this.n.add(geofenceMessageResponseListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void registerProximityMessageResponseListener(@NonNull RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener) {
        if (proximityMessageResponseListener != null) {
            synchronized (this.o) {
                this.o.add(proximityMessageResponseListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void registerRegionTransitionEventListener(@NonNull RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        if (regionTransitionEventListener != null) {
            synchronized (this.p) {
                this.p.add(regionTransitionEventListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z2) {
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void unregisterGeofenceMessageResponseListener(@NonNull RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener) {
        synchronized (this.n) {
            this.n.remove(geofenceMessageResponseListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void unregisterProximityMessageResponseListener(@NonNull RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener) {
        synchronized (this.o) {
            this.o.remove(proximityMessageResponseListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void unregisterRegionTransitionEventListener(@NonNull RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        synchronized (this.p) {
            this.p.remove(regionTransitionEventListener);
        }
    }

    private void a() {
        if (isProximityMessagingEnabled() || isGeofenceMessagingEnabled()) {
            return;
        }
        this.e.d(a.EnumC0346a.d);
    }

    private void b() {
        disableProximityMessaging();
        disableGeofenceMessaging();
    }

    @SuppressLint
    private boolean c() {
        if (this.s == null && this.t == null) {
            return false;
        }
        if (this.q.compareAndSet(false, true)) {
            try {
                this.f.a((com.salesforce.marketingcloud.location.e) this);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(C, e2, "Unable to request location update", new Object[0]);
                b();
                return false;
            }
        }
        this.e.b(a.EnumC0346a.d);
        return true;
    }

    public boolean d() {
        j jVar;
        return (isProximityMessagingEnabled() || isGeofenceMessagingEnabled()) && (jVar = this.d) != null && jVar.f().getBoolean(x, false);
    }

    private com.salesforce.marketingcloud.toggles.a a(String str, com.salesforce.marketingcloud.toggles.a aVar) {
        return aVar == null ? this.d.f().getBoolean(str, false) ? com.salesforce.marketingcloud.toggles.a.b : com.salesforce.marketingcloud.toggles.a.c : aVar;
    }

    private void b(@Nullable InitializationStatus.a aVar, int i) {
        if (com.salesforce.marketingcloud.b.a(i, 64)) {
            return;
        }
        this.t = new com.salesforce.marketingcloud.messages.proximity.a(this.d, this.g, this.m, this.r, this);
        this.e.a(this, a.EnumC0346a.d);
        if (isProximityMessagingEnabled()) {
            if (!d(true)) {
                disableProximityMessaging();
            }
            if (aVar != null) {
                aVar.c(true ^ h.b(this.j));
            }
        }
    }

    @NonNull
    private static com.salesforce.marketingcloud.location.b c(Region region) {
        return new com.salesforce.marketingcloud.location.b(region.id(), region.radius() * B, region.center().latitude(), region.center().longitude(), 2);
    }

    private void d(Region region) {
        this.r.b().execute(new e("storing_fence", new Object[0], region));
    }

    private void a(@Nullable InitializationStatus.a aVar, int i) {
        if (com.salesforce.marketingcloud.b.a(i, 32)) {
            return;
        }
        this.s = new com.salesforce.marketingcloud.messages.geofence.a(this.d, this.f, this.m, this.r, this);
        this.e.a(this, a.EnumC0346a.d);
        if (isGeofenceMessagingEnabled()) {
            if (!c(true)) {
                disableGeofenceMessaging();
            }
            if (aVar != null) {
                aVar.c(true ^ h.b(this.j));
            }
        }
    }

    private void b(MessageResponse messageResponse) {
        if (messageResponse instanceof GeofenceMessageResponse) {
            synchronized (this.n) {
                if (!this.n.isEmpty()) {
                    for (RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener : this.n) {
                        if (geofenceMessageResponseListener != null) {
                            try {
                                geofenceMessageResponseListener.onGeofenceMessageResponse((GeofenceMessageResponse) messageResponse);
                            } catch (Exception e2) {
                                com.salesforce.marketingcloud.g.b(C, e2, "%s threw an exception while processing the geofence response", geofenceMessageResponseListener.getClass().getName());
                            }
                        }
                    }
                }
            }
            return;
        }
        if (messageResponse instanceof ProximityMessageResponse) {
            synchronized (this.o) {
                if (!this.o.isEmpty()) {
                    for (RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener : this.o) {
                        if (proximityMessageResponseListener != null) {
                            try {
                                proximityMessageResponseListener.onProximityMessageResponse((ProximityMessageResponse) messageResponse);
                            } catch (Exception e3) {
                                com.salesforce.marketingcloud.g.b(C, e3, "%s threw an exception while processing the proximity response", proximityMessageResponseListener.getClass().getName());
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(int i, Region region) {
        synchronized (this.p) {
            if (!this.p.isEmpty()) {
                for (RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener : this.p) {
                    if (regionTransitionEventListener != null) {
                        try {
                            regionTransitionEventListener.onTransitionEvent(i, region);
                        } catch (Exception e2) {
                            com.salesforce.marketingcloud.g.b(C, e2, "%s threw an exception while processing the region (%s) transition (%d)", regionTransitionEventListener.getClass().getName(), region.id(), Integer.valueOf(i));
                        }
                    }
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c.a
    @RestrictTo
    public void b(Region region) {
        a(1, region);
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    @RestrictTo
    public final void a(@NonNull a.EnumC0346a enumC0346a) {
        if (g.f16988a[enumC0346a.ordinal()] != 1) {
            return;
        }
        i();
        j();
        if (isGeofenceMessagingEnabled() || isProximityMessagingEnabled()) {
            this.e.b(a.EnumC0346a.d);
        }
    }

    public void b(LatLon latLon) {
        com.salesforce.marketingcloud.messages.proximity.a aVar;
        if (!isProximityMessagingEnabled() || (aVar = this.t) == null || latLon == null) {
            com.salesforce.marketingcloud.g.a(C, "Tried to update proximity messages, but was not enabled.", new Object[0]);
        } else {
            aVar.a(latLon, this.i, this.h, this);
        }
    }

    @Override // com.salesforce.marketingcloud.location.e
    @RestrictTo
    public void a(Location location) {
        this.q.set(false);
        if (location == null) {
            return;
        }
        try {
            this.r.b().execute(new C0368d("store_latlon", new Object[0], new LatLon(location.getLatitude(), location.getLongitude())));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(C, e2, "Unable to make geofence message request after location update", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c.b
    @RestrictTo
    public final void a(MessageResponse messageResponse) {
        if (messageResponse == null) {
            return;
        }
        b(messageResponse);
        try {
            Region regionA = com.salesforce.marketingcloud.internal.j.a(messageResponse.getRefreshCenter(), messageResponse.getRefreshRadius());
            d(regionA);
            this.f.a(c(regionA));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(C, e2, "Failed to updated radius for magic region.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.location.c
    @RestrictTo
    public final void a(int i, @Nullable String str) {
        com.salesforce.marketingcloud.g.a(C, "Region error %d - %s", Integer.valueOf(i), str);
    }

    @Override // com.salesforce.marketingcloud.location.c
    @SuppressLint
    @RestrictTo
    public final void a(@NonNull String str, int i, @Nullable Location location) {
        if (i == 2 && Region.MAGIC_REGION_ID.equals(str)) {
            String str2 = C;
            com.salesforce.marketingcloud.g.d(str2, "MagicRegion exited", new Object[0]);
            if (!h.b(this.j)) {
                com.salesforce.marketingcloud.g.a(str2, "MagicRegion exited, but was missing location permission.", new Object[0]);
                b();
            } else if (location != null) {
                a(location);
            } else {
                this.f.a((com.salesforce.marketingcloud.location.e) this);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c.a
    @RestrictTo
    public void a(Region region) {
        a(2, region);
    }

    public void a(LatLon latLon, int i) {
        if (h.b(this.j)) {
            Region regionA = com.salesforce.marketingcloud.internal.j.a(latLon, i);
            d(regionA);
            this.f.a(c(regionA));
        }
    }

    public boolean a(@NonNull LatLon latLon, @Nullable Region region) {
        boolean z2 = true;
        if (region != null) {
            try {
                float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
                Location.distanceBetween(latLon.latitude(), latLon.longitude(), region.center().latitude(), region.center().longitude(), fArr);
                if (!d()) {
                    if (fArr[0] <= region.radius() * B) {
                        z2 = false;
                    }
                }
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.b(C, "An error occurred while calculating distance between last known location and the current location.", new Object[0]);
            }
        }
        j jVar = this.d;
        if (jVar != null) {
            jVar.f().edit().remove(x).apply();
        }
        return z2;
    }

    @Override // com.salesforce.marketingcloud.messages.c.a
    @RestrictTo
    public final void a(Region region, Message message) {
        if (region == null || message == null) {
            return;
        }
        com.salesforce.marketingcloud.g.d(C, "showMessage(%s, %s)", region.id(), message.id());
        NotificationMessage notificationMessageA = com.salesforce.marketingcloud.internal.h.a(message, region);
        if (notificationMessageA == null || !com.salesforce.marketingcloud.messages.b.c(message)) {
            return;
        }
        try {
            com.salesforce.marketingcloud.messages.b.a(message, this.d);
            this.k.a(notificationMessageA, new f(message));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(C, e2, "Failed to show message", new Object[0]);
        }
    }

    public void a(LatLon latLon) {
        com.salesforce.marketingcloud.messages.geofence.a aVar;
        if (!isGeofenceMessagingEnabled() || (aVar = this.s) == null || latLon == null) {
            com.salesforce.marketingcloud.g.a(C, "Tried to update geofence messages, but was not enabled.", new Object[0]);
        } else {
            aVar.a(latLon, this.i, this.h, this);
        }
    }
}
