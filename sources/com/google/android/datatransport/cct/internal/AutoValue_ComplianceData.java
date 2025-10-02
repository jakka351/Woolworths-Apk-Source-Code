package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;

/* loaded from: classes.dex */
final class AutoValue_ComplianceData extends ComplianceData {

    /* renamed from: a, reason: collision with root package name */
    public final ExternalPrivacyContext f14410a;
    public final ComplianceData.ProductIdOrigin b;

    /* loaded from: classes2.dex */
    public static final class Builder extends ComplianceData.Builder {

        /* renamed from: a, reason: collision with root package name */
        public ExternalPrivacyContext f14411a;
        public ComplianceData.ProductIdOrigin b;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData a() {
            return new AutoValue_ComplianceData(this.f14411a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData.Builder b(ExternalPrivacyContext externalPrivacyContext) {
            this.f14411a = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final ComplianceData.Builder c() {
            this.b = ComplianceData.ProductIdOrigin.d;
            return this;
        }
    }

    public AutoValue_ComplianceData(ExternalPrivacyContext externalPrivacyContext, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.f14410a = externalPrivacyContext;
        this.b = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ExternalPrivacyContext b() {
        return this.f14410a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ComplianceData.ProductIdOrigin c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        ExternalPrivacyContext externalPrivacyContext = this.f14410a;
        if (externalPrivacyContext == null) {
            if (complianceData.b() != null) {
                return false;
            }
        } else if (!externalPrivacyContext.equals(complianceData.b())) {
            return false;
        }
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return productIdOrigin == null ? complianceData.c() == null : productIdOrigin.equals(complianceData.c());
    }

    public final int hashCode() {
        ExternalPrivacyContext externalPrivacyContext = this.f14410a;
        int iHashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return (productIdOrigin != null ? productIdOrigin.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f14410a + ", productIdOrigin=" + this.b + "}";
    }
}
