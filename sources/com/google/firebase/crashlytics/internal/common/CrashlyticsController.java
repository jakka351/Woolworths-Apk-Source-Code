package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.sessions.api.CrashEventReceiver;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
class CrashlyticsController {
    public static final b r = new b(0);
    public static final Charset s = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15270a;
    public final DataCollectionArbiter b;
    public final CrashlyticsFileMarker c;
    public final UserMetadata d;
    public final CrashlyticsWorkers e;
    public final IdManager f;
    public final FileStore g;
    public final AppData h;
    public final LogFileManager i;
    public final CrashlyticsNativeComponent j;
    public final AnalyticsEventLogger k;
    public final CrashlyticsAppQualitySessionsSubscriber l;
    public final SessionReportingCoordinator m;
    public CrashlyticsUncaughtExceptionHandler n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$1, reason: invalid class name */
    class AnonymousClass1 implements CrashlyticsUncaughtExceptionHandler.CrashListener {
        public AnonymousClass1() {
        }

        public final void a(final SettingsController settingsController, final Thread thread, final Throwable th) {
            Task taskContinueWithTask;
            final CrashlyticsController crashlyticsController = CrashlyticsController.this;
            synchronized (crashlyticsController) {
                Logger.f15258a.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName(), null);
                CrashEventReceiver.a();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                CrashlyticsWorker crashlyticsWorker = crashlyticsController.e.f15286a;
                Callable<Task<Void>> callable = new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                    @Override // java.util.concurrent.Callable
                    public final Task<Void> call() throws Throwable {
                        FileStore fileStore;
                        String str;
                        b bVar = CrashlyticsController.r;
                        long j = jCurrentTimeMillis;
                        long j2 = j / 1000;
                        CrashlyticsController crashlyticsController2 = CrashlyticsController.this;
                        String strE = crashlyticsController2.e();
                        Logger logger = Logger.f15258a;
                        if (strE == null) {
                            logger.c(null, "Tried to write a fatal exception while no session was open.");
                            return Tasks.forResult(null);
                        }
                        crashlyticsController2.c.a();
                        SessionReportingCoordinator sessionReportingCoordinator = crashlyticsController2.m;
                        sessionReportingCoordinator.getClass();
                        logger.e("Persisting fatal event for session ".concat(strE));
                        sessionReportingCoordinator.e(th, thread, AppMeasurement.CRASH_ORIGIN, new EventMetadata(strE, j2, EmptyMap.d), true);
                        crashlyticsController2.getClass();
                        try {
                            fileStore = crashlyticsController2.g;
                            str = ".ae" + j;
                            fileStore.getClass();
                        } catch (IOException e) {
                            logger.f(e, "Could not create app exception marker file.");
                        }
                        if (!new File(fileStore.c, str).createNewFile()) {
                            throw new IOException("Create new file failed.");
                        }
                        SettingsController settingsController2 = settingsController;
                        crashlyticsController2.b(false, settingsController2, false);
                        crashlyticsController2.c(new CLSUUID().f15266a, Boolean.FALSE);
                        return !crashlyticsController2.b.a() ? Tasks.forResult(null) : settingsController2.c().onSuccessTask(crashlyticsController2.e.f15286a, new SuccessContinuation<Settings, Void>(strE) { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public final Task<Void> then(Settings settings) {
                                Settings settings2 = settings;
                                CrashlyticsController crashlyticsController3 = CrashlyticsController.this;
                                if (settings2 != null) {
                                    return Tasks.whenAll((Task<?>[]) new Task[]{CrashlyticsController.a(crashlyticsController3), crashlyticsController3.m.f(null, crashlyticsController3.e.f15286a)});
                                }
                                Logger.f15258a.f(null, "Received null app settings, cannot send reports at crash time.");
                                return Tasks.forResult(null);
                            }
                        });
                    }
                };
                synchronized (crashlyticsWorker.e) {
                    taskContinueWithTask = crashlyticsWorker.f.continueWithTask(crashlyticsWorker.d, new au.com.woolworths.product.details.epoxy.a(callable, 18));
                    crashlyticsWorker.f = taskContinueWithTask;
                }
                try {
                    Utils.a(taskContinueWithTask);
                } catch (TimeoutException unused) {
                    Logger.f15258a.c(null, "Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e) {
                    Logger.f15258a.c(e, "Error handling uncaught exception");
                }
            }
        }
    }

    public CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, com.google.firebase.crashlytics.a aVar, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        new AtomicBoolean(false);
        this.f15270a = context;
        this.f = idManager;
        this.b = dataCollectionArbiter;
        this.g = fileStore;
        this.c = crashlyticsFileMarker;
        this.h = appData;
        this.d = userMetadata;
        this.i = logFileManager;
        this.j = crashlyticsNativeComponentDeferredProxy;
        this.k = aVar;
        this.l = crashlyticsAppQualitySessionsSubscriber;
        this.m = sessionReportingCoordinator;
        this.e = crashlyticsWorkers;
    }

    public static Task a(CrashlyticsController crashlyticsController) throws NumberFormatException, ClassNotFoundException {
        Task taskCall;
        crashlyticsController.getClass();
        Logger logger = Logger.f15258a;
        ArrayList arrayList = new ArrayList();
        for (File file : FileStore.e(crashlyticsController.g.c.listFiles(r))) {
            try {
                final long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    logger.f(null, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    logger.b("Logging app exception event to Firebase Analytics", null);
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
                        @Override // java.util.concurrent.Callable
                        public final Void call() {
                            Bundle bundle = new Bundle();
                            bundle.putInt("fatal", 1);
                            bundle.putLong("timestamp", j);
                            CrashlyticsController.this.k.c(bundle);
                            return null;
                        }
                    });
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                logger.f(null, "Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x043c  */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [int] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r21, com.google.firebase.crashlytics.internal.settings.SettingsController r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.b(boolean, com.google.firebase.crashlytics.internal.settings.SettingsController, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Logger logger = Logger.f15258a;
        logger.b("Opening a new session with ID " + str, null);
        Locale locale = Locale.US;
        IdManager idManager = this.f;
        String str2 = idManager.c;
        AppData appData = this.h;
        StaticSessionData.AppData appDataB = StaticSessionData.AppData.b(str2, appData.f, appData.g, ((AutoValue_InstallIdProvider_InstallIds) idManager.c()).f15263a, (appData.d != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).d, appData.h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        StaticSessionData.OsData osDataA = StaticSessionData.OsData.a(CommonUtils.g());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        CommonUtils.Architecture architecture = CommonUtils.Architecture.d;
        String str5 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str5)) {
            logger.e("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            CommonUtils.Architecture architecture2 = (CommonUtils.Architecture) CommonUtils.Architecture.e.get(str5.toLowerCase(locale));
            if (architecture2 != null) {
                architecture = architecture2;
            }
        }
        int iOrdinal = architecture.ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = CommonUtils.a(this.f15270a);
        boolean zF = CommonUtils.f();
        int iC = CommonUtils.c();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.j.a(str, jCurrentTimeMillis, StaticSessionData.b(appDataB, osDataA, StaticSessionData.DeviceData.c(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (bool.booleanValue() && str != null) {
            this.d.h(str);
        }
        this.i.b(str);
        this.l.d(str);
        SessionReportingCoordinator sessionReportingCoordinator = this.m;
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator.f15281a;
        CrashlyticsReport.Builder builderA = CrashlyticsReport.a();
        builderA.l("20.0.1");
        AppData appData2 = crashlyticsReportDataCapture.c;
        builderA.h(appData2.f15261a);
        IdManager idManager2 = crashlyticsReportDataCapture.b;
        builderA.i(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f15263a);
        builderA.g(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).b);
        builderA.f(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).c);
        String str9 = appData2.f;
        builderA.d(str9);
        String str10 = appData2.g;
        builderA.e(str10);
        builderA.k(4);
        CrashlyticsReport.Session.Builder builderA2 = CrashlyticsReport.Session.a();
        builderA2.l(jCurrentTimeMillis);
        builderA2.j(str);
        builderA2.h(CrashlyticsReportDataCapture.g);
        CrashlyticsReport.Session.Application.Builder builderA3 = CrashlyticsReport.Session.Application.a();
        builderA3.e(idManager2.c);
        builderA3.g(str9);
        builderA3.d(str10);
        builderA3.f(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f15263a);
        DevelopmentPlatformProvider developmentPlatformProvider = appData2.h;
        builderA3.b(developmentPlatformProvider.a());
        builderA3.c(developmentPlatformProvider.b());
        builderA2.b(builderA3.a());
        CrashlyticsReport.Session.OperatingSystem.Builder builderA4 = CrashlyticsReport.Session.OperatingSystem.a();
        builderA4.d(3);
        builderA4.e(str3);
        builderA4.b(str4);
        builderA4.c(CommonUtils.g());
        builderA2.k(builderA4.a());
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str5) && (num = (Integer) CrashlyticsReportDataCapture.f.get(str5.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = CommonUtils.a(crashlyticsReportDataCapture.f15274a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zF2 = CommonUtils.f();
        int iC2 = CommonUtils.c();
        CrashlyticsReport.Session.Device.Builder builderA5 = CrashlyticsReport.Session.Device.a();
        builderA5.b(iIntValue);
        builderA5.f(str6);
        builderA5.c(iAvailableProcessors2);
        builderA5.h(jA2);
        builderA5.d(blockCount2);
        builderA5.i(zF2);
        builderA5.j(iC2);
        builderA5.e(str7);
        builderA5.g(str8);
        builderA2.e(builderA5.a());
        builderA2.i(3);
        builderA.m(builderA2.a());
        CrashlyticsReport crashlyticsReportA = builderA.a();
        FileStore fileStore = sessionReportingCoordinator.b.b;
        CrashlyticsReport.Session sessionM = crashlyticsReportA.m();
        if (sessionM == null) {
            logger.b("Could not get session for report", null);
            return;
        }
        String strI = sessionM.i();
        try {
            CrashlyticsReportPersistence.g.getClass();
            CrashlyticsReportPersistence.f(fileStore.b(strI, "report"), CrashlyticsReportJsonTransform.f15383a.encode(crashlyticsReportA));
            File fileB = fileStore.b(strI, "start-time");
            long jK = sessionM.k();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), CrashlyticsReportPersistence.e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(jK * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            logger.b("Could not persist report for session " + strI, e);
        }
    }

    public final boolean d(SettingsController settingsController) throws Throwable {
        CrashlyticsWorkers.a();
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.n;
        Logger logger = Logger.f15258a;
        if (crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.e.get()) {
            logger.f(null, "Skipping session finalization because a crash has already occurred.");
            return false;
        }
        logger.e("Finalizing previously open sessions.");
        try {
            b(true, settingsController, true);
            logger.e("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            logger.c(e, "Unable to finalize previously open sessions.");
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = this.m.b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws Resources.NotFoundException, IOException {
        InputStream resourceAsStream;
        Context context = this.f15270a;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        Logger logger = Logger.f15258a;
        if (string != null) {
            logger.b("Read version control info from string resource", null);
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            logger.f(null, "Couldn't get Class Loader");
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            logger.d("No version control information found");
            return null;
        }
        try {
            logger.b("Read version control info from file", null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() throws Resources.NotFoundException {
        Logger logger = Logger.f15258a;
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.d.g(strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.f15270a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    logger.c(null, "Attempting to set custom attribute with null key, ignoring.");
                }
                logger.d("Saved version control info");
            }
        } catch (IOException e2) {
            logger.f(e2, "Unable to save version control info");
        }
    }

    public final void h(final Task task) {
        Task task2;
        Task taskA;
        TaskCompletionSource taskCompletionSource = this.o;
        Logger logger = Logger.f15258a;
        FileStore fileStore = this.m.b.b;
        if (FileStore.e(fileStore.e.listFiles()).isEmpty() && FileStore.e(fileStore.f.listFiles()).isEmpty() && FileStore.e(fileStore.g.listFiles()).isEmpty()) {
            logger.e("No crash reports are available to be sent.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        logger.e("Crash reports are available to be sent.");
        DataCollectionArbiter dataCollectionArbiter = this.b;
        if (dataCollectionArbiter.a()) {
            logger.b("Automatic data collection is enabled. Allowing upload.", null);
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            logger.b("Automatic data collection is disabled.", null);
            logger.e("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (dataCollectionArbiter.c) {
                task2 = dataCollectionArbiter.d.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task<Boolean> then(Void r1) {
                    return Tasks.forResult(Boolean.TRUE);
                }
            });
            logger.b("Waiting for send/deleteUnsentReports to be called.", null);
            taskA = CrashlyticsTasks.a(taskOnSuccessTask, this.p.getTask());
        }
        taskA.onSuccessTask(this.e.f15286a, new SuccessContinuation<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task<Void> then(Boolean bool) {
                Boolean bool2 = bool;
                boolean zBooleanValue = bool2.booleanValue();
                Logger logger2 = Logger.f15258a;
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                if (zBooleanValue) {
                    logger2.b("Sending cached crash reports...", null);
                    boolean zBooleanValue2 = bool2.booleanValue();
                    DataCollectionArbiter dataCollectionArbiter2 = crashlyticsController.b;
                    if (!zBooleanValue2) {
                        dataCollectionArbiter2.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    dataCollectionArbiter2.h.trySetResult(null);
                    return task.onSuccessTask(crashlyticsController.e.f15286a, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task<Void> then(Settings settings) throws NumberFormatException, ClassNotFoundException {
                            if (settings == null) {
                                Logger.f15258a.f(null, "Received null app settings at app startup. Cannot send cached reports");
                                return Tasks.forResult(null);
                            }
                            CrashlyticsController crashlyticsController2 = CrashlyticsController.this;
                            CrashlyticsController.a(crashlyticsController2);
                            crashlyticsController2.m.f(null, crashlyticsController2.e.f15286a);
                            crashlyticsController2.q.trySetResult(null);
                            return Tasks.forResult(null);
                        }
                    });
                }
                logger2.e("Deleting cached crash reports...");
                FileStore fileStore2 = crashlyticsController.g;
                Iterator it = FileStore.e(fileStore2.c.listFiles(CrashlyticsController.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                FileStore fileStore3 = crashlyticsController.m.b.b;
                CrashlyticsReportPersistence.a(FileStore.e(fileStore3.e.listFiles()));
                CrashlyticsReportPersistence.a(FileStore.e(fileStore3.f.listFiles()));
                CrashlyticsReportPersistence.a(FileStore.e(fileStore3.g.listFiles()));
                crashlyticsController.q.trySetResult(null);
                return Tasks.forResult(null);
            }
        });
    }
}
