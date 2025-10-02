package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {
    public final PersistentHashSetBuilder g;
    public Object h;
    public boolean i;
    public int j;

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder persistentHashSetBuilder) {
        super(persistentHashSetBuilder.f);
        this.g = persistentHashSetBuilder;
        this.j = persistentHashSetBuilder.g;
    }

    public final void c(int i, TrieNode trieNode, Object obj, int i2) {
        int i3 = trieNode.f1682a;
        ArrayList arrayList = this.d;
        if (i3 == 0) {
            int iQ = ArraysKt.Q(trieNode.b, obj);
            TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i2);
            trieNodeIterator.f1683a = trieNode.b;
            trieNodeIterator.b = iQ;
            this.e = i2;
            return;
        }
        int iG = trieNode.g(1 << TrieNodeKt.c(i, i2 * 5));
        TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i2);
        Object[] objArr = trieNode.b;
        trieNodeIterator2.f1683a = objArr;
        trieNodeIterator2.b = iG;
        Object obj2 = objArr[iG];
        if (obj2 instanceof TrieNode) {
            c(i, (TrieNode) obj2, obj, i2 + 1);
        } else {
            this.e = i2;
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public final Object next() {
        if (this.g.g != this.j) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.h = next;
        this.i = true;
        return next;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        boolean z = this.f;
        PersistentHashSetBuilder persistentHashSetBuilder = this.g;
        if (z) {
            TrieNodeIterator trieNodeIterator = (TrieNodeIterator) this.d.get(this.e);
            trieNodeIterator.a();
            Object obj = trieNodeIterator.f1683a[trieNodeIterator.b];
            TypeIntrinsics.a(persistentHashSetBuilder).remove(this.h);
            c(obj != null ? obj.hashCode() : 0, persistentHashSetBuilder.f, obj, 0);
        } else {
            TypeIntrinsics.a(persistentHashSetBuilder).remove(this.h);
        }
        this.h = null;
        this.i = false;
        this.j = persistentHashSetBuilder.g;
    }
}
