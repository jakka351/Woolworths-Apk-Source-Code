package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/HashSetSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class HashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, HashSet<E>> {
    public final HashSetClassDesc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashSetSerializer(KSerializer eSerializer) {
        super(eSerializer);
        Intrinsics.h(eSerializer, "eSerializer");
        SerialDescriptor elementDesc = eSerializer.getB();
        Intrinsics.h(elementDesc, "elementDesc");
        this.b = new HashSetClassDesc(elementDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object a() {
        return new HashSet();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int b(Object obj) {
        HashSet hashSet = (HashSet) obj;
        Intrinsics.h(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        Intrinsics.h(null, "<this>");
        return new HashSet((Collection) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object h(Object obj) {
        HashSet hashSet = (HashSet) obj;
        Intrinsics.h(hashSet, "<this>");
        return hashSet;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void i(int i, Object obj, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        Intrinsics.h(hashSet, "<this>");
        hashSet.add(obj2);
    }
}
