package me.oriient.internal.services.remoteLog.models;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.K;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f25540a;
    public final long b;
    public int c;
    public final long d;
    public boolean e;

    public b(long j) {
        String strH = androidx.constraintlayout.core.state.a.h("toString(...)");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f25540a = strH;
        this.b = jCurrentTimeMillis;
        this.c = 0;
        this.d = j;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f25540a, bVar.f25540a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + K.a(this.d, me.oriient.internal.services.config.a.a(this.c, K.a(this.b, this.f25540a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchData(id=");
        sb.append((Object) c.a(this.f25540a));
        sb.append(", timeStarted=");
        sb.append(this.b);
        sb.append(", currentSize=");
        sb.append(this.c);
        sb.append(", timeToSendThisBatch=");
        sb.append(this.d);
        sb.append(", inDb=");
        return androidx.camera.core.impl.b.s(sb, this.e, ')');
    }
}
