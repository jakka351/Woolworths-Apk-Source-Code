package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.PromotionHeader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.ComposableSingletons$PromotionDetailsScreenKt$lambda$-1081475209$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PromotionDetailsScreenKt$lambda$1081475209$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            new PromotionHeader("Member Price Any 3 for $12", "#D44500", "Arnott's Tiny Teddy Variety 15 pack", "");
            PromotionDetailsScreenKt.d(new PromotionHeader("Member Price Any 3 for $12", "#D44500", "Arnott's Tiny Teddy Variety 15 pack", null), composer, 0);
        }
        return Unit.f24250a;
    }
}
