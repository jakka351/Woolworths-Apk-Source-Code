package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagedList;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageListingKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.buyagain.domain.BuyAgainInteractor;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainViewModelLegacy;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainProductItemListenerLegacy;", "Lau/com/woolworths/shop/buyagain/ui/legacy/footer/BuyAgainFooterListener;", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainViewModelLegacy extends ViewModel implements FullPageErrorStateClickHandler, BuyAgainProductItemListenerLegacy, BuyAgainFooterListener {
    public final BuyAgainInteractor e;
    public final TrolleyInteractor f;
    public final ProductBoostInteractor g;
    public final AnalyticsManager h;
    public final ShopAccountInteractor i;
    public final BufferedChannel j;
    public final Flow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final Lazy n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainViewModelLegacy$Companion;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BuyAgainViewModelLegacy(BuyAgainInteractor buyAgainInteractor, TrolleyInteractor trolleyInteractor, ProductBoostInteractor productBoostInteractor, AnalyticsManager analyticsManager, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = buyAgainInteractor;
        this.f = trolleyInteractor;
        this.g = productBoostInteractor;
        this.h = analyticsManager;
        this.i = accountInteractor;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.j = bufferedChannelA;
        this.k = FlowKt.I(bufferedChannelA);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(BuyAgainContractLegacy.ViewState.h);
        this.l = mutableStateFlowA;
        this.m = FlowKt.b(mutableStateFlowA);
        this.n = LazyKt.b(new a(this, 2));
        BuildersKt.c(ViewModelKt.a(this), null, null, new BuyAgainViewModelLegacy$loadScreen$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable p6(au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy r57, kotlin.coroutines.jvm.internal.ContinuationImpl r58) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy.p6(au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    public static void r6(BuyAgainViewModelLegacy buyAgainViewModelLegacy, MutableStateFlow mutableStateFlow, boolean z, PagedList pagedList, String str, ButtonApiData buttonApiData, ButtonApiData buttonApiData2, Map map, boolean z2, FullPageErrorCause fullPageErrorCause, int i) {
        if ((i & 1) != 0) {
            z = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).f10291a;
        }
        if ((i & 2) != 0) {
            pagedList = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).b;
        }
        if ((i & 4) != 0) {
            str = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).c.f10290a;
        }
        if ((i & 8) != 0) {
            buttonApiData = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).d.b;
        }
        if ((i & 16) != 0) {
            buttonApiData2 = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).d.c;
        }
        if ((i & 32) != 0) {
            map = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).e;
        }
        if ((i & 64) != 0) {
            z2 = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).f;
        }
        if ((i & 128) != 0) {
            fullPageErrorCause = ((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).g;
        }
        FullPageErrorCause fullPageErrorCause2 = fullPageErrorCause;
        buyAgainViewModelLegacy.getClass();
        BuyAgainContractLegacy.ViewState viewState = (BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue();
        ButtonApiData buttonApiData3 = buttonApiData2;
        BuyAgainContractLegacy.HeaderState headerState = new BuyAgainContractLegacy.HeaderState(str);
        boolean z3 = z2;
        Map map2 = map;
        BuyAgainContractLegacy.FooterState footerState = new BuyAgainContractLegacy.FooterState(!(buttonApiData == null && buttonApiData3 == null) && fullPageErrorCause2 == null, buttonApiData != null ? ButtonApiData.b(buttonApiData, null, null, !map2.isEmpty(), 503) : null, buttonApiData3 != null ? ButtonApiData.b(buttonApiData3, null, null, true ^ map2.isEmpty(), 503) : null, map2.size());
        viewState.getClass();
        mutableStateFlow.f(new BuyAgainContractLegacy.ViewState(z, pagedList, headerState, footerState, map2, z3, fullPageErrorCause2));
    }

    @Override // au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterListener
    public final void S5() {
        this.h.g(BuyAgainAnalytics.BuyAgain.Action.g);
        this.j.k(new BuyAgainContractLegacy.Actions.OpenAddToList(((BuyAgainContractLegacy.ViewState) this.l.getValue()).e));
    }

    @Override // au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy
    public final void U4(ProductCard item) {
        Intrinsics.h(item, "item");
        this.j.k(new BuyAgainContractLegacy.Actions.OpenQuantitySelector(item, ((Number) ((BuyAgainContractLegacy.ViewState) this.l.getValue()).e.getOrDefault(item, Float.valueOf(BitmapDescriptorFactory.HUE_RED))).floatValue()));
    }

    @Override // au.com.woolworths.shop.buyagain.ui.legacy.footer.BuyAgainFooterListener
    public final void f2() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new BuyAgainViewModelLegacy$onAddToCartClicked$1(this, null), 3);
    }

    @Override // au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy
    public final void i0(ProductCard item, boolean z) {
        Intrinsics.h(item, "item");
        MutableStateFlow mutableStateFlow = this.l;
        LinkedHashMap linkedHashMapS = MapsKt.s(((BuyAgainContractLegacy.ViewState) mutableStateFlow.getValue()).e);
        if (z) {
        }
        r6(this, mutableStateFlow, false, null, null, null, null, linkedHashMapS, false, null, 223);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        this.h.g(BuyAgainAnalytics.BuyAgain.Action.j);
        this.j.k(BuyAgainContractLegacy.Actions.GoToProducts.f10281a);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        FullPageErrorCause fullPageErrorCause = ((BuyAgainContractLegacy.ViewState) this.m.getValue()).g;
        boolean z = fullPageErrorCause instanceof BuyAgainListConnectionErrorOld;
        AnalyticsManager analyticsManager = this.h;
        if (z) {
            analyticsManager.g(BuyAgainAnalytics.BuyAgain.Action.l);
        } else if (fullPageErrorCause instanceof BuyAgainListServerErrorOld) {
            analyticsManager.g(BuyAgainAnalytics.BuyAgain.Action.p);
        }
        r6(this, this.l, false, null, null, null, null, null, false, null, 127);
        PageListingKt.a((NumericPageListing) this.n.getD());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q6(java.util.List r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy.q6(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy
    public final void t(ProductCard item) {
        Intrinsics.h(item, "item");
        AnalyticsManagerExtKt.a(this.h, "Buy Again screen", null, (String) BuyAgainAnalytics.BuyAgain.d.get("app.Section"), item);
        this.j.k(new BuyAgainContractLegacy.Actions.LaunchInStoreMap(item));
    }
}
