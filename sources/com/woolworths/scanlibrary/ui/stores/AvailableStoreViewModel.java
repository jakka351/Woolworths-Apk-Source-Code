package com.woolworths.scanlibrary.ui.stores;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import com.woolworths.scanlibrary.domain.stores.GetAvailableStoresUC;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreContract;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "LiveDataHolder", "GetAvailableStoresObserverSingle", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AvailableStoreViewModel extends BaseViewModel implements FullPageErrorStateClickHandler {
    public final GetAvailableStoresUC h;
    public final AnalyticsManager i;
    public final FeatureToggleManager j;
    public final LiveDataHolder k;
    public AvailableStoreContract.ViewState l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public HashMap o;
    public int p;
    public final boolean q;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreViewModel$GetAvailableStoresObserverSingle;", "Lcom/woolworths/scanlibrary/base/mvvm/ApiSingleDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/stores/GetAvailableStoresUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetAvailableStoresObserverSingle extends ApiSingleDisposableObserver<GetAvailableStoresUC.ResponseValue> {
        public GetAvailableStoresObserverSingle() {
            super(22, AvailableStoreViewModel.this.q ? null : AvailableStoreViewModel.this.f);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void a(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
            super.a(i, apigeeErrorResponse, i2);
            AvailableStoreViewModel availableStoreViewModel = AvailableStoreViewModel.this;
            availableStoreViewModel.k.f21341a.j(new Event(AvailableStoreContract.Actions.AvailableStoreLoadingFail.f21337a));
            availableStoreViewModel.p6();
            AvailableStoreContract.ViewState viewStateA = AvailableStoreContract.ViewState.a(availableStoreViewModel.l, false, true, 1);
            availableStoreViewModel.l = viewStateA;
            availableStoreViewModel.m.j(viewStateA);
            availableStoreViewModel.i.c(new AvailableStoreViewModel$trackError$1());
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void c(MvpView.ErrorType errorType) {
            super.c(errorType);
            AvailableStoreViewModel availableStoreViewModel = AvailableStoreViewModel.this;
            availableStoreViewModel.p6();
            availableStoreViewModel.k.f21341a.j(new Event(AvailableStoreContract.Actions.AvailableStoreLoadingFail.f21337a));
            AvailableStoreContract.ViewState viewStateA = AvailableStoreContract.ViewState.a(availableStoreViewModel.l, false, true, 1);
            availableStoreViewModel.l = viewStateA;
            availableStoreViewModel.m.j(viewStateA);
            availableStoreViewModel.i.c(new AvailableStoreViewModel$trackError$1());
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetAvailableStoresUC.ResponseValue response = (GetAvailableStoresUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            AvailableStoreViewModel availableStoreViewModel = AvailableStoreViewModel.this;
            availableStoreViewModel.p6();
            List list = response.f21205a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                String state = ((Store) obj2).getState();
                if (state == null) {
                    state = "";
                }
                Object arrayList = linkedHashMap.get(state);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(state, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            availableStoreViewModel.o = linkedHashMap;
            availableStoreViewModel.k.f21341a.j(new Event(new AvailableStoreContract.Actions.AvailableStoreLoadingSuccess(list)));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreViewModel$LiveDataHolder;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class LiveDataHolder {

        /* renamed from: a, reason: collision with root package name */
        public final MutableLiveData f21341a = new MutableLiveData();
    }

    public AvailableStoreViewModel(GetAvailableStoresUC getAvailableStoresUC, AnalyticsManager analyticsManager, ResourceResolverImpl resourceResolverImpl, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.h = getAvailableStoresUC;
        this.i = analyticsManager;
        this.j = featureToggleManager;
        this.k = new LiveDataHolder();
        AvailableStoreContract.ViewState viewState = new AvailableStoreContract.ViewState(false, false);
        this.l = viewState;
        MutableLiveData mutableLiveData = new MutableLiveData(viewState);
        this.m = mutableLiveData;
        this.n = mutableLiveData;
        this.o = new HashMap();
        this.q = true;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        r6();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
    }

    public final void r6() {
        q6();
        AvailableStoreContract.ViewState viewStateA = AvailableStoreContract.ViewState.a(this.l, false, false, 1);
        this.l = viewStateA;
        this.m.j(viewStateA);
        SingleObserveOn singleObserveOnF = this.h.b(new GetAvailableStoresUC.RequestValues()).f(AndroidSchedulers.a());
        GetAvailableStoresObserverSingle getAvailableStoresObserverSingle = new GetAvailableStoresObserverSingle();
        singleObserveOnF.a(getAvailableStoresObserverSingle);
        this.e.d(getAvailableStoresObserverSingle);
    }

    public final List s6(String stateCode) {
        Intrinsics.h(stateCode, "stateCode");
        List list = (List) this.o.get(stateCode);
        if (list == null) {
            list = EmptyList.d;
        }
        AvailableStoreContract.ViewState viewStateA = AvailableStoreContract.ViewState.a(this.l, list.isEmpty(), false, 2);
        this.l = viewStateA;
        this.m.j(viewStateA);
        if (list.isEmpty()) {
            this.i.c(new Action() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoreViewModel$trackEmptyState$1
                public final Screens d = Screens.p;
                public final Category e = Category.v;
                public final String f = "Scan&Go isn't available in your area yet!";

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: a, reason: from getter */
                public final String getF() {
                    return this.f;
                }

                @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                /* renamed from: b, reason: from getter */
                public final Category getE() {
                    return this.e;
                }

                @Override // au.com.woolworths.android.onesite.analytics.Action
                /* renamed from: f */
                public final Screen getD() {
                    return this.d;
                }
            });
        }
        return list;
    }
}
