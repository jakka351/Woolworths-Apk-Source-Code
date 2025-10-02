package me.oriient.internal.services.remoteLog;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class h extends SendingSchedule {

    /* renamed from: a, reason: collision with root package name */
    public final long f25538a;
    public final TimeUnit b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j, TimeUnit units) {
        super(null);
        Intrinsics.h(units, "units");
        this.f25538a = j;
        this.b = units;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25538a == hVar.f25538a && this.b == hVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f25538a) * 31);
    }

    public final String toString() {
        return "Interval(interval=" + this.f25538a + ", units=" + this.b + ')';
    }
}
