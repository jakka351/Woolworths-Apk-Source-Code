package me.oriient.internal.services.dataManager.plai;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plai.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1365o {

    /* renamed from: a, reason: collision with root package name */
    public final List f25307a;
    public final CachedDataStatus b;

    public C1365o(List products, CachedDataStatus status) {
        Intrinsics.h(products, "products");
        Intrinsics.h(status, "status");
        this.f25307a = products;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1365o)) {
            return false;
        }
        C1365o c1365o = (C1365o) obj;
        return Intrinsics.c(this.f25307a, c1365o.f25307a) && this.b == c1365o.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25307a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductCacheResult(products=" + this.f25307a + ", status=" + this.b + ')';
    }
}
