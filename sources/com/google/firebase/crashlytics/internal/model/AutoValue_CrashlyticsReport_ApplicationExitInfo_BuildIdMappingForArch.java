package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* renamed from: a, reason: collision with root package name */
    public final String f15332a;
    public final String b;
    public final String c;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15333a;
        public String b;
        public String c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch a() {
            String str;
            String str2;
            String str3 = this.f15333a;
            if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15333a == null) {
                sb.append(" arch");
            }
            if (this.b == null) {
                sb.append(" libraryName");
            }
            if (this.c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f15333a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.f15332a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String b() {
        return this.f15332a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        return this.f15332a.equals(buildIdMappingForArch.b()) && this.b.equals(buildIdMappingForArch.d()) && this.c.equals(buildIdMappingForArch.c());
    }

    public final int hashCode() {
        return ((((this.f15332a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f15332a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return a.o(sb, this.c, "}");
    }
}
