package com.google.android.datatransport.cct.internal;

import YU.a;
import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

/* loaded from: classes.dex */
final class AutoValue_LogEvent extends LogEvent {

    /* renamed from: a, reason: collision with root package name */
    public final long f14418a;
    public final Integer b;
    public final ComplianceData c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final NetworkConnectionInfo h;
    public final ExperimentIds i;

    public static final class Builder extends LogEvent.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Long f14419a;
        public Integer b;
        public ComplianceData c;
        public Long d;
        public byte[] e;
        public String f;
        public Long g;
        public NetworkConnectionInfo h;
        public ExperimentIds i;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent a() {
            String strG = this.f14419a == null ? " eventTimeMs" : "";
            if (this.d == null) {
                strG = strG.concat(" eventUptimeMs");
            }
            if (this.g == null) {
                strG = a.g(strG, " timezoneOffsetSeconds");
            }
            if (strG.isEmpty()) {
                return new AutoValue_LogEvent(this.f14419a.longValue(), this.b, this.c, this.d.longValue(), this.e, this.f, this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder b(ComplianceData complianceData) {
            this.c = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder c(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder d(long j) {
            this.f14419a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder f(ExperimentIds experimentIds) {
            this.i = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder g(NetworkConnectionInfo networkConnectionInfo) {
            this.h = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder h(long j) {
            this.g = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_LogEvent(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.f14418a = j;
        this.b = num;
        this.c = complianceData;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = networkConnectionInfo;
        this.i = experimentIds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ComplianceData a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final Integer b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long c() {
        return this.f14418a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ExperimentIds e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f14418a != logEvent.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (logEvent.b() != null) {
                return false;
            }
        } else if (!num.equals(logEvent.b())) {
            return false;
        }
        ComplianceData complianceData = this.c;
        if (complianceData == null) {
            if (logEvent.a() != null) {
                return false;
            }
        } else if (!complianceData.equals(logEvent.a())) {
            return false;
        }
        if (this.d != logEvent.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).e : logEvent.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (logEvent.h() != null) {
                return false;
            }
        } else if (!str.equals(logEvent.h())) {
            return false;
        }
        if (this.g != logEvent.i()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.h;
        if (networkConnectionInfo == null) {
            if (logEvent.f() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(logEvent.f())) {
            return false;
        }
        ExperimentIds experimentIds = this.i;
        return experimentIds == null ? logEvent.e() == null : experimentIds.equals(logEvent.e());
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final NetworkConnectionInfo f() {
        return this.h;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final byte[] g() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.f14418a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.c;
        int iHashCode2 = (iHashCode ^ (complianceData == null ? 0 : complianceData.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.h;
        int iHashCode5 = (i2 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.i;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f14418a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
