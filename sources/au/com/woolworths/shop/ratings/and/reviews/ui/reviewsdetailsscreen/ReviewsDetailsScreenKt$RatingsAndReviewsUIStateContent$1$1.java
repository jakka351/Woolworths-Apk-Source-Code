package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsUIStateContent$1$1", f = "ReviewsDetailsScreen.kt", l = {210, 215}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReviewsDetailsScreenKt$RatingsAndReviewsUIStateContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyPagingItems q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ String s;
    public final /* synthetic */ RatingReviewHandler t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsDetailsScreenKt$RatingsAndReviewsUIStateContent$1$1(LazyPagingItems lazyPagingItems, SnackbarHostState snackbarHostState, String str, RatingReviewHandler ratingReviewHandler, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.q = lazyPagingItems;
        this.r = snackbarHostState;
        this.s = str;
        this.t = ratingReviewHandler;
        this.u = mutableState;
        this.v = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewsDetailsScreenKt$RatingsAndReviewsUIStateContent$1$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewsDetailsScreenKt$RatingsAndReviewsUIStateContent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (androidx.compose.material.SnackbarHostState.b(r11.r, r11.s, null, r8, r9, 2) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.p
            androidx.compose.runtime.MutableState r2 = r11.u
            r3 = 2
            androidx.compose.runtime.MutableState r4 = r11.v
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.b(r12)
            r9 = r11
            goto L62
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            kotlin.ResultKt.b(r12)
            goto L3a
        L21:
            kotlin.ResultKt.b(r12)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r2.setValue(r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r4.setValue(r12)
            r11.p = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r5, r11)
            if (r12 != r0) goto L3a
            r9 = r11
            goto L61
        L3a:
            androidx.paging.compose.LazyPagingItems r12 = r11.q
            androidx.paging.CombinedLoadStates r12 = r12.d()
            androidx.paging.LoadState r12 = r12.c
            boolean r12 = r12 instanceof androidx.paging.LoadState.Error
            if (r12 == 0) goto L6f
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r4.setValue(r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r2.setValue(r12)
            androidx.compose.material.SnackbarDuration r8 = androidx.compose.material.SnackbarDuration.d
            r11.p = r3
            androidx.compose.material.SnackbarHostState r5 = r11.r
            java.lang.String r6 = r11.s
            r7 = 0
            r10 = 2
            r9 = r11
            java.lang.Object r12 = androidx.compose.material.SnackbarHostState.b(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L62
        L61:
            return r0
        L62:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r4.setValue(r12)
            au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler r12 = r9.t
            java.lang.String r0 = r9.s
            r12.r5(r0)
            goto L75
        L6f:
            r9 = r11
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r4.setValue(r12)
        L75:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt$RatingsAndReviewsUIStateContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
