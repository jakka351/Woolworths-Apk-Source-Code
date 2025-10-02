package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.ratingsandreviews.SubmitReviewAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.ReviewFormSectionTargetProduct;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormData;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel$fetchReviewFormData$1", f = "SubmitReviewViewModel.kt", l = {106}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubmitReviewViewModel$fetchReviewFormData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubmitReviewViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewViewModel$fetchReviewFormData$1(SubmitReviewViewModel submitReviewViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = submitReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewViewModel$fetchReviewFormData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewViewModel$fetchReviewFormData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SubmitReviewViewModel submitReviewViewModel = this.q;
        AnalyticsManager analyticsManager = submitReviewViewModel.f;
        String str = submitReviewViewModel.e;
        MutableStateFlow mutableStateFlow = submitReviewViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        FullPageMessage.Error.ServerError serverError = FullPageMessage.Error.ServerError.f8920a;
        int i2 = 1;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SubmitReviewInteractor submitReviewInteractor = submitReviewViewModel.g;
                this.p = 1;
                SubmitReviewRepository submitReviewRepository = submitReviewInteractor.f12776a;
                submitReviewRepository.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new SubmitReviewRepository$getSubmitRatingForm$2(submitReviewRepository, str, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            WriteReviewFormData writeReviewFormData = (WriteReviewFormData) obj;
            if (writeReviewFormData.b.isEmpty()) {
                mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Failure(serverError, null, new a(submitReviewViewModel, 0), 6));
            } else {
                mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Content(writeReviewFormData));
                analyticsManager.f(new SubmitReviewAnalytics.SubmitReview(CollectionsKt.Q(str)));
            }
            submitReviewViewModel.l = writeReviewFormData;
            List list = writeReviewFormData.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ReviewFormSectionTargetProduct) {
                    arrayList.add(obj2);
                }
            }
            ReviewFormSectionTargetProduct reviewFormSectionTargetProduct = (ReviewFormSectionTargetProduct) CollectionsKt.F(arrayList);
            submitReviewViewModel.m = reviewFormSectionTargetProduct != null ? reviewFormSectionTargetProduct.f12744a.b : "";
        } catch (NoConnectivityException unused) {
            mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Failure(FullPageMessage.Error.ConnectionError.f8919a, null, new a(submitReviewViewModel, i2), 6));
        } catch (ServerErrorException e) {
            ServerError serverError2 = (ServerError) CollectionsKt.F(e.d);
            if (Intrinsics.c(serverError2 != null ? serverError2.b : null, "Duplicate submission")) {
                mutableStateFlow.setValue(SubmitReviewContract.ViewState.DuplicateFailure.f12773a);
                analyticsManager.g((Event) new SubmitReviewAnalytics.SubmitReview(CollectionsKt.Q(str)).f.b.getD());
            } else {
                mutableStateFlow.setValue(new SubmitReviewContract.ViewState.Failure(serverError, null, new a(submitReviewViewModel, 2), 6));
            }
        }
        return Unit.f24250a;
    }
}
