package com.google.android.datatransport;

import au.com.woolworths.android.onesite.a;

/* loaded from: classes2.dex */
final class AutoValue_ProductData extends ProductData {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f14387a;

    public AutoValue_ProductData(Integer num) {
        this.f14387a = num;
    }

    @Override // com.google.android.datatransport.ProductData
    public final Integer a() {
        return this.f14387a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProductData) {
            return this.f14387a.equals(((ProductData) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f14387a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return a.p(new StringBuilder("ProductData{productId="), this.f14387a, "}");
    }
}
