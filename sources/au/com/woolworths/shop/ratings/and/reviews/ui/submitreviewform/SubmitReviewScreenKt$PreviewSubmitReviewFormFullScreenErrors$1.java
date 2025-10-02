package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubmitReviewScreenKt$PreviewSubmitReviewFormFullScreenErrors$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SnackbarHostState snackbarHostState = new SnackbarHostState();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            SubmitReviewContract.ViewState.Failure failure = new SubmitReviewContract.ViewState.Failure(null, null, (Function0) objG, 6);
            SubmitReviewPreviewViewModel submitReviewPreviewViewModel = new SubmitReviewPreviewViewModel();
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new h(20);
                composer.A(objG2);
            }
            composer.l();
            SubmitReviewScreenKt.g(submitReviewPreviewViewModel, (Function0) objG2, failure, snackbarHostState, composer, 48);
        }
        return Unit.f24250a;
    }
}
