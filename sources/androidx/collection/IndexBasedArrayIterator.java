package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {
    public int d;
    public int e;
    public boolean f;

    public IndexBasedArrayIterator(int i) {
        this.d = i;
    }

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.e);
        this.e++;
        this.f = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            RuntimeHelpersKt.b("Call next() before removing an element.");
            throw null;
        }
        int i = this.e - 1;
        this.e = i;
        b(i);
        this.d--;
        this.f = false;
    }
}
