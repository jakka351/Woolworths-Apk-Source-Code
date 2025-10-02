package au.com.woolworths.feature.shop.bundles.bottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.bundles.BundlesAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.bundles.BundlesInteractor;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesBottomSheetContract;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesDataKt;
import au.com.woolworths.feature.shop.bundles.data.BundlesExtKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.offers.ProductsBoostViewListener;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorItemClickListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesToCartViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/github/rubensousa/gravitysnaphelper/GravitySnapHelper$SnapListener;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorItemClickListener;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "Factory", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddBundlesToCartViewModel extends ViewModel implements GravitySnapHelper.SnapListener, HorizontalSelectorItemClickListener, HorizontalSelectorViewListener, ProductsBoostViewListener {
    public final Bundle e;
    public final CollectionModeInteractor f;
    public final CartUpdateInteractor g;
    public final AnalyticsManager h;
    public final BundlesInteractor i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final BufferedChannel l;
    public final Flow m;
    public final BundlesData n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesToCartViewModel$Companion;", "", "", "ANIMATION_END_DELAY", "J", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/AddBundlesToCartViewModel$Factory;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        AddBundlesToCartViewModel a(Bundle bundle);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BundlesBottomSheetActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BundlesBottomSheetActionType bundlesBottomSheetActionType = BundlesBottomSheetActionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BundlesBottomSheetActionType bundlesBottomSheetActionType2 = BundlesBottomSheetActionType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AddBundlesToCartViewModel(Bundle bundle, CollectionModeInteractor collectionModeInteractor, CartUpdateInteractor cartUpdateInteractor, AnalyticsManager analyticsManager, BundlesInteractor interactor) {
        Object value;
        int iB;
        StatefulButtonState statefulButtonState;
        Intrinsics.h(bundle, "bundle");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(interactor, "interactor");
        this.e = bundle;
        this.f = collectionModeInteractor;
        this.g = cartUpdateInteractor;
        this.h = analyticsManager;
        this.i = interactor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(AddBundlesBottomSheetContract.ViewState.c);
        this.j = mutableStateFlowA;
        this.k = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.l = bufferedChannelA;
        this.m = FlowKt.I(bufferedChannelA);
        do {
            value = mutableStateFlowA.getValue();
            AddBundlesBottomSheetContract.ViewState viewState = (AddBundlesBottomSheetContract.ViewState) value;
            iB = BundlesDataKt.b(this.e);
            Bundle bundle2 = this.e;
            statefulButtonState = BundlesDataKt.b(bundle2) == BundlesDataKt.b(bundle2) ? StatefulButtonState.f : StatefulButtonState.d;
            viewState.getClass();
        } while (!mutableStateFlowA.d(value, new AddBundlesBottomSheetContract.ViewState(iB, statefulButtonState)));
        this.n = this.i.b(this.f.b() ? this.f.a() : null);
    }

    @Override // com.github.rubensousa.gravitysnaphelper.GravitySnapHelper.SnapListener
    public final void H0(int i) {
    }

    @Override // au.com.woolworths.product.offers.ProductsBoostViewListener
    public final void d() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddBundlesToCartViewModel$onAnimationEnd$1(this, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int f5() {
        return BundlesDataKt.b(this.e);
    }

    public final void p6(AddBundlesBottomSheetContract.Actions actions) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddBundlesToCartViewModel$emitAction$1(this, actions, null), 3);
    }

    public final void q6(Bundle bundle, MapBuilder mapBuilder, BundlesBottomSheetActionType bundlesBottomSheetActionType) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddBundlesToCartViewModel$performCartUpdate$1(bundle, mapBuilder, this, bundlesBottomSheetActionType, null), 3);
    }

    public final void r6(int i, MapBuilder mapBuilder) {
        Event event;
        Double inTrolley;
        ListBuilder listBuilderV = CollectionsKt.v();
        Bundle bundle = this.e;
        List list = bundle.b;
        List list2 = bundle.b;
        Iterator it = BundlesDataKt.a(list).iterator();
        while (it.hasNext()) {
            ProductCard productCard = ((BundleProductCard) it.next()).f6758a;
            Double d = (Double) mapBuilder.get(productCard.getProductId());
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley != null && (inTrolley = trolley.getInTrolley()) != null) {
                dDoubleValue = inTrolley.doubleValue();
            }
            listBuilderV.add(String.valueOf(Math.abs(dDoubleValue2 - dDoubleValue)));
        }
        final ListBuilder productQuantityDelta = CollectionsKt.q(listBuilderV);
        final int iAbs = Math.abs((i - BundlesDataKt.b(bundle)) - 1);
        if (i == 0) {
            BundlesAnalytics.Bundles.Action.Companion companion = BundlesAnalytics.Bundles.Action.d;
            final ArrayList arrayListA = BundlesExtKt.a(bundle);
            companion.getClass();
            Intrinsics.h(productQuantityDelta, "productQuantityDelta");
            event = new Event(iAbs, productQuantityDelta, arrayListA) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$removeBundleBottomSheetClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Value", String.valueOf(iAbs)));
                    spreadBuilder.a(new Pair("event.Label", "remove"));
                    spreadBuilder.a(new Pair("product.Quantity", productQuantityDelta));
                    spreadBuilder.a(new Pair("product.IDs", arrayListA));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "remove_bundle_from_cart";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "remove_bundle_from_cart".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        } else if (i > BundlesDataKt.b(bundle)) {
            BundlesAnalytics.Bundles.Action.Companion companion2 = BundlesAnalytics.Bundles.Action.d;
            final ArrayList arrayListA2 = BundlesExtKt.a(bundle);
            companion2.getClass();
            Intrinsics.h(productQuantityDelta, "productQuantityDelta");
            event = new Event(iAbs, productQuantityDelta, arrayListA2) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$increaseBundleBottomSheet$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Value", String.valueOf(iAbs)));
                    spreadBuilder.a(new Pair("event.Label", "update cart"));
                    spreadBuilder.a(new Pair("product.Quantity", productQuantityDelta));
                    spreadBuilder.a(new Pair("product.IDs", arrayListA2));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "bundle_cart_update_add";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "bundle_cart_update_add".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        } else {
            BundlesAnalytics.Bundles.Action.Companion companion3 = BundlesAnalytics.Bundles.Action.d;
            final ArrayList arrayListA3 = BundlesExtKt.a(bundle);
            companion3.getClass();
            Intrinsics.h(productQuantityDelta, "productQuantityDelta");
            event = new Event(iAbs, productQuantityDelta, arrayListA3) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$decreaseBundleBottomSheet$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Value", String.valueOf(iAbs)));
                    spreadBuilder.a(new Pair("event.Label", "update cart"));
                    spreadBuilder.a(new Pair("product.Quantity", productQuantityDelta));
                    spreadBuilder.a(new Pair("product.IDs", arrayListA3));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "bundle_cart_update_remove";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "bundle_cart_update_remove".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        }
        ArrayList arrayListA4 = BundlesDataKt.a(list2);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA4, 10));
        Iterator it2 = arrayListA4.iterator();
        while (it2.hasNext()) {
            arrayList.add(((BundleProductCard) it2.next()).f6758a);
        }
        AnalyticsData analyticsData = bundle.d;
        if (analyticsData != null) {
            BundlesData bundlesData = this.n;
            BundlesData.BundlesLandingPage bundlesLandingPage = bundlesData instanceof BundlesData.BundlesLandingPage ? (BundlesData.BundlesLandingPage) bundlesData : null;
            AnalyticsData analyticsDataC = AnalyticsDataKt.c(analyticsData, bundlesLandingPage != null ? bundlesLandingPage.c : null, false);
            Iterator it3 = BundlesDataKt.a(list2).iterator();
            while (it3.hasNext()) {
                analyticsDataC = AnalyticsDataKt.c(analyticsDataC, ((BundleProductCard) it3.next()).f6758a.getProductCardAnalytics(), true);
            }
            analyticsData = analyticsDataC;
        }
        this.h.i(AnalyticsDataKt.b(event, analyticsData), ProductAnalyticsExtKt.f(arrayList));
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        return BundlesDataKt.b(this.e);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        MutableStateFlow mutableStateFlow;
        Object value;
        StatefulButtonState statefulButtonState;
        do {
            mutableStateFlow = this.j;
            value = mutableStateFlow.getValue();
            AddBundlesBottomSheetContract.ViewState viewState = (AddBundlesBottomSheetContract.ViewState) value;
            Bundle bundle = this.e;
            Intrinsics.h(bundle, "<this>");
            statefulButtonState = BundlesDataKt.b(bundle) == i ? StatefulButtonState.f : StatefulButtonState.d;
            viewState.getClass();
        } while (!mutableStateFlow.d(value, new AddBundlesBottomSheetContract.ViewState(i, statefulButtonState)));
    }
}
