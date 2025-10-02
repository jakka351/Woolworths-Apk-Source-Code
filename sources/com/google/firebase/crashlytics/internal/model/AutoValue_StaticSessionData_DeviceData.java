package com.google.firebase.crashlytics.internal.model;

import YU.a;
import android.os.Build;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* renamed from: a, reason: collision with root package name */
    public final int f15380a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public AutoValue_StaticSessionData_DeviceData(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f15380a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int a() {
        return this.f15380a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        return this.f15380a == deviceData.a() && Build.MODEL.equals(deviceData.g()) && this.b == deviceData.b() && this.c == deviceData.j() && this.d == deviceData.d() && this.e == deviceData.e() && this.f == deviceData.i() && Build.MANUFACTURER.equals(deviceData.f()) && Build.PRODUCT.equals(deviceData.h());
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String f() {
        return Build.MANUFACTURER;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String g() {
        return Build.MODEL;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String h() {
        return Build.PRODUCT;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f15380a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.b) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int i() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long j() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f15380a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.b);
        sb.append(", totalRam=");
        sb.append(this.c);
        sb.append(", diskSpace=");
        sb.append(this.d);
        sb.append(", isEmulator=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return a.o(sb, Build.PRODUCT, "}");
    }
}
