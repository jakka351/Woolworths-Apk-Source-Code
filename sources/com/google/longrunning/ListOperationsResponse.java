package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class ListOperationsResponse extends GeneratedMessageLite<ListOperationsResponse, Builder> implements ListOperationsResponseOrBuilder {
    private static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<ListOperationsResponse> PARSER;
    private Internal.ProtobufList<Operation> operations_ = GeneratedMessageLite.w();
    private String nextPageToken_ = "";

    /* renamed from: com.google.longrunning.ListOperationsResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15971a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15971a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15971a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15971a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15971a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15971a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15971a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15971a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListOperationsResponse, Builder> implements ListOperationsResponseOrBuilder {
    }

    static {
        ListOperationsResponse listOperationsResponse = new ListOperationsResponse();
        DEFAULT_INSTANCE = listOperationsResponse;
        GeneratedMessageLite.J(ListOperationsResponse.class, listOperationsResponse);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", Operation.class, "nextPageToken_"});
            case 3:
                return new ListOperationsResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListOperationsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListOperationsResponse.class) {
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
