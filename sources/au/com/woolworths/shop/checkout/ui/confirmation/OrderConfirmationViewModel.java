package au.com.woolworths.shop.checkout.ui.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsManagerImpl;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.checkout.domain.model.ProductInfo;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderInfo;
import au.com.woolworths.shop.checkout.ui.analytics.OrderConfirmationActions;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/shop/checkout/ui/listener/OrderTotalListener;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationViewModel extends ViewModel implements DynamicSizeCardClickListener, FullPageErrorStateClickHandler, OrderTotalListener {
    public static final OrderConfirmationContract.ViewState p = new OrderConfirmationContract.ViewState(true, EmptyList.d, new ResText(R.string.order_confirmation_button_title), null);
    public final OrderConfirmationInteractor e;
    public final AnalyticsManager f;
    public final FirebaseAnalyticsManagerImpl g;
    public final GoogleAdManagerInteractor h;
    public final CartUpdateInteractor i;
    public final FeatureToggleManager j;
    public final SharedFlowImpl k;
    public final MutableStateFlow l;
    public final SharedFlowImpl m;
    public final Flow n;
    public String o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel$2", f = "OrderConfirmationViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OrderConfirmationViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CartUpdateInteractor cartUpdateInteractor = OrderConfirmationViewModel.this.i;
            cartUpdateInteractor.b.K();
            cartUpdateInteractor.k.setValue(0);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationViewModel$Companion;", "", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$ViewState;", "INITIAL_STATE", "Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$ViewState;", "", "AUD", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OrderConfirmationViewModel(OrderConfirmationInteractor orderConfirmationInteractor, EditOrderInteractor editOrderInteractor, AnalyticsManager analyticsManager, FirebaseAnalyticsManagerImpl firebaseAnalyticsManager, GoogleAdManagerInteractor googleAdManagerInteractor, CartUpdateInteractor cartUpdateInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(editOrderInteractor, "editOrderInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(firebaseAnalyticsManager, "firebaseAnalyticsManager");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = orderConfirmationInteractor;
        this.f = analyticsManager;
        this.g = firebaseAnalyticsManager;
        this.h = googleAdManagerInteractor;
        this.i = cartUpdateInteractor;
        this.j = featureToggleManager;
        editOrderInteractor.P(EditOrderMode.NOT_EDITING);
        editOrderInteractor.D();
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.k = sharedFlowImplB;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(p);
        this.l = mutableStateFlowA;
        this.m = sharedFlowImplB;
        this.n = mutableStateFlowA;
    }

    public static final Bundle p6(OrderConfirmationViewModel orderConfirmationViewModel, OrderInfo orderInfo) {
        Bundle bundleG = c.g("currency", "AUD");
        bundleG.putString("transaction_id", orderInfo.f);
        bundleG.putDouble("value", Double.parseDouble(orderInfo.g));
        bundleG.putDouble("shipping", Double.parseDouble(orderInfo.h));
        ArrayList<ProductInfo> arrayList = orderInfo.f10653a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (ProductInfo productInfo : arrayList) {
            Bundle bundle = new Bundle();
            bundle.putString("item_id", productInfo.f10632a);
            bundle.putString("item_name", productInfo.b);
            bundle.putDouble("price", productInfo.c);
            bundle.putLong("quantity", (long) Math.ceil(productInfo.d));
            arrayList2.add(bundle);
        }
        bundleG.putParcelableArray("items", (Parcelable[]) arrayList2.toArray(new Bundle[0]));
        return bundleG;
    }

    public static void s6(OrderConfirmationViewModel orderConfirmationViewModel, MutableStateFlow mutableStateFlow, boolean z, List list, Text text, OrderConfirmationErrorState orderConfirmationErrorState, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = EmptyList.d;
        }
        if ((i & 4) != 0) {
            text = new ResText(R.string.order_confirmation_button_title);
        }
        if ((i & 8) != 0) {
            orderConfirmationErrorState = null;
        }
        mutableStateFlow.setValue(new OrderConfirmationContract.ViewState(z, list, text, orderConfirmationErrorState));
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener
    public final void k4() {
        this.f.j(OrderConfirmationActions.HelpRequested.e, TrackingMetadata.Companion.a(TrackableValue.o0, "You'll collect"));
    }

    @Override // au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener
    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof ActionableCard;
        SharedFlowImpl sharedFlowImpl = this.k;
        AnalyticsManager analyticsManager = this.f;
        if (z) {
            ActionableCard actionableCard = (ActionableCard) data;
            analyticsManager.j(OrderConfirmationActions.ActionableCardClick.e, ActionableCardKt.a(actionableCard));
            sharedFlowImpl.f(new OrderConfirmationContract.Action.HandleBannerClick(actionableCard.getLink()));
        } else if (data instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
            String ctaUrl = googleAdBannerCard.getCtaUrl();
            String targetId = googleAdBannerCard.getTargetId();
            if (ctaUrl != null && ctaUrl.length() != 0) {
                sharedFlowImpl.f(new OrderConfirmationContract.Action.HandleBannerClick(ctaUrl));
            } else if (targetId != null) {
                sharedFlowImpl.f(new OrderConfirmationContract.Action.LaunchProductListProductGroup(targetId, googleAdBannerCard.getTitle(), googleAdBannerCard.getTargetType()));
            }
            BuildersKt.c(ViewModelKt.a(this), null, null, new OrderConfirmationViewModel$onGoogleAdBannerClicked$1(this, googleAdBannerCard, null), 3);
            analyticsManager.j(OrderConfirmationActions.GoogleAdBannerClick.e, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        q6();
    }

    public final void q6() {
        s6(this, this.l, true, null, null, null, 14);
        BuildersKt.c(ViewModelKt.a(this), null, null, new OrderConfirmationViewModel$fetchOrderConfirmation$1(this, null), 3);
    }

    public final void r6(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof ActionableCard;
        AnalyticsManager analyticsManager = this.f;
        if (z) {
            analyticsManager.j(OrderConfirmationActions.ActionableCardImpression.e, ActionableCardKt.a((ActionableCard) data));
        } else if (data instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
            BuildersKt.c(ViewModelKt.a(this), null, null, new OrderConfirmationViewModel$onGoogleAdBannerImpression$1(this, googleAdBannerCard, null), 3);
            analyticsManager.j(OrderConfirmationActions.GoogleAdBannerImpression.e, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener
    public final void v4(String str) {
        AnalyticsManager analyticsManager = this.f;
        if (str == null || str.length() == 0) {
            analyticsManager.c(OrderConfirmationActions.HelpAlert.e);
        } else {
            analyticsManager.j(OrderConfirmationActions.HelpAlert.e, TrackingMetadata.Companion.a(TrackableValue.o0, str));
        }
    }
}
