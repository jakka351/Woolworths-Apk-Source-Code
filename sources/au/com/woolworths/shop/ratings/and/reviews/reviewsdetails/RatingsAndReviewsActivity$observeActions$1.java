package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.RatingsAndReviewsScreens;
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
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity$observeActions$1", f = "RatingsAndReviewsActivity.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RatingsAndReviewsActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RatingsAndReviewsActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ReviewsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ReviewsContract.Actions actions = (ReviewsContract.Actions) obj;
            RatingsAndReviewsActivity ratingsAndReviewsActivity = (RatingsAndReviewsActivity) this.d;
            int i = RatingsAndReviewsActivity.z;
            ratingsAndReviewsActivity.getClass();
            if (actions instanceof ReviewsContract.Actions.OnDeepLinkClicked) {
                ratingsAndReviewsActivity.startActivity(ShopAppDeepLink.a(RatingsAndReviewsScreens.d, ((ReviewsContract.Actions.OnDeepLinkClicked) actions).f12754a));
            } else {
                if (!(actions instanceof ReviewsContract.Actions.OnNavigateUp)) {
                    throw new NoWhenBranchMatchedException();
                }
                ratingsAndReviewsActivity.finish();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingsAndReviewsActivity$observeActions$1(RatingsAndReviewsActivity ratingsAndReviewsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = ratingsAndReviewsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingsAndReviewsActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RatingsAndReviewsActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            RatingsAndReviewsActivity ratingsAndReviewsActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, ratingsAndReviewsActivity, RatingsAndReviewsActivity.class, "handleAction", "handleAction(Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions;)V", 4), FlowExtKt.a(((ReviewsViewModel) ratingsAndReviewsActivity.y.getD()).i, ratingsAndReviewsActivity.getD(), Lifecycle.State.f));
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
