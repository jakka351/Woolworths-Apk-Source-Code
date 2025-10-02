package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class AndroidApplicationInfo extends GeneratedMessageLite<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
    private static final AndroidApplicationInfo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<AndroidApplicationInfo> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: com.google.firebase.perf.v1.AndroidApplicationInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15728a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15728a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15728a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15728a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15728a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15728a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15728a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15728a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
    }

    static {
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo();
        DEFAULT_INSTANCE = androidApplicationInfo;
        GeneratedMessageLite.J(AndroidApplicationInfo.class, androidApplicationInfo);
    }

    public static void L(AndroidApplicationInfo androidApplicationInfo, String str) {
        androidApplicationInfo.getClass();
        str.getClass();
        androidApplicationInfo.bitField0_ |= 1;
        androidApplicationInfo.packageName_ = str;
    }

    public static void M(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        androidApplicationInfo.bitField0_ |= 2;
        androidApplicationInfo.sdkVersion_ = "22.0.1";
    }

    public static void N(AndroidApplicationInfo androidApplicationInfo, String str) {
        androidApplicationInfo.getClass();
        androidApplicationInfo.bitField0_ |= 4;
        androidApplicationInfo.versionName_ = str;
    }

    public static AndroidApplicationInfo O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder R() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final boolean P() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean Q() {
        return (this.bitField0_ & 2) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new AndroidApplicationInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AndroidApplicationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AndroidApplicationInfo.class) {
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
