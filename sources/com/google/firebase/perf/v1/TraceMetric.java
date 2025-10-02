package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class TraceMetric extends GeneratedMessageLite<TraceMetric, Builder> implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_;
    private MapFieldLite<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private Internal.ProtobufList<PerfSession> perfSessions_;
    private Internal.ProtobufList<TraceMetric> subtraces_;

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15746a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15746a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15746a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15746a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15746a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15746a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15746a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15746a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TraceMetric, Builder> implements TraceMetricOrBuilder {
        public final void t(TraceMetric traceMetric) {
            p();
            TraceMetric.N((TraceMetric) this.e, traceMetric);
        }

        public final void u(long j, String str) {
            str.getClass();
            p();
            TraceMetric.M((TraceMetric) this.e).put(str, Long.valueOf(j));
        }

        public final void v(long j) {
            p();
            TraceMetric.S((TraceMetric) this.e, j);
        }

        public final void w(long j) {
            p();
            TraceMetric.T((TraceMetric) this.e, j);
        }

        public final void y(String str) {
            p();
            TraceMetric.L((TraceMetric) this.e, str);
        }
    }

    public static final class CountersDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15747a = new MapEntryLite(WireFormat.FieldType.n, WireFormat.FieldType.h, 0L);
    }

    public static final class CustomAttributesDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15748a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f15748a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.J(TraceMetric.class, traceMetric);
    }

    public TraceMetric() {
        MapFieldLite mapFieldLite = MapFieldLite.e;
        this.counters_ = mapFieldLite;
        this.customAttributes_ = mapFieldLite;
        this.name_ = "";
        this.subtraces_ = GeneratedMessageLite.w();
        this.perfSessions_ = GeneratedMessageLite.w();
    }

    public static void L(TraceMetric traceMetric, String str) {
        traceMetric.getClass();
        str.getClass();
        traceMetric.bitField0_ |= 1;
        traceMetric.name_ = str;
    }

    public static MapFieldLite M(TraceMetric traceMetric) {
        MapFieldLite<String, Long> mapFieldLite = traceMetric.counters_;
        if (!mapFieldLite.d) {
            traceMetric.counters_ = mapFieldLite.c();
        }
        return traceMetric.counters_;
    }

    public static void N(TraceMetric traceMetric, TraceMetric traceMetric2) {
        traceMetric.getClass();
        traceMetric2.getClass();
        Internal.ProtobufList<TraceMetric> protobufList = traceMetric.subtraces_;
        if (!protobufList.r()) {
            traceMetric.subtraces_ = GeneratedMessageLite.C(protobufList);
        }
        traceMetric.subtraces_.add(traceMetric2);
    }

    public static void O(TraceMetric traceMetric, ArrayList arrayList) {
        Internal.ProtobufList<TraceMetric> protobufList = traceMetric.subtraces_;
        if (!protobufList.r()) {
            traceMetric.subtraces_ = GeneratedMessageLite.C(protobufList);
        }
        AbstractMessageLite.k(arrayList, traceMetric.subtraces_);
    }

    public static MapFieldLite P(TraceMetric traceMetric) {
        MapFieldLite<String, String> mapFieldLite = traceMetric.customAttributes_;
        if (!mapFieldLite.d) {
            traceMetric.customAttributes_ = mapFieldLite.c();
        }
        return traceMetric.customAttributes_;
    }

    public static void Q(TraceMetric traceMetric, PerfSession perfSession) {
        traceMetric.getClass();
        Internal.ProtobufList<PerfSession> protobufList = traceMetric.perfSessions_;
        if (!protobufList.r()) {
            traceMetric.perfSessions_ = GeneratedMessageLite.C(protobufList);
        }
        traceMetric.perfSessions_.add(perfSession);
    }

    public static void R(TraceMetric traceMetric, List list) {
        Internal.ProtobufList<PerfSession> protobufList = traceMetric.perfSessions_;
        if (!protobufList.r()) {
            traceMetric.perfSessions_ = GeneratedMessageLite.C(protobufList);
        }
        AbstractMessageLite.k(list, traceMetric.perfSessions_);
    }

    public static void S(TraceMetric traceMetric, long j) {
        traceMetric.bitField0_ |= 4;
        traceMetric.clientStartTimeUs_ = j;
    }

    public static void T(TraceMetric traceMetric, long j) {
        traceMetric.bitField0_ |= 8;
        traceMetric.durationUs_ = j;
    }

    public static TraceMetric Y() {
        return DEFAULT_INSTANCE;
    }

    public static Builder e0() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final boolean U() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int V() {
        return this.counters_.size();
    }

    public final Map W() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map X() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long Z() {
        return this.durationUs_;
    }

    public final String a0() {
        return this.name_;
    }

    public final Internal.ProtobufList b0() {
        return this.perfSessions_;
    }

    public final Internal.ProtobufList c0() {
        return this.subtraces_;
    }

    public final boolean d0() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", CountersDefaultEntryHolder.f15747a, "subtraces_", TraceMetric.class, "customAttributes_", CustomAttributesDefaultEntryHolder.f15748a, "perfSessions_", PerfSession.class});
            case 3:
                return new TraceMetric();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<TraceMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TraceMetric.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
