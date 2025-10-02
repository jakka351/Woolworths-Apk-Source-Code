package com.google.firebase.firestore.proto;

import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private Timestamp snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private ByteString resumeToken_ = ByteString.e;

    /* renamed from: com.google.firebase.firestore.proto.Target$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15553a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15553a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15553a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15553a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15553a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15553a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15553a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15553a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TargetTypeCase {
        public static final TargetTypeCase d;
        public static final TargetTypeCase e;
        public static final TargetTypeCase f;
        public static final /* synthetic */ TargetTypeCase[] g;

        static {
            TargetTypeCase targetTypeCase = new TargetTypeCase("QUERY", 0);
            d = targetTypeCase;
            TargetTypeCase targetTypeCase2 = new TargetTypeCase("DOCUMENTS", 1);
            e = targetTypeCase2;
            TargetTypeCase targetTypeCase3 = new TargetTypeCase("TARGETTYPE_NOT_SET", 2);
            f = targetTypeCase3;
            g = new TargetTypeCase[]{targetTypeCase, targetTypeCase2, targetTypeCase3};
        }

        public static TargetTypeCase valueOf(String str) {
            return (TargetTypeCase) Enum.valueOf(TargetTypeCase.class, str);
        }

        public static TargetTypeCase[] values() {
            return (TargetTypeCase[]) g.clone();
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.J(Target.class, target);
    }

    public static void L(Target target, Target.QueryTarget queryTarget) {
        target.getClass();
        target.targetType_ = queryTarget;
        target.targetTypeCase_ = 5;
    }

    public static void M(Target target, Target.DocumentsTarget documentsTarget) {
        target.getClass();
        target.targetType_ = documentsTarget;
        target.targetTypeCase_ = 6;
    }

    public static void N(Target target, Timestamp timestamp) {
        target.getClass();
        target.lastLimboFreeSnapshotVersion_ = timestamp;
        target.bitField0_ |= 2;
    }

    public static void O(Target target) {
        target.lastLimboFreeSnapshotVersion_ = null;
        target.bitField0_ &= -3;
    }

    public static void P(Target target, int i) {
        target.targetId_ = i;
    }

    public static void Q(Target target, Timestamp timestamp) {
        target.getClass();
        target.snapshotVersion_ = timestamp;
        target.bitField0_ |= 1;
    }

    public static void R(Target target, ByteString byteString) {
        target.getClass();
        byteString.getClass();
        target.resumeToken_ = byteString;
    }

    public static void S(Target target, long j) {
        target.lastListenSequenceNumber_ = j;
    }

    public static Builder b0() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public static Target c0(byte[] bArr) {
        return (Target) GeneratedMessageLite.H(DEFAULT_INSTANCE, bArr);
    }

    public final Target.DocumentsTarget T() {
        return this.targetTypeCase_ == 6 ? (Target.DocumentsTarget) this.targetType_ : Target.DocumentsTarget.M();
    }

    public final Timestamp U() {
        Timestamp timestamp = this.lastLimboFreeSnapshotVersion_;
        return timestamp == null ? Timestamp.N() : timestamp;
    }

    public final long V() {
        return this.lastListenSequenceNumber_;
    }

    public final Target.QueryTarget W() {
        return this.targetTypeCase_ == 5 ? (Target.QueryTarget) this.targetType_ : Target.QueryTarget.N();
    }

    public final ByteString X() {
        return this.resumeToken_;
    }

    public final Timestamp Y() {
        Timestamp timestamp = this.snapshotVersion_;
        return timestamp == null ? Timestamp.N() : timestamp;
    }

    public final int Z() {
        return this.targetId_;
    }

    public final TargetTypeCase a0() {
        int i = this.targetTypeCase_;
        if (i == 0) {
            return TargetTypeCase.f;
        }
        if (i == 5) {
            return TargetTypeCase.d;
        }
        if (i != 6) {
            return null;
        }
        return TargetTypeCase.e;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", Target.QueryTarget.class, Target.DocumentsTarget.class, "lastLimboFreeSnapshotVersion_"});
            case 3:
                return new Target();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Target> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Target.class) {
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
