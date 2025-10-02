package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreen$1$1", f = "SubmitReviewScreen.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubmitReviewScreenKt$SubmitReviewScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubmitReviewViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ CoroutineScope s;
    public final /* synthetic */ SnackbarHostState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewScreenKt$SubmitReviewScreen$1$1(SubmitReviewViewModel submitReviewViewModel, Function0 function0, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.q = submitReviewViewModel;
        this.r = function0;
        this.s = coroutineScope;
        this.t = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewScreenKt$SubmitReviewScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewScreenKt$SubmitReviewScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.i;
            final CoroutineScope coroutineScope = this.s;
            final SnackbarHostState snackbarHostState = this.t;
            final Function0 function0 = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreen$1$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreen$1$1$1$1", f = "SubmitReviewScreen.kt", l = {119}, m = "invokeSuspend")
                /* renamed from: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C02751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ SnackbarHostState q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02751(SnackbarHostState snackbarHostState, Continuation continuation) {
                        super(2, continuation);
                        this.q = snackbarHostState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C02751(this.q, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C02751) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            this.p = 1;
                            if (SnackbarHostState.b(this.q, "Review submitted successfully. it may take some time to appear on the site", null, null, this, 6) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SubmitReviewContract.Action action = (SubmitReviewContract.Action) obj2;
                    if (Intrinsics.c(action, SubmitReviewContract.Action.OnNavigateUp.f12770a)) {
                        function0.invoke();
                    } else if (Intrinsics.c(action, SubmitReviewContract.Action.ShowSubmitFormSuccessToast.f12771a)) {
                        BuildersKt.c(coroutineScope, null, null, new C02751(snackbarHostState, null), 3);
                    } else if (!Intrinsics.c(action, SubmitReviewContract.Action.LaunchLogin.f12769a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
