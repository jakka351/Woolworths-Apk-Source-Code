package com.salesforce.marketingcloud.http;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.security.ProviderInstaller;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.util.j;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class c extends f {
    public static final String j = "com.salesforce.marketingcloud.http.RESPONSE";
    public static final String k = "http_response";
    public static final String l = "http_request";
    private static final int m = 10;
    static final String n = g.a("RequestManager");
    private final Context f;
    private final SharedPreferences g;
    private l h;
    private BroadcastReceiver i;
    private final Map<String, String> e = new a();

    @VisibleForTesting
    final Map<com.salesforce.marketingcloud.http.a, InterfaceC0362c> d = new ArrayMap(0);

    public class a extends LinkedHashMap<String, String> {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 10;
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ InterfaceC0362c b;
        final /* synthetic */ com.salesforce.marketingcloud.http.b c;
        final /* synthetic */ com.salesforce.marketingcloud.http.d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, InterfaceC0362c interfaceC0362c, com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
            super(str, objArr);
            this.b = interfaceC0362c;
            this.c = bVar;
            this.d = dVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.b.a(this.c, this.d);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.http.c$c, reason: collision with other inner class name */
    public interface InterfaceC0362c {
        @WorkerThread
        void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar);
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(c.n, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(c.n, "Received null action", new Object[0]);
                return;
            }
            if (!action.equals(c.j)) {
                g.a(c.n, "Received unknown action: %s", action);
                return;
            }
            com.salesforce.marketingcloud.http.b bVarA = com.salesforce.marketingcloud.http.b.a(intent.getBundleExtra(c.l));
            com.salesforce.marketingcloud.http.d dVar = (com.salesforce.marketingcloud.http.d) intent.getParcelableExtra(c.k);
            if (bVarA == null || dVar == null) {
                g.d(c.n, "Received null request/response", new Object[0]);
            } else {
                c.this.a(bVarA, dVar);
            }
        }
    }

    public c(Context context, SharedPreferences sharedPreferences, l lVar) {
        this.f = (Context) j.a(context, "Context is null");
        this.g = (SharedPreferences) j.a(sharedPreferences, "SharedPreferences is null");
        this.h = lVar;
    }

    public void a(@NonNull com.salesforce.marketingcloud.http.a aVar) {
        synchronized (this.d) {
            this.d.remove(aVar);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "RequestManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        return new JSONObject(this.e);
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public final void tearDown(boolean z) {
        synchronized (this.d) {
            this.d.clear();
        }
        Context context = this.f;
        if (context == null || this.i == null) {
            return;
        }
        LocalBroadcastManager.a(context).d(this.i);
    }

    @Override // com.salesforce.marketingcloud.f
    public final void a(@NonNull InitializationStatus.a aVar) {
        try {
            a();
        } catch (Exception e) {
            aVar.e(true);
            aVar.a("Failed to install providers: " + e.getMessage());
        }
        this.i = new d();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(j);
        LocalBroadcastManager.a(this.f).b(this.i, intentFilter);
    }

    private void a() throws Exception {
        ProviderInstaller.installIfNeeded(this.f);
    }

    public void a(@NonNull com.salesforce.marketingcloud.http.b bVar, @NonNull com.salesforce.marketingcloud.http.d dVar) {
        com.salesforce.marketingcloud.http.a aVarP = bVar.p();
        g.d(n, "%s request took %dms with code: %d", aVarP.name(), Long.valueOf(dVar.h()), Integer.valueOf(dVar.b()));
        aVarP.a(this.g, dVar);
        try {
            Map<String, String> map = this.e;
            String strR = bVar.r();
            Locale locale = Locale.ENGLISH;
            map.put(strR, dVar.e() + " - " + dVar.b());
        } catch (Exception e) {
            g.b(n, e, "Failed to record response.", new Object[0]);
        }
        synchronized (this.d) {
            InterfaceC0362c interfaceC0362c = this.d.get(aVarP);
            if (interfaceC0362c != null) {
                try {
                    this.h.a().execute(new b("onResponse", new Object[0], interfaceC0362c, bVar, dVar));
                } catch (Exception e2) {
                    g.b(n, e2, "Failed to deliver response.", new Object[0]);
                }
            } else {
                g.e(n, "Request %s complete, but no listener was present to handle response %d.", bVar.r(), Integer.valueOf(dVar.b()));
            }
        }
    }

    public void a(@NonNull com.salesforce.marketingcloud.http.a aVar, @NonNull InterfaceC0362c interfaceC0362c) {
        synchronized (this.d) {
            try {
                if (this.d.put(aVar, interfaceC0362c) != null) {
                    g.a(n, "%s replaces previous listener for $s requests", interfaceC0362c.getClass().getName(), aVar.name());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void a(@NonNull com.salesforce.marketingcloud.http.b bVar) {
        j.a(bVar, "request is null");
        try {
            a();
        } catch (Exception unused) {
            g.e(n, "Failed to verify SSL providers via Google Play Services.", new Object[0]);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = bVar.p().c(this.g);
        long jA = bVar.p().a(this.g);
        if (jCurrentTimeMillis <= jC || jCurrentTimeMillis <= jA) {
            a(bVar, com.salesforce.marketingcloud.http.d.a("Too Many Requests", 429));
        } else {
            bVar.p().b(this.g);
            MCService.a(this.f, bVar);
        }
    }
}
