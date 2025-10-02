package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.c;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Deferred.DeferredHandler, BreadcrumbSource, AnalyticsEventLogger, ComponentFactory {
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj) {
        this.d = obj;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.d;
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.d.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.c.a(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        long j;
        IOException iOException;
        FirebaseCrashlytics firebaseCrashlytics;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.d;
        int i = CrashlyticsRegistrar.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class);
        Deferred deferredI = componentContainer.i(CrashlyticsNativeComponent.class);
        Deferred deferredI2 = componentContainer.i(AnalyticsConnector.class);
        Deferred deferredI3 = componentContainer.i(FirebaseRemoteConfigInterop.class);
        ExecutorService executorService = (ExecutorService) componentContainer.h(crashlyticsRegistrar.f15249a);
        ExecutorService executorService2 = (ExecutorService) componentContainer.h(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) componentContainer.h(crashlyticsRegistrar.c);
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        String packageName = context.getPackageName();
        Logger logger = Logger.f15258a;
        logger.d("Initializing Firebase Crashlytics 20.0.1 for " + packageName);
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(context);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(context, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferredI);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferredI2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.d(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, new a(analyticsDeferredProxy), new a(analyticsDeferredProxy), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferredI3), crashlyticsWorkers);
        firebaseApp.a();
        String str = firebaseApp.c.b;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", "string");
        }
        String string = iD != 0 ? context.getResources().getString(iD) : null;
        ArrayList arrayList = new ArrayList();
        int iD2 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD3 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD4 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iD2 == 0 || iD3 == 0 || iD4 == 0) {
            j = jCurrentTimeMillis;
            iOException = null;
            logger.b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4)), null);
        } else {
            String[] stringArray = context.getResources().getStringArray(iD2);
            String[] stringArray2 = context.getResources().getStringArray(iD3);
            String[] stringArray3 = context.getResources().getStringArray(iD4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i2 = 0;
                while (i2 < stringArray3.length) {
                    int i3 = i2;
                    arrayList.add(new BuildIdInfo(stringArray[i3], stringArray2[i3], stringArray3[i3]));
                    i2 = i3 + 1;
                    jCurrentTimeMillis = jCurrentTimeMillis;
                }
                j = jCurrentTimeMillis;
                iOException = null;
            } else {
                j = jCurrentTimeMillis;
                iOException = null;
                logger.b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)), null);
            }
        }
        logger.b("Mapping file ID is: " + string, iOException);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BuildIdInfo buildIdInfo = (BuildIdInfo) it.next();
            String strC = buildIdInfo.c();
            String strA = buildIdInfo.a();
            String strB = buildIdInfo.b();
            StringBuilder sbV = YU.a.v("Build id for ", strC, " on ", strA, ": ");
            sbV.append(strB);
            logger.b(sbV.toString(), null);
        }
        DevelopmentPlatformProvider developmentPlatformProvider = new DevelopmentPlatformProvider(context);
        try {
            String packageName2 = context.getPackageName();
            String strD = idManager.d();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
            String string2 = Long.toString(packageInfo.getLongVersionCode());
            String str2 = packageInfo.versionName;
            if (str2 == null) {
                str2 = "0.0";
            }
            String str3 = str2;
            AppData appData = new AppData(str, string, arrayList, strD, packageName2, string2, str3, developmentPlatformProvider);
            logger.e("Installer package name is: " + strD);
            SettingsController settingsControllerA = SettingsController.a(context, str, idManager, new HttpRequestFactory(), string2, str3, fileStore, dataCollectionArbiter);
            settingsControllerA.e(crashlyticsWorkers).addOnFailureListener(executorService3, new androidx.compose.ui.graphics.colorspace.a(20));
            if (crashlyticsCore.d(appData, settingsControllerA)) {
                crashlyticsCore.o.f15286a.a(new c(2, crashlyticsCore, settingsControllerA));
            }
            firebaseCrashlytics = new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            logger.c(e, "Error retrieving app package info.");
            firebaseCrashlytics = null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis2 > 16) {
            logger.b(b.l(jCurrentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms"), null);
        }
        return firebaseCrashlytics;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void c(Bundle bundle) {
        ((AnalyticsDeferredProxy) this.d).b.c(bundle);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void f(Provider provider) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.d;
        Logger logger = Logger.f15258a;
        logger.b("AnalyticsConnector now available.", null);
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleC = analyticsConnector.c("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleC == null) {
            logger.b("Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            analyticsConnectorHandleC = analyticsConnector.c(AppMeasurement.CRASH_ORIGIN, crashlyticsAnalyticsListener);
            if (analyticsConnectorHandleC != null) {
                logger.f(null, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (analyticsConnectorHandleC == null) {
            logger.f(null, "Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        logger.b("Registered Firebase Analytics listener.", null);
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger);
        synchronized (analyticsDeferredProxy) {
            try {
                Iterator it = analyticsDeferredProxy.d.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.a((BreadcrumbHandler) it.next());
                }
                crashlyticsAnalyticsListener.b = breadcrumbAnalyticsEventReceiver;
                crashlyticsAnalyticsListener.f15248a = blockingAnalyticsEventLogger;
                analyticsDeferredProxy.c = breadcrumbAnalyticsEventReceiver;
                analyticsDeferredProxy.b = blockingAnalyticsEventLogger;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
