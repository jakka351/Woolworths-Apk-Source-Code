package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes6.dex */
public final class Precondition extends GeneratedMessageLite<Precondition, Builder> implements PreconditionOrBuilder {
    private static final Precondition DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile Parser<Precondition> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* renamed from: com.google.firestore.v1.Precondition$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15889a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15889a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15889a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15889a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15889a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15889a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15889a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15889a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Precondition, Builder> implements PreconditionOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConditionTypeCase {
        public static final ConditionTypeCase d;
        public static final ConditionTypeCase e;
        public static final ConditionTypeCase f;
        public static final /* synthetic */ ConditionTypeCase[] g;

        static {
            ConditionTypeCase conditionTypeCase = new ConditionTypeCase("EXISTS", 0);
            d = conditionTypeCase;
            ConditionTypeCase conditionTypeCase2 = new ConditionTypeCase("UPDATE_TIME", 1);
            e = conditionTypeCase2;
            ConditionTypeCase conditionTypeCase3 = new ConditionTypeCase("CONDITIONTYPE_NOT_SET", 2);
            f = conditionTypeCase3;
            g = new ConditionTypeCase[]{conditionTypeCase, conditionTypeCase2, conditionTypeCase3};
        }

        public static ConditionTypeCase valueOf(String str) {
            return (ConditionTypeCase) Enum.valueOf(ConditionTypeCase.class, str);
        }

        public static ConditionTypeCase[] values() {
            return (ConditionTypeCase[]) g.clone();
        }
    }

    static {
        Precondition precondition = new Precondition();
        DEFAULT_INSTANCE = precondition;
        GeneratedMessageLite.J(Precondition.class, precondition);
    }

    public static void L(Precondition precondition, boolean z) {
        precondition.conditionTypeCase_ = 1;
        precondition.conditionType_ = Boolean.valueOf(z);
    }

    public static void M(Precondition precondition, Timestamp timestamp) {
        precondition.getClass();
        precondition.conditionType_ = timestamp;
        precondition.conditionTypeCase_ = 2;
    }

    public static Precondition O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder R() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final ConditionTypeCase N() {
        int i = this.conditionTypeCase_;
        if (i == 0) {
            return ConditionTypeCase.f;
        }
        if (i == 1) {
            return ConditionTypeCase.d;
        }
        if (i != 2) {
            return null;
        }
        return ConditionTypeCase.e;
    }

    public final boolean P() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public final Timestamp Q() {
        return this.conditionTypeCase_ == 2 ? (Timestamp) this.conditionType_ : Timestamp.N();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", Timestamp.class});
            case 3:
                return new Precondition();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Precondition> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Precondition.class) {
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
