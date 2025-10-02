package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final JsonSerializer f15951a;
    public final JsonDeserializer b;
    public final Gson c;
    public final TypeToken d;
    public final TypeAdapterFactory e;
    public final GsonContextImpl f = new GsonContextImpl();
    public final boolean g;
    public volatile TypeAdapter h;

    /* loaded from: classes6.dex */
    public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        public GsonContextImpl() {
        }

        @Override // com.google.gson.JsonDeserializationContext
        public final Object a(JsonElement jsonElement, Type type) {
            Gson gson = TreeTypeAdapter.this.c;
            gson.getClass();
            TypeToken<?> typeToken = TypeToken.get(type);
            if (jsonElement == null) {
                return null;
            }
            return gson.c(new JsonTreeReader(jsonElement), typeToken);
        }
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {
        public final TypeToken d;
        public final boolean e;
        public final JsonSerializer f;
        public final JsonDeserializer g;

        public SingleTypeFactory(Object obj, TypeToken typeToken, boolean z) {
            JsonSerializer jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.f = jsonSerializer;
            JsonDeserializer jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            this.g = jsonDeserializer;
            C$Gson$Preconditions.a((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.d = typeToken;
            this.e = z;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter a(Gson gson, TypeToken typeToken) {
            TypeToken typeToken2 = this.d;
            if (typeToken2 == null) {
                typeToken.getRawType();
                throw null;
            }
            if (!typeToken2.equals(typeToken) && (!this.e || typeToken2.getType() != typeToken.getRawType())) {
                return null;
            }
            return new TreeTypeAdapter(this.f, this.g, gson, typeToken, this, true);
        }
    }

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, TypeAdapterFactory typeAdapterFactory, boolean z) {
        this.f15951a = jsonSerializer;
        this.b = jsonDeserializer;
        this.c = gson;
        this.d = typeToken;
        this.e = typeAdapterFactory;
        this.g = z;
    }

    public static TypeAdapterFactory b(TypeToken typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType());
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final TypeAdapter a() {
        if (this.f15951a != null) {
            return this;
        }
        TypeAdapter typeAdapter = this.h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter typeAdapterH = this.c.h(this.e, this.d);
        this.h = typeAdapterH;
        return typeAdapterH;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        JsonDeserializer jsonDeserializer = this.b;
        if (jsonDeserializer == null) {
            TypeAdapter typeAdapterH = this.h;
            if (typeAdapterH == null) {
                typeAdapterH = this.c.h(this.e, this.d);
                this.h = typeAdapterH;
            }
            return typeAdapterH.read(jsonReader);
        }
        JsonElement jsonElementA = Streams.a(jsonReader);
        if (this.g) {
            jsonElementA.getClass();
            if (jsonElementA instanceof JsonNull) {
                return null;
            }
        }
        return jsonDeserializer.deserialize(jsonElementA, this.d.getType(), this.f);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        JsonSerializer jsonSerializer = this.f15951a;
        if (jsonSerializer == null) {
            TypeAdapter typeAdapterH = this.h;
            if (typeAdapterH == null) {
                typeAdapterH = this.c.h(this.e, this.d);
                this.h = typeAdapterH;
            }
            typeAdapterH.write(jsonWriter, obj);
            return;
        }
        if (this.g && obj == null) {
            jsonWriter.nullValue();
            return;
        }
        this.d.getType();
        TypeAdapters.z.write(jsonWriter, jsonSerializer.a());
    }
}
