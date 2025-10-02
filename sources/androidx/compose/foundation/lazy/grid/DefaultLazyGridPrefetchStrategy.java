package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {

    /* renamed from: a, reason: collision with root package name */
    public int f1004a = -1;
    public final MutableVector b = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
    public boolean c;

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void a(NestedPrefetchScope nestedPrefetchScope, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            nestedPrefetchScope.a(i + i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void b(LazyGridMeasureResult lazyGridMeasureResult) {
        int w;
        Orientation orientation = lazyGridMeasureResult.q;
        if (this.f1004a == -1 || lazyGridMeasureResult.f().isEmpty()) {
            return;
        }
        if (this.c) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.O(lazyGridMeasureResult.f());
            w = (orientation == Orientation.d ? lazyGridItemInfo.getW() : lazyGridItemInfo.getX()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.D(lazyGridMeasureResult.f());
            w = (orientation == Orientation.d ? lazyGridItemInfo2.getW() : lazyGridItemInfo2.getX()) - 1;
        }
        if (this.f1004a != w) {
            this.f1004a = -1;
            MutableVector mutableVector = this.b;
            Object[] objArr = mutableVector.d;
            int i = mutableVector.f;
            for (int i2 = 0; i2 < i; i2++) {
                ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i2]).cancel();
            }
            mutableVector.h();
        }
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void c(LazyGridState$prefetchScope$1 lazyGridState$prefetchScope$1, float f, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int w;
        int f1015a;
        if (lazyGridLayoutInfo.f().isEmpty()) {
            return;
        }
        boolean z = f < BitmapDescriptorFactory.HUE_RED;
        if (z) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.O(lazyGridLayoutInfo.f());
            w = (lazyGridLayoutInfo.getQ() == Orientation.d ? lazyGridItemInfo.getW() : lazyGridItemInfo.getX()) + 1;
            f1015a = ((LazyGridItemInfo) CollectionsKt.O(lazyGridLayoutInfo.f())).getF996a() + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.D(lazyGridLayoutInfo.f());
            w = (lazyGridLayoutInfo.getQ() == Orientation.d ? lazyGridItemInfo2.getW() : lazyGridItemInfo2.getX()) - 1;
            f1015a = ((LazyGridItemInfo) CollectionsKt.D(lazyGridLayoutInfo.f())).getF996a() - 1;
        }
        if (f1015a < 0 || f1015a >= lazyGridLayoutInfo.getO()) {
            return;
        }
        int i = this.f1004a;
        MutableVector mutableVector = this.b;
        if (w != i && w >= 0) {
            if (this.c != z) {
                Object[] objArr = mutableVector.d;
                int i2 = mutableVector.f;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i3]).cancel();
                }
            }
            this.c = z;
            this.f1004a = w;
            mutableVector.h();
            lazyGridState$prefetchScope$1.getClass();
            ArrayList arrayList = new ArrayList();
            LazyGridState lazyGridState = lazyGridState$prefetchScope$1.f1026a;
            Snapshot snapshotA = Snapshot.Companion.a();
            Function1 g = snapshotA != null ? snapshotA.getE() : null;
            Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
            try {
                LazyGridMeasureResult lazyGridMeasureResult = lazyGridState.b ? lazyGridState.c : (LazyGridMeasureResult) ((SnapshotMutableStateImpl) lazyGridState.e).getD();
                if (lazyGridMeasureResult != null) {
                    List list = (List) lazyGridMeasureResult.k.invoke(Integer.valueOf(w));
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Pair pair = (Pair) list.get(i4);
                        arrayList = arrayList;
                        arrayList.add(lazyGridState.o.a(((Number) pair.d).intValue(), ((Constraints) pair.e).f2197a));
                    }
                }
                Snapshot.Companion.e(snapshotA, snapshotB, g);
                mutableVector.e(mutableVector.f, arrayList);
            } catch (Throwable th) {
                Snapshot.Companion.e(snapshotA, snapshotB, g);
                throw th;
            }
        }
        if (!z) {
            if (lazyGridLayoutInfo.getM() - LazyGridSnapLayoutInfoProviderKt.a((LazyGridItemInfo) CollectionsKt.D(lazyGridLayoutInfo.f()), lazyGridLayoutInfo.getQ()) < f) {
                Object[] objArr2 = mutableVector.d;
                int i5 = mutableVector.f;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) objArr2[i6]).b();
                }
                return;
            }
            return;
        }
        LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo) CollectionsKt.O(lazyGridLayoutInfo.f());
        if (((LazyGridSnapLayoutInfoProviderKt.a(lazyGridItemInfo3, lazyGridLayoutInfo.getQ()) + ((int) (lazyGridLayoutInfo.getQ() == Orientation.d ? lazyGridItemInfo3.getU() & 4294967295L : lazyGridItemInfo3.getU() >> 32))) + lazyGridLayoutInfo.getS()) - lazyGridLayoutInfo.getN() < (-f)) {
            Object[] objArr3 = mutableVector.d;
            int i7 = mutableVector.f;
            for (int i8 = 0; i8 < i7; i8++) {
                ((LazyLayoutPrefetchState.PrefetchHandle) objArr3[i8]).b();
            }
        }
    }
}
