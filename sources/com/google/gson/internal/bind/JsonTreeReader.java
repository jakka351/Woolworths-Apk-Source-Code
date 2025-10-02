package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import io.jsonwebtoken.JwtParser;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class JsonTreeReader extends JsonReader {
    public static final Reader h = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };
    public static final Object i = new Object();
    public Object[] d;
    public int e;
    public String[] f;
    public int[] g;

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15943a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f15943a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15943a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15943a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15943a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(h);
        this.d = new Object[32];
        this.e = 0;
        this.f = new String[32];
        this.g = new int[32];
        h(jsonElement);
    }

    public final void a(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + b());
    }

    public final String b() {
        return " at path " + getPath(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() {
        a(JsonToken.BEGIN_ARRAY);
        h(((JsonArray) e()).d.iterator());
        this.g[this.e - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() {
        a(JsonToken.BEGIN_OBJECT);
        h(((JsonObject) e()).d.entrySet().iterator());
    }

    public final JsonElement c() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) e();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d = new Object[]{i};
        this.e = 1;
    }

    public final String d(boolean z) {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) e()).next();
        String str = (String) entry.getKey();
        this.f[this.e - 1] = z ? "<skipped>" : str;
        h(entry.getValue());
        return str;
    }

    public final Object e() {
        return this.d[this.e - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() {
        a(JsonToken.END_ARRAY);
        f();
        f();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() {
        a(JsonToken.END_OBJECT);
        this.f[this.e - 1] = null;
        f();
        f();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final Object f() {
        Object[] objArr = this.d;
        int i2 = this.e - 1;
        this.e = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void g() {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) e()).next();
        h(entry.getValue());
        h(new JsonPrimitive((String) entry.getKey()));
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.e;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.d;
            Object obj = objArr[i2];
            if (obj instanceof JsonArray) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.g[i2];
                    if (z && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.f[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    public final void h(Object obj) {
        int i2 = this.e;
        Object[] objArr = this.d;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.d = Arrays.copyOf(objArr, i3);
            this.g = Arrays.copyOf(this.g, i3);
            this.f = (String[]) Arrays.copyOf(this.f, i3);
        }
        Object[] objArr2 = this.d;
        int i4 = this.e;
        this.e = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        a(JsonToken.BOOLEAN);
        boolean zH = ((JsonPrimitive) f()).h();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zH;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + b());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) e();
        double dDoubleValue = jsonPrimitive.d instanceof Number ? jsonPrimitive.i().doubleValue() : Double.parseDouble(jsonPrimitive.g());
        if (!isLenient() && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        f();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dDoubleValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + b());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) e();
        int iIntValue = jsonPrimitive.d instanceof Number ? jsonPrimitive.i().intValue() : Integer.parseInt(jsonPrimitive.g());
        f();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iIntValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + b());
        }
        long jD = ((JsonPrimitive) e()).d();
        f();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jD;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() {
        return d(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() {
        a(JsonToken.NULL);
        f();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + b());
        }
        String strG = ((JsonPrimitive) f()).g();
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strG;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws MalformedJsonException {
        if (this.e == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objE = e();
        if (objE instanceof Iterator) {
            boolean z = this.d[this.e - 2] instanceof JsonObject;
            Iterator it = (Iterator) objE;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            h(it.next());
            return peek();
        }
        if (objE instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objE instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objE instanceof JsonPrimitive) {
            Serializable serializable = ((JsonPrimitive) objE).d;
            if (serializable instanceof String) {
                return JsonToken.STRING;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (objE instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (objE == i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objE.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws MalformedJsonException {
        int i2 = AnonymousClass2.f15943a[peek().ordinal()];
        if (i2 == 1) {
            d(true);
            return;
        }
        if (i2 == 2) {
            endArray();
            return;
        }
        if (i2 == 3) {
            endObject();
            return;
        }
        if (i2 != 4) {
            f();
            int i3 = this.e;
            if (i3 > 0) {
                int[] iArr = this.g;
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return "JsonTreeReader" + b();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
