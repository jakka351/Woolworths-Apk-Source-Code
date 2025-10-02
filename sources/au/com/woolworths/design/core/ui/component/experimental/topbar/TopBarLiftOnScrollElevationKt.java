package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TopBarLiftOnScrollElevationKt {
    public static final CoreElevation a(LazyListState lazyListState, Composer composer) {
        Intrinsics.h(lazyListState, "<this>");
        composer.o(330221231);
        float f = TopBarConstants.f4737a;
        CoreElevation coreElevation = (CoreElevation) TopBarConstants$Elevation$1.d.invoke(composer, 6);
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = SnapshotStateKt.d(new androidx.navigation.compose.a(5, lazyListState, coreElevation));
            composer.A(objG);
        }
        composer.l();
        CoreElevation coreElevation2 = (CoreElevation) ((State) objG).getD();
        composer.l();
        return coreElevation2;
    }
}
