package com.salesforce.marketingcloud.events;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.analytics.l;
import com.salesforce.marketingcloud.analytics.m;
import com.salesforce.marketingcloud.analytics.n;
import com.salesforce.marketingcloud.events.g;
import com.salesforce.marketingcloud.k;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.storage.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class c extends EventManager implements com.salesforce.marketingcloud.e, k.e, com.salesforce.marketingcloud.behaviors.b, EventSubscriber {

    @RestrictTo
    public static final String r = "event_gate_time_mills";

    @RestrictTo
    public static final String s = "event_max_display_in_session";

    @RestrictTo
    public static final String t = "event_min_time_sec_in_session";
    private static final String v = "$opencount";
    private static final int w = 1;
    protected final m d;

    @Nullable
    final SFMCSdkComponents e;
    final j f;
    private final k g;
    private final com.salesforce.marketingcloud.behaviors.c h;
    private final com.salesforce.marketingcloud.events.f i;
    private final l j;
    private final n k;
    private final com.salesforce.marketingcloud.internal.l l;
    private final Context n;
    protected com.salesforce.marketingcloud.config.a p;
    private com.salesforce.marketingcloud.registration.f q;
    static final String u = com.salesforce.marketingcloud.g.a("EventManager");
    private static final EnumSet<k.d> x = EnumSet.of(k.d.triggers);
    private final AtomicBoolean m = new AtomicBoolean(false);
    protected CountDownLatch o = new CountDownLatch(1);

    public class a extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ Event[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, Event... eventArr) {
            super(str, objArr);
            this.b = eventArr;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            int i = c.this.f.f().getInt(c.r, 0);
            if (i > 0) {
                try {
                    if (!c.this.o.await(i, TimeUnit.MILLISECONDS)) {
                        com.salesforce.marketingcloud.g.e(c.u, "Track await time of %s milliseconds exceeded!", Integer.valueOf(i));
                        c.this.o.countDown();
                        if (c.this.p.h()) {
                            c.this.d.b(new JSONObject().put(com.salesforce.marketingcloud.config.a.f, i));
                        }
                    }
                } catch (InterruptedException e) {
                    com.salesforce.marketingcloud.g.b(c.u, e, "Encountered exception while awaiting at track.", new Object[0]);
                } catch (JSONException e2) {
                    com.salesforce.marketingcloud.g.b(c.u, e2, "Failed to log analytics for onSyncGateTimedOut", new Object[0]);
                }
            }
            Event[] eventArr = this.b;
            ArrayList arrayList = null;
            if (eventArr != null && eventArr.length > 0) {
                for (Event event : eventArr) {
                    if (event != null) {
                        com.salesforce.marketingcloud.g.a(c.u, "(%s) event logged with attributes %s", event.name(), event.attributes());
                        c cVar = c.this;
                        List<com.salesforce.marketingcloud.events.e> listA = cVar.a(event, cVar.a(event));
                        if (listA != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addAll(listA);
                        }
                    }
                }
            }
            if (arrayList != null) {
                c.this.a(arrayList);
            }
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ Event[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, Event... eventArr) {
            super(str, objArr);
            this.b = eventArr;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            Event[] eventArr = this.b;
            if (eventArr == null || eventArr.length <= 0) {
                return;
            }
            c cVar = c.this;
            SFMCSdkComponents sFMCSdkComponents = cVar.e;
            if (sFMCSdkComponents != null) {
                sFMCSdkComponents.getEventManager().track(com.salesforce.marketingcloud.events.d.b(this.b, EnumSet.of(Event.Producer.PUSH)));
            } else {
                cVar.a(eventArr);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.events.c$c, reason: collision with other inner class name */
    public class C0357c extends ArrayList<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f16878a;

        public C0357c(h hVar) {
            this.f16878a = hVar;
            add(Integer.valueOf(c.this.f.v().b(hVar)));
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {
        public d(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f.v().k();
            c.this.a(new com.salesforce.marketingcloud.events.a());
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        public e(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.g.c(c.u, "Purged %d outdated debug/telemetry events.", Integer.valueOf(c.this.f.n().a()));
        }
    }

    public class f extends com.salesforce.marketingcloud.internal.g {
        public f(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.g.c(c.u, "Purged %d outdated analytic events.", Integer.valueOf(c.this.f.m().a()));
        }
    }

    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16879a;

        static {
            int[] iArr = new int[g.b.values().length];
            f16879a = iArr;
            try {
                iArr[g.b.f16888a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16879a[g.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16879a[g.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16879a[g.b.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(Context context, com.salesforce.marketingcloud.registration.f fVar, j jVar, k kVar, com.salesforce.marketingcloud.behaviors.c cVar, com.salesforce.marketingcloud.analytics.h hVar, com.salesforce.marketingcloud.internal.l lVar, @Nullable SFMCSdkComponents sFMCSdkComponents, com.salesforce.marketingcloud.config.a aVar, com.salesforce.marketingcloud.events.f fVar2) {
        this.n = context;
        this.q = fVar;
        this.f = jVar;
        this.g = kVar;
        this.h = cVar;
        this.d = hVar;
        this.k = hVar;
        this.i = fVar2;
        this.l = lVar;
        this.e = sFMCSdkComponents;
        this.j = hVar;
        this.p = aVar;
    }

    @NonNull
    private com.salesforce.marketingcloud.events.predicates.f a(h hVar, Event event, @Nullable List<com.salesforce.marketingcloud.events.g> list) {
        ArrayList arrayList;
        if (list == null || list.size() == 0) {
            return com.salesforce.marketingcloud.events.predicates.f.b;
        }
        Map<String, List<Object>> mapA = com.salesforce.marketingcloud.events.d.a(event);
        Map<String, List<Object>> mapA2 = a(hVar);
        mapA2.putAll(mapA);
        String strG = hVar.g();
        if (strG != null) {
            HashMap map = new HashMap(list.size());
            for (com.salesforce.marketingcloud.events.g gVar : list) {
                map.put(Integer.valueOf(gVar.f()), gVar);
            }
            arrayList = new ArrayList(map.size());
            for (String str : strG.split(strG.contains("||") ? "\\|\\|" : "&&")) {
                arrayList.add(a(mapA2, (com.salesforce.marketingcloud.events.g) map.get(Integer.valueOf(Integer.parseInt(str)))));
            }
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            Iterator<com.salesforce.marketingcloud.events.g> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(mapA2, it.next()));
            }
            arrayList = arrayList2;
        }
        return (strG == null || !strG.contains("||")) ? new com.salesforce.marketingcloud.events.predicates.a((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0])) : new com.salesforce.marketingcloud.events.predicates.e((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0]));
    }

    private void b() {
        SFMCSdkComponents sFMCSdkComponents = this.e;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().unsubscribe(this);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "Event";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.salesforce.marketingcloud.storage.db.m.g, this.f.v().m());
            return jSONObject;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(u, e2, "Unable to compile componentState for EventComponent", new Object[0]);
            return jSONObject;
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i) {
        if (!com.salesforce.marketingcloud.b.a(i, 4096)) {
            this.g.a(x, this);
            this.h.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
            a();
            this.m.set(false);
            return;
        }
        this.m.set(true);
        this.g.a(x, (k.e) null);
        this.h.a(this);
        if (com.salesforce.marketingcloud.b.c(i, 4096)) {
            this.f.v().b(Collections.EMPTY_LIST);
        }
        b();
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i) {
        if (!com.salesforce.marketingcloud.b.b(i, 4096)) {
            b();
            this.m.set(true);
        } else {
            this.g.a(x, this);
            this.h.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        if (this.m.get() || aVar != com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED) {
            return;
        }
        if (this.o.getCount() <= 0) {
            this.o = new CountDownLatch(1);
        }
        try {
            this.l.b().execute(new d("app_foreground_trigger", new Object[0]));
            this.l.b().execute(new e("dev_stats_db_cleanup", new Object[0]));
            this.l.b().execute(new f("analytic_item_db_cleanup", new Object[0]));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(u, e2, "An error occurred while triggering app foreground", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber
    @WorkerThread
    public void onEventPublished(@NonNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event... eventArr) {
        try {
            SFMCSdkComponents sFMCSdkComponents = this.e;
            PushMessageManager pushMessageManager = null;
            Identity identity = sFMCSdkComponents != null ? sFMCSdkComponents.getIdentity() : null;
            try {
                MarketingCloudSdk marketingCloudSdk = MarketingCloudSdk.getInstance();
                if (marketingCloudSdk != null) {
                    pushMessageManager = marketingCloudSdk.getPushMessageManager();
                }
            } catch (Exception unused) {
            }
            a(com.salesforce.marketingcloud.events.d.a((Object[]) eventArr));
            this.k.a(new com.salesforce.marketingcloud.analytics.e(this.q, pushMessageManager, com.salesforce.marketingcloud.util.h.b(this.n), identity), eventArr);
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(u, e2, "Could not process events from onEventPublished()", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NonNull k.d dVar, @NonNull JSONObject jSONObject) throws JSONException {
        if (this.m.get() || !x.contains(dVar)) {
            return;
        }
        if (jSONObject.optInt("version") != 1) {
            com.salesforce.marketingcloud.g.b(u, "Unable to handle sync payload due to version mismatch", new Object[0]);
        } else if (dVar == k.d.triggers) {
            a(jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        this.g.a(x, (k.e) null);
        this.h.a(this);
        b();
    }

    @Override // com.salesforce.marketingcloud.events.EventManager
    public void track(Event... eventArr) {
        if (this.m.get()) {
            return;
        }
        try {
            this.l.b().execute(new b("trigger_event", new Object[0], eventArr));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(u, e2, "An error occurred while triggering track event", new Object[0]);
        }
    }

    @VisibleForTesting
    public c(Context context, com.salesforce.marketingcloud.registration.f fVar, j jVar, k kVar, com.salesforce.marketingcloud.behaviors.c cVar, m mVar, n nVar, com.salesforce.marketingcloud.internal.l lVar, @Nullable SFMCSdkComponents sFMCSdkComponents, com.salesforce.marketingcloud.events.f fVar2, com.salesforce.marketingcloud.config.a aVar, l lVar2) {
        this.n = context;
        this.q = fVar;
        this.f = jVar;
        this.g = kVar;
        this.h = cVar;
        this.d = mVar;
        this.k = nVar;
        this.i = fVar2;
        this.l = lVar;
        this.e = sFMCSdkComponents;
        this.j = lVar2;
        this.p = aVar;
    }

    public List<com.salesforce.marketingcloud.events.e> a(Event event, @Nullable List<h> list) {
        ArrayList arrayList = null;
        if (list != null && list.size() != 0) {
            try {
                for (h hVar : list) {
                    if (a(hVar, event, hVar.k()).b()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        for (com.salesforce.marketingcloud.events.e eVar : hVar.j()) {
                            arrayList.add(eVar);
                            try {
                                this.d.a(hVar.h(), eVar.e(), eVar.f(), eVar.d());
                            } catch (Exception e2) {
                                com.salesforce.marketingcloud.g.b(u, e2, "Failed to log analytics for trigger [%s]", hVar.h());
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e3) {
                com.salesforce.marketingcloud.g.b(u, e3, "An outcome could not be reached with the given trigger(s) for the event.", new Object[0]);
            }
        }
        return arrayList;
    }

    private com.salesforce.marketingcloud.events.predicates.f a(Map<String, List<Object>> map, @Nullable com.salesforce.marketingcloud.events.g gVar) {
        int i;
        if (gVar == null) {
            return com.salesforce.marketingcloud.events.predicates.f.c;
        }
        ArrayList arrayList = new ArrayList();
        List<Object> list = map.get(gVar.g().toLowerCase(Locale.getDefault()));
        if (list != null) {
            i = 0;
            for (Object obj : list) {
                if (obj instanceof List) {
                    try {
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(a(it.next(), gVar));
                            i++;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    arrayList.add(a(obj, gVar));
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return i > 1 ? new com.salesforce.marketingcloud.events.predicates.e((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0])) : i == 1 ? new com.salesforce.marketingcloud.events.predicates.a((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0])) : com.salesforce.marketingcloud.events.predicates.f.c;
    }

    private com.salesforce.marketingcloud.events.predicates.f a(Object obj, com.salesforce.marketingcloud.events.g gVar) {
        int i = g.f16879a[gVar.j().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? com.salesforce.marketingcloud.events.predicates.f.c : new com.salesforce.marketingcloud.events.predicates.g(obj, gVar.h(), gVar.i()) : new com.salesforce.marketingcloud.events.predicates.b(obj, gVar.h(), gVar.i()) : new com.salesforce.marketingcloud.events.predicates.c(obj, gVar.h(), gVar.i()) : new com.salesforce.marketingcloud.events.predicates.d(obj, gVar.h(), gVar.i());
    }

    @NonNull
    private Map<String, List<Object>> a(h hVar) {
        HashMap map = new HashMap();
        map.put(v, new C0357c(hVar));
        return map;
    }

    @VisibleForTesting
    public void a(List<com.salesforce.marketingcloud.events.e> list) {
        com.salesforce.marketingcloud.events.f fVar;
        TreeSet treeSet = null;
        for (com.salesforce.marketingcloud.events.e eVar : list) {
            if ("iam".equals(eVar.f())) {
                if (treeSet == null) {
                    treeSet = new TreeSet();
                }
                treeSet.add(eVar.e());
            }
        }
        if (treeSet == null || (fVar = this.i) == null) {
            return;
        }
        fVar.handleOutcomes(treeSet);
    }

    public void a(Event... eventArr) {
        if (this.m.get()) {
            return;
        }
        try {
            this.l.b().execute(new a("trigger_event", new Object[0], eventArr));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.e(u, e2, "An error occurred while processing the event", new Object[0]);
        }
    }

    private void a(JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            com.salesforce.marketingcloud.g.a(u, "%d triggers received from sync.", Integer.valueOf(length));
            TreeSet treeSet = new TreeSet();
            com.salesforce.marketingcloud.storage.n nVarV = this.f.v();
            for (int i = 0; i < length; i++) {
                try {
                    h hVar = new h(jSONArray.getJSONObject(i));
                    nVarV.a(hVar);
                    treeSet.add(hVar.h());
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(u, e2, "Unable to parse trigger from payload", new Object[0]);
                }
            }
            nVarV.b(treeSet);
            JSONObject jSONObject2 = new JSONObject();
            l.a aVar = l.a.TRIGGER_PROCESS;
            jSONObject2.put(aVar.b(), System.currentTimeMillis() - jCurrentTimeMillis);
            if (this.p.l()) {
                this.j.a(aVar, jSONObject2);
            }
        } catch (JSONException e3) {
            com.salesforce.marketingcloud.g.b(u, e3, "Unable to parse trigger sync payload", new Object[0]);
        }
        this.o.countDown();
    }

    private void a() {
        SFMCSdkComponents sFMCSdkComponents = this.e;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().subscribe(this);
        }
    }

    @Nullable
    @VisibleForTesting
    public List<h> a(Event event) {
        return this.f.v().g(event.name());
    }
}
