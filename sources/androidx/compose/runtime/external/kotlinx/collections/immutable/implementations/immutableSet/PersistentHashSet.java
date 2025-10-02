package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PersistentHashSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public final TrieNode d;
    public final int e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public PersistentHashSet(int i, TrieNode trieNode) {
        this.d = trieNode;
        this.e = i;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet add(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = this.d;
        TrieNode trieNodeA = trieNode.a(iHashCode, 0, obj);
        return trieNode == trieNodeA ? this : new PersistentHashSet(getE() + 1, trieNodeA);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet addAll(Collection collection) {
        PersistentHashSetBuilder persistentHashSetBuilder = new PersistentHashSetBuilder(this);
        persistentHashSetBuilder.addAll(collection);
        return persistentHashSetBuilder.build();
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet.Builder builder() {
        return new PersistentHashSetBuilder(this);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        boolean z = collection instanceof PersistentHashSet;
        TrieNode trieNode = this.d;
        return z ? trieNode.d(0, ((PersistentHashSet) collection).d) : collection instanceof PersistentHashSetBuilder ? trieNode.d(0, ((PersistentHashSetBuilder) collection).f) : super.containsAll(collection);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashSetIterator(this.d);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet remove(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = this.d;
        TrieNode trieNodeQ = trieNode.q(iHashCode, 0, obj);
        return trieNode == trieNodeQ ? this : new PersistentHashSet(getE() - 1, trieNodeQ);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet removeAll(Collection collection) {
        PersistentHashSetBuilder persistentHashSetBuilder = new PersistentHashSetBuilder(this);
        persistentHashSetBuilder.removeAll(collection);
        return persistentHashSetBuilder.build();
    }
}
