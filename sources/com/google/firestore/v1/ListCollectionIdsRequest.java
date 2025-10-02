package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class ListCollectionIdsRequest extends GeneratedMessageLite<ListCollectionIdsRequest, Builder> implements ListCollectionIdsRequestOrBuilder {
    private static final ListCollectionIdsRequest DEFAULT_INSTANCE;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListCollectionIdsRequest> PARSER;
    private int pageSize_;
    private String parent_ = "";
    private String pageToken_ = "";

    /* renamed from: com.google.firestore.v1.ListCollectionIdsRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15880a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15880a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15880a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15880a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15880a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15880a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15880a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15880a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListCollectionIdsRequest, Builder> implements ListCollectionIdsRequestOrBuilder {
    }

    static {
        ListCollectionIdsRequest listCollectionIdsRequest = new ListCollectionIdsRequest();
        DEFAULT_INSTANCE = listCollectionIdsRequest;
        GeneratedMessageLite.J(ListCollectionIdsRequest.class, listCollectionIdsRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"parent_", "pageSize_", "pageToken_"});
            case 3:
                return new ListCollectionIdsRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListCollectionIdsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListCollectionIdsRequest.class) {
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
