package au.com.woolworths.shop.ratingsandreviews.ui.reviewitem;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ItemPreviewKt$lambda$549825634$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ItemPreviewKt.a("Colgate Plax Antibacterial Mouthwash Peppermint Alcohol Free 500ml", "https://uatcdn0.woolworths.media/content/wowproductimages/small/019145.jpg", Modifier.Companion.d, composer, 438);
        }
        return Unit.f24250a;
    }
}
