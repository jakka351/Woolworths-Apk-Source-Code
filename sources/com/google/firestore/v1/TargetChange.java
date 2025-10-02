package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;

/* loaded from: classes6.dex */
public final class TargetChange extends GeneratedMessageLite<TargetChange, Builder> implements TargetChangeOrBuilder {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final TargetChange DEFAULT_INSTANCE;
    private static volatile Parser<TargetChange> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Status cause_;
    private Timestamp readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = GeneratedMessageLite.u();
    private ByteString resumeToken_ = ByteString.e;

    /* renamed from: com.google.firestore.v1.TargetChange$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15898a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15898a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15898a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15898a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15898a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15898a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15898a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15898a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TargetChange, Builder> implements TargetChangeOrBuilder {
    }

    public enum TargetChangeType implements Internal.EnumLite {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.firestore.v1.TargetChange$TargetChangeType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<TargetChangeType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return TargetChangeType.a(i);
            }
        }

        public static final class TargetChangeTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return TargetChangeType.a(i) != null;
            }
        }

        TargetChangeType(int i) {
            this.d = i;
        }

        public static TargetChangeType a(int i) {
            if (i == 0) {
                return NO_CHANGE;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return REMOVE;
            }
            if (i == 3) {
                return CURRENT;
            }
            if (i != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        TargetChange targetChange = new TargetChange();
        DEFAULT_INSTANCE = targetChange;
        GeneratedMessageLite.J(TargetChange.class, targetChange);
    }

    public static TargetChange M() {
        return DEFAULT_INSTANCE;
    }

    public final Status L() {
        Status status = this.cause_;
        return status == null ? Status.M() : status;
    }

    public final Timestamp N() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.N() : timestamp;
    }

    public final ByteString O() {
        return this.resumeToken_;
    }

    public final TargetChangeType P() {
        TargetChangeType targetChangeTypeA = TargetChangeType.a(this.targetChangeType_);
        return targetChangeTypeA == null ? TargetChangeType.UNRECOGNIZED : targetChangeTypeA;
    }

    public final int Q() {
        return this.targetIds_.size();
    }

    public final Internal.IntList R() {
        return this.targetIds_;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new TargetChange();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<TargetChange> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TargetChange.class) {
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
