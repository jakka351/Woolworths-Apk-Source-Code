package au.com.woolworths.foundation.rewards.common.ui.pointsbalance;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.rewards.common.ui.pointsbalance.ComposableSingletons$PointsIndicatorDescriptionKt$lambda$-1396941045$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PointsIndicatorDescriptionKt$lambda$1396941045$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CompositionLocalKt.a(HomepageStyleKt.f8583a.b(HomepageStyle.e), ComposableSingletons$PointsIndicatorDescriptionKt.f8596a, composer, 56);
        }
        return Unit.f24250a;
    }
}
