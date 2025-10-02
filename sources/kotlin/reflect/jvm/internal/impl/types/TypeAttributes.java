package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, KMappedMarker {
    public static final Companion e = new Companion();
    public static final TypeAttributes f = new TypeAttributes(EmptyList.d);

    @SourceDebugExtension
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public static TypeAttributes c(List list) {
            return list.isEmpty() ? TypeAttributes.f : new TypeAttributes(list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public final int a(ConcurrentHashMap concurrentHashMap, String str, Function1 function1) {
            int iIntValue;
            Intrinsics.h(concurrentHashMap, "<this>");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = function1.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }
    }

    public TypeAttributes(List list) {
        this.d = EmptyArrayMap.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeAttribute typeAttribute = (TypeAttribute) it.next();
            KClass tClass = typeAttribute.b();
            Intrinsics.h(tClass, "tClass");
            String strX = tClass.x();
            Intrinsics.e(strX);
            h(strX, typeAttribute);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final Companion d() {
        return e;
    }
}
