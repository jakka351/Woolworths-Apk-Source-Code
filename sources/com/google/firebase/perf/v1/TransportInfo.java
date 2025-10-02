package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class TransportInfo extends GeneratedMessageLite<TransportInfo, Builder> implements TransportInfoOrBuilder {
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Parser<TransportInfo> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: com.google.firebase.perf.v1.TransportInfo$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15749a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15749a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15749a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15749a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15749a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15749a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15749a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15749a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TransportInfo, Builder> implements TransportInfoOrBuilder {
        public Builder() {
            super(TransportInfo.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes6.dex */
    public enum DispatchDestination implements Internal.EnumLite {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        public final int d;

        /* renamed from: com.google.firebase.perf.v1.TransportInfo$DispatchDestination$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<DispatchDestination> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return DispatchDestination.SOURCE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return DispatchDestination.FL_LEGACY_V1;
            }
        }

        public static final class DispatchDestinationVerifier implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final Internal.EnumVerifier f15750a = new DispatchDestinationVerifier();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? null : DispatchDestination.FL_LEGACY_V1 : DispatchDestination.SOURCE_UNKNOWN) != null;
            }
        }

        DispatchDestination(int i) {
            this.d = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    static {
        TransportInfo transportInfo = new TransportInfo();
        DEFAULT_INSTANCE = transportInfo;
        GeneratedMessageLite.J(TransportInfo.class, transportInfo);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", DispatchDestination.DispatchDestinationVerifier.f15750a});
            case 3:
                return new TransportInfo();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<TransportInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TransportInfo.class) {
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
