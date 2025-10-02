package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor d;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter f15939a;
        public final ObjectConstructor b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, ObjectConstructor objectConstructor) {
            this.f15939a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = objectConstructor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f15939a).b.read(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f15939a.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.d = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C$Gson$Preconditions.a(Collection.class.isAssignableFrom(rawType));
        Type typeH = C$Gson$Types.h(type, rawType, C$Gson$Types.e(type, rawType, Collection.class), new HashMap());
        Class cls = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, cls, gson.g(TypeToken.get(cls)), this.d.b(typeToken));
    }
}
