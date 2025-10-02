package au.com.woolworths.shop.ratingsandreviews.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RatingsAndReviewsPreviewUIKt$Preview_RatingsAndReviewsPreviewUI$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewUIKt$Preview_RatingsAndReviewsPreviewUI$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new b(3);
                composer.A(objG);
            }
            Function2 function2 = (Function2) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new b(4);
                composer.A(objE);
            }
            Function2 function22 = (Function2) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new b(5);
                composer.A(objE2);
            }
            composer.l();
            RatingsAndReviewsPreviewUIKt.b(null, function2, function22, (Function2) objE2, null, composer, 3504);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(null, null, 0L, 0L, null, null, ComposableLambdaKt.c(-78815796, new AnonymousClass1(), composer), composer, 63);
        }
        return Unit.f24250a;
    }
}
