package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class AuthenticationRule extends GeneratedMessageLite<AuthenticationRule, Builder> implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser<AuthenticationRule> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private int bitField0_;
    private OAuthRequirements oauth_;
    private String selector_ = "";
    private Internal.ProtobufList<AuthRequirement> requirements_ = GeneratedMessageLite.w();

    /* renamed from: com.google.api.AuthenticationRule$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14798a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14798a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14798a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14798a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14798a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14798a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14798a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14798a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthenticationRule, Builder> implements AuthenticationRuleOrBuilder {
    }

    static {
        AuthenticationRule authenticationRule = new AuthenticationRule();
        DEFAULT_INSTANCE = authenticationRule;
        GeneratedMessageLite.J(AuthenticationRule.class, authenticationRule);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0005\u0007\u0007\u001b", new Object[]{"bitField0_", "selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class});
            case 3:
                return new AuthenticationRule();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AuthenticationRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AuthenticationRule.class) {
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
