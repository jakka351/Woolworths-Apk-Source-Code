package au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses;

import androidx.camera.core.impl.e;
import au.com.woolworths.android.onesite.analytics.adobe.data.ScreenState;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.legacy.databinding.ItemPreviouslyUsedAddressBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;
import au.com.woolworths.android.onesite.modules.mvp.BasePresenterImpl;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.FulfilmentExceptions;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.observers.DisposableSingleObserver;
import java.util.List;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class ManageFullDeliveryAddressesPresenter extends BasePresenterImpl<ManageFullDeliveryAddressesContract.View> implements ManageFullDeliveryAddressesContract.Presenter {
    public final RepositoryManager c;
    public final LegacyShoppingModeRepository d;
    public final LegacyShopAnalyticsManager e;
    public final ShopAccountInteractor f;
    public final CollectionModeInteractor g;
    public final SchedulersProvider h;
    public final NetworkExceptions i;
    public final FulfilmentExceptions j;
    public boolean k = false;
    public boolean l = false;
    public List m = null;
    public SingleCache n = null;
    public SingleCache o = null;
    public SingleFlatMap p = null;
    public int q = -1;

    /* renamed from: au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesPresenter$2, reason: invalid class name */
    class AnonymousClass2 extends DisposableSingleObserver<List<SaveAddressResult.Address>> {
        public AnonymousClass2() {
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
            ManageFullDeliveryAddressesContract.View view = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
            manageFullDeliveryAddressesPresenter.i.getClass();
            if (th instanceof NoConnectivityException) {
                view.W2(view.V0());
            } else {
                view.W2(view.y2());
                Timber.b(th);
            }
            view.y();
            manageFullDeliveryAddressesPresenter.p = null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
            manageFullDeliveryAddressesPresenter.d();
            ManageFullDeliveryAddressesContract.View view = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
            manageFullDeliveryAddressesPresenter.m = (List) obj;
            view.y();
            view.z3(view.e0());
            manageFullDeliveryAddressesPresenter.p = null;
        }
    }

    /* renamed from: au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesPresenter$3, reason: invalid class name */
    class AnonymousClass3 extends DisposableSingleObserver<List<SaveAddressResult.Address>> {
        public AnonymousClass3() {
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
            NetworkExceptions networkExceptions = manageFullDeliveryAddressesPresenter.i;
            networkExceptions.getClass();
            if (NetworkExceptions.c(th)) {
                String strA = manageFullDeliveryAddressesPresenter.j.a(th);
                if (Strings.b(strA)) {
                    ManageFullDeliveryAddressesContract.View view = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
                    view.W2(view.y2());
                } else {
                    ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).W2(strA);
                }
                Timber.b(th);
            } else {
                networkExceptions.getClass();
                if (th instanceof NoConnectivityException) {
                    ManageFullDeliveryAddressesContract.View view2 = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
                    view2.W2(view2.V0());
                } else {
                    Timber.b(th);
                    ManageFullDeliveryAddressesContract.View view3 = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
                    view3.W2(view3.y2());
                }
            }
            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).y();
            manageFullDeliveryAddressesPresenter.o = null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
            manageFullDeliveryAddressesPresenter.d();
            manageFullDeliveryAddressesPresenter.m = (List) obj;
            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).y();
            ManageFullDeliveryAddressesContract.View view = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
            view.z3(view.e0());
            manageFullDeliveryAddressesPresenter.o = null;
        }
    }

    /* renamed from: au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesPresenter$4, reason: invalid class name */
    class AnonymousClass4 extends DisposableSingleObserver<List<SaveAddressResult.Address>> {
        public AnonymousClass4() {
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
            ManageFullDeliveryAddressesContract.View view = (ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a;
            view.W2(view.R0());
            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).f3(manageFullDeliveryAddressesPresenter.q);
            manageFullDeliveryAddressesPresenter.n = null;
            manageFullDeliveryAddressesPresenter.q = -1;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
            manageFullDeliveryAddressesPresenter.m = (List) obj;
            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).J3();
            List list = manageFullDeliveryAddressesPresenter.m;
            if (list == null || list.isEmpty()) {
                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).p1();
            } else {
                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).k2();
            }
            manageFullDeliveryAddressesPresenter.n = null;
            manageFullDeliveryAddressesPresenter.q = -1;
        }
    }

    public ManageFullDeliveryAddressesPresenter(RepositoryManager repositoryManager, LegacyShoppingModeRepository legacyShoppingModeRepository, ShopAccountInteractor shopAccountInteractor, CollectionModeInteractor collectionModeInteractor, SchedulersProvider schedulersProvider, LegacyShopAnalyticsManager legacyShopAnalyticsManager, NetworkExceptions networkExceptions, FulfilmentExceptions fulfilmentExceptions) {
        this.c = repositoryManager;
        this.d = legacyShoppingModeRepository;
        this.f = shopAccountInteractor;
        this.g = collectionModeInteractor;
        this.h = schedulersProvider;
        this.e = legacyShopAnalyticsManager;
        this.i = networkExceptions;
        this.j = fulfilmentExceptions;
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final int b() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final void c(ManageFullDeliveryAddressesActivity manageFullDeliveryAddressesActivity, boolean z, boolean z2) {
        this.f4374a = manageFullDeliveryAddressesActivity;
        this.k = z;
        this.l = z2;
        ObservableMap observableMapC = RxBus.a().c(ForcedLogoutEvent.class);
        SchedulersProvider schedulersProvider = this.h;
        ObservableObserveOn observableObserveOnF = observableMapC.i(schedulersProvider.d()).f(schedulersProvider.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new e(this, 20), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        CompositeDisposable compositeDisposable = this.b;
        compositeDisposable.d(lambdaObserver);
        boolean z3 = this.f.b.b.getBoolean("forced_logged_out", false);
        LegacyShoppingModeRepository legacyShoppingModeRepository = this.d;
        if (z3) {
            ((ManageFullDeliveryAddressesContract.View) this.f4374a).r0();
        } else {
            SingleCache singleCache = this.o;
            if (singleCache != null) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3();
                singleCache.a(anonymousClass3);
                compositeDisposable.d(anonymousClass3);
            } else {
                SingleFlatMap singleFlatMap = this.p;
                if (singleFlatMap != null) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                    singleFlatMap.a(anonymousClass2);
                    compositeDisposable.d(anonymousClass2);
                } else {
                    SingleCache singleCache2 = this.n;
                    if (singleCache2 != null) {
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
                        singleCache2.a(anonymousClass4);
                        compositeDisposable.d(anonymousClass4);
                    }
                    ((ManageFullDeliveryAddressesContract.View) this.f4374a).u();
                    Single singleO = legacyShoppingModeRepository.o(false);
                    DisposableSingleObserver<List<SaveAddressResult.Address>> disposableSingleObserver = new DisposableSingleObserver<List<SaveAddressResult.Address>>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesPresenter.1
                        @Override // io.reactivex.SingleObserver
                        public final void onError(Throwable th) {
                            Bark.f8483a.d(new ReportOwner(ReportOwner.Squad.i), th, "Failed to fetch previously used address.", null);
                            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
                            manageFullDeliveryAddressesPresenter.m = null;
                            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).y();
                            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).s2();
                        }

                        @Override // io.reactivex.SingleObserver
                        public final void onSuccess(Object obj) {
                            ManageFullDeliveryAddressesPresenter manageFullDeliveryAddressesPresenter = ManageFullDeliveryAddressesPresenter.this;
                            manageFullDeliveryAddressesPresenter.m = (List) obj;
                            LegacyShoppingModeRepository legacyShoppingModeRepository2 = manageFullDeliveryAddressesPresenter.d;
                            if (legacyShoppingModeRepository2.m() != null) {
                                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).o4(legacyShoppingModeRepository2.m().toString());
                            } else {
                                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).K1();
                            }
                            ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).y();
                            List list = manageFullDeliveryAddressesPresenter.m;
                            if ((list == null || list.isEmpty()) && legacyShoppingModeRepository2.m() == null) {
                                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).e3(manageFullDeliveryAddressesPresenter.k, manageFullDeliveryAddressesPresenter.l);
                                return;
                            }
                            List list2 = manageFullDeliveryAddressesPresenter.m;
                            if (list2 == null || list2.isEmpty()) {
                                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).p1();
                            } else {
                                ((ManageFullDeliveryAddressesContract.View) manageFullDeliveryAddressesPresenter.f4374a).k2();
                            }
                        }
                    };
                    singleO.a(disposableSingleObserver);
                    compositeDisposable.d(disposableSingleObserver);
                }
            }
        }
        if (legacyShoppingModeRepository.m() != null) {
            ((ManageFullDeliveryAddressesContract.View) this.f4374a).o4(legacyShoppingModeRepository.m().toString());
        } else {
            ((ManageFullDeliveryAddressesContract.View) this.f4374a).K1();
        }
        this.e.a(ScreenState.Companion.a("Manage saved delivery addresses screen"));
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final void d() {
        this.g.Q();
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final void e(int i) {
        if (i < 0 || i >= b()) {
            return;
        }
        SingleCache singleCache = new SingleCache(this.d.j((SaveAddressResult.Address) this.m.get(i)));
        this.n = singleCache;
        this.q = i;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        singleCache.a(anonymousClass4);
        this.b.d(anonymousClass4);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final void f(int i) {
        if (i < 0 || i >= b()) {
            return;
        }
        ((ManageFullDeliveryAddressesContract.View) this.f4374a).u();
        SaveAddressResult.Address address = (SaveAddressResult.Address) this.m.get(i);
        boolean z = this.k;
        CompositeDisposable compositeDisposable = this.b;
        LegacyShoppingModeRepository legacyShoppingModeRepository = this.d;
        if (z) {
            SingleCache singleCache = new SingleCache(legacyShoppingModeRepository.h(address));
            this.o = singleCache;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            singleCache.a(anonymousClass3);
            compositeDisposable.d(anonymousClass3);
            return;
        }
        if (this.l) {
            SingleFlatMap singleFlatMap = new SingleFlatMap(new SingleCache(legacyShoppingModeRepository.l(address)), new e(legacyShoppingModeRepository, 19));
            this.p = singleFlatMap;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            singleFlatMap.a(anonymousClass2);
            compositeDisposable.d(anonymousClass2);
            return;
        }
        SingleCache singleCache2 = new SingleCache(legacyShoppingModeRepository.i(address));
        this.o = singleCache2;
        AnonymousClass3 anonymousClass32 = new AnonymousClass3();
        singleCache2.a(anonymousClass32);
        compositeDisposable.d(anonymousClass32);
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final long g(int i) {
        List list = this.m;
        if (list == null || i >= list.size()) {
            return 0L;
        }
        return ((SaveAddressResult.Address) this.m.get(i)).a();
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract.Presenter
    public final void h(int i, PreviouslyUsedAddressesViewHolder previouslyUsedAddressesViewHolder) {
        ItemPreviouslyUsedAddressBinding itemPreviouslyUsedAddressBinding = previouslyUsedAddressesViewHolder.f4325a;
        if (i < 0 || i >= b()) {
            return;
        }
        SaveAddressResult.Address address = (SaveAddressResult.Address) this.m.get(i);
        itemPreviouslyUsedAddressBinding.y.setText(address.toString());
        itemPreviouslyUsedAddressBinding.z.setVisibility(8);
        itemPreviouslyUsedAddressBinding.A.setVisibility(0);
        previouslyUsedAddressesViewHolder.c(true);
        itemPreviouslyUsedAddressBinding.A.setVisibility(address.g() ? 8 : 0);
    }
}
