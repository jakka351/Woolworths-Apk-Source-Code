package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes2.dex */
public final class LogEventDropped {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f14460a;
    public final Reason b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public long f14461a = 0;
        public Reason b = Reason.REASON_UNKNOWN;

        public final LogEventDropped a() {
            return new LogEventDropped(this.f14461a, this.b);
        }
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int d;

        Reason(int i) {
            this.d = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int g() {
            return this.d;
        }
    }

    static {
        new Builder().a();
    }

    public LogEventDropped(long j, Reason reason) {
        this.f14460a = j;
        this.b = reason;
    }

    public final long a() {
        return this.f14460a;
    }

    public final Reason b() {
        return this.b;
    }
}
