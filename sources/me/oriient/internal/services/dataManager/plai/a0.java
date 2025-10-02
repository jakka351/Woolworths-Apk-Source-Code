package me.oriient.internal.services.dataManager.plai;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25294a;
    public final String b;

    public a0(String floorId, String url) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(url, "url");
        this.f25294a = floorId;
        this.b = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.c(this.f25294a, a0Var.f25294a) && Intrinsics.c(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25294a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaiUrl(floorId=");
        sb.append(this.f25294a);
        sb.append(", url=");
        return me.oriient.internal.infra.rest.e.a(sb, this.b, ')');
    }
}
