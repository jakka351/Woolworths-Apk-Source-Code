package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormData;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SubmitReviewViewModel e;

    public /* synthetic */ a(SubmitReviewViewModel submitReviewViewModel, int i) {
        this.d = i;
        this.e = submitReviewViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                SubmitReviewViewModel submitReviewViewModel = this.e;
                MutableStateFlow mutableStateFlow = submitReviewViewModel.j;
                mutableStateFlow.setValue(SubmitReviewContract.ViewState.InProgress.f12775a);
                submitReviewViewModel.q6();
                break;
            case 1:
                SubmitReviewViewModel submitReviewViewModel2 = this.e;
                MutableStateFlow mutableStateFlow2 = submitReviewViewModel2.j;
                mutableStateFlow2.setValue(SubmitReviewContract.ViewState.InProgress.f12775a);
                submitReviewViewModel2.q6();
                break;
            case 2:
                SubmitReviewViewModel submitReviewViewModel3 = this.e;
                MutableStateFlow mutableStateFlow3 = submitReviewViewModel3.j;
                mutableStateFlow3.setValue(SubmitReviewContract.ViewState.InProgress.f12775a);
                submitReviewViewModel3.q6();
                break;
            default:
                SubmitReviewViewModel submitReviewViewModel4 = this.e;
                MutableStateFlow mutableStateFlow4 = submitReviewViewModel4.j;
                WriteReviewFormData writeReviewFormData = submitReviewViewModel4.l;
                if (writeReviewFormData == null) {
                    Intrinsics.p("reviewFormData");
                    throw null;
                }
                mutableStateFlow4.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData));
                break;
        }
        return Unit.f24250a;
    }
}
