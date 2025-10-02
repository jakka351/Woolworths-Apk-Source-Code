package au.com.woolworths.feature.rewards.account.preferences;

import android.content.Context;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1", f = "RewardsPreferenceDetailsContent.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsPreferenceDetailsViewModel q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ Context s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1(RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModel, SnackbarHostState snackbarHostState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsPreferenceDetailsViewModel;
        this.r = snackbarHostState;
        this.s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.u;
            final SnackbarHostState snackbarHostState = this.r;
            final Context context = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt$RewardsPreferenceDetailsUi$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    RewardsPreferenceDetailsContract.ViewActions viewActions = (RewardsPreferenceDetailsContract.ViewActions) obj2;
                    if (viewActions instanceof RewardsPreferenceDetailsContract.ViewActions.ShowSnackBarErrorMessage) {
                        String string = context.getString(((RewardsPreferenceDetailsContract.ViewActions.ShowSnackBarErrorMessage) viewActions).f5728a);
                        Intrinsics.g(string, "getString(...)");
                        Object objB = SnackbarHostState.b(snackbarHostState, string, null, SnackbarDuration.e, continuation, 2);
                        if (objB == CoroutineSingletons.d) {
                            return objB;
                        }
                    } else {
                        if (!(viewActions instanceof RewardsPreferenceDetailsContract.ViewActions.ShowSnackBarMessage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objB2 = SnackbarHostState.b(snackbarHostState, ((RewardsPreferenceDetailsContract.ViewActions.ShowSnackBarMessage) viewActions).f5729a, null, SnackbarDuration.e, continuation, 2);
                        if (objB2 == CoroutineSingletons.d) {
                            return objB2;
                        }
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
