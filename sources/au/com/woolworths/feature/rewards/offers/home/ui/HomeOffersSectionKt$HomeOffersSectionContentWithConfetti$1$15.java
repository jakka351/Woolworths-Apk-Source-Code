package au.com.woolworths.feature.rewards.offers.home.ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.rewards.base.confetti.RewardsConfettiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class HomeOffersSectionKt$HomeOffersSectionContentWithConfetti$1$15 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
        composer.o(5004770);
        boolean zI = composer.I(null);
        Object objG = composer.G();
        if (zI || objG == Composer.Companion.f1624a) {
            objG = new a(0);
            composer.A(objG);
        }
        composer.l();
        RewardsConfettiKt.a(0, 1, composer, null, (Function0) objG);
        return Unit.f24250a;
    }
}
