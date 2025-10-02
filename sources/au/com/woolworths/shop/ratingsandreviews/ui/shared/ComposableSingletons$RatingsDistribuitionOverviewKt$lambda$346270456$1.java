package au.com.woolworths.shop.ratingsandreviews.ui.shared;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$RatingsDistribuitionOverviewKt$lambda$346270456$1 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final ComposableSingletons$RatingsDistribuitionOverviewKt$lambda$346270456$1 d = new ComposableSingletons$RatingsDistribuitionOverviewKt$lambda$346270456$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaddingValues it = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(it, "it");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            RatingsDistribuitionOverviewKt.a(3.5d, 3.5d, "31 reviews", "Rated 3.5 out of 5 stars", null, composer, 3510, 16);
        }
        return Unit.f24250a;
    }
}
