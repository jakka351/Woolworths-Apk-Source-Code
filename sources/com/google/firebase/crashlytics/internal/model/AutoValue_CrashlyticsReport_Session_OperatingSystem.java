package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* renamed from: a, reason: collision with root package name */
    public final int f15374a;
    public final String b;
    public final String c;
    public final boolean d;

    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15375a;
        public String b;
        public String c;
        public boolean d;
        public byte e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem a() {
            String str;
            String str2;
            if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(str, this.f15375a, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            if (this.c == null) {
                sb.append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder c(boolean z) {
            this.d = z;
            this.e = (byte) (this.e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder d(int i) {
            this.f15375a = i;
            this.e = (byte) (this.e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(String str, int i, String str2, boolean z) {
        this.f15374a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final int c() {
        return this.f15374a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        return this.f15374a == operatingSystem.c() && this.b.equals(operatingSystem.d()) && this.c.equals(operatingSystem.b()) && this.d == operatingSystem.e();
    }

    public final int hashCode() {
        return ((((((this.f15374a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f15374a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return a.k("}", sb, this.d);
    }
}
