package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public final Object[] f;
    public final TrieIterator g;

    public PersistentVectorIterator(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.f = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.g = new TrieIterator(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        TrieIterator trieIterator = this.g;
        if (trieIterator.hasNext()) {
            this.d++;
            return trieIterator.next();
        }
        int i = this.d;
        this.d = i + 1;
        return this.f[i - trieIterator.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        TrieIterator trieIterator = this.g;
        int i2 = trieIterator.e;
        if (i <= i2) {
            this.d = i - 1;
            return trieIterator.previous();
        }
        int i3 = i - 1;
        this.d = i3;
        return this.f[i3 - i2];
    }
}
