package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/ReferenceArraySerializer;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
    public final KClass b;
    public final ArrayClassDesc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(KClass kClass, KSerializer eSerializer) {
        super(eSerializer);
        Intrinsics.h(kClass, "kClass");
        Intrinsics.h(eSerializer, "eSerializer");
        this.b = kClass;
        SerialDescriptor elementDesc = eSerializer.getB();
        Intrinsics.h(elementDesc, "elementDesc");
        this.c = new ArrayClassDesc(elementDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object a() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.h(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.h(objArr, "<this>");
        return ArrayIteratorKt.a(objArr);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.h(objArr, "<this>");
        return objArr.length;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        Intrinsics.h(null, "<this>");
        ArraysKt.f(null);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.c;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object h(Object obj) throws NegativeArraySizeException {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.h(arrayList, "<this>");
        KClass eClass = this.b;
        Intrinsics.h(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.b(eClass), arrayList.size());
        Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.g(array, "toArray(...)");
        return array;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.h(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
