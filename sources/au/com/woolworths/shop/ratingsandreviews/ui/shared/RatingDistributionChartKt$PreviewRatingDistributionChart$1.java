package au.com.woolworths.shop.ratingsandreviews.ui.shared;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RatingDistributionChartKt$PreviewRatingDistributionChart$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.ratingsandreviews.ui.shared.RatingDistributionChartKt$PreviewRatingDistributionChart$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            PaddingValues it = (PaddingValues) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(it, "it");
            if ((iIntValue & 17) == 16 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            RatingDistributionChartKt.a(null, null, composer, 0);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ScaffoldKt.a(null, null, null, null, 0L, null, ComposableLambdaKt.c(218262203, new AnonymousClass1(), composer), composer, 12582912, 127);
        }
        return Unit.f24250a;
    }
}
