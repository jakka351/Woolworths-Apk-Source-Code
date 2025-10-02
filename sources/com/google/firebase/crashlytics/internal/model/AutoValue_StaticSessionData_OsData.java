package com.google.firebase.crashlytics.internal.model;

import YU.a;
import android.os.Build;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15381a;

    public AutoValue_StaticSessionData_OsData(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f15381a = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final boolean b() {
        return this.f15381a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final String c() {
        return Build.VERSION.CODENAME;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final String d() {
        return Build.VERSION.RELEASE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        return Build.VERSION.RELEASE.equals(osData.d()) && Build.VERSION.CODENAME.equals(osData.c()) && this.f15381a == osData.b();
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f15381a ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", osCodeName=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", isRooted=");
        return a.k("}", sb, this.f15381a);
    }
}
