package au.com.woolworths.shop.ratingsandreviews.ui.shared;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.ratingsandreviews.ui.shared.ComposableSingletons$RatingsDistribuitionOverviewKt$lambda$-1388612885$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$RatingsDistribuitionOverviewKt$lambda$1388612885$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ScaffoldKt.a(null, null, null, null, 0L, null, ComposableSingletons$RatingsDistribuitionOverviewKt.f12789a, composer, 12582912, 127);
        }
        return Unit.f24250a;
    }
}
