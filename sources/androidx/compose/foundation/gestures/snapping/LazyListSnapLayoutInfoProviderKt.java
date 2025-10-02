package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    public static final int a(LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getP() == Orientation.d ? lazyListLayoutInfo.a() & 4294967295L : lazyListLayoutInfo.a() >> 32);
    }

    public static final TargetedFlingBehavior b(LazyListState lazyListState, Composer composer) {
        boolean zN = composer.n(lazyListState);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListState, SnapPosition.Center.f916a);
            composer.A(objG);
        }
        return SnapFlingBehaviorKt.e((SnapLayoutInfoProvider) objG, composer, 0);
    }
}
