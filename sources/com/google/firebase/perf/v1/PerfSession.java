package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class PerfSession extends GeneratedMessageLite<PerfSession, Builder> implements PerfSessionOrBuilder {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile Parser<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, SessionVerbosity> sessionVerbosity_converter_ = new AnonymousClass1();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.u();

    /* renamed from: com.google.firebase.perf.v1.PerfSession$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.ListAdapter.Converter<Integer, SessionVerbosity> {
    }

    /* renamed from: com.google.firebase.perf.v1.PerfSession$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15744a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15744a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15744a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15744a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15744a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15744a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15744a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15744a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PerfSession, Builder> implements PerfSessionOrBuilder {
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.J(PerfSession.class, perfSession);
    }

    public static void L(PerfSession perfSession, String str) {
        perfSession.getClass();
        str.getClass();
        perfSession.bitField0_ |= 1;
        perfSession.sessionId_ = str;
    }

    public static void M(PerfSession perfSession) {
        perfSession.getClass();
        Internal.IntList intList = perfSession.sessionVerbosity_;
        if (!intList.r()) {
            int size = intList.size();
            perfSession.sessionVerbosity_ = intList.a(size == 0 ? 10 : size * 2);
        }
        perfSession.sessionVerbosity_.W1(1);
    }

    public static Builder P() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final SessionVerbosity N() {
        SessionVerbosity sessionVerbosityA = SessionVerbosity.a(this.sessionVerbosity_.getInt(0));
        return sessionVerbosityA == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityA;
    }

    public final int O() {
        return this.sessionVerbosity_.size();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.SessionVerbosityVerifier.f15745a});
            case 3:
                return new PerfSession();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<PerfSession> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PerfSession.class) {
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
