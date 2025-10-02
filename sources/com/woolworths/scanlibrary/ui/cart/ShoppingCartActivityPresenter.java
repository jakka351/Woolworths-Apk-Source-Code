package com.woolworths.scanlibrary.ui.cart;

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
import com.woolworths.scanlibrary.domain.cart.ClearCartUseCase;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.models.profile.Survey;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartContract;
import com.woolworths.scanlibrary.ui.menu.analytics.MenuActionData;
import com.woolworths.scanlibrary.util.event.Event;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartActivityPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartContract$View;", "Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartContract$Presenter;", "ClearCartObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShoppingCartActivityPresenter extends BasePresenter<ShoppingCartContract.View> implements ShoppingCartContract.Presenter {
    public final Store c;
    public final ClearCartUseCase d;
    public final AnalyticsProvider e;
    public final AnalyticsManager f;
    public final MedalliaInteractor g;
    public final SurveyManager h;
    public final ContextScope i;
    public final CompositeDisposable j;
    public final MutableLiveData k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartActivityPresenter$ClearCartObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/cart/ClearCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearCartObserver extends BaseDisposableObserver<ClearCartUseCase.ResponseValue> {
        public final MutableLiveData g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearCartObserver(ShoppingCartContract.View view, MutableLiveData liveEvent) {
            super(view, 4);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            this.g = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ClearCartUseCase.ResponseValue response = (ClearCartUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.g.j(new Event(ShoppingCartContract.ShoppingCartEvent.ShowTapOnViewEvent.f21213a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartActivityPresenter(ShoppingCartContract.View view, Store currentStore, ClearCartUseCase clearCartUseCase, AnalyticsProvider analyticsAggregator, AnalyticsManager analyticsManager, MedalliaInteractor medalliaInteractor, SurveyManager surveyManager) {
        super(view);
        Intrinsics.h(currentStore, "currentStore");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(surveyManager, "surveyManager");
        this.c = currentStore;
        this.d = clearCartUseCase;
        this.e = analyticsAggregator;
        this.f = analyticsManager;
        this.g = medalliaInteractor;
        this.h = surveyManager;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.i = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()));
        this.j = new CompositeDisposable();
        this.k = new MutableLiveData();
        view.k1(this);
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void X0() {
        CoroutineScopeKt.b(this.i, null);
        super.X0();
    }

    @Override // com.woolworths.scanlibrary.ui.cart.ShoppingCartContract.Presenter
    public final void a() {
        MvpView mvpView = this.f21139a;
        ((ShoppingCartContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.d.b(new ClearCartUseCase.RequestValues(this.c.getNo())).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        ClearCartObserver clearCartObserver = new ClearCartObserver((ShoppingCartContract.View) mvpView, this.k);
        singleObserveOnF.a(clearCartObserver);
        this.j.d(clearCartObserver);
        this.e.b(new AbandonShoppingTracking());
    }

    @Override // com.woolworths.scanlibrary.ui.cart.ShoppingCartContract.Presenter
    public final void b() {
        Survey survey;
        String menuFormId;
        this.f.j(MenuActionData.f, TrackingMetadata.Companion.a(TrackableValue.o0, "Send Feedback"));
        if (!this.g.b() || (survey = this.h.f21206a) == null || (menuFormId = survey.getMenuFormId()) == null) {
            return;
        }
        BuildersKt.c(this.i, null, null, new ShoppingCartActivityPresenter$submitUserFeedback$1$1(this, menuFormId, null), 3);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.ShoppingCartContract.Presenter
    /* renamed from: z0, reason: from getter */
    public final MutableLiveData getK() {
        return this.k;
    }
}
