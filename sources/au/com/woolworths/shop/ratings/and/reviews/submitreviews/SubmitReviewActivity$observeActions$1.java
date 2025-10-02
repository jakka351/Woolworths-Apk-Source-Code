package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity$observeActions$1", f = "SubmitReviewActivity.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubmitReviewActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubmitReviewActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<SubmitReviewContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            SubmitReviewContract.Action action = (SubmitReviewContract.Action) obj;
            SubmitReviewActivity submitReviewActivity = (SubmitReviewActivity) this.d;
            int i = SubmitReviewActivity.z;
            if (action instanceof SubmitReviewContract.Action.OnNavigateUp) {
                submitReviewActivity.finish();
            } else if (action instanceof SubmitReviewContract.Action.LaunchLogin) {
                submitReviewActivity.y.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
            } else {
                submitReviewActivity.getClass();
                if (!(action instanceof SubmitReviewContract.Action.ShowSubmitFormSuccessToast)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewActivity$observeActions$1(SubmitReviewActivity submitReviewActivity, Continuation continuation) {
        super(2, continuation);
        this.q = submitReviewActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = SubmitReviewActivity.z;
            SubmitReviewActivity submitReviewActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, submitReviewActivity, SubmitReviewActivity.class, "handleAction", "handleAction(Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$Action;)V", 4), FlowExtKt.a(((SubmitReviewViewModel) submitReviewActivity.x.getD()).i, submitReviewActivity.getD(), Lifecycle.State.f));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
