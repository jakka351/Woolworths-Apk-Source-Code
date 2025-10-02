package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.rxutils.ResultKt;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.analytics.PickUpLocatorActions;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "CallingApi", "Companion", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpLocatorViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final PickUpLocatorInteractor e;
    public final AnalyticsManager f;
    public final SchedulersProvider g;
    public final LocationInteractor h;
    public final NetworkExceptions i;
    public final CompositeDisposable j;
    public final MutableLiveData k;
    public final PublishSubject l;
    public final PublishSubject m;
    public String n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorViewModel$CallingApi;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallingApi {
        public static final CallingApi d;
        public static final CallingApi e;
        public static final /* synthetic */ CallingApi[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            CallingApi callingApi = new CallingApi("NEARBY_LOCATIONS", 0);
            d = callingApi;
            CallingApi callingApi2 = new CallingApi("SUBURB_RESULTS", 1);
            e = callingApi2;
            CallingApi[] callingApiArr = {callingApi, callingApi2};
            f = callingApiArr;
            g = EnumEntriesKt.a(callingApiArr);
        }

        public static CallingApi valueOf(String str) {
            return (CallingApi) Enum.valueOf(CallingApi.class, str);
        }

        public static CallingApi[] values() {
            return (CallingApi[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorViewModel$Companion;", "", "", "MINIMUM_SEARCH_THRESHOLD", "I", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8186a;

        static {
            int[] iArr = new int[PickUpLocatorPageErrorState.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState = PickUpLocatorPageErrorState.d;
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState2 = PickUpLocatorPageErrorState.d;
                iArr[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState3 = PickUpLocatorPageErrorState.d;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState4 = PickUpLocatorPageErrorState.d;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState5 = PickUpLocatorPageErrorState.d;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PickUpLocatorPageErrorState pickUpLocatorPageErrorState6 = PickUpLocatorPageErrorState.d;
                iArr[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f8186a = iArr;
            int[] iArr2 = new int[CallingApi.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                CallingApi callingApi = CallingApi.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public PickUpLocatorViewModel(PickUpLocatorInteractor pickUpLocatorInteractor, AnalyticsManager analyticsManager, SchedulersProvider schedulersProvider, LocationInteractor locationInteractor, NetworkExceptions networkExceptions) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(networkExceptions, "networkExceptions");
        this.e = pickUpLocatorInteractor;
        this.f = analyticsManager;
        this.g = schedulersProvider;
        this.h = locationInteractor;
        this.i = networkExceptions;
        this.j = new CompositeDisposable();
        this.k = new MutableLiveData();
        PublishSubject publishSubject = new PublishSubject();
        this.l = publishSubject;
        this.m = publishSubject;
        this.n = "";
    }

    public static PickUpLocatorContract.ViewState r6(PickUpLocatorViewModel pickUpLocatorViewModel, PickUpLocatorContract.PageState pageState, PickUpLocatorPageErrorState pickUpLocatorPageErrorState, ArrayList arrayList, ArrayList arrayList2, int i) {
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState2 = null;
        if ((i & 2) != 0) {
            pickUpLocatorPageErrorState = null;
        }
        List list = arrayList;
        if ((i & 4) != 0) {
            list = null;
        }
        List list2 = arrayList2;
        if ((i & 8) != 0) {
            list2 = null;
        }
        MutableLiveData mutableLiveData = pickUpLocatorViewModel.k;
        if (pickUpLocatorPageErrorState == null) {
            PickUpLocatorContract.ViewState viewState = (PickUpLocatorContract.ViewState) mutableLiveData.e();
            if (viewState != null) {
                pickUpLocatorPageErrorState2 = viewState.b;
            }
        } else {
            pickUpLocatorPageErrorState2 = pickUpLocatorPageErrorState;
        }
        List list3 = EmptyList.d;
        List list4 = list;
        if (list == null) {
            PickUpLocatorContract.ViewState viewState2 = (PickUpLocatorContract.ViewState) mutableLiveData.e();
            list4 = viewState2 != null ? viewState2.c : list3;
        }
        if (list2 == null) {
            PickUpLocatorContract.ViewState viewState3 = (PickUpLocatorContract.ViewState) mutableLiveData.e();
            list2 = viewState3 != null ? viewState3.d : list3;
        }
        return new PickUpLocatorContract.ViewState(pageState, pickUpLocatorPageErrorState2, list4, list2);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.j.e();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        PickUpLocatorContract.ViewState viewState = (PickUpLocatorContract.ViewState) this.k.e();
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState = viewState != null ? viewState.b : null;
        int i = pickUpLocatorPageErrorState == null ? -1 : WhenMappings.f8186a[pickUpLocatorPageErrorState.ordinal()];
        PublishSubject publishSubject = this.l;
        if (i == 1) {
            publishSubject.onNext(PickUpLocatorContract.Actions.ShowPermissionsDialog.f8182a);
        } else if (i == 2) {
            publishSubject.onNext(PickUpLocatorContract.Actions.GoToSettings.f8177a);
        } else {
            if (i != 3) {
                return;
            }
            publishSubject.onNext(PickUpLocatorContract.Actions.TurnOnDeviceLocation.f8183a);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        MutableLiveData mutableLiveData = this.k;
        PickUpLocatorContract.ViewState viewState = (PickUpLocatorContract.ViewState) mutableLiveData.e();
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState = viewState != null ? viewState.b : null;
        int i = pickUpLocatorPageErrorState == null ? -1 : WhenMappings.f8186a[pickUpLocatorPageErrorState.ordinal()];
        AnalyticsManager analyticsManager = this.f;
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.l.onNext(PickUpLocatorContract.Actions.SetFocusOnSearchView.f8181a);
                break;
            case 4:
            case 5:
                analyticsManager.c(PickUpLocatorActions.f);
                p6();
                break;
            case 6:
            case 7:
                analyticsManager.c(PickUpLocatorActions.f);
                mutableLiveData.m(r6(this, PickUpLocatorContract.PageState.d, null, null, null, 14));
                s6(this.n);
                break;
        }
    }

    public final void p6() {
        LocationInteractor locationInteractor = this.h;
        boolean zB = LocationsKt.b(locationInteractor.f8946a);
        MutableLiveData mutableLiveData = this.k;
        if (!zB) {
            mutableLiveData.m(r6(this, PickUpLocatorContract.PageState.g, locationInteractor.e() ? PickUpLocatorPageErrorState.j : PickUpLocatorPageErrorState.i, null, null, 12));
            return;
        }
        if (!locationInteractor.d()) {
            mutableLiveData.m(r6(this, PickUpLocatorContract.PageState.g, PickUpLocatorPageErrorState.k, null, null, 12));
            return;
        }
        if (mutableLiveData.e() != null) {
            PickUpLocatorContract.ViewState viewState = (PickUpLocatorContract.ViewState) mutableLiveData.e();
            if ((viewState != null ? viewState.f8184a : null) != PickUpLocatorContract.PageState.g) {
                PickUpLocatorContract.ViewState viewState2 = (PickUpLocatorContract.ViewState) mutableLiveData.e();
                List list = viewState2 != null ? viewState2.c : null;
                if (list != null && !list.isEmpty()) {
                    return;
                }
            }
        }
        SingleResumeNext singleResumeNextA = ResultKt.a(new MaybeFlatMapSingle(new MaybePeek(locationInteractor.b(), new c(2, new d(this, 2)), Functions.c), new c(3, new d(this, 3))).f(this.g.b()));
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new c(4, new d(this, 1)), Functions.e);
        singleResumeNextA.a(consumerSingleObserver);
        DisposableKt.a(this.j, consumerSingleObserver);
    }

    public final PickUpLocatorContract.ViewState q6(Result result, CallingApi callingApi) {
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState;
        PickUpLocatorPageErrorState pickUpLocatorPageErrorState2;
        Intrinsics.h(result, "<this>");
        NetworkExceptions networkExceptions = this.i;
        Intrinsics.h(networkExceptions, "networkExceptions");
        boolean z = result.b instanceof NoConnectivityException;
        AnalyticsManager analyticsManager = this.f;
        if (z) {
            analyticsManager.c(PickUpLocatorActions.d);
            int iOrdinal = callingApi.ordinal();
            if (iOrdinal == 0) {
                pickUpLocatorPageErrorState2 = PickUpLocatorPageErrorState.d;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                pickUpLocatorPageErrorState2 = PickUpLocatorPageErrorState.f;
            }
            return r6(this, PickUpLocatorContract.PageState.g, pickUpLocatorPageErrorState2, null, null, 12);
        }
        analyticsManager.c(PickUpLocatorActions.e);
        int iOrdinal2 = callingApi.ordinal();
        if (iOrdinal2 == 0) {
            pickUpLocatorPageErrorState = PickUpLocatorPageErrorState.e;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pickUpLocatorPageErrorState = PickUpLocatorPageErrorState.g;
        }
        return r6(this, PickUpLocatorContract.PageState.g, pickUpLocatorPageErrorState, null, null, 12);
    }

    public final void s6(String queryTextValue) {
        Intrinsics.h(queryTextValue, "queryTextValue");
        this.n = queryTextValue;
        PickUpLocatorInteractor pickUpLocatorInteractor = this.e;
        pickUpLocatorInteractor.getClass();
        PickUpLocatorRepository pickUpLocatorRepository = pickUpLocatorInteractor.f8185a;
        pickUpLocatorRepository.getClass();
        SingleResumeNext singleResumeNextA = ResultKt.a(pickUpLocatorRepository.d.b(queryTextValue).f(this.g.b()));
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new c(1, new d(this, 0)), Functions.e);
        singleResumeNextA.a(consumerSingleObserver);
        DisposableKt.a(this.j, consumerSingleObserver);
    }
}
