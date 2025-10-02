package au.com.woolworths.shop.checkout.ui.timeselector;

import android.app.Activity;
import android.content.Context;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarDuration;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$1$1", f = "TimeSelectorScreen.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeSelectorScreenKt$TimeSelectorScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TimeSelectorViewModel q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ SnackbarHostState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSelectorScreenKt$TimeSelectorScreen$1$1(TimeSelectorViewModel timeSelectorViewModel, Context context, SnackbarHostState snackbarHostState, Continuation continuation) {
        super(2, continuation);
        this.q = timeSelectorViewModel;
        this.r = context;
        this.s = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimeSelectorScreenKt$TimeSelectorScreen$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeSelectorScreenKt$TimeSelectorScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.l;
            final Context context = this.r;
            final SnackbarHostState snackbarHostState = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorScreenKt$TimeSelectorScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    TimeSelectorContract.Actions actions = (TimeSelectorContract.Actions) obj2;
                    boolean zC = Intrinsics.c(actions, TimeSelectorContract.Actions.Finish.f10833a);
                    Unit unit = Unit.f24250a;
                    Context context2 = context;
                    if (zC) {
                        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                        if (activity != null) {
                            activity.setResult(-1);
                            activity.finish();
                            return unit;
                        }
                    } else {
                        if (!(actions instanceof TimeSelectorContract.Actions.ShowSnackBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objC = SnackbarHostState.c(snackbarHostState, ((TimeSelectorContract.Actions.ShowSnackBar) actions).f10834a.getText(context2).toString(), null, SnackbarDuration.e, continuation, 6);
                        if (objC == CoroutineSingletons.d) {
                            return objC;
                        }
                    }
                    return unit;
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
