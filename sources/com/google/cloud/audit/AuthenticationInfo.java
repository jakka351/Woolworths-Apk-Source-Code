package com.google.cloud.audit;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class AuthenticationInfo extends GeneratedMessageLite<AuthenticationInfo, Builder> implements AuthenticationInfoOrBuilder {
    private static final AuthenticationInfo DEFAULT_INSTANCE;
    private static volatile Parser<AuthenticationInfo> PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    /* renamed from: com.google.cloud.audit.AuthenticationInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14857a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14857a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14857a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14857a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14857a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14857a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14857a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14857a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthenticationInfo, Builder> implements AuthenticationInfoOrBuilder {
    }

    static {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        DEFAULT_INSTANCE = authenticationInfo;
        GeneratedMessageLite.J(AuthenticationInfo.class, authenticationInfo);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            case 3:
                return new AuthenticationInfo();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AuthenticationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AuthenticationInfo.class) {
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
