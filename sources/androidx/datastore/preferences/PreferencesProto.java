package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PreferencesProto {

    /* renamed from: androidx.datastore.preferences.PreferencesProto$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2583a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f2583a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2583a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2583a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2583a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2583a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2583a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2583a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.e;

        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        }

        public static final class PreferencesDefaultEntryHolder {

            /* renamed from: a, reason: collision with root package name */
            public static final MapEntryLite f2584a = new MapEntryLite(WireFormat.FieldType.n, WireFormat.FieldType.p, Value.D());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.s(PreferenceMap.class, preferenceMap);
        }

        public static MapFieldLite t(PreferenceMap preferenceMap) {
            MapFieldLite<String, Value> mapFieldLite = preferenceMap.preferences_;
            if (!mapFieldLite.d) {
                preferenceMap.preferences_ = mapFieldLite.c();
            }
            return preferenceMap.preferences_;
        }

        public static Builder v() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.h, null));
        }

        public static PreferenceMap w(InputStream inputStream) throws InvalidProtocolBufferException {
            GeneratedMessageLite generatedMessageLiteR = GeneratedMessageLite.r(DEFAULT_INSTANCE, CodedInputStream.f(inputStream), ExtensionRegistryLite.a());
            if (GeneratedMessageLite.m(generatedMessageLiteR, true)) {
                return (PreferenceMap) generatedMessageLiteR;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.p(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.f2584a});
                case 3:
                    return new PreferenceMap();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<PreferenceMap> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PreferenceMap.class) {
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

        public final Map u() {
            return Collections.unmodifiableMap(this.preferences_);
        }
    }

    /* loaded from: classes.dex */
    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.i();

        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.s(StringSet.class, stringSet);
        }

        public static void t(StringSet stringSet, Iterable iterable) {
            Internal.ProtobufList<String> protobufList = stringSet.strings_;
            if (!protobufList.r()) {
                int size = protobufList.size();
                stringSet.strings_ = protobufList.a(size == 0 ? 10 : size * 2);
            }
            AbstractMessageLite.c(iterable, stringSet.strings_);
        }

        public static StringSet u() {
            return DEFAULT_INSTANCE;
        }

        public static Builder w() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.h, null));
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.p(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 3:
                    return new StringSet();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<StringSet> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StringSet.class) {
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

        public final Internal.ProtobufList v() {
            return this.strings_;
        }
    }

    /* loaded from: classes.dex */
    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ValueCase {
            public static final ValueCase d;
            public static final ValueCase e;
            public static final ValueCase f;
            public static final ValueCase g;
            public static final ValueCase h;
            public static final ValueCase i;
            public static final ValueCase j;
            public static final ValueCase k;
            public static final ValueCase l;
            public static final /* synthetic */ ValueCase[] m;

            static {
                ValueCase valueCase = new ValueCase("BOOLEAN", 0);
                d = valueCase;
                ValueCase valueCase2 = new ValueCase("FLOAT", 1);
                e = valueCase2;
                ValueCase valueCase3 = new ValueCase("INTEGER", 2);
                f = valueCase3;
                ValueCase valueCase4 = new ValueCase("LONG", 3);
                g = valueCase4;
                ValueCase valueCase5 = new ValueCase("STRING", 4);
                h = valueCase5;
                ValueCase valueCase6 = new ValueCase("STRING_SET", 5);
                i = valueCase6;
                ValueCase valueCase7 = new ValueCase("DOUBLE", 6);
                j = valueCase7;
                ValueCase valueCase8 = new ValueCase("BYTES", 7);
                k = valueCase8;
                ValueCase valueCase9 = new ValueCase("VALUE_NOT_SET", 8);
                l = valueCase9;
                m = new ValueCase[]{valueCase, valueCase2, valueCase3, valueCase4, valueCase5, valueCase6, valueCase7, valueCase8, valueCase9};
            }

            public static ValueCase valueOf(String str) {
                return (ValueCase) Enum.valueOf(ValueCase.class, str);
            }

            public static ValueCase[] values() {
                return (ValueCase[]) m.clone();
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.s(Value.class, value);
        }

        public static void A(Value value, int i) {
            value.valueCase_ = 3;
            value.value_ = Integer.valueOf(i);
        }

        public static Value D() {
            return DEFAULT_INSTANCE;
        }

        public static Builder L() {
            return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.h(GeneratedMessageLite.MethodToInvoke.h, null));
        }

        public static void t(Value value, long j) {
            value.valueCase_ = 4;
            value.value_ = Long.valueOf(j);
        }

        public static void u(Value value, String str) {
            value.getClass();
            value.valueCase_ = 5;
            value.value_ = str;
        }

        public static void v(Value value, StringSet stringSet) {
            value.getClass();
            value.value_ = stringSet;
            value.valueCase_ = 6;
        }

        public static void w(Value value, double d) {
            value.valueCase_ = 7;
            value.value_ = Double.valueOf(d);
        }

        public static void x(Value value, ByteString byteString) {
            value.getClass();
            value.valueCase_ = 8;
            value.value_ = byteString;
        }

        public static void y(Value value, boolean z) {
            value.valueCase_ = 1;
            value.value_ = Boolean.valueOf(z);
        }

        public static void z(Value value, float f) {
            value.valueCase_ = 2;
            value.value_ = Float.valueOf(f);
        }

        public final boolean B() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public final ByteString C() {
            return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.e;
        }

        public final double E() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        public final float F() {
            return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : BitmapDescriptorFactory.HUE_RED;
        }

        public final int G() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public final long H() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        public final String I() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        public final StringSet J() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.u();
        }

        public final ValueCase K() {
            switch (this.valueCase_) {
                case 0:
                    return ValueCase.l;
                case 1:
                    return ValueCase.d;
                case 2:
                    return ValueCase.e;
                case 3:
                    return ValueCase.f;
                case 4:
                    return ValueCase.g;
                case 5:
                    return ValueCase.h;
                case 6:
                    return ValueCase.i;
                case 7:
                    return ValueCase.j;
                case 8:
                    return ValueCase.k;
                default:
                    return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.p(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", StringSet.class});
                case 3:
                    return new Value();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Value> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Value.class) {
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

    /* loaded from: classes.dex */
    public interface ValueOrBuilder extends MessageLiteOrBuilder {
    }
}
