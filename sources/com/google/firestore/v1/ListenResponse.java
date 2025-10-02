package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class ListenResponse extends GeneratedMessageLite<ListenResponse, Builder> implements ListenResponseOrBuilder {
    private static final ListenResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile Parser<ListenResponse> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* renamed from: com.google.firestore.v1.ListenResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15886a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15886a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15886a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15886a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15886a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15886a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15886a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15886a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListenResponse, Builder> implements ListenResponseOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseTypeCase {
        public static final ResponseTypeCase d;
        public static final ResponseTypeCase e;
        public static final ResponseTypeCase f;
        public static final ResponseTypeCase g;
        public static final ResponseTypeCase h;
        public static final ResponseTypeCase i;
        public static final /* synthetic */ ResponseTypeCase[] j;

        static {
            ResponseTypeCase responseTypeCase = new ResponseTypeCase("TARGET_CHANGE", 0);
            d = responseTypeCase;
            ResponseTypeCase responseTypeCase2 = new ResponseTypeCase("DOCUMENT_CHANGE", 1);
            e = responseTypeCase2;
            ResponseTypeCase responseTypeCase3 = new ResponseTypeCase("DOCUMENT_DELETE", 2);
            f = responseTypeCase3;
            ResponseTypeCase responseTypeCase4 = new ResponseTypeCase("DOCUMENT_REMOVE", 3);
            g = responseTypeCase4;
            ResponseTypeCase responseTypeCase5 = new ResponseTypeCase("FILTER", 4);
            h = responseTypeCase5;
            ResponseTypeCase responseTypeCase6 = new ResponseTypeCase("RESPONSETYPE_NOT_SET", 5);
            i = responseTypeCase6;
            j = new ResponseTypeCase[]{responseTypeCase, responseTypeCase2, responseTypeCase3, responseTypeCase4, responseTypeCase5, responseTypeCase6};
        }

        public static ResponseTypeCase valueOf(String str) {
            return (ResponseTypeCase) Enum.valueOf(ResponseTypeCase.class, str);
        }

        public static ResponseTypeCase[] values() {
            return (ResponseTypeCase[]) j.clone();
        }
    }

    static {
        ListenResponse listenResponse = new ListenResponse();
        DEFAULT_INSTANCE = listenResponse;
        GeneratedMessageLite.J(ListenResponse.class, listenResponse);
    }

    public static ListenResponse L() {
        return DEFAULT_INSTANCE;
    }

    public final DocumentChange M() {
        return this.responseTypeCase_ == 3 ? (DocumentChange) this.responseType_ : DocumentChange.L();
    }

    public final DocumentDelete N() {
        return this.responseTypeCase_ == 4 ? (DocumentDelete) this.responseType_ : DocumentDelete.L();
    }

    public final DocumentRemove O() {
        return this.responseTypeCase_ == 6 ? (DocumentRemove) this.responseType_ : DocumentRemove.L();
    }

    public final ExistenceFilter P() {
        return this.responseTypeCase_ == 5 ? (ExistenceFilter) this.responseType_ : ExistenceFilter.M();
    }

    public final ResponseTypeCase Q() {
        int i = this.responseTypeCase_;
        if (i == 0) {
            return ResponseTypeCase.i;
        }
        if (i == 2) {
            return ResponseTypeCase.d;
        }
        if (i == 3) {
            return ResponseTypeCase.e;
        }
        if (i == 4) {
            return ResponseTypeCase.f;
        }
        if (i == 5) {
            return ResponseTypeCase.h;
        }
        if (i != 6) {
            return null;
        }
        return ResponseTypeCase.g;
    }

    public final TargetChange R() {
        return this.responseTypeCase_ == 2 ? (TargetChange) this.responseType_ : TargetChange.M();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", TargetChange.class, DocumentChange.class, DocumentDelete.class, ExistenceFilter.class, DocumentRemove.class});
            case 3:
                return new ListenResponse();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListenResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListenResponse.class) {
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
