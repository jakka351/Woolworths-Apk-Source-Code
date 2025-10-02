package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Utils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes.dex */
public class FirebasePerformance implements FirebasePerformanceAttributable {
    public static final AndroidLogger h = AndroidLogger.e();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Provider e;
    public final FirebaseInstallationsApi f;
    public final Provider g;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface HttpMethod {
    }

    public FirebasePerformance(FirebaseApp firebaseApp, Provider provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        Bundle bundle;
        this.e = provider;
        this.f = firebaseInstallationsApi;
        this.g = provider2;
        if (firebaseApp == null) {
            new ImmutableBundle(new Bundle());
            return;
        }
        FirebaseOptions firebaseOptions = firebaseApp.c;
        TransportManager transportManager = TransportManager.v;
        transportManager.g = firebaseApp;
        firebaseApp.a();
        transportManager.s = firebaseOptions.g;
        transportManager.i = firebaseInstallationsApi;
        transportManager.j = provider2;
        transportManager.l.execute(new com.google.firebase.perf.transport.a(transportManager, 1));
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        ImmutableBundle immutableBundle = bundle != null ? new ImmutableBundle(bundle) : new ImmutableBundle();
        remoteConfigManager.setFirebaseRemoteConfigProvider(provider);
        configResolver.b = immutableBundle;
        ConfigResolver.d.b = Utils.a(context);
        configResolver.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = configResolver.g();
        AndroidLogger androidLogger = h;
        if (androidLogger.b) {
            if (boolG != null ? boolG.booleanValue() : FirebaseApp.d().j()) {
                firebaseApp.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(ConsoleUrlGenerator.a(firebaseOptions.g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (androidLogger.b) {
                    androidLogger.f15702a.getClass();
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
