package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes.dex */
public class DataCollectionArbiter {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15276a;
    public final FirebaseApp b;
    public final Object c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final TaskCompletionSource h;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.c = obj;
        this.d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource();
        firebaseApp.a();
        Context context = firebaseApp.f15169a;
        this.b = firebaseApp;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f15276a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                Logger.f15258a.c(e, "Could not read data collection permission from manifest");
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f = false;
                boolValueOf = null;
            } else {
                this.f = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.g = boolValueOf;
        synchronized (obj) {
            try {
                if (a()) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zJ;
        Boolean bool = this.g;
        if (bool != null) {
            zJ = bool.booleanValue();
        } else {
            try {
                zJ = this.b.j();
            } catch (IllegalStateException unused) {
                zJ = false;
            }
        }
        Logger.f15258a.b(YU.a.j("Crashlytics automatic data collection ", zJ ? "ENABLED" : "DISABLED", " by ", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API", "."), null);
        return zJ;
    }
}
