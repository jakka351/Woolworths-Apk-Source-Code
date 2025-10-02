package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.Stable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/BottomAppBarStateImpl;", "Landroidx/compose/material3/BottomAppBarState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BottomAppBarStateImpl implements BottomAppBarState {

    /* renamed from: a, reason: collision with root package name */
    public final MutableFloatState f1400a;
    public final MutableFloatState b;
    public final MutableFloatState c;

    public BottomAppBarStateImpl(float f, float f2, float f3) {
        this.f1400a = PrimitiveSnapshotStateKt.a(f);
        this.b = PrimitiveSnapshotStateKt.a(f3);
        this.c = PrimitiveSnapshotStateKt.a(f2);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float a() {
        MutableFloatState mutableFloatState = this.f1400a;
        return ((SnapshotMutableFloatStateImpl) mutableFloatState).a() == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : d() / ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float b() {
        return this.f1400a.a();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void c(float f) {
        ((SnapshotMutableFloatStateImpl) this.c).p(RangesKt.b(f, ((SnapshotMutableFloatStateImpl) this.f1400a).a(), BitmapDescriptorFactory.HUE_RED));
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float d() {
        return ((SnapshotMutableFloatStateImpl) this.c).a();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float e() {
        return this.b.a();
    }
}
