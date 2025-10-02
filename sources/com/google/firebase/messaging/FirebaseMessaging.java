package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static Store m;
    public static ScheduledThreadPoolExecutor o;

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15642a;
    public final FirebaseInstanceIdInternal b;
    public final Context c;
    public final GmsRpc d;
    public final RequestDeduplicator e;
    public final AutoInit f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final Metadata i;
    public boolean j;
    public final Application.ActivityLifecycleCallbacks k;
    public static final long l = TimeUnit.HOURS.toSeconds(8);
    public static Provider n = new e();

    public class AutoInit {

        /* renamed from: a, reason: collision with root package name */
        public final Subscriber f15643a;
        public boolean b;
        public Boolean c;

        public AutoInit(Subscriber subscriber) {
            this.f15643a = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.firebase.messaging.k] */
        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            Boolean boolB = b();
                            this.c = boolB;
                            if (boolB == null) {
                                this.f15643a.a(new EventHandler() { // from class: com.google.firebase.messaging.k
                                    @Override // com.google.firebase.events.EventHandler
                                    public final void a(Event event) {
                                        FirebaseMessaging.AutoInit autoInit = this.f15660a;
                                        if (autoInit.a()) {
                                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                                            Store store = FirebaseMessaging.m;
                                            firebaseMessaging.g();
                                        }
                                    }
                                });
                            }
                            this.b = true;
                        }
                    } finally {
                    }
                }
                return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f15642a.j();
            } catch (Throwable th) {
                throw th;
            }
            Boolean bool = this.c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f15642a.j();
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            FirebaseApp firebaseApp = FirebaseMessaging.this.f15642a;
            firebaseApp.a();
            Context context = firebaseApp.f15169a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber) {
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        final Metadata metadata = new Metadata(context);
        final GmsRpc gmsRpc = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.j = false;
        n = provider3;
        this.f15642a = firebaseApp;
        this.b = firebaseInstanceIdInternal;
        this.f = new AutoInit(subscriber);
        firebaseApp.a();
        final Context context2 = firebaseApp.f15169a;
        this.c = context2;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.k = fcmLifecycleCallbacks;
        this.i = metadata;
        this.d = gmsRpc;
        this.e = new RequestDeduplicator(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        firebaseApp.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.b();
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.g
            public final /* synthetic */ FirebaseMessaging e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.e;
                        if (firebaseMessaging.f.a()) {
                            firebaseMessaging.g();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.e;
                        final Context context3 = firebaseMessaging2.c;
                        ProxyNotificationInitializer.a(context3);
                        GmsRpc gmsRpc2 = firebaseMessaging2.d;
                        final boolean zF = firebaseMessaging2.f();
                        if (PlatformVersion.isAtLeastQ()) {
                            SharedPreferences sharedPreferencesA = ProxyNotificationPreferences.a(context3);
                            if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zF) {
                                gmsRpc2.c.setRetainProxiedNotifications(zF).addOnSuccessListener(new androidx.arch.core.executor.a(2), new OnSuccessListener() { // from class: com.google.firebase.messaging.n
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        androidx.constraintlayout.core.state.a.v(ProxyNotificationPreferences.a(context3), "proxy_retention", zF);
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            gmsRpc2.c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.g, new i(firebaseMessaging2, 0));
                            break;
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = TopicsSubscriber.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsStore topicsStore;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                Metadata metadata2 = metadata;
                GmsRpc gmsRpc2 = gmsRpc;
                int i4 = TopicsSubscriber.j;
                synchronized (TopicsStore.class) {
                    try {
                        WeakReference weakReference = TopicsStore.c;
                        topicsStore = weakReference != null ? (TopicsStore) weakReference.get() : null;
                        if (topicsStore == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            TopicsStore topicsStore2 = new TopicsStore(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (topicsStore2) {
                                topicsStore2.f15655a = SharedPreferencesQueue.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            TopicsStore.c = new WeakReference(topicsStore2);
                            topicsStore = topicsStore2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new TopicsSubscriber(firebaseMessaging, metadata2, topicsStore, gmsRpc2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new h(this));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.g
            public final /* synthetic */ FirebaseMessaging e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.e;
                        if (firebaseMessaging.f.a()) {
                            firebaseMessaging.g();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.e;
                        final Context context3 = firebaseMessaging2.c;
                        ProxyNotificationInitializer.a(context3);
                        GmsRpc gmsRpc2 = firebaseMessaging2.d;
                        final boolean zF = firebaseMessaging2.f();
                        if (PlatformVersion.isAtLeastQ()) {
                            SharedPreferences sharedPreferencesA = ProxyNotificationPreferences.a(context3);
                            if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zF) {
                                gmsRpc2.c.setRetainProxiedNotifications(zF).addOnSuccessListener(new androidx.arch.core.executor.a(2), new OnSuccessListener() { // from class: com.google.firebase.messaging.n
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        androidx.constraintlayout.core.state.a.v(ProxyNotificationPreferences.a(context3), "proxy_retention", zF);
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            gmsRpc2.c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.g, new i(firebaseMessaging2, 0));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (o == null) {
                    o = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                o.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized Store c(Context context) {
        try {
            if (m == null) {
                m = new Store(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.b(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Task taskContinueWithTask;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final Store.Token tokenE = e();
        if (!i(tokenE)) {
            return tokenE.f15652a;
        }
        final String strB = Metadata.b(this.f15642a);
        final RequestDeduplicator requestDeduplicator = this.e;
        synchronized (requestDeduplicator) {
            taskContinueWithTask = (Task) requestDeduplicator.b.get(strB);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                GmsRpc gmsRpc = this.d;
                taskContinueWithTask = gmsRpc.a(gmsRpc.c(new Bundle(), Metadata.b(gmsRpc.f15644a), "*")).onSuccessTask(this.h, new SuccessContinuation() { // from class: com.google.firebase.messaging.j
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.d;
                        String str = strB;
                        Store.Token token = tokenE;
                        String str2 = (String) obj;
                        Store storeC = FirebaseMessaging.c(firebaseMessaging.c);
                        FirebaseApp firebaseApp = firebaseMessaging.f15642a;
                        firebaseApp.a();
                        String strF = "[DEFAULT]".equals(firebaseApp.b) ? "" : firebaseApp.f();
                        String strA = firebaseMessaging.i.a();
                        synchronized (storeC) {
                            String strA2 = Store.Token.a(System.currentTimeMillis(), str2, strA);
                            if (strA2 != null) {
                                SharedPreferences.Editor editorEdit = storeC.f15651a.edit();
                                editorEdit.putString(strF + "|T|" + str + "|*", strA2);
                                editorEdit.commit();
                            }
                        }
                        if (token == null || !str2.equals(token.f15652a)) {
                            FirebaseApp firebaseApp2 = firebaseMessaging.f15642a;
                            firebaseApp2.a();
                            if ("[DEFAULT]".equals(firebaseApp2.b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                                    firebaseApp2.a();
                                    sb.append(firebaseApp2.b);
                                    Log.d("FirebaseMessaging", sb.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new FcmBroadcastProcessor(firebaseMessaging.c).b(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(requestDeduplicator.f15648a, new Continuation() { // from class: com.google.firebase.messaging.o
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        RequestDeduplicator requestDeduplicator2 = requestDeduplicator;
                        String str = strB;
                        synchronized (requestDeduplicator2) {
                            requestDeduplicator2.b.remove(str);
                        }
                        return task;
                    }
                });
                requestDeduplicator.b.put(strB, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final Task d() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.g.execute(new Runnable() { // from class: com.google.firebase.messaging.f
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Store store = FirebaseMessaging.m;
                FirebaseMessaging firebaseMessaging = this.d;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource2.setResult(firebaseMessaging.a());
                } catch (Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public final Store.Token e() {
        Store.Token tokenB;
        Store storeC = c(this.c);
        FirebaseApp firebaseApp = this.f15642a;
        firebaseApp.a();
        String strF = "[DEFAULT]".equals(firebaseApp.b) ? "" : firebaseApp.f();
        String strB = Metadata.b(this.f15642a);
        synchronized (storeC) {
            tokenB = Store.Token.b(storeC.f15651a.getString(strF + "|T|" + strB + "|*", null));
        }
        return tokenB;
    }

    public final boolean f() {
        Context context = this.c;
        ProxyNotificationInitializer.a(context);
        if (PlatformVersion.isAtLeastQ()) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f15642a.b(AnalyticsConnector.class) != null) {
                    return true;
                }
                if (MessagingAnalytics.a() && n != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public final void g() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.a();
        } else if (i(e())) {
            synchronized (this) {
                if (!this.j) {
                    h(0L);
                }
            }
        }
    }

    public final synchronized void h(long j) {
        b(new SyncTask(this, Math.min(Math.max(30L, 2 * j), l)), j);
        this.j = true;
    }

    public final boolean i(Store.Token token) {
        if (token != null) {
            return System.currentTimeMillis() > token.c + Store.Token.d || !this.i.a().equals(token.b);
        }
        return true;
    }
}
