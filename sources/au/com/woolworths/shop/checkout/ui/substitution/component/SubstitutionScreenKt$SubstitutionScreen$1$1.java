package au.com.woolworths.shop.checkout.ui.substitution.component;

import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$1$1", f = "SubstitutionScreen.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubstitutionScreenKt$SubstitutionScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionScreenKt$SubstitutionScreen$1$1(Flow flow, SnackbarHostState snackbarHostState, String str, Function0 function0, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = snackbarHostState;
        this.s = str;
        this.t = function0;
        this.u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubstitutionScreenKt$SubstitutionScreen$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubstitutionScreenKt$SubstitutionScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Function0 function0 = this.t;
            final String str = this.u;
            final SnackbarHostState snackbarHostState = this.r;
            final String str2 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionScreenKt$SubstitutionScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SubstitutionContract.Action action = (SubstitutionContract.Action) obj2;
                    boolean zC = Intrinsics.c(action, SubstitutionContract.Action.ShowNoProductSelected.f10813a);
                    Unit unit = Unit.f24250a;
                    if (zC) {
                        Object objC = SnackbarHostState.c(snackbarHostState, str2, null, null, continuation, 14);
                        if (objC == CoroutineSingletons.d) {
                            return objC;
                        }
                    } else {
                        if (Intrinsics.c(action, SubstitutionContract.Action.LeaveScreen.f10812a)) {
                            function0.invoke();
                            return unit;
                        }
                        if (!Intrinsics.c(action, SubstitutionContract.Action.ShowSavingError.f10814a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objC2 = SnackbarHostState.c(snackbarHostState, str, null, null, continuation, 14);
                        if (objC2 == CoroutineSingletons.d) {
                            return objC2;
                        }
                    }
                    return unit;
                }
            };
            this.p = 1;
            if (this.q.collect(flowCollector, this) == coroutineSingletons) {
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
