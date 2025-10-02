package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class StateListIterator<T> implements ListIterator<T>, KMutableListIterator {
    public final SnapshotStateList d;
    public int e;
    public int f = -1;
    public int g;

    public StateListIterator(SnapshotStateList snapshotStateList, int i) {
        this.d = snapshotStateList;
        this.e = i - 1;
        this.g = snapshotStateList.h();
    }

    public final void a() {
        if (this.d.h() != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.e + 1;
        SnapshotStateList snapshotStateList = this.d;
        snapshotStateList.add(i, obj);
        this.f = -1;
        this.e++;
        this.g = snapshotStateList.h();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.e + 1;
        this.f = i;
        SnapshotStateList snapshotStateList = this.d;
        SnapshotStateListKt.a(i, snapshotStateList.size());
        Object obj = snapshotStateList.get(i);
        this.e = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.e;
        SnapshotStateList snapshotStateList = this.d;
        SnapshotStateListKt.a(i, snapshotStateList.size());
        int i2 = this.e;
        this.f = i2;
        this.e--;
        return snapshotStateList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.e;
        SnapshotStateList snapshotStateList = this.d;
        snapshotStateList.remove(i);
        this.e--;
        this.f = -1;
        this.g = snapshotStateList.h();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f;
        if (i < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        SnapshotStateList snapshotStateList = this.d;
        snapshotStateList.set(i, obj);
        this.g = snapshotStateList.h();
    }
}
