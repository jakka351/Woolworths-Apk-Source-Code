package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.j;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public class c extends f {
    public static final String i = "timestamp";
    static final int j = 1;
    static final String k = g.a("BehaviorManager");
    private final ExecutorService d;
    private final ArrayMap<com.salesforce.marketingcloud.behaviors.a, Set<com.salesforce.marketingcloud.behaviors.b>> e = new ArrayMap<>(0);
    private final Map<com.salesforce.marketingcloud.behaviors.a, Bundle> f = new ArrayMap(1);
    private final Context g;
    private BroadcastReceiver h;

    /* loaded from: classes6.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(c.k, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(c.k, "Received null action", new Object[0]);
                return;
            }
            com.salesforce.marketingcloud.behaviors.a aVarA = com.salesforce.marketingcloud.behaviors.a.a(action);
            if (aVarA != null) {
                c.this.onBehavior(aVarA, intent.getExtras());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Set<com.salesforce.marketingcloud.behaviors.b> f16857a;
        final com.salesforce.marketingcloud.behaviors.a b;
        final Bundle c;

        public b(Set<com.salesforce.marketingcloud.behaviors.b> set, com.salesforce.marketingcloud.behaviors.a aVar, Bundle bundle) {
            this.f16857a = set;
            this.b = aVar;
            this.c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (com.salesforce.marketingcloud.behaviors.b bVar : this.f16857a) {
                if (bVar != null) {
                    try {
                        bVar.onBehavior(this.b, this.c);
                    } catch (Exception e) {
                        g.b(c.k, e, "Failure delivering behavior %s to %s", this.b.f16855a, bVar.getClass().getName());
                    }
                }
            }
        }
    }

    public c(@NonNull Context context, @NonNull ExecutorService executorService) {
        this.g = context;
        this.d = executorService;
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        this.h = new a();
        IntentFilter intentFilter = new IntentFilter();
        for (com.salesforce.marketingcloud.behaviors.a aVar2 : com.salesforce.marketingcloud.behaviors.a.values()) {
            intentFilter.addAction(aVar2.f16855a);
        }
        LocalBroadcastManager.a(this.g).b(this.h, intentFilter);
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "BehaviorManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        return null;
    }

    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("timestamp", System.currentTimeMillis());
        g.a(k, "Behavior found: %s", aVar.name());
        synchronized (this.e) {
            Set<com.salesforce.marketingcloud.behaviors.b> set = this.e.get(aVar);
            if (set != null && !set.isEmpty()) {
                try {
                    this.d.submit(new b(Collections.unmodifiableSet(set), aVar, bundle));
                } catch (RejectedExecutionException e) {
                    g.b(k, e, "Unable to deliver behavior %s.", aVar.f16855a);
                }
            }
        }
        synchronized (this.f) {
            try {
                if (aVar.b) {
                    this.f.put(aVar, bundle);
                }
                com.salesforce.marketingcloud.behaviors.a aVar2 = aVar.c;
                if (aVar2 != null) {
                    this.f.put(aVar2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public final void tearDown(boolean z) {
        Context context = this.g;
        if (context != null) {
            LocalBroadcastManager.a(context).d(this.h);
        }
    }

    public static void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.behaviors.a aVar, @Nullable Bundle bundle) {
        j.a(context, "Context is null");
        j.a(aVar, "Behavior is null");
        Intent intent = new Intent(aVar.f16855a);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        LocalBroadcastManager.a(context).c(intent);
    }

    @SuppressLint
    public void a(@NonNull com.salesforce.marketingcloud.behaviors.b bVar, @NonNull EnumSet<com.salesforce.marketingcloud.behaviors.a> enumSet) {
        j.a(bVar, "BehaviorListener is null");
        j.a(enumSet, "Behavior set is null");
        synchronized (this.e) {
            try {
                g.a(k, "Registering %s for behaviors: %s", bVar.getClass().getName(), enumSet.toString());
                Iterator<com.salesforce.marketingcloud.behaviors.a> it = enumSet.iterator();
                while (it.hasNext()) {
                    com.salesforce.marketingcloud.behaviors.a next = it.next();
                    Set<com.salesforce.marketingcloud.behaviors.b> hashSet = this.e.get(next);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        this.e.put(next, hashSet);
                    }
                    hashSet.add(bVar);
                }
            } finally {
            }
        }
        synchronized (this.f) {
            try {
                Iterator<com.salesforce.marketingcloud.behaviors.a> it2 = enumSet.iterator();
                while (it2.hasNext()) {
                    com.salesforce.marketingcloud.behaviors.a next2 = it2.next();
                    if (next2.b && this.f.containsKey(next2)) {
                        this.d.submit(new b(Collections.singleton(bVar), next2, this.f.get(next2)));
                    }
                }
            } finally {
            }
        }
    }

    public void a(@NonNull com.salesforce.marketingcloud.behaviors.b bVar) {
        synchronized (this.e) {
            try {
                Iterator<Map.Entry<com.salesforce.marketingcloud.behaviors.a, Set<com.salesforce.marketingcloud.behaviors.b>>> it = this.e.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().remove(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
