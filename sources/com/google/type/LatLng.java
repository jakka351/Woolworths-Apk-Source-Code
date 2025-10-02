package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class LatLng extends GeneratedMessageLite<LatLng, Builder> implements LatLngOrBuilder {
    private static final LatLng DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser<LatLng> PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: com.google.type.LatLng$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16120a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16120a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16120a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16120a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16120a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16120a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16120a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16120a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LatLng, Builder> implements LatLngOrBuilder {
    }

    static {
        LatLng latLng = new LatLng();
        DEFAULT_INSTANCE = latLng;
        GeneratedMessageLite.J(LatLng.class, latLng);
    }

    public static void L(LatLng latLng) {
        latLng.latitude_ = -90.0d;
    }

    public static void M(LatLng latLng) {
        latLng.longitude_ = -180.0d;
    }

    public static LatLng N() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Q() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final double O() {
        return this.latitude_;
    }

    public final double P() {
        return this.longitude_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new LatLng();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<LatLng> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LatLng.class) {
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
