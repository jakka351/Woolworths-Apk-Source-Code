package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.ComposableSingletons$SubmitReviewScreenKt$lambda$-980002736$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$SubmitReviewScreenKt$lambda$980002736$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SnackbarHostState snackbarHostState = new SnackbarHostState();
            SubmitReviewPreviewViewModel submitReviewPreviewViewModel = new SubmitReviewPreviewViewModel();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            SubmitReviewScreenKt.g(submitReviewPreviewViewModel, (Function0) objG, SubmitReviewContract.ViewState.DuplicateFailure.f12773a, snackbarHostState, composer, 432);
        }
        return Unit.f24250a;
    }
}
