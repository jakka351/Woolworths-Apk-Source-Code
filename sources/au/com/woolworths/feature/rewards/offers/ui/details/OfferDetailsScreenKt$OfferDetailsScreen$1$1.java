package au.com.woolworths.feature.rewards.offers.ui.details;

import android.content.Context;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsScreen$1$1", f = "OfferDetailsScreen.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OfferDetailsScreenKt$OfferDetailsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OfferDetailsViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ ScaffoldState t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailsScreenKt$OfferDetailsScreen$1$1(OfferDetailsViewModel offerDetailsViewModel, Function0 function0, Function1 function1, ScaffoldState scaffoldState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = offerDetailsViewModel;
        this.r = function0;
        this.s = function1;
        this.t = scaffoldState;
        this.u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfferDetailsScreenKt$OfferDetailsScreen$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfferDetailsScreenKt$OfferDetailsScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.m;
            final ScaffoldState scaffoldState = this.t;
            final Context context = this.u;
            final Function0 function0 = this.r;
            final Function1 function1 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    OfferDetailsContract.Action action = (OfferDetailsContract.Action) obj2;
                    boolean zC = Intrinsics.c(action, OfferDetailsContract.Action.NavigateUp.f6302a);
                    Unit unit = Unit.f24250a;
                    if (zC) {
                        function0.invoke();
                        return unit;
                    }
                    if (action instanceof OfferDetailsContract.Action.OpenUrl) {
                        function1.invoke(((OfferDetailsContract.Action.OpenUrl) action).f6303a);
                        return unit;
                    }
                    if (!(action instanceof OfferDetailsContract.Action.ShowBoostFailureSnackbar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SnackbarHostState snackbarHostState = scaffoldState.f1319a;
                    String string = context.getString(R.string.rewards_offer_page_error_boost_failed);
                    Intrinsics.g(string, "getString(...)");
                    Object objB = SnackbarHostState.b(snackbarHostState, string, null, null, continuation, 6);
                    return objB == CoroutineSingletons.d ? objB : unit;
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
