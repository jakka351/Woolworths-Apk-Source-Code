package me.oriient.internal.services.dataManager;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25090a;
    public long b;
    public final long c;

    public a0(Object obj, long j, long j2) {
        this.f25090a = obj;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.c(this.f25090a, a0Var.f25090a) && this.b == a0Var.b && this.c == a0Var.c;
    }

    public final int hashCode() {
        Object obj = this.f25090a;
        return Long.hashCode(this.c) + me.oriient.internal.infra.locationManager.K.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheItem(data=");
        sb.append(this.f25090a);
        sb.append(", lastUsageTimestampMillis=");
        sb.append(this.b);
        sb.append(", lastSavingTimestampMillis=");
        return androidx.camera.core.impl.b.q(sb, this.c, ')');
    }
}
