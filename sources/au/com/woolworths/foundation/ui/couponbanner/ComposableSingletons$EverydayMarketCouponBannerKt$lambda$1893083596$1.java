package au.com.woolworths.foundation.ui.couponbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$EverydayMarketCouponBannerKt$lambda$1893083596$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(null, null, Color.j, 0L, null, null, ComposableSingletons$EverydayMarketCouponBannerKt.f8913a, composer, 59);
        }
        return Unit.f24250a;
    }
}
