package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes6.dex */
public final class WriteRequest extends GeneratedMessageLite<WriteRequest, Builder> implements WriteRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final WriteRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile Parser<WriteRequest> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private MapFieldLite<String, String> labels_ = MapFieldLite.e;
    private String database_ = "";
    private String streamId_ = "";
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.w();
    private ByteString streamToken_ = ByteString.e;

    /* renamed from: com.google.firestore.v1.WriteRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15903a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15903a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15903a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15903a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15903a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15903a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15903a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15903a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteRequest, Builder> implements WriteRequestOrBuilder {
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15904a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f15904a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    static {
        WriteRequest writeRequest = new WriteRequest();
        DEFAULT_INSTANCE = writeRequest;
        GeneratedMessageLite.J(WriteRequest.class, writeRequest);
    }

    public static void L(WriteRequest writeRequest, String str) {
        writeRequest.getClass();
        str.getClass();
        writeRequest.database_ = str;
    }

    public static void M(WriteRequest writeRequest, ByteString byteString) {
        writeRequest.getClass();
        byteString.getClass();
        writeRequest.streamToken_ = byteString;
    }

    public static void N(WriteRequest writeRequest, Write write) {
        writeRequest.getClass();
        Internal.ProtobufList<Write> protobufList = writeRequest.writes_;
        if (!protobufList.r()) {
            writeRequest.writes_ = GeneratedMessageLite.C(protobufList);
        }
        writeRequest.writes_.add(write);
    }

    public static WriteRequest O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder P() {
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", Write.class, "streamToken_", "labels_", LabelsDefaultEntryHolder.f15904a});
            case 3:
                return new WriteRequest();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<WriteRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WriteRequest.class) {
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
