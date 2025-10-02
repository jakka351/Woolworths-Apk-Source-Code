package dev.chrisbanes.snapper;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LazyListKt {
    public static final SnapperFlingBehavior a(LazyListState lazyListState, Function2 function2, Composer composer) {
        Intrinsics.h(lazyListState, "lazyListState");
        composer.F(340674139);
        DecayAnimationSpec decayAnimationSpecA = SplineBasedFloatDecayAnimationSpec_androidKt.a(composer);
        SpringSpec springSpec = SnapperFlingBehaviorDefaults.f23784a;
        Function3 snapIndex = SnapperFlingBehaviorDefaults.c;
        composer.F(-1015087902);
        composer.F(511388516);
        boolean zN = composer.n(lazyListState) | composer.n(function2);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (zN || objG == composer$Companion$Empty$1) {
            objG = new LazyListSnapperLayoutInfo(lazyListState, function2);
            composer.A(objG);
        }
        composer.N();
        LazyListSnapperLayoutInfo layoutInfo = (LazyListSnapperLayoutInfo) objG;
        composer.N();
        Intrinsics.h(layoutInfo, "layoutInfo");
        Intrinsics.h(snapIndex, "snapIndex");
        composer.F(1638456080);
        Object[] objArr = {layoutInfo, decayAnimationSpecA, springSpec, snapIndex};
        composer.F(-568225417);
        boolean zN2 = false;
        for (int i = 0; i < 4; i++) {
            zN2 |= composer.n(objArr[i]);
        }
        Object objG2 = composer.G();
        if (zN2 || objG2 == composer$Companion$Empty$1) {
            objG2 = new SnapperFlingBehavior(layoutInfo, decayAnimationSpecA, springSpec, snapIndex);
            composer.A(objG2);
        }
        composer.N();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) objG2;
        composer.N();
        composer.N();
        return snapperFlingBehavior;
    }
}
