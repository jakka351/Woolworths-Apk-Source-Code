package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.LogRequest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_LogRequest extends LogRequest {

    /* renamed from: a, reason: collision with root package name */
    public final long f14420a;
    public final long b;
    public final ClientInfo c;
    public final Integer d;
    public final String e;
    public final List f;
    public final QosTier g;

    public static final class Builder extends LogRequest.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Long f14421a;
        public Long b;
        public ClientInfo c;
        public Integer d;
        public String e;
        public ArrayList f;
        public QosTier g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest a() {
            String strConcat = this.f14421a == null ? " requestTimeMs" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_LogRequest(this.f14421a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder b(ClientInfo clientInfo) {
            this.c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder c(ArrayList arrayList) {
            this.f = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder f() {
            this.g = QosTier.d;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder g(long j) {
            this.f14421a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_LogRequest(long j, long j2, ClientInfo clientInfo, Integer num, String str, ArrayList arrayList, QosTier qosTier) {
        this.f14420a = j;
        this.b = j2;
        this.c = clientInfo;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final ClientInfo b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final List c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final Integer d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f14420a != logRequest.g() || this.b != logRequest.h()) {
            return false;
        }
        ClientInfo clientInfo = this.c;
        if (clientInfo == null) {
            if (logRequest.b() != null) {
                return false;
            }
        } else if (!clientInfo.equals(logRequest.b())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (logRequest.d() != null) {
                return false;
            }
        } else if (!num.equals(logRequest.d())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (logRequest.e() != null) {
                return false;
            }
        } else if (!str.equals(logRequest.e())) {
            return false;
        }
        List list = this.f;
        if (list == null) {
            if (logRequest.c() != null) {
                return false;
            }
        } else if (!list.equals(logRequest.c())) {
            return false;
        }
        QosTier qosTier = this.g;
        return qosTier == null ? logRequest.f() == null : qosTier.equals(logRequest.f());
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final QosTier f() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long g() {
        return this.f14420a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.f14420a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.c;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14420a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
