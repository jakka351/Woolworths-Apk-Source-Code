package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/PairSerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "Lkotlin/Pair;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, Pair<? extends K, ? extends V>> {
    public final SerialDescriptorImpl c;

    public PairSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2);
        this.c = SerialDescriptorsKt.b("kotlin.Pair", new SerialDescriptor[0], new a(kSerializer, kSerializer2, 1));
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.h(pair, "<this>");
        return pair.d;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object b(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.h(pair, "<this>");
        return pair.e;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.c;
    }
}
