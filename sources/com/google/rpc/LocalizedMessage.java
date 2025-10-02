package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class LocalizedMessage extends GeneratedMessageLite<LocalizedMessage, Builder> implements LocalizedMessageOrBuilder {
    private static final LocalizedMessage DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<LocalizedMessage> PARSER;
    private String locale_ = "";
    private String message_ = "";

    /* renamed from: com.google.rpc.LocalizedMessage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16102a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16102a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16102a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16102a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16102a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16102a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16102a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16102a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LocalizedMessage, Builder> implements LocalizedMessageOrBuilder {
    }

    static {
        LocalizedMessage localizedMessage = new LocalizedMessage();
        DEFAULT_INSTANCE = localizedMessage;
        GeneratedMessageLite.J(LocalizedMessage.class, localizedMessage);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
            case 3:
                return new LocalizedMessage();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<LocalizedMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LocalizedMessage.class) {
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
