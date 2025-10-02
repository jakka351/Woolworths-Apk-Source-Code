package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpLocationsResponse;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.ResultKt;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorInteractor;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.analytics.PickUpLocationResultActions;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpLocationResultViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final PickUpLocatorInteractor e;
    public final NetworkExceptions f;
    public final SchedulersProvider g;
    public final AnalyticsManager h;
    public String i;
    public final MutableLiveData j;
    public final CompositeDisposable k;
    public final PublishSubject l;
    public final PublishSubject m;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8207a;

        static {
            int[] iArr = new int[PickUpLocationResultErrorState.values().length];
            try {
                PickUpLocationResultErrorState pickUpLocationResultErrorState = PickUpLocationResultErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickUpLocationResultErrorState pickUpLocationResultErrorState2 = PickUpLocationResultErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8207a = iArr;
        }
    }

    public PickUpLocationResultViewModel(PickUpLocatorInteractor pickUpLocatorInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, NetworkExceptions networkExceptions, SchedulersProvider schedulersProvider, AnalyticsManager analyticsManager) {
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = pickUpLocatorInteractor;
        this.f = networkExceptions;
        this.g = schedulersProvider;
        this.h = analyticsManager;
        this.j = new MutableLiveData();
        this.k = new CompositeDisposable();
        PublishSubject publishSubject = new PublishSubject();
        this.l = publishSubject;
        this.m = publishSubject;
    }

    public static PickUpLocationResultContract.ViewState q6(PickUpLocationResultViewModel pickUpLocationResultViewModel, PickUpLocationResultContract.PageState pageState, PickUpLocationResultErrorState pickUpLocationResultErrorState, List list, int i) {
        PickUpLocationResultErrorState pickUpLocationResultErrorState2 = null;
        if ((i & 2) != 0) {
            pickUpLocationResultErrorState = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        MutableLiveData mutableLiveData = pickUpLocationResultViewModel.j;
        if (pickUpLocationResultErrorState == null) {
            PickUpLocationResultContract.ViewState viewState = (PickUpLocationResultContract.ViewState) mutableLiveData.e();
            if (viewState != null) {
                pickUpLocationResultErrorState2 = viewState.b;
            }
        } else {
            pickUpLocationResultErrorState2 = pickUpLocationResultErrorState;
        }
        if (list == null) {
            PickUpLocationResultContract.ViewState viewState2 = (PickUpLocationResultContract.ViewState) mutableLiveData.e();
            list = viewState2 != null ? viewState2.c : EmptyList.d;
        }
        return new PickUpLocationResultContract.ViewState(pageState, pickUpLocationResultErrorState2, list);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.k.e();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        PickUpLocationResultContract.ViewState viewState = (PickUpLocationResultContract.ViewState) this.j.e();
        PickUpLocationResultErrorState pickUpLocationResultErrorState = viewState != null ? viewState.b : null;
        int i = pickUpLocationResultErrorState == null ? -1 : WhenMappings.f8207a[pickUpLocationResultErrorState.ordinal()];
        if (i == 1 || i == 2) {
            this.h.c(PickUpLocationResultActions.f);
            String str = this.i;
            if (str != null) {
                p6(str);
            } else {
                Intrinsics.p("locationPostCode");
                throw null;
            }
        }
    }

    public final void p6(String postcode) {
        Intrinsics.h(postcode, "postcode");
        this.i = postcode;
        PickUpLocatorInteractor pickUpLocatorInteractor = this.e;
        pickUpLocatorInteractor.getClass();
        PickUpLocatorRepository pickUpLocatorRepository = pickUpLocatorInteractor.f8185a;
        pickUpLocatorRepository.getClass();
        Single<PickUpLocationsResponse> singleH = pickUpLocatorRepository.c.h(postcode);
        au.com.woolworths.feature.shop.delivery.address.a aVar = new au.com.woolworths.feature.shop.delivery.address.a(new b(this, 0), 16);
        singleH.getClass();
        SingleResumeNext singleResumeNextA = ResultKt.a(new SingleDoOnSubscribe(singleH, aVar).f(this.g.b()));
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new au.com.woolworths.feature.shop.delivery.address.a(new b(this, 1), 17), Functions.e);
        singleResumeNextA.a(consumerSingleObserver);
        DisposableKt.a(this.k, consumerSingleObserver);
    }
}
