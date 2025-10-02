package com.woolworths.scanlibrary.ui.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import com.woolworths.scanlibrary.analytics.AbandonShoppingTracking;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.domain.cart.ClearCartUseCase;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.models.profile.Survey;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.user.User;
import com.woolworths.scanlibrary.ui.home.HomeActivityContract;
import com.woolworths.scanlibrary.ui.home.analytics.HomeActions;
import com.woolworths.scanlibrary.ui.menu.analytics.MenuActionData;
import com.woolworths.scanlibrary.util.event.Event;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$View;", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$Presenter;", "ClearCartObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeActivityPresenter extends BasePresenter<HomeActivityContract.View> implements HomeActivityContract.Presenter {
    public final Cart c;
    public final Store d;
    public final ClearCartUseCase e;
    public final AnalyticsProvider f;
    public final AnalyticsManager g;
    public final MedalliaInteractor h;
    public final SurveyManager i;
    public final CompositeDisposable j;
    public final MutableLiveData k;
    public final ContextScope l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivityPresenter$ClearCartObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/ClearCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearCartObserver extends BaseDisposableObserver<ClearCartUseCase.ResponseValue> {
        public final MutableLiveData g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearCartObserver(HomeActivityContract.View view, MutableLiveData liveEvent) {
            super(view, 4);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            this.g = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ClearCartUseCase.ResponseValue response = (ClearCartUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.g.j(new Event(HomeActivityContract.HomeEvent.ShowTapOnViewEvent.f21266a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityPresenter(HomeActivityContract.View view, Cart shoppingCart, Store currentStore, ClearCartUseCase clearCartUseCase, AnalyticsProvider analyticsAggregator, User authenticatedUser, AnalyticsManager analyticsManager, MedalliaInteractor medalliaInteractor, SurveyManager surveyManager) {
        super(view);
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(currentStore, "currentStore");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        Intrinsics.h(authenticatedUser, "authenticatedUser");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(surveyManager, "surveyManager");
        this.c = shoppingCart;
        this.d = currentStore;
        this.e = clearCartUseCase;
        this.f = analyticsAggregator;
        this.g = analyticsManager;
        this.h = medalliaInteractor;
        this.i = surveyManager;
        this.j = new CompositeDisposable();
        this.k = new MutableLiveData();
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.l = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()));
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void F() {
        this.g.c(HomeActions.g);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final boolean J0() {
        return this.c.z(true) > 0;
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void U() {
        this.g.c(HomeActions.e);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final BigDecimal V() {
        return this.c.getE();
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void X0() {
        CoroutineScopeKt.b(this.l, null);
        super.X0();
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void a() {
        MvpView mvpView = this.f21139a;
        ((HomeActivityContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.e.b(new ClearCartUseCase.RequestValues(this.d.getNo())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        ClearCartObserver clearCartObserver = new ClearCartObserver((HomeActivityContract.View) mvpView, this.k);
        singleObserveOnF.a(clearCartObserver);
        this.j.d(clearCartObserver);
        this.f.b(new AbandonShoppingTracking());
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void b() {
        Survey survey;
        String menuFormId;
        this.g.j(MenuActionData.f, TrackingMetadata.Companion.a(TrackableValue.o0, "Send Feedback"));
        if (!this.h.b() || (survey = this.i.f21206a) == null || (menuFormId = survey.getMenuFormId()) == null) {
            return;
        }
        BuildersKt.c(this.l, null, null, new HomeActivityPresenter$submitUserFeedback$1$1(this, menuFormId, null), 3);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void i(boolean z) {
        ((HomeActivityContract.View) this.f21139a).W3(z);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final int l() {
        return this.c.z(false);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void l0() {
        this.g.c(HomeActions.f);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final int n() {
        return this.d.getNo();
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void r0() {
        this.g.c(HomeActions.h);
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    /* renamed from: t0, reason: from getter */
    public final MutableLiveData getK() {
        return this.k;
    }

    @Override // com.woolworths.scanlibrary.ui.home.HomeActivityContract.Presenter
    public final void v() {
        this.g.c(HomeActions.i);
    }
}
