package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class OAuthRequirements extends GeneratedMessageLite<OAuthRequirements, Builder> implements OAuthRequirementsOrBuilder {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final OAuthRequirements DEFAULT_INSTANCE;
    private static volatile Parser<OAuthRequirements> PARSER;
    private String canonicalScopes_ = "";

    /* renamed from: com.google.api.OAuthRequirements$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14829a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14829a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14829a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14829a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14829a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14829a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14829a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14829a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<OAuthRequirements, Builder> implements OAuthRequirementsOrBuilder {
    }

    static {
        OAuthRequirements oAuthRequirements = new OAuthRequirements();
        DEFAULT_INSTANCE = oAuthRequirements;
        GeneratedMessageLite.J(OAuthRequirements.class, oAuthRequirements);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case 3:
                return new OAuthRequirements();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<OAuthRequirements> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OAuthRequirements.class) {
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
