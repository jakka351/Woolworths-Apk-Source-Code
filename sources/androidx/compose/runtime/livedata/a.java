package androidx.compose.runtime.livedata;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchController;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.feature.shop.onboarding.CallToActionEpoxyController;
import au.com.woolworths.feature.shop.onboarding.OnboardingActivity;
import au.com.woolworths.feature.shop.onboarding.OnboardingAdapter;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import au.com.woolworths.feature.shop.onboarding.databinding.ActivityOnboardingBinding;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.databinding.FragmentInstrumentListBinding;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.checkout.pay.PayPresenter;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.ui.home.HomeActivityContract;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment$instrumentListViewListener$1;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.ui.productsearch.SearchViewModel;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.widget.InstrumentListView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ProducerScope;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Observer {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((MutableState) obj2).setValue(obj);
                return;
            case 1:
                ((ProducerScope) obj2).k(obj);
                return;
            case 2:
                DeliveryAddressSearchActivity deliveryAddressSearchActivity = (DeliveryAddressSearchActivity) obj2;
                DeliveryAddressSearchContract.ViewState viewState = (DeliveryAddressSearchContract.ViewState) obj;
                DeliveryAddressSearchController deliveryAddressSearchController = deliveryAddressSearchActivity.F;
                if (deliveryAddressSearchController == null) {
                    Intrinsics.p("deliveryAddressSearchController");
                    throw null;
                }
                deliveryAddressSearchController.setData(viewState.c);
                if (viewState.f4332a) {
                    Views.c(deliveryAddressSearchActivity, 0);
                } else {
                    Views.b(deliveryAddressSearchActivity);
                }
                DeliveryAddressSearchViewModel.ScreenOptions screenOptions = viewState.d;
                if (screenOptions == null || !screenOptions.d) {
                    return;
                }
                ActivityAddFullDeliveryAddressBySearchBinding activityAddFullDeliveryAddressBySearchBinding = deliveryAddressSearchActivity.E;
                if (activityAddFullDeliveryAddressBySearchBinding != null) {
                    activityAddFullDeliveryAddressBySearchBinding.A.O(deliveryAddressSearchActivity.getString(com.woolworths.R.string.add_new_address_hint));
                    return;
                } else {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
            case 3:
                final OnboardingActivity onboardingActivity = (OnboardingActivity) obj2;
                OnboardingContract.ViewState viewState2 = (OnboardingContract.ViewState) obj;
                int i2 = OnboardingActivity.I;
                OnboardingAdapter onboardingAdapter = (OnboardingAdapter) onboardingActivity.F.getD();
                List list = viewState2.b;
                onboardingAdapter.getClass();
                onboardingAdapter.g = list;
                onboardingAdapter.l();
                CallToActionEpoxyController callToActionEpoxyController = onboardingActivity.E;
                if (callToActionEpoxyController == null) {
                    Intrinsics.p("callToActionController");
                    throw null;
                }
                callToActionEpoxyController.setData(viewState2.c);
                if (viewState2.b.isEmpty()) {
                    return;
                }
                ActivityOnboardingBinding activityOnboardingBinding = onboardingActivity.C;
                if (activityOnboardingBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                final ConstraintLayout rootView = activityOnboardingBinding.C;
                Intrinsics.g(rootView, "rootView");
                OneShotPreDrawListener.a(rootView, new Runnable() { // from class: au.com.woolworths.feature.shop.onboarding.OnboardingActivity$onCreate$lambda$5$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            onboardingActivity.reportFullyDrawn();
                        } catch (Exception e) {
                            Timber.f27013a.n("Error occurred when reportFullyDrawn", e, new Object[0]);
                        }
                    }
                });
                return;
            case 4:
                CartBadgeActionView.a((CartBadgeActionView) obj2, ((Integer) obj).intValue());
                return;
            case 5:
                DaggerBaseMvvmActivity daggerBaseMvvmActivity = (DaggerBaseMvvmActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i3 = DaggerBaseMvvmActivity.D;
                if (bool != null) {
                    daggerBaseMvvmActivity.N3(bool.booleanValue());
                    return;
                }
                return;
            case 6:
                PayFragment payFragment = (PayFragment) obj2;
                Event event = (Event) obj;
                Intrinsics.h(event, "event");
                PayContract.PayViewEvent payViewEvent = (PayContract.PayViewEvent) event.a();
                if (payViewEvent instanceof PayContract.PayViewEvent.StepUpRequestEvent) {
                    payFragment.j0(((PayContract.PayViewEvent.StepUpRequestEvent) payViewEvent).f21233a);
                    return;
                }
                if (payViewEvent instanceof PayContract.PayViewEvent.MoveToNextEvent) {
                    PayFragment.PaymentListener paymentListener = payFragment.m;
                    if (paymentListener != null) {
                        paymentListener.u1(new ExitDTO(((PayContract.Presenter) payFragment.Q1()).getC().getC(), ((PayContract.Presenter) payFragment.Q1()).s(), CartStatus.PAID, null, ((PayContract.Presenter) payFragment.Q1()).getC().getN(), 8));
                        return;
                    } else {
                        Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                }
                if (payViewEvent instanceof PayContract.PayViewEvent.GenericPaymentFailureEvent) {
                    payFragment.p(PayPresenter.TenderStatus.h);
                    ((PayContract.Presenter) payFragment.Q1()).O();
                    return;
                }
                if (payViewEvent instanceof PayContract.PayViewEvent.PaymentFailureEvent) {
                    payFragment.D4(PayFragment.PaymentErrorStatus.l, ((PayContract.PayViewEvent.PaymentFailureEvent) payViewEvent).f21231a);
                    return;
                }
                if (payViewEvent instanceof PayContract.PayViewEvent.TransferToPosFailureEvent) {
                    payFragment.D4(PayFragment.PaymentErrorStatus.q, ((PayContract.PayViewEvent.TransferToPosFailureEvent) payViewEvent).f21234a);
                    return;
                }
                if (payViewEvent instanceof PayContract.PayViewEvent.PaymentFailLimitExceedEvent) {
                    payFragment.p(PayPresenter.TenderStatus.h);
                    payFragment.D4(PayFragment.PaymentErrorStatus.k, ((PayContract.PayViewEvent.PaymentFailLimitExceedEvent) payViewEvent).f21230a);
                    return;
                } else {
                    if (!(payViewEvent instanceof PayContract.PayViewEvent.ShowExitCodeEvent)) {
                        if (payViewEvent != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                    PayFragment.PaymentListener paymentListener2 = payFragment.m;
                    if (paymentListener2 != null) {
                        paymentListener2.u1(((PayContract.PayViewEvent.ShowExitCodeEvent) payViewEvent).f21232a);
                        return;
                    } else {
                        Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                }
            case 7:
                HomeActivity homeActivity = (HomeActivity) obj2;
                Event event2 = (Event) obj;
                int i4 = HomeActivity.W;
                Intrinsics.h(event2, "event");
                HomeActivityContract.HomeEvent homeEvent = (HomeActivityContract.HomeEvent) event2.a();
                if (homeEvent instanceof HomeActivityContract.HomeEvent.ShowTapOnViewEvent) {
                    homeActivity.N3(false);
                    homeActivity.b5();
                    return;
                } else {
                    if (homeEvent != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 8:
                ItemViewFragment itemViewFragment = (ItemViewFragment) obj2;
                Event event3 = (Event) obj;
                Intrinsics.h(event3, "event");
                ItemContract.ItemViewEvent itemViewEvent = (ItemContract.ItemViewEvent) event3.a();
                if (itemViewEvent instanceof ItemContract.ItemViewEvent.RemoveItemEvent) {
                    itemViewFragment.i2(((ItemContract.ItemViewEvent.RemoveItemEvent) itemViewEvent).f21268a);
                    return;
                }
                if (itemViewEvent instanceof ItemContract.ItemViewEvent.RemoveItemSuccessEvent) {
                    itemViewFragment.N3(false);
                    itemViewFragment.m2();
                    itemViewFragment.i2(((ItemContract.ItemViewEvent.RemoveItemSuccessEvent) itemViewEvent).f21269a);
                    return;
                } else {
                    if (itemViewEvent instanceof ItemContract.ItemViewEvent.SetLoadingIndicatorEvent) {
                        itemViewFragment.N3(false);
                        return;
                    }
                    if (!(itemViewEvent instanceof ItemContract.ItemViewEvent.UpdateQuantitySuccessEvent)) {
                        if (itemViewEvent != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                    itemViewFragment.N3(false);
                    itemViewFragment.m2();
                    Intrinsics.h(((ItemContract.ItemViewEvent.UpdateQuantitySuccessEvent) itemViewEvent).f21270a, "cartItem");
                    ItemViewFragment.ProductViewInteractionListener productViewInteractionListener = itemViewFragment.p;
                    if (productViewInteractionListener != null) {
                        productViewInteractionListener.C();
                        return;
                    }
                    return;
                }
            case 9:
                InstrumentListFragment instrumentListFragment = (InstrumentListFragment) obj2;
                Event event4 = (Event) obj;
                Intrinsics.h(event4, "event");
                InstrumentListContract.InstrumentListViewEvent instrumentListViewEvent = (InstrumentListContract.InstrumentListViewEvent) event4.a();
                if (instrumentListViewEvent instanceof InstrumentListContract.InstrumentListViewEvent.FetchInstrumentListFailureEvent) {
                    instrumentListFragment.N3(false);
                    InstrumentListInterface.InstrumentListCallback instrumentListCallbackH2 = instrumentListFragment.h2();
                    if (instrumentListCallbackH2 != null) {
                        instrumentListCallbackH2.w();
                    }
                    InstrumentListInterface.InstrumentListCallback instrumentListCallbackH22 = instrumentListFragment.h2();
                    String strL3 = instrumentListCallbackH22 != null ? instrumentListCallbackH22.L3() : null;
                    if (strL3 == null || StringsKt.D(strL3)) {
                        return;
                    }
                    FragmentInstrumentListBinding fragmentInstrumentListBinding = instrumentListFragment.l;
                    if (fragmentInstrumentListBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    fragmentInstrumentListBinding.y.setText(strL3);
                    FragmentInstrumentListBinding fragmentInstrumentListBinding2 = instrumentListFragment.l;
                    if (fragmentInstrumentListBinding2 != null) {
                        fragmentInstrumentListBinding2.y.setVisibility(0);
                        return;
                    } else {
                        Intrinsics.p("binding");
                        throw null;
                    }
                }
                if (!(instrumentListViewEvent instanceof InstrumentListContract.InstrumentListViewEvent.UpdateFetchedInstrumentList)) {
                    if (instrumentListViewEvent instanceof InstrumentListContract.InstrumentListViewEvent.SetLoadingIndicatorEvent) {
                        instrumentListFragment.N3(((InstrumentListContract.InstrumentListViewEvent.SetLoadingIndicatorEvent) instrumentListViewEvent).f21286a);
                        return;
                    } else {
                        if (instrumentListViewEvent != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                instrumentListFragment.N3(false);
                List paymentInstruments = ((InstrumentListContract.InstrumentListViewEvent.UpdateFetchedInstrumentList) instrumentListViewEvent).f21287a;
                Intrinsics.h(paymentInstruments, "paymentInstruments");
                FragmentInstrumentListBinding fragmentInstrumentListBinding3 = instrumentListFragment.l;
                if (fragmentInstrumentListBinding3 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                InstrumentListView instrumentListView = fragmentInstrumentListBinding3.z;
                InstrumentListFragment$instrumentListViewListener$1 instrumentListFragment$instrumentListViewListener$1 = instrumentListFragment.r;
                int i5 = InstrumentListView.m;
                instrumentListView.b(paymentInstruments, instrumentListFragment$instrumentListViewListener$1, -1);
                InstrumentListInterface.InstrumentListCallback instrumentListCallbackH23 = instrumentListFragment.h2();
                if (instrumentListCallbackH23 != null) {
                    instrumentListCallbackH23.x(paymentInstruments);
                }
                ArrayList arrayListE = ((InstrumentListContract.Presenter) instrumentListFragment.Q1()).E();
                InstrumentListInterface.InstrumentListCallback instrumentListCallbackH24 = instrumentListFragment.h2();
                instrumentListFragment.f0(instrumentListCallbackH24 != null ? instrumentListCallbackH24.P1(arrayListE) : false);
                InstrumentListInterface.InstrumentListCallback instrumentListCallbackH25 = instrumentListFragment.h2();
                if (instrumentListCallbackH25 != null) {
                    instrumentListCallbackH25.v2(((InstrumentListContract.Presenter) instrumentListFragment.Q1()).E());
                }
                InstrumentListInterface.InstrumentListCallback instrumentListCallbackH26 = instrumentListFragment.h2();
                if (instrumentListCallbackH26 != null && instrumentListCallbackH26.r1() && paymentInstruments.isEmpty()) {
                    FragmentInstrumentListBinding fragmentInstrumentListBinding4 = instrumentListFragment.l;
                    if (fragmentInstrumentListBinding4 != null) {
                        fragmentInstrumentListBinding4.y.setText(instrumentListFragment.getString(com.woolworths.R.string.sng_label_no_payment_method));
                        return;
                    } else {
                        Intrinsics.p("binding");
                        throw null;
                    }
                }
                return;
            case 10:
                ProductInfoFragment productInfoFragment = (ProductInfoFragment) obj2;
                Event event5 = (Event) obj;
                Intrinsics.h(event5, "event");
                ProductInfoContract.ProductInfoViewEvent productInfoViewEvent = (ProductInfoContract.ProductInfoViewEvent) event5.a();
                if (productInfoViewEvent instanceof ProductInfoContract.ProductInfoViewEvent.RemoveItemSuccessEvent) {
                    productInfoFragment.N3(false);
                    FragmentActivity activity = productInfoFragment.getActivity();
                    if (activity != null) {
                        activity.setResult(-1);
                    }
                    productInfoFragment.m2(((ProductInfoContract.ProductInfoViewEvent.RemoveItemSuccessEvent) productInfoViewEvent).f21292a);
                    return;
                }
                if (!(productInfoViewEvent instanceof ProductInfoContract.ProductInfoViewEvent.UpdateQuantitySuccessEvent)) {
                    if (productInfoViewEvent != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                productInfoFragment.N3(false);
                FragmentActivity activity2 = productInfoFragment.getActivity();
                if (activity2 != null) {
                    activity2.setResult(-1);
                }
                Item cartItem = ((ProductInfoContract.ProductInfoViewEvent.UpdateQuantitySuccessEvent) productInfoViewEvent).f21293a;
                Intrinsics.h(cartItem, "cartItem");
                ProductInfoFragment.ProductInfoListener productInfoListener = productInfoFragment.o;
                if (productInfoListener != null) {
                    productInfoListener.L0(cartItem.getLinenumber());
                    return;
                } else {
                    Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
            default:
                SearchViewModel searchViewModel = (SearchViewModel) obj2;
                NetworkState networkState = (NetworkState) obj;
                int i6 = SearchActivity.M;
                if ((networkState != null ? networkState.f9174a : null) == NetworkState.e.f9174a) {
                    searchViewModel.q6();
                    return;
                } else {
                    searchViewModel.p6();
                    return;
                }
        }
    }
}
