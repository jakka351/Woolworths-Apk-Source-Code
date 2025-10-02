package au.com.woolworths.feature.shop.signup.ui;

import au.com.woolworths.feature.shop.signup.SignUpContract;
import au.com.woolworths.feature.shop.signup.SignUpViewModel;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt$SignUpScreen$1$1", f = "SignUpScreen.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SignUpScreenKt$SignUpScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SignUpViewModel r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpScreen$1$1(SignUpViewModel signUpViewModel, Function0 function0, Function1 function1, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.r = signUpViewModel;
        this.s = function0;
        this.t = function1;
        this.u = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SignUpScreenKt$SignUpScreen$1$1 signUpScreenKt$SignUpScreen$1$1 = new SignUpScreenKt$SignUpScreen$1$1(this.r, this.s, this.t, this.u, continuation);
        signUpScreenKt$SignUpScreen$1$1.q = obj;
        return signUpScreenKt$SignUpScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SignUpScreenKt$SignUpScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.q;
            Flow flow = this.r.g;
            final Function1 function1 = this.t;
            final Function0 function0 = this.u;
            final Function0 function02 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt$SignUpScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SignUpContract.Action action = (SignUpContract.Action) obj2;
                    if (action instanceof SignUpContract.Action.LaunchLogin) {
                        String f8108a = ((SignUpContract.Action.LaunchLogin) action).getF8108a();
                        if (f8108a != null) {
                            function1.invoke(f8108a);
                        } else {
                            function0.invoke();
                        }
                    } else {
                        if (!(action instanceof SignUpContract.Action.CloseSignup)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function02.invoke();
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
