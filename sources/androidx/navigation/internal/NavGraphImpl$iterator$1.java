package androidx.navigation.internal;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.navigation.NavDestination;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/internal/NavGraphImpl$iterator$1", "", "Landroidx/navigation/NavDestination;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavGraphImpl$iterator$1 implements Iterator<NavDestination>, KMutableIterator {
    public int d = -1;
    public boolean e;
    public final /* synthetic */ NavGraphImpl f;

    public NavGraphImpl$iterator$1(NavGraphImpl navGraphImpl) {
        this.f = navGraphImpl;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d + 1 < this.f.b.e();
    }

    @Override // java.util.Iterator
    public final NavDestination next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = true;
        SparseArrayCompat sparseArrayCompat = this.f.b;
        int i = this.d + 1;
        this.d = i;
        return (NavDestination) sparseArrayCompat.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        SparseArrayCompat sparseArrayCompat = this.f.b;
        ((NavDestination) sparseArrayCompat.f(this.d)).f = null;
        int i = this.d;
        Object[] objArr = sparseArrayCompat.f;
        Object obj = objArr[i];
        Object obj2 = SparseArrayCompatKt.f704a;
        if (obj != obj2) {
            objArr[i] = obj2;
            sparseArrayCompat.d = true;
        }
        this.d = i - 1;
        this.e = false;
    }
}
