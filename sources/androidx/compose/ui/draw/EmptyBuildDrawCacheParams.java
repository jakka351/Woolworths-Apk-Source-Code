package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/draw/EmptyBuildDrawCacheParams;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    public static final EmptyBuildDrawCacheParams d = new EmptyBuildDrawCacheParams();
    public static final LayoutDirection e = LayoutDirection.d;
    public static final Density f = DensityKt.a(1.0f, 1.0f);

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return f;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return e;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long h() {
        return 9205357640488583168L;
    }
}
