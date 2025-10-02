package me.oriient.internal.services.remoteLog.models;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.K;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25539a;
    public final String b;
    public final long c;
    public int d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public a(String id, String url, long j, int i, long j2, boolean z, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(url, "url");
        this.f25539a = id;
        this.b = url;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f25539a, aVar.f25539a) && Intrinsics.c(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + me.oriient.internal.infra.scheduler.a.a(this.f, K.a(this.e, me.oriient.internal.services.config.a.a(this.d, K.a(this.c, me.oriient.internal.infra.rest.a.a(this.b, this.f25539a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchConfig(id=");
        sb.append((Object) c.a(this.f25539a));
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", timeStartedSystemMilli=");
        sb.append(this.c);
        sb.append(", retries=");
        sb.append(this.d);
        sb.append(", timeToSendSystemMilli=");
        sb.append(this.e);
        sb.append(", requireCharger=");
        sb.append(this.f);
        sb.append(", allowMeteredNetworks=");
        return androidx.camera.core.impl.b.s(sb, this.g, ')');
    }
}
