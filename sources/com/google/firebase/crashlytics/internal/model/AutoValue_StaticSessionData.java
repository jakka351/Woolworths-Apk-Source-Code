package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {

    /* renamed from: a, reason: collision with root package name */
    public final StaticSessionData.AppData f15378a;
    public final StaticSessionData.OsData b;
    public final StaticSessionData.DeviceData c;

    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        this.f15378a = appData;
        this.b = osData;
        this.c = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.AppData a() {
        return this.f15378a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.DeviceData c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.OsData d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        return this.f15378a.equals(staticSessionData.a()) && this.b.equals(staticSessionData.d()) && this.c.equals(staticSessionData.c());
    }

    public final int hashCode() {
        return ((((this.f15378a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f15378a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
