package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class NetworkConnectionInfo extends GeneratedMessageLite<NetworkConnectionInfo, Builder> implements NetworkConnectionInfoOrBuilder {
    private static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<NetworkConnectionInfo> PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15736a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15736a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15736a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15736a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15736a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15736a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15736a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15736a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NetworkConnectionInfo, Builder> implements NetworkConnectionInfoOrBuilder {
    }

    public enum MobileSubtype implements Internal.EnumLite {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        public final int d;

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<MobileSubtype> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return MobileSubtype.a(i);
            }
        }

        public static final class MobileSubtypeVerifier implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final Internal.EnumVerifier f15737a = new MobileSubtypeVerifier();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return MobileSubtype.a(i) != null;
            }
        }

        MobileSubtype(int i) {
            this.d = i;
        }

        public static MobileSubtype a(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    public enum NetworkType implements Internal.EnumLite {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);

        public final int d;

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<NetworkType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return NetworkType.a(i);
            }
        }

        public static final class NetworkTypeVerifier implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final Internal.EnumVerifier f15738a = new NetworkTypeVerifier();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return NetworkType.a(i) != null;
            }
        }

        NetworkType(int i) {
            this.d = i;
        }

        public static NetworkType a(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    static {
        NetworkConnectionInfo networkConnectionInfo = new NetworkConnectionInfo();
        DEFAULT_INSTANCE = networkConnectionInfo;
        GeneratedMessageLite.J(NetworkConnectionInfo.class, networkConnectionInfo);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "networkType_", NetworkType.NetworkTypeVerifier.f15738a, "mobileSubtype_", MobileSubtype.MobileSubtypeVerifier.f15737a});
            case 3:
                return new NetworkConnectionInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<NetworkConnectionInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NetworkConnectionInfo.class) {
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
