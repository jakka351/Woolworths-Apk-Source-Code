package com.google.android.datatransport.cct.internal;

import au.com.woolworths.android.onesite.a;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

/* loaded from: classes.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f14414a;

    /* loaded from: classes2.dex */
    public static final class Builder extends ExternalPRequestContext.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Integer f14415a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final ExternalPRequestContext a() {
            return new AutoValue_ExternalPRequestContext(this.f14415a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final ExternalPRequestContext.Builder b(Integer num) {
            this.f14415a = num;
            return this;
        }
    }

    public AutoValue_ExternalPRequestContext(Integer num) {
        this.f14414a = num;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public final Integer b() {
        return this.f14414a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.f14414a;
        Integer numB = ((ExternalPRequestContext) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    public final int hashCode() {
        Integer num = this.f14414a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return a.p(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.f14414a, "}");
    }
}
