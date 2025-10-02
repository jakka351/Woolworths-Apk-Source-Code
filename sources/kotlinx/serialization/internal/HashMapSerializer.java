package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/HashMapSerializer;", "K", "V", "Lkotlinx/serialization/internal/MapLikeSerializer;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class HashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final HashMapClassDesc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapSerializer(KSerializer kSerializer, KSerializer vSerializer) {
        super(kSerializer, vSerializer);
        Intrinsics.h(kSerializer, "kSerializer");
        Intrinsics.h(vSerializer, "vSerializer");
        SerialDescriptor keyDesc = kSerializer.getB();
        SerialDescriptor valueDesc = vSerializer.getB();
        Intrinsics.h(keyDesc, "keyDesc");
        Intrinsics.h(valueDesc, "valueDesc");
        this.c = new HashMapClassDesc("kotlin.collections.HashMap", keyDesc, valueDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object a() {
        return new HashMap();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int b(Object obj) {
        HashMap map = (HashMap) obj;
        Intrinsics.h(map, "<this>");
        return map.size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        Intrinsics.h(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        Map map = (Map) obj;
        Intrinsics.h(map, "<this>");
        return map.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        Intrinsics.h(null, "<this>");
        return new HashMap((Map) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.c;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object h(Object obj) {
        HashMap map = (HashMap) obj;
        Intrinsics.h(map, "<this>");
        return map;
    }
}
