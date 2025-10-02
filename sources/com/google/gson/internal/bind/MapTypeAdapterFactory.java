package com.google.gson.internal.bind;

import androidx.camera.core.impl.b;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor d;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter f15944a;
        public final TypeAdapter b;
        public final ObjectConstructor c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, ObjectConstructor objectConstructor) {
            this.f15944a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.c = objectConstructor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.c.a();
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            TypeAdapter typeAdapter = this.b;
            TypeAdapter typeAdapter2 = this.f15944a;
            if (jsonTokenPeek != jsonToken) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    Object obj = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).b.read(jsonReader);
                    if (map.put(obj, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).b.read(jsonReader)) != null) {
                        throw new JsonSyntaxException(b.m(obj, "duplicate key: "));
                    }
                }
                jsonReader.endObject();
                return map;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                Object obj2 = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).b.read(jsonReader);
                if (map.put(obj2, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).b.read(jsonReader)) != null) {
                    throw new JsonSyntaxException(b.m(obj2, "duplicate key: "));
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                this.b.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.d = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            C$Gson$Preconditions.a(Map.class.isAssignableFrom(rawType));
            Type typeH = C$Gson$Types.h(type, rawType, C$Gson$Types.e(type, rawType, Map.class), new HashMap());
            actualTypeArguments = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type[] typeArr = actualTypeArguments;
        return new Adapter(this, gson, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.c : gson.g(TypeToken.get(type2)), typeArr[1], gson.g(TypeToken.get(actualTypeArguments[1])), this.d.b(typeToken));
    }
}
