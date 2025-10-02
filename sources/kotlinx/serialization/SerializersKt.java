package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SerializersKt {
    public static final KSerializer a(KClass kClass, ArrayList arrayList, Function0 function0) {
        KSerializer arrayListSerializer;
        KSerializer pairSerializer;
        Intrinsics.h(kClass, "<this>");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        if (kClass.equals(reflectionFactory.b(Collection.class)) || kClass.equals(reflectionFactory.b(List.class)) || kClass.equals(reflectionFactory.b(List.class)) || kClass.equals(reflectionFactory.b(ArrayList.class))) {
            arrayListSerializer = new ArrayListSerializer((KSerializer) arrayList.get(0));
        } else if (kClass.equals(reflectionFactory.b(HashSet.class))) {
            arrayListSerializer = new HashSetSerializer((KSerializer) arrayList.get(0));
        } else if (kClass.equals(reflectionFactory.b(Set.class)) || kClass.equals(reflectionFactory.b(Set.class)) || kClass.equals(reflectionFactory.b(LinkedHashSet.class))) {
            arrayListSerializer = new LinkedHashSetSerializer((KSerializer) arrayList.get(0));
        } else if (kClass.equals(reflectionFactory.b(HashMap.class))) {
            arrayListSerializer = new HashMapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else if (kClass.equals(reflectionFactory.b(Map.class)) || kClass.equals(reflectionFactory.b(Map.class)) || kClass.equals(reflectionFactory.b(LinkedHashMap.class))) {
            arrayListSerializer = new LinkedHashMapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        } else {
            if (kClass.equals(reflectionFactory.b(Map.Entry.class))) {
                KSerializer keySerializer = (KSerializer) arrayList.get(0);
                KSerializer valueSerializer = (KSerializer) arrayList.get(1);
                Intrinsics.h(keySerializer, "keySerializer");
                Intrinsics.h(valueSerializer, "valueSerializer");
                pairSerializer = new MapEntrySerializer(keySerializer, valueSerializer);
            } else if (kClass.equals(reflectionFactory.b(Pair.class))) {
                KSerializer keySerializer2 = (KSerializer) arrayList.get(0);
                KSerializer valueSerializer2 = (KSerializer) arrayList.get(1);
                Intrinsics.h(keySerializer2, "keySerializer");
                Intrinsics.h(valueSerializer2, "valueSerializer");
                pairSerializer = new PairSerializer(keySerializer2, valueSerializer2);
            } else if (kClass.equals(reflectionFactory.b(Triple.class))) {
                KSerializer aSerializer = (KSerializer) arrayList.get(0);
                KSerializer bSerializer = (KSerializer) arrayList.get(1);
                KSerializer cSerializer = (KSerializer) arrayList.get(2);
                Intrinsics.h(aSerializer, "aSerializer");
                Intrinsics.h(bSerializer, "bSerializer");
                Intrinsics.h(cSerializer, "cSerializer");
                arrayListSerializer = new TripleSerializer(aSerializer, bSerializer, cSerializer);
            } else if (JvmClassMappingKt.b(kClass).isArray()) {
                Object objInvoke = function0.invoke();
                Intrinsics.f(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                arrayListSerializer = BuiltinSerializersKt.a((KClass) objInvoke, (KSerializer) arrayList.get(0));
            } else {
                arrayListSerializer = null;
            }
            arrayListSerializer = pairSerializer;
        }
        if (arrayListSerializer != null) {
            return arrayListSerializer;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        return PlatformKt.a(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer b(KClass kClass) {
        Intrinsics.h(kClass, "<this>");
        KSerializer kSerializerD = d(kClass);
        if (kSerializerD != null) {
            return kSerializerD;
        }
        Platform_commonKt.d(kClass);
        throw null;
    }

    public static final KSerializer c(SerializersModule serializersModule, KType type) {
        Intrinsics.h(serializersModule, "<this>");
        Intrinsics.h(type, "type");
        KSerializer kSerializerA = SerializersKt__SerializersKt.a(serializersModule, type, true);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        Platform_commonKt.d(Platform_commonKt.c(type));
        throw null;
    }

    public static final KSerializer d(KClass kClass) {
        Intrinsics.h(kClass, "<this>");
        KSerializer kSerializerA = PlatformKt.a(kClass, new KSerializer[0]);
        return kSerializerA == null ? (KSerializer) PrimitivesKt.f24817a.get(kClass) : kSerializerA;
    }

    public static final KSerializer e(SerializersModule serializersModule, KType type) {
        Intrinsics.h(serializersModule, "<this>");
        Intrinsics.h(type, "type");
        return SerializersKt__SerializersKt.a(serializersModule, type, false);
    }

    public static final ArrayList f(SerializersModule serializersModule, List typeArguments, boolean z) {
        Intrinsics.h(serializersModule, "<this>");
        Intrinsics.h(typeArguments, "typeArguments");
        if (z) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c(serializersModule, (KType) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            KSerializer kSerializerE = e(serializersModule, (KType) it2.next());
            if (kSerializerE == null) {
                return null;
            }
            arrayList2.add(kSerializerE);
        }
        return arrayList2;
    }
}
