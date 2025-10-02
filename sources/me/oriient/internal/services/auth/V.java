package me.oriient.internal.services.auth;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final W f25021a;
    public final W b;

    public V(W jwt, W rawRefreshToken) {
        Intrinsics.h(jwt, "jwt");
        Intrinsics.h(rawRefreshToken, "rawRefreshToken");
        this.f25021a = jwt;
        this.b = rawRefreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v = (V) obj;
        return Intrinsics.c(this.f25021a, v.f25021a) && Intrinsics.c(this.b, v.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25021a.hashCode() * 31);
    }

    public final String toString() {
        return "JwtInfo(jwt=" + this.f25021a + ", rawRefreshToken=" + this.b + ')';
    }
}
