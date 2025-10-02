package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMutableIterator {
    public final PersistentHashMapBuilder g;
    public Object h;
    public boolean i;
    public int j;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.f, trieNodeBaseIteratorArr);
        this.g = persistentHashMapBuilder;
        this.j = persistentHashMapBuilder.h;
    }

    public final void c(int i, TrieNode trieNode, Object obj, int i2) {
        int i3 = i2 * 5;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.d;
        if (i3 <= 30) {
            int iD = 1 << TrieNodeKt.d(i, i3);
            if (trieNode.h(iD)) {
                trieNodeBaseIteratorArr[i2].a(Integer.bitCount(trieNode.f1680a) * 2, trieNode.f(iD), trieNode.d);
                this.e = i2;
                return;
            }
            int iT = trieNode.t(iD);
            TrieNode trieNodeS = trieNode.s(iT);
            trieNodeBaseIteratorArr[i2].a(Integer.bitCount(trieNode.f1680a) * 2, iT, trieNode.d);
            c(i, trieNodeS, obj, i2 + 1);
            return;
        }
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i2];
        Object[] objArr = trieNode.d;
        trieNodeBaseIterator.a(objArr.length, 0, objArr);
        while (true) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i2];
            if (Intrinsics.c(trieNodeBaseIterator2.d[trieNodeBaseIterator2.f], obj)) {
                this.e = i2;
                return;
            } else {
                trieNodeBaseIteratorArr[i2].f += 2;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final Object next() {
        if (this.g.h != this.j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f) {
            throw new NoSuchElementException();
        }
        TrieNodeBaseIterator trieNodeBaseIterator = this.d[this.e];
        this.h = trieNodeBaseIterator.d[trieNodeBaseIterator.f];
        this.i = true;
        return super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        boolean z = this.f;
        PersistentHashMapBuilder persistentHashMapBuilder = this.g;
        if (!z) {
            TypeIntrinsics.b(persistentHashMapBuilder).remove(this.h);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            TrieNodeBaseIterator trieNodeBaseIterator = this.d[this.e];
            Object obj = trieNodeBaseIterator.d[trieNodeBaseIterator.f];
            TypeIntrinsics.b(persistentHashMapBuilder).remove(this.h);
            c(obj != null ? obj.hashCode() : 0, persistentHashMapBuilder.f, obj, 0);
        }
        this.h = null;
        this.i = false;
        this.j = persistentHashMapBuilder.h;
    }
}
