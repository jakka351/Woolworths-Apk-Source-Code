package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.editorder.review.data.FooterCtaSection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.editorder.review.components.ComposableSingletons$CmoReviewContentScreenKt$lambda$-1357755291$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CmoReviewContentScreenKt$lambda$1357755291$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CmoReviewContentScreenKt$lambda$1357755291$1 d = new ComposableSingletons$CmoReviewContentScreenKt$lambda$1357755291$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FooterCtaSection footerCtaSection = new FooterCtaSection(new ButtonApiData("Cancel", null, null, true, null, null, null, null, null, 502, null), new ButtonApiData("Checkout", null, null, true, null, null, null, null, null, 502, null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(3);
                composer.A(objG);
            }
            composer.l();
            CmoReviewContentScreenKt.g(footerCtaSection, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
