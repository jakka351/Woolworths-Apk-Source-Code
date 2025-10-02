package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {
    public final ArrayList d;
    public int e;
    public boolean f;

    public PersistentHashSetIterator(TrieNode trieNode) {
        ArrayList arrayListZ = CollectionsKt.Z(new TrieNodeIterator());
        this.d = arrayListZ;
        this.f = true;
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayListZ.get(0);
        trieNodeIterator.f1683a = trieNode.b;
        trieNodeIterator.b = 0;
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        ArrayList arrayList = this.d;
        if (((TrieNodeIterator) arrayList.get(i)).a()) {
            return;
        }
        for (int i2 = this.e; -1 < i2; i2--) {
            int iB = b(i2);
            if (iB == -1) {
                TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i2);
                if (trieNodeIterator.b < trieNodeIterator.f1683a.length) {
                    TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i2);
                    int i3 = trieNodeIterator2.b;
                    int length = trieNodeIterator2.f1683a.length;
                    trieNodeIterator2.b = i3 + 1;
                    iB = b(i2);
                }
            }
            if (iB != -1) {
                this.e = iB;
                return;
            }
            if (i2 > 0) {
                TrieNodeIterator trieNodeIterator3 = (TrieNodeIterator) arrayList.get(i2 - 1);
                int i4 = trieNodeIterator3.b;
                int length2 = trieNodeIterator3.f1683a.length;
                trieNodeIterator3.b = i4 + 1;
            }
            TrieNodeIterator trieNodeIterator4 = (TrieNodeIterator) arrayList.get(i2);
            trieNodeIterator4.f1683a = TrieNode.d.b;
            trieNodeIterator4.b = 0;
        }
        this.f = false;
    }

    public final int b(int i) {
        ArrayList arrayList = this.d;
        if (((TrieNodeIterator) arrayList.get(i)).a()) {
            return i;
        }
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i);
        int i2 = trieNodeIterator.b;
        Object[] objArr = trieNodeIterator.f1683a;
        if (i2 >= objArr.length || !(objArr[i2] instanceof TrieNode)) {
            return -1;
        }
        TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i);
        int i3 = trieNodeIterator2.b;
        Object[] objArr2 = trieNodeIterator2.f1683a;
        if (i3 < objArr2.length) {
            boolean z = objArr2[i3] instanceof TrieNode;
        }
        Object obj = objArr2[i3];
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        TrieNode trieNode = (TrieNode) obj;
        int i4 = i + 1;
        if (i4 == arrayList.size()) {
            arrayList.add(new TrieNodeIterator());
        }
        TrieNodeIterator trieNodeIterator3 = (TrieNodeIterator) arrayList.get(i4);
        trieNodeIterator3.f1683a = trieNode.b;
        trieNodeIterator3.b = 0;
        return b(i4);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f) {
            throw new NoSuchElementException();
        }
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) this.d.get(this.e);
        trieNodeIterator.a();
        Object[] objArr = trieNodeIterator.f1683a;
        int i = trieNodeIterator.b;
        trieNodeIterator.b = i + 1;
        Object obj = objArr[i];
        a();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
