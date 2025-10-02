package com.salesforce.marketingcloud.proximity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.proximity.e;
import com.salesforce.marketingcloud.util.h;
import com.salesforce.marketingcloud.util.j;
import java.util.List;
import java.util.Set;
import org.altbeacon.beacon.service.BeaconService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class b extends e {
    private final Context i;
    private final Set<e.a> j;
    private final com.salesforce.marketingcloud.proximity.a k;
    private BroadcastReceiver l;
    private int m;
    private int n;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(e.h, "Received null intent.", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(e.h, "Received null action", new Object[0]);
                return;
            }
            if (action.equals(e.d)) {
                b.this.a((c) intent.getParcelableExtra(e.f));
            } else if (action.equals(e.e)) {
                b.this.b((c) intent.getParcelableExtra(e.f));
            } else {
                g.a(e.h, "Received unknown action: ", action);
            }
        }
    }

    public b(@NonNull Context context) {
        this(context, null);
    }

    @VisibleForTesting
    public void a(c cVar) {
        synchronized (this.j) {
            try {
                this.m++;
                if (cVar != null && !this.j.isEmpty()) {
                    g.c(e.h, "Entered %s", cVar);
                    for (e.a aVar : this.j) {
                        if (aVar != null) {
                            aVar.b(cVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public boolean b() {
        return true;
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void c() {
        com.salesforce.marketingcloud.proximity.a aVar = this.k;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() throws JSONException {
        JSONObject jSONObjectA;
        try {
            jSONObjectA = e.a();
        } catch (JSONException e) {
            e = e;
            jSONObjectA = null;
        }
        try {
            jSONObjectA.put("enteredEvents", this.m);
            jSONObjectA.put("exitedEvents", this.n);
            return jSONObjectA;
        } catch (JSONException e2) {
            e = e2;
            g.b(e.h, e, "Failed to create component state.", new Object[0]);
            return jSONObjectA;
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        c();
        Context context = this.i;
        if (context == null || this.l == null) {
            return;
        }
        LocalBroadcastManager.a(context).d(this.l);
    }

    public b(@NonNull Context context, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions) throws IllegalStateException {
        this.j = new ArraySet(0);
        j.a(context, "Context is null");
        this.i = context;
        if (!h.b(context.getPackageManager(), new Intent(context, (Class<?>) BeaconService.class))) {
            throw new IllegalStateException("AltBeacon service not found");
        }
        this.k = new com.salesforce.marketingcloud.proximity.a(context, proximityNotificationCustomizationOptions);
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        aVar.d(false);
        this.l = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(e.d);
        intentFilter.addAction(e.e);
        LocalBroadcastManager.a(this.i).b(this.l, intentFilter);
    }

    @VisibleForTesting
    public void b(c cVar) {
        synchronized (this.j) {
            try {
                this.n++;
                if (cVar != null && !this.j.isEmpty()) {
                    g.c(e.h, "Exited %s", cVar);
                    for (e.a aVar : this.j) {
                        if (aVar != null) {
                            aVar.a(cVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void a(List<c> list) {
        if (list != null) {
            g.c(e.h, "monitorBeaconRegions(%d region)", Integer.valueOf(list.size()));
            this.k.a(list);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void b(List<c> list) {
        if (list != null) {
            g.c(e.h, "unmonitorBeaconRegions(%d region)", Integer.valueOf(list.size()));
            this.k.b(list);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void a(@NonNull e.a aVar) {
        synchronized (this.j) {
            if (aVar != null) {
                try {
                    this.j.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void b(@NonNull e.a aVar) {
        synchronized (this.j) {
            this.j.remove(aVar);
        }
    }
}
