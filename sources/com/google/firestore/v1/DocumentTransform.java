package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class DocumentTransform extends GeneratedMessageLite<DocumentTransform, Builder> implements DocumentTransformOrBuilder {
    private static final DocumentTransform DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentTransform> PARSER;
    private String document_ = "";
    private Internal.ProtobufList<FieldTransform> fieldTransforms_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.DocumentTransform$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15876a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15876a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15876a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15876a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15876a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15876a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15876a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15876a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentTransform, Builder> implements DocumentTransformOrBuilder {
    }

    public static final class FieldTransform extends GeneratedMessageLite<FieldTransform, Builder> implements FieldTransformOrBuilder {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final FieldTransform DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile Parser<FieldTransform> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldTransform, Builder> implements FieldTransformOrBuilder {
        }

        public enum ServerValue implements Internal.EnumLite {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);

            public final int d;

            /* renamed from: com.google.firestore.v1.DocumentTransform$FieldTransform$ServerValue$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<ServerValue> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i) {
                    if (i == 0) {
                        return ServerValue.SERVER_VALUE_UNSPECIFIED;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return ServerValue.REQUEST_TIME;
                }
            }

            public static final class ServerValueVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i) {
                    return (i != 0 ? i != 1 ? null : ServerValue.REQUEST_TIME : ServerValue.SERVER_VALUE_UNSPECIFIED) != null;
                }
            }

            ServerValue(int i) {
                this.d = i;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int g() {
                if (this != UNRECOGNIZED) {
                    return this.d;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TransformTypeCase {
            public static final TransformTypeCase d;
            public static final TransformTypeCase e;
            public static final TransformTypeCase f;
            public static final TransformTypeCase g;
            public static final TransformTypeCase h;
            public static final TransformTypeCase i;
            public static final TransformTypeCase j;
            public static final /* synthetic */ TransformTypeCase[] k;

            static {
                TransformTypeCase transformTypeCase = new TransformTypeCase("SET_TO_SERVER_VALUE", 0);
                d = transformTypeCase;
                TransformTypeCase transformTypeCase2 = new TransformTypeCase("INCREMENT", 1);
                e = transformTypeCase2;
                TransformTypeCase transformTypeCase3 = new TransformTypeCase("MAXIMUM", 2);
                f = transformTypeCase3;
                TransformTypeCase transformTypeCase4 = new TransformTypeCase("MINIMUM", 3);
                g = transformTypeCase4;
                TransformTypeCase transformTypeCase5 = new TransformTypeCase("APPEND_MISSING_ELEMENTS", 4);
                h = transformTypeCase5;
                TransformTypeCase transformTypeCase6 = new TransformTypeCase("REMOVE_ALL_FROM_ARRAY", 5);
                i = transformTypeCase6;
                TransformTypeCase transformTypeCase7 = new TransformTypeCase("TRANSFORMTYPE_NOT_SET", 6);
                j = transformTypeCase7;
                k = new TransformTypeCase[]{transformTypeCase, transformTypeCase2, transformTypeCase3, transformTypeCase4, transformTypeCase5, transformTypeCase6, transformTypeCase7};
            }

            public static TransformTypeCase valueOf(String str) {
                return (TransformTypeCase) Enum.valueOf(TransformTypeCase.class, str);
            }

            public static TransformTypeCase[] values() {
                return (TransformTypeCase[]) k.clone();
            }
        }

        static {
            FieldTransform fieldTransform = new FieldTransform();
            DEFAULT_INSTANCE = fieldTransform;
            GeneratedMessageLite.J(FieldTransform.class, fieldTransform);
        }

        public static void L(FieldTransform fieldTransform, ArrayValue arrayValue) {
            fieldTransform.getClass();
            fieldTransform.transformType_ = arrayValue;
            fieldTransform.transformTypeCase_ = 6;
        }

        public static void M(FieldTransform fieldTransform, String str) {
            fieldTransform.getClass();
            str.getClass();
            fieldTransform.fieldPath_ = str;
        }

        public static void N(FieldTransform fieldTransform, ArrayValue arrayValue) {
            fieldTransform.getClass();
            fieldTransform.transformType_ = arrayValue;
            fieldTransform.transformTypeCase_ = 7;
        }

        public static void O(FieldTransform fieldTransform) {
            fieldTransform.getClass();
            fieldTransform.transformType_ = Integer.valueOf(ServerValue.REQUEST_TIME.g());
            fieldTransform.transformTypeCase_ = 2;
        }

        public static void P(FieldTransform fieldTransform, Value value) {
            fieldTransform.getClass();
            value.getClass();
            fieldTransform.transformType_ = value;
            fieldTransform.transformTypeCase_ = 3;
        }

        public static Builder W() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final ArrayValue Q() {
            return this.transformTypeCase_ == 6 ? (ArrayValue) this.transformType_ : ArrayValue.O();
        }

        public final String R() {
            return this.fieldPath_;
        }

        public final Value S() {
            return this.transformTypeCase_ == 3 ? (Value) this.transformType_ : Value.Z();
        }

        public final ArrayValue T() {
            return this.transformTypeCase_ == 7 ? (ArrayValue) this.transformType_ : ArrayValue.O();
        }

        public final ServerValue U() {
            int i = this.transformTypeCase_;
            ServerValue serverValue = ServerValue.SERVER_VALUE_UNSPECIFIED;
            if (i == 2) {
                int iIntValue = ((Integer) this.transformType_).intValue();
                if (iIntValue != 0) {
                    serverValue = iIntValue != 1 ? null : ServerValue.REQUEST_TIME;
                }
                if (serverValue == null) {
                    return ServerValue.UNRECOGNIZED;
                }
            }
            return serverValue;
        }

        public final TransformTypeCase V() {
            int i = this.transformTypeCase_;
            if (i == 0) {
                return TransformTypeCase.j;
            }
            switch (i) {
                case 2:
                    return TransformTypeCase.d;
                case 3:
                    return TransformTypeCase.e;
                case 4:
                    return TransformTypeCase.f;
                case 5:
                    return TransformTypeCase.g;
                case 6:
                    return TransformTypeCase.h;
                case 7:
                    return TransformTypeCase.i;
                default:
                    return null;
            }
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
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", Value.class, Value.class, Value.class, ArrayValue.class, ArrayValue.class});
                case 3:
                    return new FieldTransform();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<FieldTransform> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FieldTransform.class) {
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

    public interface FieldTransformOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        DocumentTransform documentTransform = new DocumentTransform();
        DEFAULT_INSTANCE = documentTransform;
        GeneratedMessageLite.J(DocumentTransform.class, documentTransform);
    }

    public static DocumentTransform L() {
        return DEFAULT_INSTANCE;
    }

    public final Internal.ProtobufList M() {
        return this.fieldTransforms_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", FieldTransform.class});
            case 3:
                return new DocumentTransform();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DocumentTransform> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DocumentTransform.class) {
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
