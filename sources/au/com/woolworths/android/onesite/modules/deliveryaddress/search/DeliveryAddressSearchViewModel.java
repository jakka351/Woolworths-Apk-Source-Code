package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.modules.deliveryaddress.SaveAddressError;
import au.com.woolworths.android.onesite.modules.deliveryaddress.analytics.AddDeliveryAddressActions;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.FulfilmentExceptions;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.woolworths.R;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchResultClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Factory", "ScreenOptions", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeliveryAddressSearchViewModel extends ViewModel implements DeliveryAddressSearchResultClickListener, FullPageErrorStateClickHandler {
    public final LegacyShoppingModeRepository e;
    public final NetworkExceptions f;
    public final FulfilmentExceptions g;
    public final AnalyticsManager h;
    public final CollectionModeInteractor i;
    public String j;
    public List k;
    public final CompositeDisposable l;
    public final PublishSubject m;
    public final PublishSubject n;
    public final PublishSubject o;
    public final PublishSubject p;
    public final MutableLiveData q;
    public final MutableLiveData r;
    public final PublishSubject s;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchViewModel$Companion;", "", "", "SEARCH_TRIGGER_THRESHOLD_ADDRESS", "I", "", "SEARCH_DEBOUNCE_TIME", "J", "", "DUPLICATE_ADDRESS_ERROR_CODE", "Ljava/lang/String;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchViewModel$Factory;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        DeliveryAddressSearchViewModel a(ScreenOptions screenOptions);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchViewModel$ScreenOptions;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScreenOptions {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4333a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public ScreenOptions(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f4333a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenOptions)) {
                return false;
            }
            ScreenOptions screenOptions = (ScreenOptions) obj;
            return this.f4333a == screenOptions.f4333a && this.b == screenOptions.b && this.c == screenOptions.c && this.d == screenOptions.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(Boolean.hashCode(this.f4333a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.q(androidx.camera.core.impl.b.v("ScreenOptions(isAddressUsedForBilling=", ", isAlternateAddress=", ", isInitialAddressPromptForNz=", this.f4333a, this.b), this.c, ", isAddingNewAddress=", this.d, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4334a;

        static {
            int[] iArr = new int[DeliveryAddressSearchErrorState.values().length];
            try {
                DeliveryAddressSearchErrorState deliveryAddressSearchErrorState = DeliveryAddressSearchErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4334a = iArr;
        }
    }

    public DeliveryAddressSearchViewModel(ScreenOptions screenOptions, ShopAccountInteractor accountInteractor, SchedulersProvider schedulersProvider, LegacyShoppingModeRepository shoppingModeRepository, NetworkExceptions networkExceptions, FulfilmentExceptions fulfilmentExceptions, AnalyticsManager analyticsManager, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(fulfilmentExceptions, "fulfilmentExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.e = shoppingModeRepository;
        this.f = networkExceptions;
        this.g = fulfilmentExceptions;
        this.h = analyticsManager;
        this.i = collectionModeInteractor;
        this.j = "";
        EmptyList emptyList = EmptyList.d;
        this.k = emptyList;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.l = compositeDisposable;
        PublishSubject publishSubject = new PublishSubject();
        this.m = publishSubject;
        PublishSubject publishSubject2 = new PublishSubject();
        this.n = publishSubject2;
        PublishSubject publishSubject3 = new PublishSubject();
        this.o = publishSubject3;
        PublishSubject publishSubject4 = new PublishSubject();
        this.p = publishSubject4;
        MutableLiveData mutableLiveData = new MutableLiveData(new DeliveryAddressSearchContract.ViewState(false, null, emptyList, screenOptions));
        this.q = mutableLiveData;
        this.r = mutableLiveData;
        this.s = publishSubject4;
        if (accountInteractor.d()) {
            Single singleO = shoppingModeRepository.o(false);
            ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new e(new c(this, 9), 4), new e(new c(this, 10), 5));
            singleO.a(consumerSingleObserver);
            compositeDisposable.d(consumerSingleObserver);
        }
        ObservableObserveOn observableObserveOnF = new ObservableDoOnEach(publishSubject2, new androidx.camera.core.impl.e(new c(this, 0), 23)).c(new androidx.camera.core.impl.e(new c(this, 1), 24), Integer.MAX_VALUE).c(new androidx.camera.core.impl.e(new c(this, 2), 25), Integer.MAX_VALUE).f(schedulersProvider.b());
        androidx.camera.core.impl.e eVar = new androidx.camera.core.impl.e(new c(this, 3), 26);
        Consumer consumer = Functions.e;
        LambdaObserver lambdaObserver = new LambdaObserver(eVar, consumer);
        observableObserveOnF.a(lambdaObserver);
        compositeDisposable.d(lambdaObserver);
        ObservableObserveOn observableObserveOnF2 = new ObservableDoOnEach(publishSubject3, new androidx.camera.core.impl.e(new c(this, 4), 27)).c(new e(new c(this, 5), 3), Integer.MAX_VALUE).f(schedulersProvider.b());
        LambdaObserver lambdaObserver2 = new LambdaObserver(new e(new c(this, 11), 6), consumer);
        observableObserveOnF2.a(lambdaObserver2);
        compositeDisposable.d(lambdaObserver2);
        ObservableObserveOn observableObserveOnF3 = RxBus.a().c(ForcedLogoutEvent.class).f(schedulersProvider.b());
        LambdaObserver lambdaObserver3 = new LambdaObserver(new e(new c(this, 12), 7), consumer);
        observableObserveOnF3.a(lambdaObserver3);
        compositeDisposable.d(lambdaObserver3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler schedulerC = schedulersProvider.c();
        ObjectHelper.b(timeUnit, "unit is null");
        ObjectHelper.b(schedulerC, "scheduler is null");
        ObservableObserveOn observableObserveOnF4 = new ObservableDebounceTimed(publishSubject, 200L, schedulerC).c(new e(new c(this, 13), 8), Integer.MAX_VALUE).f(schedulersProvider.b());
        LambdaObserver lambdaObserver4 = new LambdaObserver(new androidx.camera.core.impl.e(new c(this, 14), 22), consumer);
        observableObserveOnF4.a(lambdaObserver4);
        compositeDisposable.d(lambdaObserver4);
    }

    public static void r6(DeliveryAddressSearchViewModel deliveryAddressSearchViewModel, MutableLiveData mutableLiveData, boolean z, DeliveryAddressSearchErrorState deliveryAddressSearchErrorState, List list, int i) {
        DeliveryAddressSearchContract.ViewState viewState;
        if ((i & 2) != 0) {
            DeliveryAddressSearchContract.ViewState viewState2 = (DeliveryAddressSearchContract.ViewState) mutableLiveData.e();
            deliveryAddressSearchErrorState = viewState2 != null ? viewState2.b : null;
        }
        if ((i & 4) != 0 && ((viewState = (DeliveryAddressSearchContract.ViewState) mutableLiveData.e()) == null || (list = viewState.c) == null)) {
            list = EmptyList.d;
        }
        DeliveryAddressSearchContract.ViewState viewState3 = (DeliveryAddressSearchContract.ViewState) mutableLiveData.e();
        ScreenOptions screenOptions = viewState3 != null ? viewState3.d : null;
        deliveryAddressSearchViewModel.getClass();
        mutableLiveData.m(new DeliveryAddressSearchContract.ViewState(z, deliveryAddressSearchErrorState, list, screenOptions));
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener
    public final void R5(AddressResult.Address address) {
        Intrinsics.h(address, "address");
        this.p.onNext(DeliveryAddressSearchContract.Actions.HideKeyboard.f4328a);
        Object obj = null;
        if (!this.k.isEmpty()) {
            String strC = address.c();
            if (strC != null) {
                strC = strC.replaceAll(" {2}", " ").replaceAll("Alley,", "Ally,").replaceAll("Arcade,", "Arc,").replaceAll("Avenue,", "Ave,").replaceAll("Boulevard,", "Bvd,").replaceAll("Circuit,", "Cct,").replaceAll("Close,", "Cl,").replaceAll("Corner,", "Crn,").replaceAll("Court,", "Ct,").replaceAll("Crescent,", "Cres,").replaceAll("Drive,", "Dr,").replaceAll("Esplanade,", "Esp,").replaceAll("Green,", "Grn,").replaceAll("Grove,", "Gr,").replaceAll("Highway,", "Hwy,").replaceAll("Junction,", "Jnc,").replaceAll("Lane,", "Ln,").replaceAll("Parade,", "Pde,").replaceAll("Place,", "Pl,").replaceAll("Ridge,", "Rdge,").replaceAll("Road,", "Rd,").replaceAll("Street,", "St,").replaceAll("Square,", "Sq,").replaceAll("Terrace,", "Tce,");
            }
            Iterator it = this.k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Intrinsics.e(strC);
                String strF = ((SaveAddressResult.Address) next).f();
                Intrinsics.g(strF, "getText(...)");
                if (StringsKt.W(strC, strF, false)) {
                    obj = next;
                    break;
                }
            }
            obj = (SaveAddressResult.Address) obj;
        }
        if (obj != null) {
            this.o.onNext(obj);
        } else {
            this.n.onNext(address);
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener
    public final void l0() {
        this.h.c(AddDeliveryAddressActions.e);
        this.p.onNext(DeliveryAddressSearchContract.Actions.LaunchAddDeliveryAddressManually.f4329a);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.l.e();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        DeliveryAddressSearchContract.ViewState viewState = (DeliveryAddressSearchContract.ViewState) this.q.e();
        DeliveryAddressSearchErrorState deliveryAddressSearchErrorState = viewState != null ? viewState.b : null;
        if ((deliveryAddressSearchErrorState == null ? -1 : WhenMappings.f4334a[deliveryAddressSearchErrorState.ordinal()]) == 1) {
            l0();
        } else {
            this.p.onNext(DeliveryAddressSearchContract.Actions.HideKeyboard.f4328a);
            this.m.onNext(this.j);
        }
    }

    public final void p6(Throwable th) {
        r6(this, this.q, false, null, null, 14);
        NetworkExceptions networkExceptions = this.f;
        networkExceptions.getClass();
        boolean zC = NetworkExceptions.c(th);
        PublishSubject publishSubject = this.p;
        if (zC) {
            String strA = this.g.a(th);
            SaveAddressError saveAddressError = (SaveAddressError) networkExceptions.b(th, SaveAddressError.class);
            if (Intrinsics.c(saveAddressError != null ? saveAddressError.getErrorCode() : null, "AD008")) {
                publishSubject.onNext(new DeliveryAddressSearchContract.Actions.ShowErrorMessageWithResId(R.string.save_duplicate_address_failed));
            } else if (strA == null || StringsKt.D(strA)) {
                publishSubject.onNext(new DeliveryAddressSearchContract.Actions.ShowErrorMessageWithResId(R.string.save_delivery_address_failed));
            } else {
                publishSubject.onNext(new DeliveryAddressSearchContract.Actions.ShowErrorMessage(strA));
            }
        } else if (th instanceof NoConnectivityException) {
            publishSubject.onNext(new DeliveryAddressSearchContract.Actions.ShowErrorMessageWithResId(R.string.error_no_network));
        } else {
            publishSubject.onNext(new DeliveryAddressSearchContract.Actions.ShowErrorMessageWithResId(R.string.save_delivery_address_failed));
        }
        Timber.f27013a.p(th);
    }

    public final boolean q6(String queryTextValue) {
        Intrinsics.h(queryTextValue, "queryTextValue");
        String string = StringsKt.k0(queryTextValue).toString();
        this.j = string;
        if (string.length() >= 6) {
            this.m.onNext(this.j);
            return true;
        }
        if (this.j.length() != 0) {
            return true;
        }
        r6(this, this.q, false, null, EmptyList.d, 10);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.internal.operators.observable.ObservableOnErrorNext s6(au.com.woolworths.base.shopapp.models.address.SaveAddressResult.Address r5) {
        /*
            r4 = this;
            androidx.lifecycle.MutableLiveData r0 = r4.r
            java.lang.Object r0 = r0.e()
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract$ViewState r0 = (au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract.ViewState) r0
            if (r0 == 0) goto Ld
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel$ScreenOptions r0 = r0.d
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 0
            if (r0 == 0) goto L14
            boolean r2 = r0.f4333a
            goto L15
        L14:
            r2 = r1
        L15:
            au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository r3 = r4.e
            if (r2 != 0) goto L48
            if (r0 == 0) goto L1d
            boolean r1 = r0.b
        L1d:
            if (r1 == 0) goto L20
            goto L48
        L20:
            io.reactivex.internal.operators.single.SingleObserveOn r0 = r3.i(r5)
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.d r1 = new au.com.woolworths.android.onesite.modules.deliveryaddress.search.d
            r2 = 0
            r1.<init>(r4, r5, r2)
            androidx.camera.core.impl.e r2 = new androidx.camera.core.impl.e
            r3 = 29
            r2.<init>(r1, r3)
            io.reactivex.internal.operators.single.SingleDoOnSuccess r1 = new io.reactivex.internal.operators.single.SingleDoOnSuccess
            r1.<init>(r0, r2)
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.d r0 = new au.com.woolworths.android.onesite.modules.deliveryaddress.search.d
            r2 = 1
            r0.<init>(r4, r5, r2)
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.e r5 = new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e
            r2 = 0
            r5.<init>(r0, r2)
            io.reactivex.internal.operators.single.SingleDoOnError r0 = new io.reactivex.internal.operators.single.SingleDoOnError
            r0.<init>(r1, r5)
            goto L4c
        L48:
            io.reactivex.internal.operators.single.SingleObserveOn r0 = r3.h(r5)
        L4c:
            io.reactivex.internal.operators.single.SingleCache r5 = new io.reactivex.internal.operators.single.SingleCache
            r5.<init>(r0)
            io.reactivex.Observable r5 = r5.i()
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.c r0 = new au.com.woolworths.android.onesite.modules.deliveryaddress.search.c
            r1 = 7
            r0.<init>(r4, r1)
            au.com.woolworths.android.onesite.modules.deliveryaddress.search.e r1 = new au.com.woolworths.android.onesite.modules.deliveryaddress.search.e
            r2 = 1
            r1.<init>(r0, r2)
            io.reactivex.internal.operators.observable.ObservableOnErrorNext r0 = new io.reactivex.internal.operators.observable.ObservableOnErrorNext
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel.s6(au.com.woolworths.base.shopapp.models.address.SaveAddressResult$Address):io.reactivex.internal.operators.observable.ObservableOnErrorNext");
    }
}
