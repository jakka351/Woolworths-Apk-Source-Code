package com.google.firestore.v1;

import com.google.firestore.v1.DocumentTransform;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Write extends GeneratedMessageLite<Write, Builder> implements WriteOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final Write DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile Parser<Write> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private Precondition currentDocument_;
    private Object operation_;
    private DocumentMask updateMask_;
    private int operationCase_ = 0;
    private Internal.ProtobufList<DocumentTransform.FieldTransform> updateTransforms_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.Write$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15902a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15902a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15902a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15902a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15902a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15902a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15902a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15902a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Write, Builder> implements WriteOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OperationCase {
        public static final OperationCase d;
        public static final OperationCase e;
        public static final OperationCase f;
        public static final OperationCase g;
        public static final OperationCase h;
        public static final /* synthetic */ OperationCase[] i;

        static {
            OperationCase operationCase = new OperationCase("UPDATE", 0);
            d = operationCase;
            OperationCase operationCase2 = new OperationCase("DELETE", 1);
            e = operationCase2;
            OperationCase operationCase3 = new OperationCase("VERIFY", 2);
            f = operationCase3;
            OperationCase operationCase4 = new OperationCase("TRANSFORM", 3);
            g = operationCase4;
            OperationCase operationCase5 = new OperationCase("OPERATION_NOT_SET", 4);
            h = operationCase5;
            i = new OperationCase[]{operationCase, operationCase2, operationCase3, operationCase4, operationCase5};
        }

        public static OperationCase valueOf(String str) {
            return (OperationCase) Enum.valueOf(OperationCase.class, str);
        }

        public static OperationCase[] values() {
            return (OperationCase[]) i.clone();
        }
    }

    static {
        Write write = new Write();
        DEFAULT_INSTANCE = write;
        GeneratedMessageLite.J(Write.class, write);
    }

    public static void L(Write write, DocumentMask documentMask) {
        write.getClass();
        write.updateMask_ = documentMask;
        write.bitField0_ |= 1;
    }

    public static void M(Write write, DocumentTransform.FieldTransform fieldTransform) {
        write.getClass();
        fieldTransform.getClass();
        Internal.ProtobufList<DocumentTransform.FieldTransform> protobufList = write.updateTransforms_;
        if (!protobufList.r()) {
            write.updateTransforms_ = GeneratedMessageLite.C(protobufList);
        }
        write.updateTransforms_.add(fieldTransform);
    }

    public static void N(Write write, Document document) {
        write.getClass();
        write.operation_ = document;
        write.operationCase_ = 1;
    }

    public static void O(Write write, Precondition precondition) {
        write.getClass();
        write.currentDocument_ = precondition;
        write.bitField0_ |= 2;
    }

    public static void P(Write write, String str) {
        write.getClass();
        str.getClass();
        write.operationCase_ = 2;
        write.operation_ = str;
    }

    public static void Q(Write write, String str) {
        write.getClass();
        str.getClass();
        write.operationCase_ = 5;
        write.operation_ = str;
    }

    public static Builder d0() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public static Builder e0(Write write) {
        GeneratedMessageLite.Builder builderR = DEFAULT_INSTANCE.r();
        builderR.r(write);
        return (Builder) builderR;
    }

    public static Write f0(byte[] bArr) {
        return (Write) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final Precondition R() {
        Precondition precondition = this.currentDocument_;
        return precondition == null ? Precondition.O() : precondition;
    }

    public final String S() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public final OperationCase T() {
        int i = this.operationCase_;
        if (i == 0) {
            return OperationCase.h;
        }
        if (i == 1) {
            return OperationCase.d;
        }
        if (i == 2) {
            return OperationCase.e;
        }
        if (i == 5) {
            return OperationCase.f;
        }
        if (i != 6) {
            return null;
        }
        return OperationCase.g;
    }

    public final DocumentTransform U() {
        return this.operationCase_ == 6 ? (DocumentTransform) this.operation_ : DocumentTransform.L();
    }

    public final Document V() {
        return this.operationCase_ == 1 ? (Document) this.operation_ : Document.O();
    }

    public final DocumentMask W() {
        DocumentMask documentMask = this.updateMask_;
        return documentMask == null ? DocumentMask.M() : documentMask;
    }

    public final Internal.ProtobufList X() {
        return this.updateTransforms_;
    }

    public final String Y() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public final boolean Z() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean a0() {
        return this.operationCase_ == 6;
    }

    public final boolean b0() {
        return this.operationCase_ == 1;
    }

    public final boolean c0() {
        return (this.bitField0_ & 1) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", Document.class, "updateMask_", "currentDocument_", DocumentTransform.class, "updateTransforms_", DocumentTransform.FieldTransform.class});
            case 3:
                return new Write();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Write> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Write.class) {
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
