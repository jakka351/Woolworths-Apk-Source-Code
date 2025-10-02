package com.salesforce.marketingcloud;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCLogListener;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.b;
import com.salesforce.marketingcloud.behaviors.LifecycleManager;
import com.salesforce.marketingcloud.events.EventManager;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessageComponent;
import com.salesforce.marketingcloud.messages.iam.InAppMessageManager;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MarketingCloudSdk extends PushModuleInterface implements b.InterfaceC0353b {
    private static volatile boolean A = false;

    @VisibleForTesting
    static final String s = "MarketingCloudPrefs";

    @VisibleForTesting
    static final String t = "InitConfig";
    static MarketingCloudSdk x;
    private static Context y;
    private static volatile boolean z;

    /* renamed from: a, reason: collision with root package name */
    private final MarketingCloudConfig f16828a;
    private final List<d> b = new ArrayList();

    @Nullable
    private final SFMCSdkComponents c;
    com.salesforce.marketingcloud.location.f d;
    com.salesforce.marketingcloud.behaviors.c e;
    private com.salesforce.marketingcloud.b f;
    private com.salesforce.marketingcloud.storage.j g;
    private com.salesforce.marketingcloud.http.c h;
    private com.salesforce.marketingcloud.messages.inbox.a i;
    private com.salesforce.marketingcloud.registration.d j;
    private com.salesforce.marketingcloud.notifications.a k;
    private com.salesforce.marketingcloud.messages.push.a l;
    private com.salesforce.marketingcloud.messages.d m;
    private com.salesforce.marketingcloud.events.c n;
    private AnalyticsManager o;
    private InitializationStatus p;
    private InAppMessageComponent q;
    private com.salesforce.marketingcloud.internal.l r;
    static final String u = g.a("MarketingCloudSdk");
    private static final Object v = new Object();
    private static final List<c> w = new ArrayList();
    private static volatile boolean B = true;

    @MCKeep
    public interface InitializationListener {
        void complete(@NonNull InitializationStatus initializationStatus);
    }

    @MCKeep
    public interface WhenReadyListener {
        void ready(@NonNull MarketingCloudSdk marketingCloudSdk);
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16829a;
        final /* synthetic */ MarketingCloudConfig b;
        final /* synthetic */ SFMCSdkComponents c;
        final /* synthetic */ InitializationListener d;

        public a(Context context, MarketingCloudConfig marketingCloudConfig, SFMCSdkComponents sFMCSdkComponents, InitializationListener initializationListener) {
            this.f16829a = context;
            this.b = marketingCloudConfig;
            this.c = sFMCSdkComponents;
            this.d = initializationListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("SFMC_init");
            try {
                String str = MarketingCloudSdk.u;
                g.d(str, "Starting init thread", new Object[0]);
                MarketingCloudSdk.a(this.f16829a, this.b, this.c, this.d);
                Thread.currentThread().setName(name);
                g.d(str, "~~ MarketingCloudSdk v%s init complete ~~", MarketingCloudSdk.getSdkVersionName());
            } catch (Throwable th) {
                Thread.currentThread().setName(name);
                g.d(MarketingCloudSdk.u, "~~ MarketingCloudSdk v%s init complete ~~", MarketingCloudSdk.getSdkVersionName());
                throw th;
            }
        }
    }

    public class b extends c {
        public b(Looper looper, WhenReadyListener whenReadyListener) {
            super(looper, whenReadyListener);
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.c
        public void a(WhenReadyListener whenReadyListener) {
            if (whenReadyListener != null) {
                try {
                    whenReadyListener.ready(MarketingCloudSdk.x);
                } catch (Exception e) {
                    g.b(MarketingCloudSdk.u, e, "Error occurred in %s", whenReadyListener.getClass().getName());
                }
            }
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f16830a;
        WhenReadyListener b;
        volatile boolean c;
        private final Runnable d = new a();
        private volatile boolean e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    try {
                        if (!c.this.c) {
                            c cVar = c.this;
                            cVar.a(cVar.b);
                            c.this.c = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(Looper looper, WhenReadyListener whenReadyListener) {
            looper = looper == null ? Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper() : looper;
            this.b = whenReadyListener;
            this.f16830a = new Handler(looper);
        }

        public void a() {
            synchronized (this) {
                if (!this.c && !this.e) {
                    this.e = true;
                    this.f16830a.post(this.d);
                }
            }
        }

        public abstract void a(WhenReadyListener whenReadyListener);
    }

    private MarketingCloudSdk(@NonNull MarketingCloudConfig marketingCloudConfig, @Nullable SFMCSdkComponents sFMCSdkComponents) {
        this.f16828a = marketingCloudConfig;
        this.c = sFMCSdkComponents;
    }

    @VisibleForTesting
    @WorkerThread
    public static void c() {
        MarketingCloudSdk marketingCloudSdk = x;
        if (marketingCloudSdk != null) {
            marketingCloudSdk.a(false);
        }
        x = null;
    }

    @Nullable
    @MCKeep
    public static MarketingCloudSdk getInstance() {
        if (!z && !A) {
            throw new IllegalStateException("MarketingCloudSdk#init must be called before calling MarketingCloudSdk#getInstance.");
        }
        synchronized (v) {
            if (A) {
                return x;
            }
            boolean z2 = false;
            while (!A && z) {
                try {
                    try {
                        v.wait(0L);
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            return x;
        }
    }

    @MCKeep
    @MCLogListener.LogLevel
    public static int getLogLevel() {
        return com.salesforce.marketingcloud.internal.d.a();
    }

    @MCKeep
    public static int getSdkVersionCode() {
        return com.salesforce.marketingcloud.a.d;
    }

    @NonNull
    @MCKeep
    public static String getSdkVersionName() {
        return com.salesforce.marketingcloud.a.e;
    }

    @MCKeep
    @Deprecated
    @MainThread
    public static void init(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @Nullable InitializationListener initializationListener) {
        b(context, marketingCloudConfig, null, initializationListener);
    }

    @MCKeep
    public static boolean isInitializing() {
        return z;
    }

    @MCKeep
    public static boolean isReady() {
        return A && x != null;
    }

    @MCKeep
    public static void requestSdk(@Nullable Looper looper, @NonNull WhenReadyListener whenReadyListener) {
        b bVar = new b(looper, whenReadyListener);
        List<c> list = w;
        synchronized (list) {
            try {
                if (B) {
                    list.add(bVar);
                } else {
                    bVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @MCKeep
    public static void setLogLevel(@MCLogListener.LogLevel int i) {
        com.salesforce.marketingcloud.internal.d.a(i);
    }

    @MCKeep
    public static void setLogListener(@Nullable MCLogListener mCLogListener) {
        com.salesforce.marketingcloud.internal.d.a(mCLogListener);
    }

    @MCKeep
    public static void unregisterWhenReadyListener(@NonNull WhenReadyListener whenReadyListener) {
        if (whenReadyListener == null) {
            return;
        }
        List<c> list = w;
        synchronized (list) {
            try {
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    if (whenReadyListener == it.next().b) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.b.InterfaceC0353b
    @RestrictTo
    public void a(int i) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            try {
                d dVar = this.b.get(size);
                if (dVar instanceof e) {
                    ((e) dVar).controlChannelInit(i);
                }
            } catch (Exception e) {
                g.b(u, e, "Error encountered during control channel init.", new Object[0]);
            }
        }
    }

    @NonNull
    @RestrictTo
    public com.salesforce.marketingcloud.storage.j b() {
        return this.g;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public AnalyticsManager getAnalyticsManager() {
        return this.o;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public EventManager getEventManager() {
        return this.n;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public InAppMessageManager getInAppMessageManager() {
        return this.q;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public InboxMessageManager getInboxMessageManager() {
        return this.i;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public InitializationStatus getInitializationStatus() {
        return this.p;
    }

    @NonNull
    @MCKeep
    public MarketingCloudConfig getMarketingCloudConfig() {
        return this.f16828a;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface
    @NonNull
    public ModuleIdentity getModuleIdentity() {
        return i.a(this.f16828a.applicationId(), getRegistrationManager());
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public NotificationManager getNotificationManager() {
        return this.k;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public PushMessageManager getPushMessageManager() {
        return this.l;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public RegionMessageManager getRegionMessageManager() {
        return this.m;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public RegistrationManager getRegistrationManager() {
        return this.j;
    }

    @NonNull
    @MCKeep
    public JSONObject getSdkState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("initConfig", this.f16828a.toString());
            jSONObject.put("initStatus", this.p.toString());
            for (d dVar : this.b) {
                if (dVar != null) {
                    try {
                        jSONObject.put(dVar.componentName(), dVar.componentState());
                    } catch (Exception e) {
                        g.b(u, e, "Failed to create component state for %s", dVar);
                    }
                }
            }
        } catch (Exception e2) {
            g.b(u, e2, "Unable to create Sdk state json", new Object[0]);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface
    @NonNull
    public JSONObject getState() {
        return getSdkState();
    }

    public static void a(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @Nullable SFMCSdkComponents sFMCSdkComponents, @Nullable InitializationListener initializationListener) {
        String str = u;
        g.d(str, "executeInit %s", marketingCloudConfig);
        synchronized (v) {
            try {
                MarketingCloudSdk marketingCloudSdk = x;
                if (marketingCloudSdk != null) {
                    marketingCloudSdk.b(com.salesforce.marketingcloud.internal.e.a(marketingCloudConfig, marketingCloudSdk.f16828a));
                }
                x = new MarketingCloudSdk(marketingCloudConfig, sFMCSdkComponents);
                InitializationStatus initializationStatusA = x.a(sFMCSdkComponents != null ? sFMCSdkComponents.getRegistrationId() : null);
                g.a(str, "MarketingCloudSdk init finished with status: %s", initializationStatusA);
                A = initializationStatusA.getIsUsable();
                z = false;
                if (A) {
                    x.a(initializationStatusA);
                    MarketingCloudSdk marketingCloudSdk2 = x;
                    marketingCloudSdk2.f.a(marketingCloudSdk2);
                    List<c> list = w;
                    synchronized (list) {
                        try {
                            B = false;
                            g.d(str, "Delivering queued SDK requests to %s listeners", Integer.valueOf(list.size()));
                            if (!list.isEmpty()) {
                                Iterator<c> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next().a();
                                }
                                w.clear();
                            }
                        } finally {
                        }
                    }
                } else {
                    x.a(false);
                    x = null;
                    List<c> list2 = w;
                    synchronized (list2) {
                        list2.clear();
                    }
                }
                v.notifyAll();
                if (initializationListener != null) {
                    initializationListener.complete(initializationStatusA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x002b, B:6:0x002f, B:25:0x0065, B:23:0x0063, B:11:0x0036, B:13:0x003a, B:15:0x0042, B:19:0x004d, B:22:0x005c), top: B:28:0x002b }] */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.salesforce.marketingcloud.MarketingCloudConfig r6, @androidx.annotation.Nullable com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents r7, @androidx.annotation.Nullable com.salesforce.marketingcloud.MarketingCloudSdk.InitializationListener r8) {
        /*
            java.lang.String r0 = com.salesforce.marketingcloud.MarketingCloudSdk.u
            java.lang.String r1 = getSdkVersionName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "~~ MarketingCloudSdk v%s init() ~~"
            com.salesforce.marketingcloud.g.d(r0, r2, r1)
            java.lang.String r1 = "Context cannot be null."
            com.salesforce.marketingcloud.util.j.a(r5, r1)
            java.lang.String r1 = "Config cannot be null."
            com.salesforce.marketingcloud.util.j.a(r6, r1)
            java.lang.String r1 = r6.applicationId()
            java.lang.String r2 = r6.accessToken()
            java.lang.String r3 = r6.senderId()
            com.salesforce.marketingcloud.internal.d.a(r1, r2, r3)
            java.lang.Object r1 = com.salesforce.marketingcloud.MarketingCloudSdk.v
            monitor-enter(r1)
            boolean r2 = com.salesforce.marketingcloud.MarketingCloudSdk.A     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L36
            boolean r2 = com.salesforce.marketingcloud.MarketingCloudSdk.z     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L65
            goto L36
        L34:
            r5 = move-exception
            goto L88
        L36:
            com.salesforce.marketingcloud.MarketingCloudSdk r2 = com.salesforce.marketingcloud.MarketingCloudSdk.x     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L65
            com.salesforce.marketingcloud.MarketingCloudConfig r2 = r2.f16828a     // Catch: java.lang.Throwable -> L34
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L65
            java.lang.String r5 = "MarketingCloudSdk is already %s"
            boolean r6 = com.salesforce.marketingcloud.MarketingCloudSdk.A     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L4b
            java.lang.String r6 = "initialized"
            goto L4d
        L4b:
            java.lang.String r6 = "initializing"
        L4d:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.g.d(r0, r5, r6)     // Catch: java.lang.Throwable -> L34
            boolean r5 = isReady()     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L63
            if (r8 == 0) goto L63
            com.salesforce.marketingcloud.MarketingCloudSdk r5 = com.salesforce.marketingcloud.MarketingCloudSdk.x     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.InitializationStatus r5 = r5.p     // Catch: java.lang.Throwable -> L34
            r8.complete(r5)     // Catch: java.lang.Throwable -> L34
        L63:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return
        L65:
            java.lang.String r2 = "Starting initialization"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.g.d(r0, r2, r4)     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.MarketingCloudSdk.A = r3     // Catch: java.lang.Throwable -> L34
            r0 = 1
            com.salesforce.marketingcloud.MarketingCloudSdk.z = r0     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.MarketingCloudSdk.B = r0     // Catch: java.lang.Throwable -> L34
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.MarketingCloudSdk.y = r0     // Catch: java.lang.Throwable -> L34
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L34
            com.salesforce.marketingcloud.MarketingCloudSdk$a r2 = new com.salesforce.marketingcloud.MarketingCloudSdk$a     // Catch: java.lang.Throwable -> L34
            r2.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L34
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34
            r0.start()     // Catch: java.lang.Throwable -> L34
            goto L63
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MarketingCloudSdk.b(android.content.Context, com.salesforce.marketingcloud.MarketingCloudConfig, com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents, com.salesforce.marketingcloud.MarketingCloudSdk$InitializationListener):void");
    }

    @MCKeep
    public static void requestSdk(@NonNull WhenReadyListener whenReadyListener) {
        requestSdk(null, whenReadyListener);
    }

    @WorkerThread
    private void b(boolean z2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            try {
                this.b.get(size).tearDown(z2);
            } catch (Exception e) {
                g.b(u, e, "Error encountered tearing down component.", new Object[0]);
            }
        }
        this.b.clear();
        com.salesforce.marketingcloud.internal.l lVar = this.r;
        if (lVar != null) {
            lVar.c();
        }
        com.salesforce.marketingcloud.storage.j jVar = this.g;
        if (jVar != null) {
            try {
                jVar.x();
            } catch (Exception e2) {
                g.b(u, e2, "Error encountered tearing down storage.", new Object[0]);
            }
            this.g = null;
        }
        List<c> list = w;
        synchronized (list) {
            list.clear();
        }
        A = false;
        B = true;
    }

    @NonNull
    @RestrictTo
    public com.salesforce.marketingcloud.http.c a() {
        return this.h;
    }

    private InitializationStatus a(@Nullable String str) {
        String strA;
        if (com.salesforce.marketingcloud.util.b.a()) {
            return com.salesforce.marketingcloud.internal.c.a();
        }
        InitializationStatus.a aVarB = com.salesforce.marketingcloud.internal.c.b();
        try {
            strA = com.salesforce.marketingcloud.util.e.a(y, str);
            try {
                this.r = new com.salesforce.marketingcloud.internal.l();
                com.salesforce.marketingcloud.storage.j jVar = new com.salesforce.marketingcloud.storage.j(y, new com.salesforce.marketingcloud.util.a(y, this.f16828a.applicationId(), this.f16828a.accessToken(), strA), this.f16828a.applicationId(), this.f16828a.accessToken(), this.r);
                this.g = jVar;
                jVar.a(aVarB);
            } catch (Throwable th) {
                g.a(u, th, "Unable to initialize SDK storage.", new Object[0]);
                aVarB.a(th);
            }
        } catch (Exception e) {
            aVarB.a(e);
            g.b(u, e, "Something wrong with internal init", new Object[0]);
        }
        if (!aVarB.b()) {
            com.salesforce.marketingcloud.registration.d.a(this.f16828a, y, strA, str);
            return aVarB.a();
        }
        this.e = new com.salesforce.marketingcloud.behaviors.c(y, Executors.newSingleThreadExecutor());
        this.h = new com.salesforce.marketingcloud.http.c(y, this.g.f(), this.r);
        com.salesforce.marketingcloud.alarms.b bVar = new com.salesforce.marketingcloud.alarms.b(y, this.g, this.e);
        com.salesforce.marketingcloud.analytics.h hVar = new com.salesforce.marketingcloud.analytics.h(this.f16828a, this.g, strA, bVar, this.e, this.h, this.r);
        this.o = hVar;
        k kVar = new k(strA, this.f16828a, this.g, this.h, this.e, bVar, this.r, hVar);
        this.f = new com.salesforce.marketingcloud.b(kVar, this.g.o());
        this.d = com.salesforce.marketingcloud.location.f.a(y, this.f16828a);
        com.salesforce.marketingcloud.proximity.e eVarA = com.salesforce.marketingcloud.proximity.e.a(y, this.f16828a);
        this.k = com.salesforce.marketingcloud.notifications.a.a(y, this.g, this.f16828a.notificationCustomizationOptions(), hVar);
        this.i = new com.salesforce.marketingcloud.messages.inbox.a(this.f16828a, this.g, strA, this.e, bVar, this.h, this.r, hVar);
        this.m = new com.salesforce.marketingcloud.messages.d(y, this.f16828a, this.g, strA, this.d, eVarA, this.e, bVar, this.h, this.k, this.r, hVar);
        this.l = new com.salesforce.marketingcloud.messages.push.a(y, this.g, this.k, bVar, this.f16828a.senderId());
        com.salesforce.marketingcloud.registration.f fVar = new com.salesforce.marketingcloud.registration.f(strA, this.f16828a.applicationId(), com.salesforce.marketingcloud.util.h.a(y));
        this.j = new com.salesforce.marketingcloud.registration.d(y, this.f16828a, this.g, fVar, this.e, bVar, this.h, this.l, this.r, this.c);
        com.salesforce.marketingcloud.config.a aVar = new com.salesforce.marketingcloud.config.a(kVar, this.g, hVar);
        Context context = y;
        com.salesforce.marketingcloud.storage.j jVar2 = this.g;
        this.q = new InAppMessageComponent(context, jVar2, bVar, kVar, this.e, o.a(context, jVar2), this.f16828a.urlHandler(), this.r, hVar, this.c, aVar);
        this.n = new com.salesforce.marketingcloud.events.c(y, fVar, this.g, kVar, this.e, hVar, this.r, this.c, aVar, this.q);
        this.b.add(this.e);
        this.b.add(LifecycleManager.a((Application) y.getApplicationContext()));
        this.b.add(this.h);
        this.b.add(bVar);
        this.b.add(hVar);
        this.b.add(kVar);
        this.b.add(this.f);
        this.b.add(this.d);
        this.b.add(eVarA);
        this.b.add(this.i);
        this.b.add(this.k);
        this.b.add(this.m);
        this.b.add(this.l);
        this.b.add(this.j);
        this.b.add(aVar);
        this.b.add(this.q);
        this.b.add(this.n);
        int iA = this.f.a();
        g.d(u, "Initializing all components with control channel flag [%d]", Integer.valueOf(iA));
        for (d dVar : this.b) {
            g.d(u, "init called for %s", dVar.componentName());
            if (dVar instanceof e) {
                ((e) dVar).init(aVarB, iA);
            } else if (dVar instanceof f) {
                ((f) dVar).a(aVarB);
            }
            aVarB.a(dVar);
        }
        return aVarB.a();
    }

    private void a(boolean z2) {
        b(z2);
        z = false;
    }

    private void a(InitializationStatus initializationStatus) {
        this.p = initializationStatus;
    }
}
