package au.com.woolworths.feature.shop.login;

import au.com.woolworths.feature.shop.login.LoginContract;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LoginViewModel e;

    public /* synthetic */ c(LoginViewModel loginViewModel, int i) {
        this.d = i;
        this.e = loginViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                LoginViewModel loginViewModel = this.e;
                ShopAccountInteractor shopAccountInteractor = loginViewModel.g;
                SharedFlowImpl sharedFlowImpl = loginViewModel.o;
                if ((!loginViewModel.f.s()) && shopAccountInteractor.d()) {
                    sharedFlowImpl.f(LoginContract.Action.LaunchAddressPickerAndCloseLogin.f7448a);
                } else {
                    sharedFlowImpl.f(LoginContract.Action.CloseLoginScreen.f7447a);
                }
                break;
            default:
                this.e.o.f(LoginContract.Action.CloseLoginScreen.f7447a);
                Timber.f27013a.p((Throwable) obj);
                break;
        }
        return Unit.f24250a;
    }
}
