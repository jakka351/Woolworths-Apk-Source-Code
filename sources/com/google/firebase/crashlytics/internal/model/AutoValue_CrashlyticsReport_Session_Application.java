package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* renamed from: a, reason: collision with root package name */
    public final String f15342a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15343a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application a() {
            String str;
            String str2 = this.f15343a;
            if (str2 != null && (str = this.b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Application(str2, str, this.c, this.d, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15343a == null) {
                sb.append(" identifier");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder b(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder c(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f15343a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f15342a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String b() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String c() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String d() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String e() {
        return this.f15342a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (!this.f15342a.equals(application.e()) || !this.b.equals(application.h())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (application.d() != null) {
                return false;
            }
        } else if (!str.equals(application.d())) {
            return false;
        }
        if (application.g() != null) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (application.f() != null) {
                return false;
            }
        } else if (!str2.equals(application.f())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (application.b() != null) {
                return false;
            }
        } else if (!str3.equals(application.b())) {
            return false;
        }
        String str4 = this.f;
        return str4 == null ? application.c() == null : str4.equals(application.c());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String f() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final CrashlyticsReport.Session.Application.Organization g() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15342a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f15342a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        return a.o(sb, this.f, "}");
    }
}
