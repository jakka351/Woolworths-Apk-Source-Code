package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

/* loaded from: classes.dex */
final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {

    /* renamed from: a, reason: collision with root package name */
    public final ExternalPRequestContext f14416a;

    /* loaded from: classes2.dex */
    public static final class Builder extends ExternalPrivacyContext.Builder {

        /* renamed from: a, reason: collision with root package name */
        public ExternalPRequestContext f14417a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final ExternalPrivacyContext a() {
            return new AutoValue_ExternalPrivacyContext(this.f14417a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final ExternalPrivacyContext.Builder b(ExternalPRequestContext externalPRequestContext) {
            this.f14417a = externalPRequestContext;
            return this;
        }
    }

    public AutoValue_ExternalPrivacyContext(ExternalPRequestContext externalPRequestContext) {
        this.f14416a = externalPRequestContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public final ExternalPRequestContext b() {
        return this.f14416a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = this.f14416a;
        ExternalPRequestContext externalPRequestContextB = ((ExternalPrivacyContext) obj).b();
        return externalPRequestContext == null ? externalPRequestContextB == null : externalPRequestContext.equals(externalPRequestContextB);
    }

    public final int hashCode() {
        ExternalPRequestContext externalPRequestContext = this.f14416a;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f14416a + "}";
    }
}
