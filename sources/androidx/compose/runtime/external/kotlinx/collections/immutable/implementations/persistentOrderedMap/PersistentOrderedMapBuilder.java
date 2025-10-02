package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    public PersistentOrderedMap d;
    public Object e;
    public Object f;
    public final PersistentHashMapBuilder g;

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap) {
        this.d = persistentOrderedMap;
        this.e = persistentOrderedMap.f;
        this.f = persistentOrderedMap.g;
        this.g = persistentOrderedMap.h.builder();
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set a() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set b() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    /* renamed from: build */
    public final PersistentMap e() {
        PersistentHashMap persistentHashMapE = this.g.e();
        PersistentOrderedMap persistentOrderedMap = this.d;
        if (persistentHashMapE != persistentOrderedMap.h) {
            persistentOrderedMap = new PersistentOrderedMap(this.e, this.f, persistentHashMapE);
        }
        this.d = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* renamed from: c */
    public final int getI() {
        return this.g.getI();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g.clear();
        EndOfChain endOfChain = EndOfChain.f1687a;
        this.e = endOfChain;
        this.f = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Collection d() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.g.get(obj);
        if (linkedValue != null) {
            return linkedValue.f1684a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.g;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.get(obj);
        if (linkedValue != null) {
            Object obj3 = linkedValue.f1684a;
            if (obj3 == obj2) {
                return obj2;
            }
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, linkedValue.b, linkedValue.c));
            return obj3;
        }
        boolean zIsEmpty = isEmpty();
        EndOfChain endOfChain = EndOfChain.f1687a;
        if (zIsEmpty) {
            this.e = obj;
            this.f = obj;
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, endOfChain, endOfChain));
            return null;
        }
        Object obj4 = this.f;
        Object obj5 = persistentHashMapBuilder.get(obj4);
        Intrinsics.e(obj5);
        LinkedValue linkedValue2 = (LinkedValue) obj5;
        persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.f1684a, linkedValue2.b, obj));
        persistentHashMapBuilder.put(obj, new LinkedValue(obj2, obj4, endOfChain));
        this.f = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.g;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        Object obj2 = linkedValue.c;
        Object obj3 = linkedValue.b;
        Object obj4 = EndOfChain.f1687a;
        if (obj3 != obj4) {
            Object obj5 = persistentHashMapBuilder.get(obj3);
            Intrinsics.e(obj5);
            LinkedValue linkedValue2 = (LinkedValue) obj5;
            persistentHashMapBuilder.put(obj3, new LinkedValue(linkedValue2.f1684a, linkedValue2.b, obj2));
        } else {
            this.e = obj2;
        }
        if (obj2 != obj4) {
            Object obj6 = persistentHashMapBuilder.get(obj2);
            Intrinsics.e(obj6);
            LinkedValue linkedValue3 = (LinkedValue) obj6;
            persistentHashMapBuilder.put(obj2, new LinkedValue(linkedValue3.f1684a, obj3, linkedValue3.c));
        } else {
            this.f = obj3;
        }
        return linkedValue.f1684a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.g.get(obj);
        if (linkedValue == null || !Intrinsics.c(linkedValue.f1684a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
