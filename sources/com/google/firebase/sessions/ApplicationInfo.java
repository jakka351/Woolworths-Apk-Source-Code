package com.google.firebase.sessions;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ApplicationInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f15785a;
    public final AndroidApplicationInfo b;

    public ApplicationInfo(String appId, AndroidApplicationInfo androidApplicationInfo) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        LogEnvironment logEnvironment = LogEnvironment.e;
        Intrinsics.h(appId, "appId");
        Intrinsics.h(deviceModel, "deviceModel");
        Intrinsics.h(osVersion, "osVersion");
        this.f15785a = appId;
        this.b = androidApplicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        if (!Intrinsics.c(this.f15785a, applicationInfo.f15785a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.c(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!Intrinsics.c(str2, str2)) {
            return false;
        }
        LogEnvironment logEnvironment = LogEnvironment.e;
        return this.b.equals(applicationInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((LogEnvironment.e.hashCode() + androidx.camera.core.impl.b.c((((Build.MODEL.hashCode() + (this.f15785a.hashCode() * 31)) * 31) + 48517560) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f15785a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.1, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + LogEnvironment.e + ", androidAppInfo=" + this.b + ')';
    }
}
