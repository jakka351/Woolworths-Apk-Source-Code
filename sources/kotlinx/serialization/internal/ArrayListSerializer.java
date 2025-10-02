package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/ArrayListSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@InternalSerializationApi
/* loaded from: classes7.dex */
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {
    public final ArrayListClassDesc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayListSerializer(KSerializer element) {
        super(element);
        Intrinsics.h(element, "element");
        SerialDescriptor elementDesc = element.getB();
        Intrinsics.h(elementDesc, "elementDesc");
        this.b = new ArrayListClassDesc(elementDesc);
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
    public final Object g(Object obj) {
        Intrinsics.h(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.h(arrayList, "<this>");
        return arrayList;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.h(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
