package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentHashSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {
    public PersistentHashSet d;
    public MutabilityOwnership e = new MutabilityOwnership();
    public TrieNode f;
    public int g;
    public int h;

    public PersistentHashSetBuilder(PersistentHashSet persistentHashSet) {
        this.d = persistentHashSet;
        this.f = persistentHashSet.d;
        this.h = persistentHashSet.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int h = getH();
        this.f = this.f.j(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return h != getH();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        PersistentHashSet persistentHashSetBuild = null;
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            if (persistentHashSetBuilder != null) {
                persistentHashSetBuild = persistentHashSetBuilder.build();
            }
        } else {
            persistentHashSetBuild = persistentHashSet;
        }
        if (persistentHashSetBuild == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i = this.h;
        TrieNode trieNodeK = this.f.k(persistentHashSetBuild.d, 0, deltaCounter, this);
        int size = (collection.size() + i) - deltaCounter.f1686a;
        if (i != size) {
            this.f = trieNodeK;
            g(size);
        }
        return i != this.h;
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: b, reason: from getter */
    public final int getH() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f = TrieNode.d;
        g(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return collection instanceof PersistentHashSet ? this.f.d(0, ((PersistentHashSet) collection).d) : collection instanceof PersistentHashSetBuilder ? this.f.d(0, ((PersistentHashSetBuilder) collection).f) : super.containsAll(collection);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final PersistentHashSet build() {
        TrieNode trieNode = this.f;
        PersistentHashSet persistentHashSet = this.d;
        if (trieNode != persistentHashSet.d) {
            this.e = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet(getH(), trieNode);
        }
        this.d = persistentHashSet;
        return persistentHashSet;
    }

    public final void g(int i) {
        this.h = i;
        this.g++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int h = getH();
        this.f = this.f.l(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return h != getH();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        PersistentHashSet persistentHashSetBuild = null;
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            if (persistentHashSetBuilder != null) {
                persistentHashSetBuild = persistentHashSetBuilder.build();
            }
        } else {
            persistentHashSetBuild = persistentHashSet;
        }
        if (persistentHashSetBuild == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i = this.h;
        Object objM = this.f.m(persistentHashSetBuild.d, 0, deltaCounter, this);
        int i2 = i - deltaCounter.f1686a;
        if (i2 == 0) {
            clear();
        } else if (i2 != i) {
            Intrinsics.f(objM, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f = (TrieNode) objM;
            g(i2);
        }
        return i != this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        PersistentHashSet persistentHashSetBuild = null;
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            if (persistentHashSetBuilder != null) {
                persistentHashSetBuild = persistentHashSetBuilder.build();
            }
        } else {
            persistentHashSetBuild = persistentHashSet;
        }
        if (persistentHashSetBuild == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i = this.h;
        Object objN = this.f.n(persistentHashSetBuild.d, 0, deltaCounter, this);
        int i2 = deltaCounter.f1686a;
        if (i2 == 0) {
            clear();
        } else if (i2 != i) {
            Intrinsics.f(objN, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f = (TrieNode) objN;
            g(i2);
        }
        return i != this.h;
    }
}
