package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Page extends GeneratedMessageLite<Page, Builder> implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Page> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String name_ = "";
    private String content_ = "";
    private Internal.ProtobufList<Page> subpages_ = GeneratedMessageLite.w();

    /* renamed from: com.google.api.Page$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14830a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14830a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14830a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14830a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14830a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14830a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14830a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14830a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Page, Builder> implements PageOrBuilder {
    }

    static {
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        GeneratedMessageLite.J(Page.class, page);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", Page.class});
            case 3:
                return new Page();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Page> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Page.class) {
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
