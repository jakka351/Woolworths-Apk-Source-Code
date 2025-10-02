package me.oriient.internal.services.auth;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final String f25022a;
    public final long b;

    public W(String value, long j) {
        Intrinsics.h(value, "value");
        this.f25022a = value;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w = (W) obj;
        return Intrinsics.c(this.f25022a, w.f25022a) && this.b == w.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f25022a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Token(value=");
        sb.append(this.f25022a);
        sb.append(", expiresAtMillis=");
        return androidx.camera.core.impl.b.q(sb, this.b, ')');
    }
}
