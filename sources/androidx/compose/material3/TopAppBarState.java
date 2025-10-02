package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TopAppBarState {
    public static final SaverKt$Saver$1 d = ListSaverKt.a(TopAppBarState$Companion$Saver$2.h, TopAppBarState$Companion$Saver$1.h);

    /* renamed from: a, reason: collision with root package name */
    public final MutableFloatState f1527a;
    public final MutableFloatState b;
    public final MutableFloatState c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TopAppBarState$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public TopAppBarState(float f, float f2, float f3) {
        this.f1527a = PrimitiveSnapshotStateKt.a(f);
        this.b = PrimitiveSnapshotStateKt.a(f3);
        this.c = PrimitiveSnapshotStateKt.a(f2);
    }

    public final float a() {
        MutableFloatState mutableFloatState = this.f1527a;
        return ((SnapshotMutableFloatStateImpl) mutableFloatState).a() == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : b() / ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
    }

    public final float b() {
        return ((SnapshotMutableFloatStateImpl) this.c).a();
    }

    public final void c(float f) {
        ((SnapshotMutableFloatStateImpl) this.c).p(RangesKt.b(f, ((SnapshotMutableFloatStateImpl) this.f1527a).a(), BitmapDescriptorFactory.HUE_RED));
    }
}
