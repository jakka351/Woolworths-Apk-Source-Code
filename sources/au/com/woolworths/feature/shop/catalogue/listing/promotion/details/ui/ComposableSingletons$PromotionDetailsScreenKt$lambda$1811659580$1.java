package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model.TermsAndConditions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.ComposableSingletons$PromotionDetailsScreenKt$lambda$-1811659580$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PromotionDetailsScreenKt$lambda$1811659580$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PromotionDetailsScreenKt.b(new TermsAndConditions("Offer valid until 01/03/2024. T&C's and product exclusions apply", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."), composer, 0);
        }
        return Unit.f24250a;
    }
}
