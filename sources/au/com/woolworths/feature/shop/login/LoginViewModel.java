package au.com.woolworths.feature.shop.login;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.feature.shop.login.LoginContract;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoginViewModel extends ViewModel {
    public final LoginInteractor e;
    public final CollectionModeInteractor f;
    public final ShopAccountInteractor g;
    public final ShopAppRegionInteractor h;
    public final AnalyticsManager i;
    public final CartUpdateInteractor j;
    public final LegacyShoppingModeRepository k;
    public final CompositeDisposable l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final SharedFlowImpl o;
    public final Flow p;

    public LoginViewModel(LoginInteractor loginInteractor, CollectionModeInteractor collectionModeInteractor, ShopAccountInteractor accountInteractor, ShopAppRegionInteractor shopAppRegionInteractor, AnalyticsManager analyticsManager, CartUpdateInteractor cartUpdateInteractor, LegacyShoppingModeRepository shoppingModeRepository) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
        this.e = loginInteractor;
        this.f = collectionModeInteractor;
        this.g = accountInteractor;
        this.h = shopAppRegionInteractor;
        this.i = analyticsManager;
        this.j = cartUpdateInteractor;
        this.k = shoppingModeRepository;
        this.l = new CompositeDisposable();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new LoginContract.ViewState(false, null));
        this.m = mutableStateFlowA;
        this.n = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.o = sharedFlowImplB;
        this.p = FlowKt.a(sharedFlowImplB);
    }

    public static final void p6(LoginViewModel loginViewModel) {
        CompositeDisposable compositeDisposable = loginViewModel.l;
        Single singleO = loginViewModel.k.o(false);
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new au.com.woolworths.feature.shop.delivery.address.a(new c(loginViewModel, 0), 5), new au.com.woolworths.feature.shop.delivery.address.a(new c(loginViewModel, 1), 6));
        singleO.a(consumerSingleObserver);
        DisposableKt.a(compositeDisposable, consumerSingleObserver);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.l.e();
    }

    public final void q6(boolean z, LoginFullPageErrorState loginFullPageErrorState) {
        ((LoginContract.ViewState) this.n.getValue()).getClass();
        this.m.f(new LoginContract.ViewState(z, loginFullPageErrorState));
    }
}
