package com.google.firebase.firestore.proto;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class TargetGlobal extends GeneratedMessageLite<TargetGlobal, Builder> implements TargetGlobalOrBuilder {
    private static final TargetGlobal DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile Parser<TargetGlobal> PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private int bitField0_;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private Timestamp lastRemoteSnapshotVersion_;
    private int targetCount_;

    /* renamed from: com.google.firebase.firestore.proto.TargetGlobal$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15554a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15554a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15554a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15554a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15554a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15554a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15554a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15554a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TargetGlobal, Builder> implements TargetGlobalOrBuilder {
    }

    static {
        TargetGlobal targetGlobal = new TargetGlobal();
        DEFAULT_INSTANCE = targetGlobal;
        GeneratedMessageLite.J(TargetGlobal.class, targetGlobal);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003ဉ\u0000\u0004\u0004", new Object[]{"bitField0_", "highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case 3:
                return new TargetGlobal();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<TargetGlobal> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TargetGlobal.class) {
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
