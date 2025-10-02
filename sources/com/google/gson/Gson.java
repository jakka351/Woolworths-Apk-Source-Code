package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class Gson {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f15915a;
    public final ConcurrentHashMap b;
    public final ConstructorConstructor c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;
    public final Map f;
    public final boolean g;
    public final List h;
    public final List i;
    public final ToNumberStrategy j;
    public final ToNumberStrategy k;
    public final List l;

    /* renamed from: com.google.gson.Gson$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Number> {
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
                return;
            }
            double dDoubleValue = number.doubleValue();
            Gson.a(dDoubleValue);
            jsonWriter.value(dDoubleValue);
        }
    }

    /* renamed from: com.google.gson.Gson$2, reason: invalid class name */
    class AnonymousClass2 extends TypeAdapter<Number> {
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
            float fFloatValue = numberValueOf.floatValue();
            Gson.a(fFloatValue);
            if (!(numberValueOf instanceof Float)) {
                numberValueOf = Float.valueOf(fFloatValue);
            }
            jsonWriter.value(numberValueOf);
        }
    }

    public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public TypeAdapter f15918a = null;

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public final TypeAdapter a() {
            TypeAdapter typeAdapter = this.f15918a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) {
            TypeAdapter typeAdapter = this.f15918a;
            if (typeAdapter != null) {
                return typeAdapter.read(jsonReader);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) {
            TypeAdapter typeAdapter = this.f15918a;
            if (typeAdapter == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            typeAdapter.write(jsonWriter, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        Excluder excluder = Excluder.f;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(excluder, FieldNamingPolicy.d, map, true, true, LongSerializationPolicy.d, list, list, list, ToNumberPolicy.d, ToNumberPolicy.e, list);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(JsonElement jsonElement, Class cls) {
        return Primitives.a(cls).cast(jsonElement == null ? null : c(new JsonTreeReader(jsonElement), TypeToken.get(cls)));
    }

    public final Object c(JsonReader jsonReader, TypeToken typeToken) {
        boolean zIsLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    return g(typeToken).read(jsonReader);
                } catch (IOException e) {
                    throw new JsonSyntaxException(e);
                } catch (AssertionError e2) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new JsonSyntaxException(e3);
                }
                jsonReader.setLenient(zIsLenient);
                return null;
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
        } finally {
            jsonReader.setLenient(zIsLenient);
        }
    }

    public final Object d(Class cls, String str) {
        return Primitives.a(cls).cast(e(str, TypeToken.get(cls)));
    }

    public final Object e(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(false);
        Object objC = c(jsonReader, typeToken);
        if (objC != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return objC;
    }

    public final Object f(String str, Type type) {
        return e(str, TypeToken.get(type));
    }

    public final TypeAdapter g(TypeToken typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        TypeAdapter typeAdapter = (TypeAdapter) concurrentHashMap.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal threadLocal = this.f15915a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            TypeAdapter typeAdapter2 = (TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter);
            Iterator it = this.e.iterator();
            TypeAdapter typeAdapterA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                typeAdapterA = ((TypeAdapterFactory) it.next()).a(this, typeToken);
                if (typeAdapterA != null) {
                    if (futureTypeAdapter.f15918a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    futureTypeAdapter.f15918a = typeAdapterA;
                    map.put(typeToken, typeAdapterA);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (typeAdapterA != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return typeAdapterA;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final TypeAdapter h(TypeAdapterFactory typeAdapterFactory, TypeToken typeToken) {
        List<TypeAdapterFactory> list = this.e;
        if (!list.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.d;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : list) {
            if (z) {
                TypeAdapter typeAdapterA = typeAdapterFactory2.a(this, typeToken);
                if (typeAdapterA != null) {
                    return typeAdapterA;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final JsonWriter i(Writer writer) {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setHtmlSafe(this.g);
        jsonWriter.setLenient(false);
        jsonWriter.setSerializeNulls(false);
        return jsonWriter;
    }

    public final String j(Object obj) {
        if (obj != null) {
            return k(obj, obj.getClass());
        }
        StringWriter stringWriter = new StringWriter();
        try {
            l(i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final String k(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            m(obj, type, i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final void l(JsonWriter jsonWriter) {
        JsonNull jsonNull = JsonNull.d;
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.g);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(false);
        try {
            try {
                try {
                    TypeAdapters.z.write(jsonWriter, jsonNull);
                    jsonWriter.setLenient(zIsLenient);
                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final void m(Object obj, Type type, JsonWriter jsonWriter) {
        TypeAdapter typeAdapterG = g(TypeToken.get(type));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.g);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(false);
        try {
            try {
                typeAdapterG.write(jsonWriter, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public Gson(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, boolean z, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, ToNumberStrategy toNumberStrategy, ToNumberStrategy toNumberStrategy2, List list4) {
        final TypeAdapter<Number> typeAdapter;
        TypeAdapterFactory typeAdapterFactoryA;
        this.f15915a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        this.f = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z2, list4);
        this.c = constructorConstructor;
        this.g = z;
        this.h = list;
        this.i = list2;
        this.j = toNumberStrategy;
        this.k = toNumberStrategy2;
        this.l = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.A);
        arrayList.add(ObjectTypeAdapter.a(toNumberStrategy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.p);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.d);
        arrayList.add(TypeAdapters.e);
        arrayList.add(TypeAdapters.f);
        if (longSerializationPolicy == LongSerializationPolicy.d) {
            typeAdapter = TypeAdapters.k;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public final Object read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        return Long.valueOf(jsonReader.nextLong());
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
                        jsonWriter.value(number.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, new AnonymousClass1()));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, new AnonymousClass2()));
        if (toNumberStrategy2 == ToNumberPolicy.e) {
            typeAdapterFactoryA = NumberTypeAdapter.b;
        } else {
            typeAdapterFactoryA = NumberTypeAdapter.a(toNumberStrategy2);
        }
        arrayList.add(typeAdapterFactoryA);
        arrayList.add(TypeAdapters.h);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.b(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                return new AtomicLong(((Number) typeAdapter.read(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                typeAdapter.write(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList2.add(Long.valueOf(((Number) typeAdapter.read(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList2.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    typeAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.j);
        arrayList.add(TypeAdapters.l);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.r);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.m));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.n));
        arrayList.add(TypeAdapters.b(LazilyParsedNumber.class, TypeAdapters.o));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.t);
        arrayList.add(TypeAdapters.v);
        arrayList.add(TypeAdapters.w);
        arrayList.add(TypeAdapters.y);
        arrayList.add(TypeAdapters.u);
        arrayList.add(TypeAdapters.b);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.x);
        if (SqlTypesSupport.f15965a) {
            arrayList.add(SqlTypesSupport.e);
            arrayList.add(SqlTypesSupport.d);
            arrayList.add(SqlTypesSupport.f);
        }
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.f15954a);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
