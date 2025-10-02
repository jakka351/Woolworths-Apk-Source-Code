package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController.AnonymousClass1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class CrashlyticsCore {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15272a;
    public final DataCollectionArbiter b;
    public final OnDemandCounter c;
    public final long d;
    public CrashlyticsFileMarker e;
    public CrashlyticsFileMarker f;
    public CrashlyticsController g;
    public final IdManager h;
    public final FileStore i;
    public final com.google.firebase.crashlytics.a j;
    public final com.google.firebase.crashlytics.a k;
    public final CrashlyticsAppQualitySessionsSubscriber l;
    public final CrashlyticsNativeComponentDeferredProxy m;
    public final RemoteConfigDeferredProxy n;
    public final CrashlyticsWorkers o;

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.a aVar, com.google.firebase.crashlytics.a aVar2, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.b = dataCollectionArbiter;
        firebaseApp.a();
        this.f15272a = firebaseApp.f15169a;
        this.h = idManager;
        this.m = crashlyticsNativeComponentDeferredProxy;
        this.j = aVar;
        this.k = aVar2;
        this.i = fileStore;
        this.l = crashlyticsAppQualitySessionsSubscriber;
        this.n = remoteConfigDeferredProxy;
        this.o = crashlyticsWorkers;
        this.d = System.currentTimeMillis();
        this.c = new OnDemandCounter();
    }

    public final void a(SettingsController settingsController) throws IOException {
        CrashlyticsWorkers.a();
        CrashlyticsWorkers.a();
        this.e.a();
        Logger logger = Logger.f15258a;
        logger.e("Initialization marker file was created.");
        try {
            try {
                this.j.a(new BreadcrumbHandler() { // from class: com.google.firebase.crashlytics.internal.common.j
                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void a(String str) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        CrashlyticsCore crashlyticsCore = this.f15284a;
                        crashlyticsCore.o.f15286a.a(new e(crashlyticsCore, jCurrentTimeMillis - crashlyticsCore.d, str));
                    }
                });
                this.g.g();
                if (!settingsController.d().b.f15396a) {
                    logger.b("Collection of crash reports disabled in Crashlytics settings.", null);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(settingsController)) {
                    logger.f(null, "Previous sessions could not be finalized.");
                }
                this.g.h(settingsController.c());
                c();
            } catch (Exception e) {
                logger.c(e, "Crashlytics encountered a problem during asynchronous initialization.");
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(SettingsController settingsController) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.o.f15286a.d.submit(new g(this, settingsController, 1));
        Logger logger = Logger.f15258a;
        logger.b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logger.c(e, "Crashlytics was interrupted during initialization.");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            logger.c(e2, "Crashlytics encountered a problem during initialization.");
        } catch (TimeoutException e3) {
            logger.c(e3, "Crashlytics timed out during initialization.");
        }
    }

    public final void c() {
        Logger logger = Logger.f15258a;
        CrashlyticsWorkers.a();
        try {
            CrashlyticsFileMarker crashlyticsFileMarker = this.e;
            FileStore fileStore = crashlyticsFileMarker.b;
            String str = crashlyticsFileMarker.f15273a;
            fileStore.getClass();
            if (new File(fileStore.c, str).delete()) {
                return;
            }
            logger.f(null, "Initialization marker file was not properly removed.");
        } catch (Exception e) {
            logger.c(e, "Problem encountered deleting Crashlytics initialization marker.");
        }
    }

    public final boolean d(AppData appData, SettingsController settingsController) throws Resources.NotFoundException {
        AppData appData2;
        boolean z;
        Logger logger;
        boolean z2;
        CrashlyticsController crashlyticsController;
        UserMetadata userMetadata;
        LogFileManager logFileManager;
        SessionReportingCoordinator sessionReportingCoordinator;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        byte b;
        CrashlyticsWorkers crashlyticsWorkers = this.o;
        FileStore fileStore = this.i;
        Context context = this.f15272a;
        if (context == null || (resources = context.getResources()) == null) {
            appData2 = appData;
            z = true;
        } else {
            int iD = CommonUtils.d(context, "com.crashlytics.RequireBuildId", "bool");
            if (iD > 0) {
                z = resources.getBoolean(iD);
            } else {
                int iD2 = CommonUtils.d(context, "com.crashlytics.RequireBuildId", "string");
                if (iD2 > 0) {
                    z = Boolean.parseBoolean(context.getString(iD2));
                }
                appData2 = appData;
                z = true;
            }
            appData2 = appData;
        }
        String str = appData2.b;
        Logger logger2 = Logger.f15258a;
        if (!z) {
            logger2.e("Configured not to require a build ID.");
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String str2 = new CLSUUID().f15266a;
        try {
            this.f = new CrashlyticsFileMarker("crash_marker", fileStore);
            this.e = new CrashlyticsFileMarker("initialization_marker", fileStore);
            userMetadata = new UserMetadata(str2, fileStore, crashlyticsWorkers);
            logFileManager = new LogFileManager(fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(new RemoveRepeatsStrategy());
            RemoteConfigDeferredProxy remoteConfigDeferredProxy = this.n;
            remoteConfigDeferredProxy.getClass();
            remoteConfigDeferredProxy.f15260a.a(new androidx.compose.runtime.snapshots.a(new CrashlyticsRemoteConfigListener(userMetadata), 8));
            Context context2 = this.f15272a;
            IdManager idManager = this.h;
            try {
                sessionReportingCoordinator = new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context2, idManager, appData2, middleOutFallbackStrategy, settingsController), new CrashlyticsReportPersistence(fileStore, settingsController, this.l), DataTransportCrashlyticsReportSender.a(context2, settingsController, this.c), logFileManager, userMetadata, idManager, this.o);
                try {
                    z2 = false;
                    b = 0;
                    logger = logger2;
                    crashlyticsController = null;
                } catch (Exception e) {
                    e = e;
                    logger = logger2;
                    crashlyticsController = null;
                    z2 = false;
                    logger.c(e, "Crashlytics was not started due to an exception during initialization");
                    this.g = crashlyticsController;
                    return z2;
                }
            } catch (Exception e2) {
                e = e2;
                logger = logger2;
            }
        } catch (Exception e3) {
            e = e3;
            logger = logger2;
            z2 = false;
            crashlyticsController = null;
        }
        try {
            this.g = new CrashlyticsController(this.f15272a, this.h, this.b, this.i, this.f, appData, userMetadata, logFileManager, sessionReportingCoordinator, this.m, this.k, this.l, this.o);
            CrashlyticsFileMarker crashlyticsFileMarker = this.e;
            FileStore fileStore2 = crashlyticsFileMarker.b;
            String str3 = crashlyticsFileMarker.f15273a;
            fileStore2.getClass();
            boolean zExists = new File(fileStore2.c, str3).exists();
            try {
                Boolean.TRUE.equals((Boolean) crashlyticsWorkers.f15286a.d.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        CrashlyticsController crashlyticsController2 = this.d.g;
                        crashlyticsController2.getClass();
                        CrashlyticsWorkers.a();
                        CrashlyticsFileMarker crashlyticsFileMarker2 = crashlyticsController2.c;
                        FileStore fileStore3 = crashlyticsFileMarker2.b;
                        String str4 = crashlyticsFileMarker2.f15273a;
                        fileStore3.getClass();
                        boolean z3 = true;
                        if (new File(fileStore3.c, str4).exists()) {
                            Logger.f15258a.e("Found previous crash marker.");
                            FileStore fileStore4 = crashlyticsFileMarker2.b;
                            fileStore4.getClass();
                            new File(fileStore4.c, str4).delete();
                        } else {
                            String strE = crashlyticsController2.e();
                            if (strE == null || !crashlyticsController2.j.d(strE)) {
                                z3 = false;
                            }
                        }
                        return Boolean.valueOf(z3);
                    }
                }).get(3L, TimeUnit.SECONDS));
            } catch (Exception unused) {
            }
            CrashlyticsController crashlyticsController2 = this.g;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            crashlyticsController2.getClass();
            crashlyticsController2.e.f15286a.a(new c(b == true ? 1 : 0, crashlyticsController2, str2));
            CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(crashlyticsController2.new AnonymousClass1(), settingsController, defaultUncaughtExceptionHandler, crashlyticsController2.j);
            crashlyticsController2.n = crashlyticsUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
            if (!zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                logger.b("Successfully configured exception handler.", null);
                return true;
            }
            logger.b("Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
            b(settingsController);
            return false;
        } catch (Exception e4) {
            e = e4;
            logger.c(e, "Crashlytics was not started due to an exception during initialization");
            this.g = crashlyticsController;
            return z2;
        }
    }
}
