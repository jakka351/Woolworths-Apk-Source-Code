package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class FirebaseApp {
    public static final Object k = new Object();
    public static final ArrayMap l = new ArrayMap(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f15169a;
    public final String b;
    public final FirebaseOptions c;
    public final ComponentRuntime d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final Lazy g;
    public final Provider h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi
    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference f15170a = new AtomicReference();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.k) {
                try {
                    Iterator it = new ArrayList(FirebaseApp.l.values()).iterator();
                    while (it.hasNext()) {
                        FirebaseApp firebaseApp = (FirebaseApp) it.next();
                        if (firebaseApp.e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it2 = firebaseApp.i.iterator();
                            while (it2.hasNext()) {
                                ((BackgroundStateChangeListener) it2.next()).onBackgroundStateChanged(z);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @TargetApi
    /* loaded from: classes6.dex */
    public static class UserUnlockReceiver extends BroadcastReceiver {
        public static final AtomicReference b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        public final Context f15171a;

        public UserUnlockReceiver(Context context) {
            this.f15171a = context;
        }

        public static void a(Context context) {
            AtomicReference atomicReference = b;
            if (atomicReference.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.k) {
                try {
                    Iterator it = FirebaseApp.l.values().iterator();
                    while (it.hasNext()) {
                        ((FirebaseApp) it.next()).g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f15171a.unregisterReceiver(this);
        }
    }

    public FirebaseApp(final Context context, FirebaseOptions firebaseOptions, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.f15169a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.c = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.d;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListA = ComponentDiscovery.b(context, ComponentDiscoveryService.class).a();
        Trace.endSection();
        Trace.beginSection("Runtime");
        ComponentRuntime.Builder builder = new ComponentRuntime.Builder(UiExecutor.d);
        ArrayList arrayList = builder.b;
        arrayList.addAll(arrayListA);
        arrayList.add(new com.google.firebase.components.a(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new com.google.firebase.components.a(new ExecutorsRegistrar(), 1));
        builder.a(Component.c(context, Context.class, new Class[0]));
        builder.a(Component.c(this, FirebaseApp.class, new Class[0]));
        builder.a(Component.c(firebaseOptions, FirebaseOptions.class, new Class[0]));
        builder.d = new ComponentMonitor();
        if (UserManagerCompat.a(context) && FirebaseInitProvider.e.get()) {
            builder.a(Component.c(startupTime, StartupTime.class, new Class[0]));
        }
        ComponentRuntime componentRuntime = new ComponentRuntime(builder.f15227a, arrayList, builder.c, builder.d);
        this.d = componentRuntime;
        Trace.endSection();
        this.g = new Lazy(new Provider() { // from class: com.google.firebase.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseApp.k;
                FirebaseApp firebaseApp = this.f15174a;
                return new DataCollectionConfigStorage(context, firebaseApp.f(), (Publisher) firebaseApp.d.a(Publisher.class));
            }
        });
        this.h = componentRuntime.c(DefaultHeartBeatController.class);
        BackgroundStateChangeListener backgroundStateChangeListener = new BackgroundStateChangeListener() { // from class: com.google.firebase.b
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                if (z) {
                    Object obj = FirebaseApp.k;
                } else {
                    ((DefaultHeartBeatController) this.f15221a.h.get()).c();
                }
            }
        };
        a();
        if (atomicBoolean.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        copyOnWriteArrayList.add(backgroundStateChangeListener);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                for (V v : l.values()) {
                    v.a();
                    arrayList.add(v.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FirebaseApp d() {
        FirebaseApp firebaseApp;
        synchronized (k) {
            try {
                firebaseApp = (FirebaseApp) l.get("[DEFAULT]");
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((DefaultHeartBeatController) firebaseApp.h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FirebaseApp e(String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (k) {
            try {
                firebaseApp = (FirebaseApp) l.get(str.trim());
                if (firebaseApp == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((DefaultHeartBeatController) firebaseApp.h.get()).c();
            } finally {
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp h(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return d();
                }
                FirebaseOptions firebaseOptionsA = FirebaseOptions.a(context);
                if (firebaseOptionsA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, firebaseOptionsA, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseApp i(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        AtomicReference atomicReference = GlobalBackgroundStateListener.f15170a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = GlobalBackgroundStateListener.f15170a;
            if (atomicReference2.get() == null) {
                GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                while (true) {
                    if (atomicReference2.compareAndSet(null, globalBackgroundStateListener)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            ArrayMap arrayMap = l;
            Preconditions.checkState(!arrayMap.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, firebaseOptions, strTrim);
            arrayMap.put(strTrim, firebaseApp);
        }
        firebaseApp.g();
        return firebaseApp;
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.a();
        return this.b.equals(firebaseApp.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        Context context = this.f15169a;
        boolean zA = UserManagerCompat.a(context);
        String str = this.b;
        if (!zA) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            UserUnlockReceiver.a(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.k("[DEFAULT]".equals(str));
        ((DefaultHeartBeatController) this.h.get()).c();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean j() {
        boolean z;
        a();
        DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) this.g.get();
        synchronized (dataCollectionConfigStorage) {
            z = dataCollectionConfigStorage.b;
        }
        return z;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.b).add("options", this.c).toString();
    }
}
