package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {

    /* renamed from: a, reason: collision with root package name */
    public int f988a;
    public LazyLayoutPrefetchState.PrefetchHandle b;
    public boolean c;

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void a(NestedPrefetchScope nestedPrefetchScope, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            nestedPrefetchScope.a(i + i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void b(LazyListMeasureResult lazyListMeasureResult) {
        if (this.f988a == -1 || lazyListMeasureResult.f().isEmpty()) {
            return;
        }
        if (this.f988a != (this.c ? ((LazyListItemInfo) CollectionsKt.O(lazyListMeasureResult.f())).getF996a() + 1 : ((LazyListItemInfo) CollectionsKt.D(lazyListMeasureResult.f())).getF996a() - 1)) {
            this.f988a = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.b;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.b = null;
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void c(LazyListState$prefetchScope$1 lazyListState$prefetchScope$1, float f, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (lazyListLayoutInfo.f().isEmpty()) {
            return;
        }
        boolean z = f < BitmapDescriptorFactory.HUE_RED;
        int f1015a = z ? ((LazyListItemInfo) CollectionsKt.O(lazyListLayoutInfo.f())).getF996a() + 1 : ((LazyListItemInfo) CollectionsKt.D(lazyListLayoutInfo.f())).getF996a() - 1;
        if (f1015a < 0 || f1015a >= lazyListLayoutInfo.getN()) {
            return;
        }
        if (f1015a != this.f988a) {
            if (this.c != z && (prefetchHandle3 = this.b) != null) {
                prefetchHandle3.cancel();
            }
            this.c = z;
            this.f988a = f1015a;
            LazyListState lazyListState = lazyListState$prefetchScope$1.f1001a;
            Snapshot snapshotA = Snapshot.Companion.a();
            Function1 g = snapshotA != null ? snapshotA.getE() : null;
            Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
            try {
                long j = ((LazyListMeasureResult) ((SnapshotMutableStateImpl) lazyListState.e).getD()).j;
                Snapshot.Companion.e(snapshotA, snapshotB, g);
                this.b = lazyListState.o.a(f1015a, j);
            } catch (Throwable th) {
                Snapshot.Companion.e(snapshotA, snapshotB, g);
                throw th;
            }
        }
        if (!z) {
            if (lazyListLayoutInfo.getL() - ((LazyListItemInfo) CollectionsKt.D(lazyListLayoutInfo.f())).getP() >= f || (prefetchHandle = this.b) == null) {
                return;
            }
            prefetchHandle.b();
            return;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.O(lazyListLayoutInfo.f());
        if (((lazyListItemInfo.getQ() + lazyListItemInfo.getP()) + lazyListLayoutInfo.getR()) - lazyListLayoutInfo.getM() >= (-f) || (prefetchHandle2 = this.b) == null) {
            return;
        }
        prefetchHandle2.b();
    }
}
