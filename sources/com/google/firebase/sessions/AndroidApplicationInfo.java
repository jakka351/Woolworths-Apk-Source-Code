package com.google.firebase.sessions;

import android.os.Build;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AndroidApplicationInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f15784a;
    public final String b;
    public final String c;
    public final ProcessDetails d;
    public final ArrayList e;

    public AndroidApplicationInfo(String str, String versionName, String appBuildVersion, ProcessDetails processDetails, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        Intrinsics.h(versionName, "versionName");
        Intrinsics.h(appBuildVersion, "appBuildVersion");
        Intrinsics.h(deviceManufacturer, "deviceManufacturer");
        this.f15784a = str;
        this.b = versionName;
        this.c = appBuildVersion;
        this.d = processDetails;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        if (!this.f15784a.equals(androidApplicationInfo.f15784a) || !Intrinsics.c(this.b, androidApplicationInfo.b) || !Intrinsics.c(this.c, androidApplicationInfo.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.c(str, str) && this.d.equals(androidApplicationInfo.d) && this.e.equals(androidApplicationInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f15784a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f15784a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
