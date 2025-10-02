package com.google.firebase.crashlytics.internal.model;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f15330a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15331a;
        public String b;
        public int c;
        public int d;
        public long e;
        public long f;
        public long g;
        public String h;
        public List i;
        public byte j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo a() {
            String str;
            if (this.j == 63 && (str = this.b) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f15331a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder b(List list) {
            this.i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder c(int i) {
            this.d = i;
            this.j = (byte) (this.j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder d(int i) {
            this.f15331a = i;
            this.j = (byte) (this.j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder f(long j) {
            this.e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder g(int i) {
            this.c = i;
            this.j = (byte) (this.j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder h(long j) {
            this.f = j;
            this.j = (byte) (this.j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder i(long j) {
            this.g = j;
            this.j = (byte) (this.j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder j(String str) {
            this.h = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f15330a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final List b() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int d() {
        return this.f15330a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f15330a != applicationExitInfo.d() || !this.b.equals(applicationExitInfo.e()) || this.c != applicationExitInfo.g() || this.d != applicationExitInfo.c() || this.e != applicationExitInfo.f() || this.f != applicationExitInfo.h() || this.g != applicationExitInfo.i()) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (applicationExitInfo.j() != null) {
                return false;
            }
        } else if (!str.equals(applicationExitInfo.j())) {
            return false;
        }
        List list = this.i;
        return list == null ? applicationExitInfo.b() == null : list.equals(applicationExitInfo.b());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int g() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15330a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String j() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.f15330a);
        sb.append(", processName=");
        sb.append(this.b);
        sb.append(", reasonCode=");
        sb.append(this.c);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append(", pss=");
        sb.append(this.e);
        sb.append(", rss=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append(", traceFile=");
        sb.append(this.h);
        sb.append(", buildIdMappingForArch=");
        return a.t(sb, this.i, "}");
    }
}
