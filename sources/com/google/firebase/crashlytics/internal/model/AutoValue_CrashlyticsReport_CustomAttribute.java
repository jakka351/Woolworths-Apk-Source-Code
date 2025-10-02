package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final String f15334a;
    public final String b;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15335a;
        public String b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute a() {
            String str;
            String str2 = this.f15335a;
            if (str2 != null && (str = this.b) != null) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15335a == null) {
                sb.append(" key");
            }
            if (this.b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f15335a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f15334a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String b() {
        return this.f15334a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        return this.f15334a.equals(customAttribute.b()) && this.b.equals(customAttribute.c());
    }

    public final int hashCode() {
        return ((this.f15334a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f15334a);
        sb.append(", value=");
        return a.o(sb, this.b, "}");
    }
}
