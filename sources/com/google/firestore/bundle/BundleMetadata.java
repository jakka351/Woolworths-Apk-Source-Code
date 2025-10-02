package com.google.firestore.bundle;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class BundleMetadata extends GeneratedMessageLite<BundleMetadata, Builder> implements BundleMetadataOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 2;
    private static final BundleMetadata DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<BundleMetadata> PARSER = null;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 5;
    public static final int TOTAL_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp createTime_;
    private String id_ = "";
    private long totalBytes_;
    private int totalDocuments_;
    private int version_;

    /* renamed from: com.google.firestore.bundle.BundleMetadata$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15852a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15852a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15852a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15852a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15852a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15852a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15852a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15852a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BundleMetadata, Builder> implements BundleMetadataOrBuilder {
    }

    static {
        BundleMetadata bundleMetadata = new BundleMetadata();
        DEFAULT_INSTANCE = bundleMetadata;
        GeneratedMessageLite.J(BundleMetadata.class, bundleMetadata);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u000b\u0004\u000b\u0005\u0003", new Object[]{"bitField0_", "id_", "createTime_", "version_", "totalDocuments_", "totalBytes_"});
            case 3:
                return new BundleMetadata();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BundleMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BundleMetadata.class) {
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
