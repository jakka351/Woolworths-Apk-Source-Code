package com.google.gson.internal.bind;

import YU.a;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class JsonTreeWriter extends JsonWriter {
    public static final Writer g = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    public static final JsonPrimitive h = new JsonPrimitive("closed");
    public final ArrayList d;
    public String e;
    public JsonElement f;

    public JsonTreeWriter() {
        super(g);
        this.d = new ArrayList();
        this.f = JsonNull.d;
    }

    public final JsonElement a() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.f;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final JsonElement b() {
        return (JsonElement) a.c(1, this.d);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() {
        JsonArray jsonArray = new JsonArray();
        c(jsonArray);
        this.d.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() {
        JsonObject jsonObject = new JsonObject();
        c(jsonObject);
        this.d.add(jsonObject);
        return this;
    }

    public final void c(JsonElement jsonElement) {
        if (this.e != null) {
            if (!(jsonElement instanceof JsonNull) || getSerializeNulls()) {
                ((JsonObject) b()).h(this.e, jsonElement);
            }
            this.e = null;
            return;
        }
        if (this.d.isEmpty()) {
            this.f = jsonElement;
            return;
        }
        JsonElement jsonElementB = b();
        if (!(jsonElementB instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) jsonElementB).h(jsonElement);
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(h);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() || this.e != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() || this.e != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.d.isEmpty() || this.e != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.e = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() {
        c(JsonNull.d);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (bool == null) {
            c(JsonNull.d);
            return this;
        }
        c(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            c(JsonNull.d);
            return this;
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) {
        if (str == null) {
            c(JsonNull.d);
            return this;
        }
        c(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) {
        c(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(float f) {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        c(new JsonPrimitive(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        c(new JsonPrimitive(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) {
        c(new JsonPrimitive(Long.valueOf(j)));
        return this;
    }
}
