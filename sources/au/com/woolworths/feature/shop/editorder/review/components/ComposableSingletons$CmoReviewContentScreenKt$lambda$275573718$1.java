package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.editorder.review.components.preview.CmoReviewViewStateProvider;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$CmoReviewContentScreenKt$lambda$275573718$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CmoReviewContentScreenKt$lambda$275573718$1 d = new ComposableSingletons$CmoReviewContentScreenKt$lambda$275573718$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ChangeMyOrderDetailsSectionItems.Cart cart = CmoReviewViewStateProvider.f7119a;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new c(4);
                composer.A(objG);
            }
            composer.l();
            CmoReviewContentScreenKt.c(cart, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
