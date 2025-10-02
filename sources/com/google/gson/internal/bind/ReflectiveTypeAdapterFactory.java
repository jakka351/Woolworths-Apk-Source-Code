package com.google.gson.internal.bind;

import YU.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor d;
    public final FieldNamingStrategy e;
    public final Excluder f;
    public final List g;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f15949a;

        public Adapter(LinkedHashMap linkedHashMap) {
            this.f15949a = linkedHashMap;
        }

        public abstract Object a();

        public abstract Object b(Object obj);

        public abstract void c(Object obj, JsonReader jsonReader, BoundField boundField);

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Object objA = a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = (BoundField) this.f15949a.get(jsonReader.nextName());
                    if (boundField == null || !boundField.e) {
                        jsonReader.skipValue();
                    } else {
                        c(objA, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return b(objA);
            } catch (IllegalAccessException e) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator it = this.f15949a.values().iterator();
                while (it.hasNext()) {
                    ((BoundField) it.next()).c(jsonWriter, obj);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }
    }

    public static abstract class BoundField {

        /* renamed from: a, reason: collision with root package name */
        public final String f15950a;
        public final Field b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public BoundField(String str, Field field, boolean z, boolean z2) {
            this.f15950a = str;
            this.b = field;
            this.c = field.getName();
            this.d = z;
            this.e = z2;
        }

        public abstract void a(JsonReader jsonReader, int i, Object[] objArr);

        public abstract void b(JsonReader jsonReader, Object obj);

        public abstract void c(JsonWriter jsonWriter, Object obj);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        public final ObjectConstructor b;

        public FieldReflectionAdapter(ObjectConstructor objectConstructor, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.b = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object a() {
            return this.b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object b(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void c(Object obj, JsonReader jsonReader, BoundField boundField) {
            boundField.b(jsonReader, obj);
        }
    }

    /* loaded from: classes6.dex */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        public static final HashMap e;
        public final Constructor b;
        public final Object[] c;
        public final HashMap d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            e = map;
        }

        public RecordAdapter(Class cls, LinkedHashMap linkedHashMap, boolean z) throws SecurityException {
            super(linkedHashMap);
            this.d = new HashMap();
            Constructor constructorF = ReflectionHelper.f(cls);
            this.b = constructorF;
            if (z) {
                ReflectiveTypeAdapterFactory.b(null, constructorF);
            } else {
                ReflectionHelper.i(constructorF);
            }
            String[] strArrG = ReflectionHelper.g(cls);
            for (int i = 0; i < strArrG.length; i++) {
                this.d.put(strArrG[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object a() {
            return (Object[]) this.c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object b(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.f15960a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void c(Object obj, JsonReader jsonReader, BoundField boundField) {
            Object[] objArr = (Object[]) obj;
            String str = boundField.c;
            Integer num = (Integer) this.d.get(str);
            if (num != null) {
                boundField.a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.d = constructorConstructor;
        this.e = fieldNamingStrategy;
        this.f = excluder;
        this.g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!ReflectionAccessFilterHelper.a(obj, accessibleObject)) {
            throw new JsonIOException(a.g(ReflectionHelper.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult filterResultB = ReflectionAccessFilterHelper.b(rawType, this.g);
        if (filterResultB == ReflectionAccessFilter.FilterResult.g) {
            throw new JsonIOException(androidx.constraintlayout.core.state.a.e(rawType, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = filterResultB == ReflectionAccessFilter.FilterResult.f;
        return ReflectionHelper.h(rawType) ? new RecordAdapter(rawType, c(gson, typeToken, rawType, z, true), z) : new FieldReflectionAdapter(this.d.b(typeToken), c(gson, typeToken, rawType, z, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap c(com.google.gson.Gson r29, com.google.gson.reflect.TypeToken r30, java.lang.Class r31, boolean r32, boolean r33) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):java.util.LinkedHashMap");
    }

    public final boolean d(Field field, boolean z) {
        Class<?> type = field.getType();
        Excluder excluder = this.f;
        excluder.getClass();
        if (Excluder.c(type) || excluder.b(type, z) || (136 & field.getModifiers()) != 0 || field.isSynthetic() || Excluder.c(field.getType())) {
            return false;
        }
        List list = z ? excluder.d : excluder.e;
        if (list.isEmpty()) {
            return true;
        }
        new FieldAttributes(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ExclusionStrategy) it.next()).b()) {
                return false;
            }
        }
        return true;
    }
}
