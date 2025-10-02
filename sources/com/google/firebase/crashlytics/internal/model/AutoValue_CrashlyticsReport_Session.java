package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* renamed from: a, reason: collision with root package name */
    public final String f15340a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final CrashlyticsReport.Session.Application g;
    public final CrashlyticsReport.Session.User h;
    public final CrashlyticsReport.Session.OperatingSystem i;
    public final CrashlyticsReport.Session.Device j;
    public final List k;
    public final int l;

    public static final class Builder extends CrashlyticsReport.Session.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15341a;
        public String b;
        public String c;
        public long d;
        public Long e;
        public boolean f;
        public CrashlyticsReport.Session.Application g;
        public CrashlyticsReport.Session.User h;
        public CrashlyticsReport.Session.OperatingSystem i;
        public CrashlyticsReport.Session.Device j;
        public List k;
        public int l;
        public byte m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session a() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.m == 7 && (str = this.f15341a) != null && (str2 = this.b) != null && (application = this.g) != null) {
                return new AutoValue_CrashlyticsReport_Session(str, str2, this.c, this.d, this.e, this.f, application, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15341a == null) {
                sb.append(" generator");
            }
            if (this.b == null) {
                sb.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.g == null) {
                sb.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder b(CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.g = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder c(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder d(boolean z) {
            this.f = z;
            this.m = (byte) (this.m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder e(CrashlyticsReport.Session.Device device) {
            this.j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder f(Long l) {
            this.e = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder g(List list) {
            this.k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f15341a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder i(int i) {
            this.l = i;
            this.m = (byte) (this.m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder k(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder l(long j) {
            this.d = j;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder m(CrashlyticsReport.Session.User user) {
            this.h = user;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List list, int i) {
        this.f15340a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = application;
        this.h = user;
        this.i = operatingSystem;
        this.j = device;
        this.k = list;
        this.l = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Application b() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Device d() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.f15340a.equals(session.g()) || !this.b.equals(session.i())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (session.c() != null) {
                return false;
            }
        } else if (!str.equals(session.c())) {
            return false;
        }
        if (this.d != session.k()) {
            return false;
        }
        Long l = this.e;
        if (l == null) {
            if (session.e() != null) {
                return false;
            }
        } else if (!l.equals(session.e())) {
            return false;
        }
        if (this.f != session.m() || !this.g.equals(session.b())) {
            return false;
        }
        CrashlyticsReport.Session.User user = this.h;
        if (user == null) {
            if (session.l() != null) {
                return false;
            }
        } else if (!user.equals(session.l())) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.i;
        if (operatingSystem == null) {
            if (session.j() != null) {
                return false;
            }
        } else if (!operatingSystem.equals(session.j())) {
            return false;
        }
        CrashlyticsReport.Session.Device device = this.j;
        if (device == null) {
            if (session.d() != null) {
                return false;
            }
        } else if (!device.equals(session.d())) {
            return false;
        }
        List list = this.k;
        if (list == null) {
            if (session.f() != null) {
                return false;
            }
        } else if (!list.equals(session.f())) {
            return false;
        }
        return this.l == session.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final List f() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String g() {
        return this.f15340a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final int h() {
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15340a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.h;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.i;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.j;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String i() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.OperatingSystem j() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final long k() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.User l() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final boolean m() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Builder n() {
        Builder builder = new Builder();
        builder.f15341a = g();
        builder.b = i();
        builder.c = c();
        builder.d = k();
        builder.e = e();
        builder.f = m();
        builder.g = b();
        builder.h = l();
        builder.i = j();
        builder.j = d();
        builder.k = f();
        builder.l = h();
        builder.m = (byte) 7;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f15340a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return a.m(sb, this.l, "}");
    }
}
