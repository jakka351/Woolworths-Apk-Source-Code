package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class ListDocumentsRequest extends GeneratedMessageLite<ListDocumentsRequest, Builder> implements ListDocumentsRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final ListDocumentsRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 7;
    public static final int ORDER_BY_FIELD_NUMBER = 6;
    public static final int PAGE_SIZE_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListDocumentsRequest> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 10;
    public static final int SHOW_MISSING_FIELD_NUMBER = 12;
    public static final int TRANSACTION_FIELD_NUMBER = 8;
    private int bitField0_;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int pageSize_;
    private boolean showMissing_;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";
    private String collectionId_ = "";
    private String pageToken_ = "";
    private String orderBy_ = "";

    /* renamed from: com.google.firestore.v1.ListDocumentsRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15882a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15882a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15882a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15882a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15882a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15882a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15882a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15882a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListDocumentsRequest, Builder> implements ListDocumentsRequestOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConsistencySelectorCase {
        public static final /* synthetic */ ConsistencySelectorCase[] d = {new ConsistencySelectorCase("TRANSACTION", 0), new ConsistencySelectorCase("READ_TIME", 1), new ConsistencySelectorCase("CONSISTENCYSELECTOR_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsistencySelectorCase EF5;

        public static ConsistencySelectorCase valueOf(String str) {
            return (ConsistencySelectorCase) Enum.valueOf(ConsistencySelectorCase.class, str);
        }

        public static ConsistencySelectorCase[] values() {
            return (ConsistencySelectorCase[]) d.clone();
        }
    }

    static {
        ListDocumentsRequest listDocumentsRequest = new ListDocumentsRequest();
        DEFAULT_INSTANCE = listDocumentsRequest;
        GeneratedMessageLite.J(ListDocumentsRequest.class, listDocumentsRequest);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\f\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007ဉ\u0000\b=\u0000\n<\u0000\f\u0007", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "parent_", "collectionId_", "pageSize_", "pageToken_", "orderBy_", "mask_", Timestamp.class, "showMissing_"});
            case 3:
                return new ListDocumentsRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListDocumentsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListDocumentsRequest.class) {
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
