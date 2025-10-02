package com.google.firestore.bundle;

import com.google.firestore.v1.Document;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class BundleElement extends GeneratedMessageLite<BundleElement, Builder> implements BundleElementOrBuilder {
    private static final BundleElement DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_METADATA_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAMED_QUERY_FIELD_NUMBER = 2;
    private static volatile Parser<BundleElement> PARSER;
    private int elementTypeCase_ = 0;
    private Object elementType_;

    /* renamed from: com.google.firestore.bundle.BundleElement$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15851a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15851a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15851a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15851a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15851a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15851a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15851a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15851a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundleElement, Builder> implements BundleElementOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ElementTypeCase {
        public static final /* synthetic */ ElementTypeCase[] d = {new ElementTypeCase("METADATA", 0), new ElementTypeCase("NAMED_QUERY", 1), new ElementTypeCase("DOCUMENT_METADATA", 2), new ElementTypeCase("DOCUMENT", 3), new ElementTypeCase("ELEMENTTYPE_NOT_SET", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        ElementTypeCase EF5;

        public static ElementTypeCase valueOf(String str) {
            return (ElementTypeCase) Enum.valueOf(ElementTypeCase.class, str);
        }

        public static ElementTypeCase[] values() {
            return (ElementTypeCase[]) d.clone();
        }
    }

    static {
        BundleElement bundleElement = new BundleElement();
        DEFAULT_INSTANCE = bundleElement;
        GeneratedMessageLite.J(BundleElement.class, bundleElement);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"elementType_", "elementTypeCase_", BundleMetadata.class, NamedQuery.class, BundledDocumentMetadata.class, Document.class});
            case 3:
                return new BundleElement();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BundleElement> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BundleElement.class) {
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
