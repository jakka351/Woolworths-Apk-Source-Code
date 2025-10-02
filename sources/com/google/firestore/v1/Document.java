package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Document extends GeneratedMessageLite<Document, Builder> implements DocumentOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final Document DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Document> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp createTime_;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.e;
    private String name_ = "";
    private Timestamp updateTime_;

    /* renamed from: com.google.firestore.v1.Document$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15870a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15870a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15870a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15870a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15870a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15870a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15870a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15870a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Document, Builder> implements DocumentOrBuilder {
    }

    public static final class FieldsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15871a = new MapEntryLite(WireFormat.FieldType.n, WireFormat.FieldType.p, Value.Z());
    }

    static {
        Document document = new Document();
        DEFAULT_INSTANCE = document;
        GeneratedMessageLite.J(Document.class, document);
    }

    public static void L(Document document, String str) {
        document.getClass();
        str.getClass();
        document.name_ = str;
    }

    public static MapFieldLite M(Document document) {
        MapFieldLite<String, Value> mapFieldLite = document.fields_;
        if (!mapFieldLite.d) {
            document.fields_ = mapFieldLite.c();
        }
        return document.fields_;
    }

    public static void N(Document document, Timestamp timestamp) {
        document.getClass();
        document.updateTime_ = timestamp;
        document.bitField0_ |= 2;
    }

    public static Document O() {
        return DEFAULT_INSTANCE;
    }

    public static Builder S() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final Map P() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final String Q() {
        return this.name_;
    }

    public final Timestamp R() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.N() : timestamp;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", FieldsDefaultEntryHolder.f15871a, "createTime_", "updateTime_"});
            case 3:
                return new Document();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Document> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Document.class) {
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
