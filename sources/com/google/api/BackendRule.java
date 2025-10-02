package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class BackendRule extends GeneratedMessageLite<BackendRule, Builder> implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile Parser<BackendRule> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private int authenticationCase_ = 0;
    private String selector_ = "";
    private String address_ = "";
    private String protocol_ = "";

    /* renamed from: com.google.api.BackendRule$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14800a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14800a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14800a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14800a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14800a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14800a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14800a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14800a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AuthenticationCase {
        public static final /* synthetic */ AuthenticationCase[] d = {new AuthenticationCase("JWT_AUDIENCE", 0), new AuthenticationCase("DISABLE_AUTH", 1), new AuthenticationCase("AUTHENTICATION_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        AuthenticationCase EF5;

        public static AuthenticationCase valueOf(String str) {
            return (AuthenticationCase) Enum.valueOf(AuthenticationCase.class, str);
        }

        public static AuthenticationCase[] values() {
            return (AuthenticationCase[]) d.clone();
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BackendRule, Builder> implements BackendRuleOrBuilder {
    }

    public enum PathTranslation implements Internal.EnumLite {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.api.BackendRule$PathTranslation$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<PathTranslation> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return PathTranslation.PATH_TRANSLATION_UNSPECIFIED;
                }
                if (i == 1) {
                    return PathTranslation.CONSTANT_ADDRESS;
                }
                if (i != 2) {
                    return null;
                }
                return PathTranslation.APPEND_PATH_TO_ADDRESS;
            }
        }

        public static final class PathTranslationVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? i != 2 ? null : PathTranslation.APPEND_PATH_TO_ADDRESS : PathTranslation.CONSTANT_ADDRESS : PathTranslation.PATH_TRANSLATION_UNSPECIFIED) != null;
            }
        }

        PathTranslation(int i2) {
            this.d = i2;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        BackendRule backendRule = new BackendRule();
        DEFAULT_INSTANCE = backendRule;
        GeneratedMessageLite.J(BackendRule.class, backendRule);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 3:
                return new BackendRule();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BackendRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BackendRule.class) {
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
