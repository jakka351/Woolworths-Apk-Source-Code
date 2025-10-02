package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* renamed from: a, reason: collision with root package name */
    public final String f15379a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final DevelopmentPlatformProvider f;

    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f15379a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        this.f = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String a() {
        return this.f15379a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final int c() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final DevelopmentPlatformProvider d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        return this.f15379a.equals(appData.a()) && this.b.equals(appData.f()) && this.c.equals(appData.g()) && this.d.equals(appData.e()) && this.e == appData.c() && this.f.equals(appData.d());
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.f15379a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f15379a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
