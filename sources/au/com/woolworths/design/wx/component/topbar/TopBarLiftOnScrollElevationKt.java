package au.com.woolworths.design.wx.component.topbar;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TopBarLiftOnScrollElevationKt {
    public static final float a(LazyListState lazyListState, Composer composer) {
        Intrinsics.h(lazyListState, "<this>");
        composer.o(-2085994209);
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = SnapshotStateKt.d(new a(lazyListState, 0));
            composer.A(objG);
        }
        composer.l();
        float f = ((Dp) ((State) objG).getD()).d;
        composer.l();
        return f;
    }

    public static final float b(LazyGridState lazyGridState, Composer composer) {
        Intrinsics.h(lazyGridState, "<this>");
        composer.o(1850959815);
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = SnapshotStateKt.d(new androidx.lifecycle.a(lazyGridState, 14));
            composer.A(objG);
        }
        composer.l();
        float f = ((Dp) ((State) objG).getD()).d;
        composer.l();
        return f;
    }
}
