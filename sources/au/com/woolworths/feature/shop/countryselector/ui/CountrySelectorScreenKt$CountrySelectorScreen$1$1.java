package au.com.woolworths.feature.shop.countryselector.ui;

import au.com.woolworths.feature.shop.countryselector.CountrySelectorContract;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorScreenKt$CountrySelectorScreen$1$1", f = "CountrySelectorScreen.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CountrySelectorScreenKt$CountrySelectorScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CountrySelectorViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectorScreenKt$CountrySelectorScreen$1$1(CountrySelectorViewModel countrySelectorViewModel, Function0 function0, Function1 function1, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.q = countrySelectorViewModel;
        this.r = function0;
        this.s = function1;
        this.t = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CountrySelectorScreenKt$CountrySelectorScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CountrySelectorScreenKt$CountrySelectorScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.j;
            final Function1 function1 = this.s;
            final Function0 function0 = this.t;
            final Function0 function02 = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorScreenKt$CountrySelectorScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    CountrySelectorContract.Actions actions = (CountrySelectorContract.Actions) obj2;
                    if (actions instanceof CountrySelectorContract.Actions.Navigate) {
                        CountrySelectorContract.Destination destination = ((CountrySelectorContract.Actions.Navigate) actions).f7031a;
                        if (Intrinsics.c(destination, CountrySelectorContract.Destination.Onboarding.f7034a)) {
                            function02.invoke();
                        } else {
                            if (!(destination instanceof CountrySelectorContract.Destination.HomePage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            function1.invoke(((CountrySelectorContract.Destination.HomePage) destination).f7033a);
                        }
                    } else {
                        if (!Intrinsics.c(actions, CountrySelectorContract.Actions.PerformIdpLogout.f7032a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function0.invoke();
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
