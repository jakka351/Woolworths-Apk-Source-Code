package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class h extends f {
    final d q;
    final Set<e> r = new ArraySet(0);
    private final Set<c> s = new ArraySet(0);
    private MarketingCloudConfig t;
    private int u;
    private int v;
    private String w;
    private int x;
    private Context y;
    private BroadcastReceiver z;

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                r5 = 0
                if (r6 != 0) goto Ld
                java.lang.String r6 = com.salesforce.marketingcloud.location.f.h
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r0 = "Received null intent"
                com.salesforce.marketingcloud.g.d(r6, r0, r5)
                return
            Ld:
                java.lang.String r0 = r6.getAction()
                if (r0 != 0) goto L1d
                java.lang.String r6 = com.salesforce.marketingcloud.location.f.h
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r0 = "Received null action"
                com.salesforce.marketingcloud.g.d(r6, r0, r5)
                return
            L1d:
                int r1 = r0.hashCode()
                r2 = -1
                switch(r1) {
                    case -284548713: goto L3d;
                    case 557677285: goto L32;
                    case 557783927: goto L27;
                    default: goto L25;
                }
            L25:
                r1 = r2
                goto L47
            L27:
                java.lang.String r1 = "com.salesforce.marketingcloud.location.GEOFENCE_EVENT"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L30
                goto L25
            L30:
                r1 = 2
                goto L47
            L32:
                java.lang.String r1 = "com.salesforce.marketingcloud.location.GEOFENCE_ERROR"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L3b
                goto L25
            L3b:
                r1 = 1
                goto L47
            L3d:
                java.lang.String r1 = "com.salesforce.marketingcloud.location.LOCATION_UPDATE"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L46
                goto L25
            L46:
                r1 = r5
            L47:
                java.lang.String r3 = "extra_location"
                switch(r1) {
                    case 0: goto L98;
                    case 1: goto L82;
                    case 2: goto L58;
                    default: goto L4c;
                }
            L4c:
                java.lang.String r5 = com.salesforce.marketingcloud.location.f.h
                java.lang.Object[] r6 = new java.lang.Object[]{r0}
                java.lang.String r0 = "Received unknown action: %s"
                com.salesforce.marketingcloud.g.a(r5, r0, r6)
                return
            L58:
                java.lang.String r5 = "extra_transition"
                int r5 = r6.getIntExtra(r5, r2)
                if (r5 != r2) goto L61
                goto L97
            L61:
                java.lang.String r0 = com.salesforce.marketingcloud.location.f.h
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Received geofence transition %d"
                com.salesforce.marketingcloud.g.a(r0, r2, r1)
                com.salesforce.marketingcloud.location.h r0 = com.salesforce.marketingcloud.location.h.this
                java.lang.String r1 = "extra_fence_ids"
                java.util.ArrayList r1 = r6.getStringArrayListExtra(r1)
                android.os.Parcelable r6 = r6.getParcelableExtra(r3)
                android.location.Location r6 = (android.location.Location) r6
                r0.b(r5, r1, r6)
                return
            L82:
                java.lang.String r5 = "extra_error_code"
                int r5 = r6.getIntExtra(r5, r2)
                java.lang.String r0 = "extra_error_message"
                java.lang.String r6 = r6.getStringExtra(r0)
                if (r5 == r2) goto L97
                if (r6 == 0) goto L97
                com.salesforce.marketingcloud.location.h r0 = com.salesforce.marketingcloud.location.h.this
                r0.b(r5, r6)
            L97:
                return
            L98:
                java.lang.String r0 = com.salesforce.marketingcloud.location.f.h
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r1 = "Received location update."
                com.salesforce.marketingcloud.g.a(r0, r1, r5)
                com.salesforce.marketingcloud.location.h r5 = com.salesforce.marketingcloud.location.h.this
                android.os.Parcelable r6 = r6.getParcelableExtra(r3)
                android.location.Location r6 = (android.location.Location) r6
                r5.b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.location.h.a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public h(@NonNull Context context, MarketingCloudConfig marketingCloudConfig) throws IllegalStateException {
        this.y = context;
        this.q = new d(context);
        this.t = marketingCloudConfig;
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        this.z = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.salesforce.marketingcloud.location.LOCATION_UPDATE");
        intentFilter.addAction("com.salesforce.marketingcloud.location.GEOFENCE_EVENT");
        intentFilter.addAction("com.salesforce.marketingcloud.location.GEOFENCE_ERROR");
        LocalBroadcastManager.a(this.y).b(this.z, intentFilter);
        aVar.a(this.q.c());
        aVar.a(this.q.b());
        aVar.b(!this.q.d());
    }

    @VisibleForTesting
    public void b(int i, String str) {
        synchronized (this.s) {
            try {
                if (!this.s.isEmpty()) {
                    for (c cVar : this.s) {
                        if (cVar != null) {
                            cVar.a(i, str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() throws JSONException {
        JSONObject jSONObjectA = f.a(this.t, this.q.c(), this.q.b());
        try {
            jSONObjectA.put("locationRequests", this.u);
            jSONObjectA.put("locationsReceived", this.v);
            jSONObjectA.put("lastLocationRequester", this.w);
            jSONObjectA.put("geofenceEvents", this.x);
            return jSONObjectA;
        } catch (JSONException e) {
            com.salesforce.marketingcloud.g.b(f.h, e, "Error creating state for RealLocationManager.", new Object[0]);
            return jSONObjectA;
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        d dVar = this.q;
        if (dVar != null && z) {
            dVar.a();
        }
        Context context = this.y;
        if (context == null || this.z == null) {
            return;
        }
        LocalBroadcastManager.a(context).d(this.z);
    }

    @Override // com.salesforce.marketingcloud.location.f
    public boolean a() {
        return this.q.d();
    }

    @VisibleForTesting
    public void b(int i, @NonNull List<String> list, @Nullable Location location) {
        String str = f.h;
        com.salesforce.marketingcloud.g.d(str, "onGeofenceRegionEvent", new Object[0]);
        if (list == null || list.isEmpty()) {
            com.salesforce.marketingcloud.g.c(str, "No fenceIds were provided.", new Object[0]);
            return;
        }
        this.x++;
        synchronized (this.s) {
            try {
                if (this.s.isEmpty()) {
                    com.salesforce.marketingcloud.g.c(str, "Geofence region event occured with no one listening.", new Object[0]);
                } else {
                    for (c cVar : this.s) {
                        if (cVar != null) {
                            for (String str2 : list) {
                                com.salesforce.marketingcloud.g.a(f.h, "Notifiying %s of geofence [%s] region event [d]", cVar.getClass().getName(), str2, Integer.valueOf(i));
                                cVar.a(str2, i, location);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    @RequiresPermission
    public void a(b... bVarArr) throws SecurityException {
        if (bVarArr == null || bVarArr.length == 0) {
            com.salesforce.marketingcloud.g.a(f.h, "monitorGeofences - No geofenceRegions provided.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.g.d(f.h, "Monitoring %s fence(s).", Integer.valueOf(bVarArr.length));
            this.q.a(bVarArr);
        }
    }

    @VisibleForTesting
    public void b(Location location) {
        if (location == null) {
            return;
        }
        this.v++;
        synchronized (this.r) {
            try {
                if (!this.r.isEmpty()) {
                    for (e eVar : this.r) {
                        if (eVar != null) {
                            eVar.a(location);
                        }
                    }
                    this.r.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(@NonNull c cVar) {
        com.salesforce.marketingcloud.g.d(f.h, "registerForGeofenceRegionEvents(%s)", cVar.getClass().getName());
        synchronized (this.s) {
            this.s.add(cVar);
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b() {
        this.q.a();
    }

    @Override // com.salesforce.marketingcloud.location.f
    @SuppressLint
    public void a(@NonNull e eVar) throws SecurityException {
        boolean z;
        if (eVar == null) {
            return;
        }
        synchronized (this.r) {
            try {
                z = this.r.add(eVar) && this.r.size() == 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.u++;
            this.w = eVar.getClass().getName();
            this.q.e();
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b(@NonNull c cVar) {
        if (cVar != null) {
            synchronized (this.s) {
                this.s.remove(cVar);
            }
        }
    }

    @RestrictTo
    public h(Context context, d dVar) {
        this.y = context;
        this.q = dVar;
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(List<String> list) {
        if (list == null || list.size() == 0) {
            com.salesforce.marketingcloud.g.c(f.h, "unmonitorGeofences - No geofenceRegionIds provided.", new Object[0]);
        } else {
            this.q.a(list);
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b(@NonNull e eVar) {
        synchronized (this.r) {
            this.r.remove(eVar);
        }
    }
}
