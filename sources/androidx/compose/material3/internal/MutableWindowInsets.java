package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f1561a;

    public MutableWindowInsets(WindowInsets windowInsets) {
        this.f1561a = SnapshotStateKt.f(windowInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        return ((WindowInsets) ((SnapshotMutableStateImpl) this.f1561a).getD()).a(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        return ((WindowInsets) ((SnapshotMutableStateImpl) this.f1561a).getD()).b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        return ((WindowInsets) ((SnapshotMutableStateImpl) this.f1561a).getD()).c(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        return ((WindowInsets) ((SnapshotMutableStateImpl) this.f1561a).getD()).d(density, layoutDirection);
    }
}
