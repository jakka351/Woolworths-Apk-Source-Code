package com.google.firebase.crashlytics.internal.model;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final CrashlyticsReport.Session k;
    public final CrashlyticsReport.FilesPayload l;
    public final CrashlyticsReport.ApplicationExitInfo m;

    public static final class Builder extends CrashlyticsReport.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15329a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public CrashlyticsReport.Session j;
        public CrashlyticsReport.FilesPayload k;
        public CrashlyticsReport.ApplicationExitInfo l;
        public byte m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport a() {
            if (this.m == 1 && this.f15329a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
                return new AutoValue_CrashlyticsReport(this.f15329a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15329a == null) {
                sb.append(" sdkVersion");
            }
            if (this.b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                sb.append(" platform");
            }
            if (this.d == null) {
                sb.append(" installationUuid");
            }
            if (this.h == null) {
                sb.append(" buildVersion");
            }
            if (this.i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.l = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder c(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder f(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder g(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder j(CrashlyticsReport.FilesPayload filesPayload) {
            this.k = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder k(int i) {
            this.c = i;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f15329a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder m(CrashlyticsReport.Session session) {
            this.j = session;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = session;
        this.l = filesPayload;
        this.m = applicationExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.ApplicationExitInfo b() {
        return this.m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String c() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String d() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (!this.b.equals(crashlyticsReport.l()) || !this.c.equals(crashlyticsReport.h()) || this.d != crashlyticsReport.k() || !this.e.equals(crashlyticsReport.i())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (crashlyticsReport.g() != null) {
                return false;
            }
        } else if (!str.equals(crashlyticsReport.g())) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (crashlyticsReport.f() != null) {
                return false;
            }
        } else if (!str2.equals(crashlyticsReport.f())) {
            return false;
        }
        String str3 = this.h;
        if (str3 == null) {
            if (crashlyticsReport.c() != null) {
                return false;
            }
        } else if (!str3.equals(crashlyticsReport.c())) {
            return false;
        }
        if (!this.i.equals(crashlyticsReport.d()) || !this.j.equals(crashlyticsReport.e())) {
            return false;
        }
        CrashlyticsReport.Session session = this.k;
        if (session == null) {
            if (crashlyticsReport.m() != null) {
                return false;
            }
        } else if (!session.equals(crashlyticsReport.m())) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = this.l;
        if (filesPayload == null) {
            if (crashlyticsReport.j() != null) {
                return false;
            }
        } else if (!filesPayload.equals(crashlyticsReport.j())) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.m;
        return applicationExitInfo == null ? crashlyticsReport.b() == null : applicationExitInfo.equals(crashlyticsReport.b());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String f() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String g() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.k;
        int iHashCode5 = (iHashCode4 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.l;
        int iHashCode6 = (iHashCode5 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.m;
        return iHashCode6 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String i() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.FilesPayload j() {
        return this.l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int k() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String l() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Session m() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Builder n() {
        Builder builder = new Builder();
        builder.f15329a = l();
        builder.b = h();
        builder.c = k();
        builder.d = i();
        builder.e = g();
        builder.f = f();
        builder.g = c();
        builder.h = d();
        builder.i = e();
        builder.j = m();
        builder.k = j();
        builder.l = b();
        builder.m = (byte) 1;
        return builder;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
