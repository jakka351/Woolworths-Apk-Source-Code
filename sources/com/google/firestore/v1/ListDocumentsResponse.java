package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class ListDocumentsResponse extends GeneratedMessageLite<ListDocumentsResponse, Builder> implements ListDocumentsResponseOrBuilder {
    private static final ListDocumentsResponse DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<ListDocumentsResponse> PARSER;
    private Internal.ProtobufList<Document> documents_ = GeneratedMessageLite.w();
    private String nextPageToken_ = "";

    /* renamed from: com.google.firestore.v1.ListDocumentsResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15883a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15883a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15883a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15883a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15883a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15883a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15883a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15883a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListDocumentsResponse, Builder> implements ListDocumentsResponseOrBuilder {
    }

    static {
        ListDocumentsResponse listDocumentsResponse = new ListDocumentsResponse();
        DEFAULT_INSTANCE = listDocumentsResponse;
        GeneratedMessageLite.J(ListDocumentsResponse.class, listDocumentsResponse);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"documents_", Document.class, "nextPageToken_"});
            case 3:
                return new ListDocumentsResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListDocumentsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListDocumentsResponse.class) {
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
