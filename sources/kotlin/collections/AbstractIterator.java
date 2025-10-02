package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/AbstractIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {
    public int d;
    public Object e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 0) {
            this.d = 3;
            a();
            return this.d == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 1) {
            this.d = 0;
            return this.e;
        }
        if (i != 2) {
            this.d = 3;
            a();
            if (this.d == 1) {
                this.d = 0;
                return this.e;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
