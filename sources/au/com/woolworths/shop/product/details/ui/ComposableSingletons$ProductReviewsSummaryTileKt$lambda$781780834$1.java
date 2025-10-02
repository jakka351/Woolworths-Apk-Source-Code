package au.com.woolworths.shop.product.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.product.details.ui.ComposableSingletons$ProductReviewsSummaryTileKt$lambda$-781780834$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductReviewsSummaryTileKt$lambda$781780834$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductReviewsSummaryTileKt$lambda$781780834$1 d = new ComposableSingletons$ProductReviewsSummaryTileKt$lambda$781780834$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE);
            }
            composer.l();
            ProductReviewsSummaryTileKt.a("No ratings yet", "3.3 out of 5", 0.0d, "Write review", "Write review", "productRatingsAndReview", function0, null, (Function0) objE, composer, 102460854, 128);
        }
        return Unit.f24250a;
    }
}
