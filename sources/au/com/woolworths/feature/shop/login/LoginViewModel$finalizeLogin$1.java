package au.com.woolworths.feature.shop.login;

import au.com.woolworths.analytics.supers.login.LoginAnalytics;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.network.AkamaiException;
import au.com.woolworths.android.onesite.network.AkamaiServerErrorType;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.login.LoginContract;
import au.com.woolworths.feature.shop.login.analytics.LoginErrorReason;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.LoginViewModel$finalizeLogin$1", f = "LoginViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LoginViewModel$finalizeLogin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LoginViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$finalizeLogin$1(LoginViewModel loginViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = loginViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginViewModel$finalizeLogin$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginViewModel$finalizeLogin$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        LoginViewModel loginViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = loginViewModel.o;
        CollectionModeInteractor collectionModeInteractor = loginViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                LoginInteractor loginInteractor = loginViewModel.e;
                String str = this.r;
                this.p = 1;
                if (loginInteractor.a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            loginViewModel.i.g(LoginAnalytics.LoginWebview.Action.e);
            if (collectionModeInteractor.G() && collectionModeInteractor.c() == null) {
                sharedFlowImpl.f(LoginContract.Action.LaunchPickUpLocator.f7449a);
            } else {
                loginViewModel.j.f = 0L;
                if (loginViewModel.h.b() == Region.j) {
                    LoginViewModel.p6(loginViewModel);
                } else {
                    sharedFlowImpl.f(LoginContract.Action.CloseLoginScreen.f7447a);
                }
            }
        } catch (NoConnectivityException unused) {
            loginViewModel.q6(false, ConnectionErrorState.d);
        } catch (ServerErrorException e) {
            LoginErrorReason[] loginErrorReasonArr = LoginErrorReason.e;
            AkamaiServerErrorType akamaiServerErrorTypeA = ExceptionExtKt.a(e);
            if (akamaiServerErrorTypeA != null) {
                String f4561a = akamaiServerErrorTypeA.getF4561a();
                if (f4561a != null) {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.Barker.h(new ReportOwner(ReportOwner.Squad.m), new AkamaiException(androidx.camera.core.impl.b.o(akamaiServerErrorTypeA.getC(), " -> ", f4561a)), "Login failed -> " + akamaiServerErrorTypeA.getC(), 24);
                } else {
                    Bark.Companion companion2 = Bark.f8483a;
                    Bark.Barker.h(new ReportOwner(ReportOwner.Squad.m), new AkamaiException(akamaiServerErrorTypeA.getC()), "Login failed -> " + akamaiServerErrorTypeA.getC(), 24);
                }
            }
            loginViewModel.q6(false, new ServerErrorState(ExceptionExtKt.c(e, akamaiServerErrorTypeA != null ? akamaiServerErrorTypeA.getF4561a() : null, akamaiServerErrorTypeA != null ? akamaiServerErrorTypeA.getB() : null), Boolean.valueOf(ExceptionExtKt.b(e))));
        }
        return Unit.f24250a;
    }
}
