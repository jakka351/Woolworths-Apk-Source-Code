package au.com.woolworths.shop.ratingsandreviews.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.ratingsandreviews.ui.ComposableSingletons$RatingsAndReviewsPreviewHeadingKt$lambda$-2116314465$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$RatingsAndReviewsPreviewHeadingKt$lambda$2116314465$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$RatingsAndReviewsPreviewHeadingKt$lambda$2116314465$1 d = new ComposableSingletons$RatingsAndReviewsPreviewHeadingKt$lambda$2116314465$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RatingsAndReviewsPreviewHeadingKt.a("Ratings and Reviews", "Your account details will not be made visible to the public if you leave a review", null, composer, 54, 4);
        }
        return Unit.f24250a;
    }
}
