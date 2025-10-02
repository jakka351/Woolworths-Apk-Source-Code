package com.google.gson.internal.bind;

import androidx.constraintlayout.core.state.a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class TypeAdapters {
    public static final TypeAdapterFactory A;
    public static final TypeAdapterFactory B;

    /* renamed from: a, reason: collision with root package name */
    public static final TypeAdapterFactory f15954a = new AnonymousClass31(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) {
            throw new UnsupportedOperationException(a.f((Class) obj, new StringBuilder("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }.nullSafe());
    public static final TypeAdapterFactory b = new AnonymousClass31(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i2 = 0;
            while (jsonTokenPeek != JsonToken.END_ARRAY) {
                int i3 = AnonymousClass35.f15956a[jsonTokenPeek.ordinal()];
                boolean zNextBoolean = true;
                if (i3 == 1 || i3 == 2) {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        StringBuilder sbR = YU.a.r(iNextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbR.append(jsonReader.getPreviousPath());
                        throw new JsonSyntaxException(sbR.toString());
                    }
                } else {
                    if (i3 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                    }
                    zNextBoolean = jsonReader.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i2);
                }
                i2++;
                jsonTokenPeek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.value(bitSet.get(i2) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }.nullSafe());
    public static final TypeAdapter c;
    public static final TypeAdapterFactory d;
    public static final TypeAdapterFactory e;
    public static final TypeAdapterFactory f;
    public static final TypeAdapterFactory g;
    public static final TypeAdapterFactory h;
    public static final TypeAdapterFactory i;
    public static final TypeAdapterFactory j;
    public static final TypeAdapter k;
    public static final TypeAdapterFactory l;
    public static final TypeAdapter m;
    public static final TypeAdapter n;
    public static final TypeAdapter o;
    public static final TypeAdapterFactory p;
    public static final TypeAdapterFactory q;
    public static final TypeAdapterFactory r;
    public static final TypeAdapterFactory s;
    public static final TypeAdapterFactory t;
    public static final TypeAdapterFactory u;
    public static final TypeAdapterFactory v;
    public static final TypeAdapterFactory w;
    public static final TypeAdapterFactory x;
    public static final TypeAdapterFactory y;
    public static final TypeAdapter z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    class AnonymousClass31 implements TypeAdapterFactory {
        public final /* synthetic */ Class d;
        public final /* synthetic */ TypeAdapter e;

        public AnonymousClass31(Class cls, TypeAdapter typeAdapter) {
            this.d = cls;
            this.e = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == this.d) {
                return this.e;
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Factory[type=");
            a.x(this.d, sb, ",adapter=");
            sb.append(this.e);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    class AnonymousClass32 implements TypeAdapterFactory {
        public final /* synthetic */ Class d;
        public final /* synthetic */ Class e;
        public final /* synthetic */ TypeAdapter f;

        public AnonymousClass32(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.d = cls;
            this.e = cls2;
            this.f = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.d || rawType == this.e) {
                return this.f;
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Factory[type=");
            a.x(this.e, sb, "+");
            a.x(this.d, sb, ",adapter=");
            sb.append(this.f);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$35, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass35 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15956a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f15956a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15956a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15956a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15956a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15956a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15956a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f15957a = new HashMap();
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public EnumTypeAdapter(final Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                    @Override // java.security.PrivilegedAction
                    public final Field[] run() throws SecurityException {
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.f15957a.put(str, r4);
                        }
                    }
                    this.f15957a.put(strName, r4);
                    this.b.put(string, r4);
                    this.c.put(r4, strName);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            Enum r0 = (Enum) this.f15957a.get(strNextString);
            return r0 == null ? (Enum) this.b.get(strNextString) : r0;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            jsonWriter.value(r3 == null ? null : (String) this.c.get(r3));
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != JsonToken.NULL) {
                    return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value((Boolean) obj);
            }
        };
        c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        d = new AnonymousClass32(Boolean.TYPE, Boolean.class, typeAdapter);
        e = new AnonymousClass32(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 255 && iNextInt >= -128) {
                        return Byte.valueOf((byte) iNextInt);
                    }
                    StringBuilder sbR = YU.a.r(iNextInt, "Lossy conversion from ", " to byte; at path ");
                    sbR.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbR.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(r4.byteValue());
                }
            }
        });
        f = new AnonymousClass32(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 65535 && iNextInt >= -32768) {
                        return Short.valueOf((short) iNextInt);
                    }
                    StringBuilder sbR = YU.a.r(iNextInt, "Lossy conversion from ", " to short; at path ");
                    sbR.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbR.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(r4.shortValue());
                }
            }
        });
        g = new AnonymousClass32(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                if (((Number) obj) == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(r4.intValue());
                }
            }
        });
        h = new AnonymousClass31(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value(((AtomicInteger) obj).get());
            }
        }.nullSafe());
        i = new AnonymousClass31(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value(((AtomicBoolean) obj).get());
            }
        }.nullSafe());
        j = new AnonymousClass31(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.beginArray();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(r6.get(i2));
                }
                jsonWriter.endArray();
            }
        }.nullSafe());
        k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    jsonWriter.nullValue();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                jsonWriter.value(numberValueOf);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }
        };
        l = new AnonymousClass32(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                StringBuilder sbU = YU.a.u("Expecting character, got: ", strNextString, "; at ");
                sbU.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbU.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                Character ch = (Character) obj;
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek != JsonToken.NULL) {
                    return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value((String) obj);
            }
        };
        m = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e2) {
                    StringBuilder sbU = YU.a.u("Failed parsing '", strNextString, "' as BigDecimal; at path ");
                    sbU.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbU.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value((BigDecimal) obj);
            }
        };
        n = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return new BigInteger(strNextString);
                } catch (NumberFormatException e2) {
                    StringBuilder sbU = YU.a.u("Failed parsing '", strNextString, "' as BigInteger; at path ");
                    sbU.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbU.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value((BigInteger) obj);
            }
        };
        o = new TypeAdapter<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value((LazilyParsedNumber) obj);
            }
        };
        p = new AnonymousClass31(String.class, typeAdapter2);
        q = new AnonymousClass31(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        });
        r = new AnonymousClass31(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        s = new AnonymousClass31(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URL(strNextString);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                URL url = (URL) obj;
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        });
        t = new AnonymousClass31(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString = jsonReader.nextString();
                    if ("null".equals(strNextString)) {
                        return null;
                    }
                    return new URI(strNextString);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                URI uri = (URI) obj;
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        u = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter a(Gson gson, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object read(JsonReader jsonReader) {
                            Object obj = typeAdapter3.read(jsonReader);
                            if (obj != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(obj)) {
                                    throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + obj.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                                }
                            }
                            return obj;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void write(JsonWriter jsonWriter, Object obj) {
                            typeAdapter3.write(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                a.x(cls, sb, ",adapter=");
                sb.append(typeAdapter3);
                sb.append("]");
                return sb.toString();
            }
        };
        v = new AnonymousClass31(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return UUID.fromString(strNextString);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbU = YU.a.u("Failed parsing '", strNextString, "' as UUID; at path ");
                    sbU.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbU.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        });
        w = new AnonymousClass31(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(strNextString);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbU = YU.a.u("Failed parsing '", strNextString, "' as Currency; at path ");
                    sbU.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbU.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                jsonWriter.value(((Currency) obj).getCurrencyCode());
            }
        }.nullSafe());
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    int iNextInt = jsonReader.nextInt();
                    if ("year".equals(strNextName)) {
                        i2 = iNextInt;
                    } else if ("month".equals(strNextName)) {
                        i3 = iNextInt;
                    } else if ("dayOfMonth".equals(strNextName)) {
                        i4 = iNextInt;
                    } else if ("hourOfDay".equals(strNextName)) {
                        i5 = iNextInt;
                    } else if ("minute".equals(strNextName)) {
                        i6 = iNextInt;
                    } else if ("second".equals(strNextName)) {
                        i7 = iNextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                if (((Calendar) obj) == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(r4.get(1));
                jsonWriter.name("month");
                jsonWriter.value(r4.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(r4.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(r4.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(r4.get(12));
                jsonWriter.name("second");
                jsonWriter.value(r4.get(13));
                jsonWriter.endObject();
            }
        };
        x = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return typeAdapter4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + typeAdapter4 + "]";
            }
        };
        y = new AnonymousClass31(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        });
        final TypeAdapter<JsonElement> typeAdapter5 = new TypeAdapter<JsonElement>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            public static JsonElement a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i2 = AnonymousClass35.f15956a[jsonToken.ordinal()];
                if (i2 == 1) {
                    return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
                }
                if (i2 == 2) {
                    return new JsonPrimitive(jsonReader.nextString());
                }
                if (i2 == 3) {
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                if (i2 == 6) {
                    jsonReader.nextNull();
                    return JsonNull.d;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            public static JsonElement b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i2 = AnonymousClass35.f15956a[jsonToken.ordinal()];
                if (i2 == 4) {
                    jsonReader.beginArray();
                    return new JsonArray();
                }
                if (i2 != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new JsonObject();
            }

            public static void c(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
                if (jsonElement == null || (jsonElement instanceof JsonNull)) {
                    jsonWriter.nullValue();
                    return;
                }
                boolean z2 = jsonElement instanceof JsonPrimitive;
                if (z2) {
                    if (!z2) {
                        throw new IllegalStateException("Not a JSON Primitive: " + jsonElement);
                    }
                    JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                    if (jsonPrimitive.l()) {
                        jsonWriter.value(jsonPrimitive.i());
                        return;
                    } else if (jsonPrimitive.j()) {
                        jsonWriter.value(jsonPrimitive.h());
                        return;
                    } else {
                        jsonWriter.value(jsonPrimitive.g());
                        return;
                    }
                }
                boolean z3 = jsonElement instanceof JsonArray;
                if (z3) {
                    jsonWriter.beginArray();
                    if (!z3) {
                        throw new IllegalStateException("Not a JSON Array: " + jsonElement);
                    }
                    Iterator<JsonElement> it = ((JsonArray) jsonElement).iterator();
                    while (it.hasNext()) {
                        c(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (!(jsonElement instanceof JsonObject)) {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
                jsonWriter.beginObject();
                for (Map.Entry entry : jsonElement.b().entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    c(jsonWriter, (JsonElement) entry.getValue());
                }
                jsonWriter.endObject();
            }

            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    return ((JsonTreeReader) jsonReader).c();
                }
                JsonToken jsonTokenPeek = jsonReader.peek();
                JsonElement jsonElementB = b(jsonReader, jsonTokenPeek);
                if (jsonElementB == null) {
                    return a(jsonReader, jsonTokenPeek);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String strNextName = jsonElementB instanceof JsonObject ? jsonReader.nextName() : null;
                        JsonToken jsonTokenPeek2 = jsonReader.peek();
                        JsonElement jsonElementB2 = b(jsonReader, jsonTokenPeek2);
                        boolean z2 = jsonElementB2 != null;
                        if (jsonElementB2 == null) {
                            jsonElementB2 = a(jsonReader, jsonTokenPeek2);
                        }
                        if (jsonElementB instanceof JsonArray) {
                            ((JsonArray) jsonElementB).h(jsonElementB2);
                        } else {
                            ((JsonObject) jsonElementB).h(strNextName, jsonElementB2);
                        }
                        if (z2) {
                            arrayDeque.addLast(jsonElementB);
                            jsonElementB = jsonElementB2;
                        }
                    } else {
                        if (jsonElementB instanceof JsonArray) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return jsonElementB;
                        }
                        jsonElementB = (JsonElement) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
                c(jsonWriter, (JsonElement) obj);
            }
        };
        z = typeAdapter5;
        final Class<JsonElement> cls2 = JsonElement.class;
        A = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter a(Gson gson, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object read(JsonReader jsonReader) {
                            Object obj = typeAdapter5.read(jsonReader);
                            if (obj != null) {
                                Class cls22 = rawType;
                                if (!cls22.isInstance(obj)) {
                                    throw new JsonSyntaxException("Expected a " + cls22.getName() + " but was " + obj.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                                }
                            }
                            return obj;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void write(JsonWriter jsonWriter, Object obj) {
                            typeAdapter5.write(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                a.x(cls2, sb, ",adapter=");
                sb.append(typeAdapter5);
                sb.append("]");
                return sb.toString();
            }
        };
        B = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter a(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    public static TypeAdapterFactory a(final TypeToken typeToken, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter a(Gson gson, TypeToken typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static TypeAdapterFactory b(Class cls, TypeAdapter typeAdapter) {
        return new AnonymousClass31(cls, typeAdapter);
    }

    public static TypeAdapterFactory c(Class cls, Class cls2, TypeAdapter typeAdapter) {
        return new AnonymousClass32(cls, cls2, typeAdapter);
    }
}
