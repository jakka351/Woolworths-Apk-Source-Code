package au.com.woolworths.shop.ratingsandreviews.ui.reviewitem;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReviewItemRecommendationKt$lambda$580841190$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ReviewItemRecommendationKt$lambda$580841190$1 d = new ComposableSingletons$ReviewItemRecommendationKt$lambda$580841190$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ReviewItemRecommendationKt.a("https://uatcdn0.woolworths.media/content/wowproductimages/small/019145.jpg", "Text here", true, PaddingKt.g(Modifier.Companion.d, 16, 8), composer, 3510);
        }
        return Unit.f24250a;
    }
}
