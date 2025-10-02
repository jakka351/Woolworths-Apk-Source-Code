package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class ListenRequest extends GeneratedMessageLite<ListenRequest, Builder> implements ListenRequestOrBuilder {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ListenRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile Parser<ListenRequest> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private MapFieldLite<String, String> labels_ = MapFieldLite.e;
    private String database_ = "";

    /* renamed from: com.google.firestore.v1.ListenRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15884a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15884a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15884a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15884a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15884a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15884a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15884a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15884a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListenRequest, Builder> implements ListenRequestOrBuilder {
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15885a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f15885a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TargetChangeCase {
        public static final /* synthetic */ TargetChangeCase[] d = {new TargetChangeCase("ADD_TARGET", 0), new TargetChangeCase("REMOVE_TARGET", 1), new TargetChangeCase("TARGETCHANGE_NOT_SET", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        TargetChangeCase EF5;

        public static TargetChangeCase valueOf(String str) {
            return (TargetChangeCase) Enum.valueOf(TargetChangeCase.class, str);
        }

        public static TargetChangeCase[] values() {
            return (TargetChangeCase[]) d.clone();
        }
    }

    static {
        ListenRequest listenRequest = new ListenRequest();
        DEFAULT_INSTANCE = listenRequest;
        GeneratedMessageLite.J(ListenRequest.class, listenRequest);
    }

    public static MapFieldLite L(ListenRequest listenRequest) {
        MapFieldLite<String, String> mapFieldLite = listenRequest.labels_;
        if (!mapFieldLite.d) {
            listenRequest.labels_ = mapFieldLite.c();
        }
        return listenRequest.labels_;
    }

    public static void M(ListenRequest listenRequest, String str) {
        listenRequest.getClass();
        str.getClass();
        listenRequest.database_ = str;
    }

    public static void N(ListenRequest listenRequest, Target target) {
        listenRequest.getClass();
        listenRequest.targetChange_ = target;
        listenRequest.targetChangeCase_ = 2;
    }

    public static void O(ListenRequest listenRequest, int i) {
        listenRequest.targetChangeCase_ = 3;
        listenRequest.targetChange_ = Integer.valueOf(i);
    }

    public static ListenRequest P() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Q() {
        return (Builder) DEFAULT_INSTANCE.r();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", Target.class, "labels_", LabelsDefaultEntryHolder.f15885a});
            case 3:
                return new ListenRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListenRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListenRequest.class) {
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
