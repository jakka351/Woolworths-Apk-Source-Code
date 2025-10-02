package com.google.firestore.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class MapValue extends GeneratedMessageLite<MapValue, Builder> implements MapValueOrBuilder {
    private static final MapValue DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<MapValue> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.e;

    /* renamed from: com.google.firestore.v1.MapValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15887a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15887a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15887a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15887a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15887a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15887a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15887a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15887a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MapValue, Builder> implements MapValueOrBuilder {
        public final void t(Value value, String str) {
            str.getClass();
            p();
            MapValue.L((MapValue) this.e).put(str, value);
        }
    }

    public static final class FieldsDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15888a = new MapEntryLite(WireFormat.FieldType.n, WireFormat.FieldType.p, Value.Z());
    }

    static {
        MapValue mapValue = new MapValue();
        DEFAULT_INSTANCE = mapValue;
        GeneratedMessageLite.J(MapValue.class, mapValue);
    }

    public static MapFieldLite L(MapValue mapValue) {
        MapFieldLite<String, Value> mapFieldLite = mapValue.fields_;
        if (!mapFieldLite.d) {
            mapValue.fields_ = mapFieldLite.c();
        }
        return mapValue.fields_;
    }

    public static MapValue M() {
        return DEFAULT_INSTANCE;
    }

    public static Builder R() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final int N() {
        return this.fields_.size();
    }

    public final Map O() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final Value P(String str) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        return null;
    }

    public final Value Q(String str) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        throw new IllegalArgumentException();
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.f15888a});
            case 3:
                return new MapValue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<MapValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MapValue.class) {
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
