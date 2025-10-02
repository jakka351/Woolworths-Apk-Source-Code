package au.com.woolworths.feature.shop.editorder.review.components;

import android.content.Context;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$1$1", f = "CmoReviewScreen.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CmoReviewScreenKt$CmoReviewScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Function1 t;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$1$1$1", f = "CmoReviewScreen.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt$CmoReviewScreen$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CmoReviewContract.UiAction, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ SnackbarHostState r;
        public final /* synthetic */ Context s;
        public final /* synthetic */ Function1 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SnackbarHostState snackbarHostState, Context context, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.r = snackbarHostState;
            this.s = context;
            this.t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CmoReviewContract.UiAction) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CmoReviewContract.UiAction uiAction = (CmoReviewContract.UiAction) this.q;
                if (uiAction instanceof CmoReviewContract.UiAction.ShowSnackbarMessage) {
                    String string = ((CmoReviewContract.UiAction.ShowSnackbarMessage) uiAction).f7086a.getText(this.s).toString();
                    this.p = 1;
                    if (SnackbarHostState.c(this.r, string, null, null, this, 14) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (!(uiAction instanceof CmoReviewContract.UiAction.NavigateTo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.t.invoke(((CmoReviewContract.UiAction.NavigateTo) uiAction).f7085a);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmoReviewScreenKt$CmoReviewScreen$1$1(Flow flow, SnackbarHostState snackbarHostState, Context context, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = snackbarHostState;
        this.s = context;
        this.t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CmoReviewScreenKt$CmoReviewScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CmoReviewScreenKt$CmoReviewScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, null);
            this.p = 1;
            if (FlowKt.h(this.q, anonymousClass1, this) == coroutineSingletons) {
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
