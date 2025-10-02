package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    public PersistentHashMap d;
    public MutabilityOwnership e = new MutabilityOwnership();
    public TrieNode f;
    public Object g;
    public int h;
    public int i;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        this.d = persistentHashMap;
        this.f = persistentHashMap.f;
        this.i = persistentHashMap.g;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set a() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set b() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* renamed from: c, reason: from getter */
    public final int getI() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f = TrieNode.e;
        f(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Collection d() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentHashMap e() {
        TrieNode trieNode = this.f;
        PersistentHashMap persistentHashMap = this.d;
        if (trieNode != persistentHashMap.f) {
            this.e = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap(this.f, getI());
        }
        this.d = persistentHashMap;
        return persistentHashMap;
    }

    public final void f(int i) {
        this.i = i;
        this.h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.g = null;
        this.f = this.f.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        PersistentHashMap persistentHashMapE = null;
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            if (persistentHashMapBuilder != null) {
                persistentHashMapE = persistentHashMapBuilder.e();
            }
        } else {
            persistentHashMapE = persistentHashMap;
        }
        if (persistentHashMapE == null) {
            super.putAll(map);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i = this.i;
        TrieNode trieNode = this.f;
        TrieNode trieNode2 = persistentHashMapE.f;
        Intrinsics.f(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f = trieNode.m(trieNode2, 0, deltaCounter, this);
        int i2 = (persistentHashMapE.g + i) - deltaCounter.f1686a;
        if (i != i2) {
            f(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = getI();
        TrieNode trieNodeO = this.f.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (trieNodeO == null) {
            trieNodeO = TrieNode.e;
        }
        this.f = trieNodeO;
        return i != getI();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.g = null;
        TrieNode trieNodeN = this.f.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (trieNodeN == null) {
            trieNodeN = TrieNode.e;
        }
        this.f = trieNodeN;
        return this.g;
    }
}
