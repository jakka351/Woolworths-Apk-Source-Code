package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class StateSetIterator<T> implements Iterator<T>, KMutableIterator {
    public final SnapshotStateSet d;
    public final Iterator e;
    public Object f;
    public Object g;
    public int h;

    public StateSetIterator(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.d = snapshotStateSet;
        this.e = it;
        this.h = snapshotStateSet.g();
        this.f = this.g;
        this.g = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d.g() != this.h) {
            throw new ConcurrentModificationException();
        }
        this.f = this.g;
        Iterator it = this.e;
        this.g = it.hasNext() ? it.next() : null;
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.d;
        if (snapshotStateSet.g() != this.h) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f;
        if (obj == null) {
            throw new IllegalStateException();
        }
        snapshotStateSet.remove(obj);
        this.f = null;
        this.h = snapshotStateSet.g();
    }
}
