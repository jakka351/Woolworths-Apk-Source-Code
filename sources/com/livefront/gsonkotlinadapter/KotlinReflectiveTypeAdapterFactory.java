package com.livefront.gsonkotlinadapter;

import androidx.compose.ui.platform.i;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/livefront/gsonkotlinadapter/KotlinReflectiveTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "Adapter", "Companion", "gson-kotlin-adapter"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class KotlinReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/livefront/gsonkotlinadapter/KotlinReflectiveTypeAdapterFactory$Adapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/gson/TypeAdapter;", "gson-kotlin-adapter"}, k = 1, mv = {1, 4, 0})
    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final KFunction f16310a;
        public final Class b;
        public final LinkedHashMap c;
        public final Map d;
        public final ArrayList e;
        public final Map f;
        public final TypeAdapter g;
        public final LinkedHashMap h;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.Collection] */
        public Adapter(KotlinReflectiveTypeAdapterFactory kotlinReflectiveTypeAdapterFactory, Gson gson, TypeToken type, KClass kClass) throws NoSuchFieldException {
            Field declaredField;
            Caller callerQ;
            Intrinsics.i(type, "type");
            KFunction kFunctionA = KClasses.a(kClass);
            if (kFunctionA == null) {
                Intrinsics.n();
                throw null;
            }
            this.f16310a = kFunctionA;
            KCallableImpl kCallableImplA = UtilKt.a(kFunctionA);
            Member f24299a = (kCallableImplA == null || (callerQ = kCallableImplA.q()) == null) ? null : callerQ.getF24299a();
            Constructor constructor = f24299a instanceof Constructor ? (Constructor) f24299a : null;
            Class<T> declaringClass = constructor != null ? constructor.getDeclaringClass() : null;
            if (declaringClass == null) {
                Intrinsics.n();
                throw null;
            }
            this.b = declaringClass;
            List parameters = kFunctionA.getParameters();
            ArrayList arrayList = new ArrayList();
            for (T t : parameters) {
                if (!((KParameter) t).k()) {
                    arrayList.add(t);
                }
            }
            int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(next, null);
            }
            this.c = linkedHashMap;
            List<KParameter> parameters2 = this.f16310a.getParameters();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(parameters2, 10));
            for (KParameter getSerializedNames : parameters2) {
                Class declaringClass2 = this.b;
                Intrinsics.i(getSerializedNames, "$this$getSerializedNames");
                Intrinsics.i(declaringClass2, "declaringClass");
                String name = getSerializedNames.getName();
                Object objQ = EmptyList.d;
                if (name != null) {
                    try {
                        declaredField = declaringClass2.getDeclaredField(name);
                    } catch (NoSuchFieldException unused) {
                        declaredField = null;
                    }
                    SerializedName serializedName = declaredField != null ? (SerializedName) declaredField.getAnnotation(SerializedName.class) : null;
                    if (declaredField != null && !Modifier.isTransient(declaredField.getModifiers())) {
                        if (serializedName != null) {
                            List listQ = CollectionsKt.Q(serializedName.value());
                            String[] elements = serializedName.alternate();
                            Intrinsics.h(elements, "elements");
                            objQ = new ArrayList(listQ.size() + elements.length);
                            objQ.addAll(listQ);
                            CollectionsKt.j(objQ, elements);
                        } else {
                            objQ = CollectionsKt.Q(name);
                        }
                    }
                }
                arrayList2.add(new Pair(getSerializedNames, objQ));
            }
            Map mapP = MapsKt.p(arrayList2);
            this.d = mapP;
            Set setEntrySet = mapP.entrySet();
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : setEntrySet) {
                Map.Entry entry = (Map.Entry) t2;
                KParameter kParameter = (KParameter) entry.getKey();
                if (((List) entry.getValue()).isEmpty() && !kParameter.k()) {
                    arrayList3.add(t2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add((KParameter) ((Map.Entry) it2.next()).getKey());
            }
            this.e = arrayList4;
            Set<Map.Entry> setEntrySet2 = this.d.entrySet();
            ArrayList arrayList5 = new ArrayList();
            for (Map.Entry entry2 : setEntrySet2) {
                KParameter kParameter2 = (KParameter) entry2.getKey();
                List list = (List) entry2.getValue();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.s(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(new Pair((String) it3.next(), kParameter2));
                }
                CollectionsKt.h(arrayList6, arrayList5);
            }
            this.f = MapsKt.p(arrayList5);
            this.g = gson.h(kotlinReflectiveTypeAdapterFactory, type);
            List parameters3 = this.f16310a.getParameters();
            int iH2 = MapsKt.h(CollectionsKt.s(parameters3, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
            for (T t3 : parameters3) {
                KParameter property = (KParameter) t3;
                Intrinsics.i(property, "property");
                TypeToken<?> typeToken = TypeToken.get(C$Gson$Types.h(type.getType(), type.getRawType(), ReflectJvmMapping.c(property.getType()), new HashMap()));
                Intrinsics.d(typeToken, "TypeToken.get(`$Gson$Typ… property.type.javaType))");
                linkedHashMap2.put(t3, gson.g(typeToken));
            }
            this.h = linkedHashMap2;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader reader) throws IOException {
            Intrinsics.i(reader, "reader");
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((KParameter) next).getName() != null) {
                        arrayList2.add(next);
                    }
                }
                throw new IllegalArgumentException(i.a(')', "Transient constructor parameters must provide a default value. (", CollectionsKt.M(arrayList2, ", ", null, null, KotlinReflectiveTypeAdapterFactory$Adapter$read$1$names$2.h, 30)).toString());
            }
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            reader.beginObject();
            while (reader.hasNext()) {
                KParameter kParameter = (KParameter) this.f.get(reader.nextName());
                if (kParameter == null) {
                    reader.skipValue();
                } else if (linkedHashMap.put(kParameter, ((TypeAdapter) MapsKt.e(kParameter, this.h)).read(reader)) != null) {
                    throw new IllegalArgumentException((this.b.getSimpleName() + " declares multiple JSON fields named " + kParameter.getName()).toString());
                }
            }
            reader.endObject();
            LinkedHashMap linkedHashMap2 = this.c;
            ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                arrayList3.add(linkedHashMap.putIfAbsent((KParameter) entry.getKey(), entry.getValue()));
            }
            return this.f16310a.callBy(linkedHashMap);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter writer, Object obj) throws IOException {
            Intrinsics.i(writer, "writer");
            if (obj == null) {
                writer.nullValue();
            } else {
                this.g.write(writer, obj);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/livefront/gsonkotlinadapter/KotlinReflectiveTypeAdapterFactory$Companion;", "", "Ljava/lang/Class;", "Lkotlin/Metadata;", "KOTLIN_METADATA", "Ljava/lang/Class;", "gson-kotlin-adapter"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter a(Gson gson, TypeToken type) {
        Intrinsics.i(type, "type");
        Class rawType = type.getRawType();
        Intrinsics.d(rawType, "type.rawType");
        if (rawType.isLocalClass() || rawType.isInterface() || rawType.isEnum() || rawType.isAnnotationPresent(JsonAdapter.class) || !rawType.isAnnotationPresent(Metadata.class)) {
            return null;
        }
        Class rawType2 = type.getRawType();
        if (rawType2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        KClass kClassE = JvmClassMappingKt.e(rawType2);
        if (kClassE.isAbstract()) {
            throw new IllegalArgumentException("Cannot serialize abstract class ".concat(rawType.getName()).toString());
        }
        if (kClassE.p()) {
            throw new IllegalArgumentException("Cannot serialize sealed class ".concat(rawType.getName()).toString());
        }
        if (kClassE.i()) {
            throw new IllegalArgumentException("Cannot serialize inner class ".concat(rawType.getName()).toString());
        }
        if (KClasses.a(kClassE) != null) {
            return new Adapter(this, gson, type, kClassE);
        }
        return null;
    }
}
