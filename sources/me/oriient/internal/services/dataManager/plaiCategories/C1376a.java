package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.CachedDataStatus;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1376a {

    /* renamed from: a, reason: collision with root package name */
    public final List f25339a;
    public final CachedDataStatus b;

    public C1376a(List categories, CachedDataStatus status) {
        Intrinsics.h(categories, "categories");
        Intrinsics.h(status, "status");
        this.f25339a = categories;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1376a)) {
            return false;
        }
        C1376a c1376a = (C1376a) obj;
        return Intrinsics.c(this.f25339a, c1376a.f25339a) && this.b == c1376a.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25339a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoryCacheResult(categories=" + this.f25339a + ", status=" + this.b + ')';
    }
}
