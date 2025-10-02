package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {
    public final TrieNodeBaseIterator[] d;
    public int e;
    public boolean f = true;

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        this.d = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].a(Integer.bitCount(trieNode.f1680a) * 2, 0, trieNode.d);
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.d;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i];
        if (trieNodeBaseIterator.f < trieNodeBaseIterator.e) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i];
                int i2 = trieNodeBaseIterator2.f;
                Object[] objArr = trieNodeBaseIterator2.d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    trieNodeBaseIterator2.f = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.e = iB;
                return;
            }
            if (i > 0) {
                TrieNodeBaseIterator trieNodeBaseIterator3 = trieNodeBaseIteratorArr[i - 1];
                int i3 = trieNodeBaseIterator3.f;
                int length2 = trieNodeBaseIterator3.d.length;
                trieNodeBaseIterator3.f = i3 + 1;
            }
            trieNodeBaseIteratorArr[i].a(0, 0, TrieNode.e.d);
            i--;
        }
        this.f = false;
    }

    public final int b(int i) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.d;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i];
        int i2 = trieNodeBaseIterator.f;
        if (i2 < trieNodeBaseIterator.e) {
            return i;
        }
        Object[] objArr = trieNodeBaseIterator.d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        TrieNode trieNode = (TrieNode) obj;
        if (i == 6) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i + 1];
            Object[] objArr2 = trieNode.d;
            trieNodeBaseIterator2.a(objArr2.length, 0, objArr2);
        } else {
            trieNodeBaseIteratorArr[i + 1].a(Integer.bitCount(trieNode.f1680a) * 2, 0, trieNode.d);
        }
        return b(i + 1);
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
        T next = this.d[this.e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
