package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class ApplicationInfo extends GeneratedMessageLite<ApplicationInfo, Builder> implements ApplicationInfoOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<ApplicationInfo> PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.e;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15730a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15730a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15730a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15730a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15730a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15730a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15730a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15730a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ApplicationInfo, Builder> implements ApplicationInfoOrBuilder {
    }

    public static final class CustomAttributesDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15731a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f15731a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        GeneratedMessageLite.J(ApplicationInfo.class, applicationInfo);
    }

    public static void L(ApplicationInfo applicationInfo, String str) {
        applicationInfo.getClass();
        str.getClass();
        applicationInfo.bitField0_ |= 1;
        applicationInfo.googleAppId_ = str;
    }

    public static void M(ApplicationInfo applicationInfo, ApplicationProcessState applicationProcessState) {
        applicationInfo.getClass();
        applicationInfo.applicationProcessState_ = applicationProcessState.d;
        applicationInfo.bitField0_ |= 8;
    }

    public static MapFieldLite N(ApplicationInfo applicationInfo) {
        MapFieldLite<String, String> mapFieldLite = applicationInfo.customAttributes_;
        if (!mapFieldLite.d) {
            applicationInfo.customAttributes_ = mapFieldLite.c();
        }
        return applicationInfo.customAttributes_;
    }

    public static void O(ApplicationInfo applicationInfo, String str) {
        applicationInfo.getClass();
        str.getClass();
        applicationInfo.bitField0_ |= 2;
        applicationInfo.appInstanceId_ = str;
    }

    public static void P(ApplicationInfo applicationInfo, AndroidApplicationInfo androidApplicationInfo) {
        applicationInfo.getClass();
        applicationInfo.androidAppInfo_ = androidApplicationInfo;
        applicationInfo.bitField0_ |= 4;
    }

    public static ApplicationInfo R() {
        return DEFAULT_INSTANCE;
    }

    public static Builder W() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final AndroidApplicationInfo Q() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        return androidApplicationInfo == null ? AndroidApplicationInfo.O() : androidApplicationInfo;
    }

    public final boolean S() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean T() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean U() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 1) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.ApplicationProcessStateVerifier.f15732a, "customAttributes_", CustomAttributesDefaultEntryHolder.f15731a});
            case 3:
                return new ApplicationInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ApplicationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ApplicationInfo.class) {
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
