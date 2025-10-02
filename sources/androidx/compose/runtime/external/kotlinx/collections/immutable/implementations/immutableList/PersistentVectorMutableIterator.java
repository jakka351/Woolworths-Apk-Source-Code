package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {
    public final PersistentVectorBuilder f;
    public int g;
    public TrieIterator h;
    public int i;

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.k);
        this.f = persistentVectorBuilder;
        this.g = persistentVectorBuilder.i();
        this.i = -1;
        b();
    }

    public final void a() {
        if (this.g != this.f.i()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.d;
        PersistentVectorBuilder persistentVectorBuilder = this.f;
        persistentVectorBuilder.add(i, obj);
        this.d++;
        this.e = persistentVectorBuilder.getK();
        this.g = persistentVectorBuilder.i();
        this.i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        PersistentVectorBuilder persistentVectorBuilder = this.f;
        Object[] objArr = persistentVectorBuilder.i;
        if (objArr == null) {
            this.h = null;
            return;
        }
        int i = (persistentVectorBuilder.k - 1) & (-32);
        int i2 = this.d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (persistentVectorBuilder.g / 5) + 1;
        TrieIterator trieIterator = this.h;
        if (trieIterator == null) {
            this.h = new TrieIterator(objArr, i2, i, i3);
            return;
        }
        trieIterator.d = i2;
        trieIterator.e = i;
        trieIterator.f = i3;
        if (trieIterator.g.length < i3) {
            trieIterator.g = new Object[i3];
        }
        trieIterator.g[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        trieIterator.h = r6;
        trieIterator.b(i2 - r6, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.i = i;
        TrieIterator trieIterator = this.h;
        PersistentVectorBuilder persistentVectorBuilder = this.f;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.j;
            this.d = i + 1;
            return objArr[i];
        }
        if (trieIterator.hasNext()) {
            this.d++;
            return trieIterator.next();
        }
        Object[] objArr2 = persistentVectorBuilder.j;
        int i2 = this.d;
        this.d = i2 + 1;
        return objArr2[i2 - trieIterator.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.i = i - 1;
        TrieIterator trieIterator = this.h;
        PersistentVectorBuilder persistentVectorBuilder = this.f;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.j;
            int i2 = i - 1;
            this.d = i2;
            return objArr[i2];
        }
        int i3 = trieIterator.e;
        if (i <= i3) {
            this.d = i - 1;
            return trieIterator.previous();
        }
        Object[] objArr2 = persistentVectorBuilder.j;
        int i4 = i - 1;
        this.d = i4;
        return objArr2[i4 - i3];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder = this.f;
        persistentVectorBuilder.d(i);
        int i2 = this.i;
        if (i2 < this.d) {
            this.d = i2;
        }
        this.e = persistentVectorBuilder.getK();
        this.g = persistentVectorBuilder.i();
        this.i = -1;
        b();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder = this.f;
        persistentVectorBuilder.set(i, obj);
        this.g = persistentVectorBuilder.i();
        b();
    }
}
