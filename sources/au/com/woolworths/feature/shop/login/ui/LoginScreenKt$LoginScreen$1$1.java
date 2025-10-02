package au.com.woolworths.feature.shop.login.ui;

import au.com.woolworths.feature.shop.login.LoginContract;
import au.com.woolworths.feature.shop.login.LoginViewModel;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.ui.LoginScreenKt$LoginScreen$1$1", f = "LoginScreen.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LoginScreenKt$LoginScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LoginViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginScreenKt$LoginScreen$1$1(LoginViewModel loginViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Continuation continuation) {
        super(2, continuation);
        this.q = loginViewModel;
        this.r = function0;
        this.s = function02;
        this.t = function03;
        this.u = function04;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginScreenKt$LoginScreen$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginScreenKt$LoginScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.p;
            final Function0 function0 = this.t;
            final Function0 function02 = this.u;
            final Function0 function03 = this.r;
            final Function0 function04 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.login.ui.LoginScreenKt$LoginScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    LoginContract.Action action = (LoginContract.Action) obj2;
                    if (action instanceof LoginContract.Action.CloseLoginScreen) {
                        function03.invoke();
                    } else if (action instanceof LoginContract.Action.LaunchPickUpLocator) {
                        function04.invoke();
                    } else if (action instanceof LoginContract.Action.LaunchSignUp) {
                        function0.invoke();
                    } else {
                        if (!Intrinsics.c(action, LoginContract.Action.LaunchAddressPickerAndCloseLogin.f7448a)) {
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
