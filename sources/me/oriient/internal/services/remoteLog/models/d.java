package me.oriient.internal.services.remoteLog.models;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f25542a;
    public final byte[] b;
    public final String c;

    public d(long j, byte[] data, String batchId) {
        Intrinsics.h(data, "data");
        Intrinsics.h(batchId, "batchId");
        this.f25542a = j;
        this.b = data;
        this.c = batchId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f25542a == dVar.f25542a && Intrinsics.c(this.b, dVar.b) && Intrinsics.c(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.compose.ui.input.pointer.a.d(Long.hashCode(this.f25542a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Message(timeReceivedMilli=" + this.f25542a + ", data=" + Arrays.toString(this.b) + ", batchId=" + ((Object) c.a(this.c)) + ')';
    }
}
