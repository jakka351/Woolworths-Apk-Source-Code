package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.cart.CartAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.local.CartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartAlert;
import au.com.woolworths.foundation.shop.cart.data.model.CartBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartImageTextBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityUpdated;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.CartSection;
import au.com.woolworths.foundation.shop.cart.data.model.MemberPricePromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.MultiBuyPromotionInfo;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.promotion.banner.ui.PromotionBannerAction;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.ShopCartFeature;
import au.com.woolworths.shop.cart.analytics.CartAnalyticsExtKt;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.CartSectionOptionsListener;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;
import au.com.woolworths.shop.cart.ui.cart.AutoNavigationState;
import au.com.woolworths.shop.cart.ui.cart.CartContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/cart/ui/CartSectionOptionsListener;", "Lau/com/woolworths/shop/cart/ui/ProductSectionItemListener;", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartViewModel extends ViewModel implements CartSectionOptionsListener, ProductSectionItemListener {
    public static final EmCouponBannerAnalytics.Banner u;
    public final CartRepositoryImpl e;
    public final ShopAccountInteractor f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final CartUpdateInteractor i;
    public final CollectionModeInteractor j;
    public final ShopAppRegionInteractor k;
    public final BufferedChannel l;
    public final Flow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final SharedFlowImpl p;
    public final ArrayList q;
    public final ArrayList r;
    public boolean s;
    public AutoNavigationState t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartViewModel$Companion;", "", "Lau/com/woolworths/analytics/supers/couponbanner/EmCouponBannerAnalytics$Banner;", "EmCouponBannerAnalyticsAction", "Lau/com/woolworths/analytics/supers/couponbanner/EmCouponBannerAnalytics$Banner;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10494a;

        static {
            int[] iArr = new int[CartProductQuantityAction.values().length];
            try {
                CartProductQuantityAction cartProductQuantityAction = CartProductQuantityAction.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction2 = CartProductQuantityAction.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction3 = CartProductQuantityAction.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction4 = CartProductQuantityAction.d;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction5 = CartProductQuantityAction.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10494a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    static {
        ?? r0 = new CartAnalytics.Cart().d;
        Object obj = r0.get("app.Section");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = r0.get("screen.Type");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        u = new EmCouponBannerAnalytics.Banner("Cart screen", str2 != null ? str2 : "", str);
    }

    public CartViewModel(CartRepositoryImpl cartRepositoryImpl, ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, CartUpdateInteractor cartUpdateInteractor, CollectionModeInteractor collectionModeInteractor, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.e = cartRepositoryImpl;
        this.f = accountInteractor;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        this.i = cartUpdateInteractor;
        this.j = collectionModeInteractor;
        this.k = shopAppRegionInteractor;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, bufferOverflow);
        this.l = bufferedChannelA;
        this.m = FlowKt.I(bufferedChannelA);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new CartContract.ViewState(false, false, null, null, EmptyMap.d));
        this.n = mutableStateFlowA;
        this.o = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, 1, bufferOverflow);
        this.p = sharedFlowImplA;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.t = AutoNavigationState.None.f10458a;
        if (shopAppRegionInteractor.b() != Region.i && !accountInteractor.d()) {
            bufferedChannelA.k(CartContract.Actions.Login.f10468a);
            return;
        }
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CartViewModel$startListeningPendingUpdates$1(this, null), FlowKt.o(sharedFlowImplA, 1000L)), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CartViewModel$startListeningPendingUpdates$2(this, null), FlowKt.s(cartUpdateInteractor.h, 1)), ViewModelKt.a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.shop.cart.ui.cart.CartViewModel r15, kotlin.jvm.functions.Function0 r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.ui.cart.CartViewModel.p6(au.com.woolworths.shop.cart.ui.cart.CartViewModel, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void x6(CartViewModel cartViewModel, MutableStateFlow mutableStateFlow, boolean z, Cart cart, CartFullErrorMessage cartFullErrorMessage, Map map, int i) {
        if ((i & 1) != 0) {
            z = ((CartContract.ViewState) mutableStateFlow.getValue()).f10490a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            cart = ((CartContract.ViewState) mutableStateFlow.getValue()).c;
        }
        Cart cart2 = cart;
        if ((i & 4) != 0) {
            cartFullErrorMessage = ((CartContract.ViewState) mutableStateFlow.getValue()).d;
        }
        CartFullErrorMessage cartFullErrorMessage2 = cartFullErrorMessage;
        if ((i & 8) != 0) {
            map = ((CartContract.ViewState) mutableStateFlow.getValue()).e;
        }
        cartViewModel.getClass();
        mutableStateFlow.f(CartContract.ViewState.a((CartContract.ViewState) mutableStateFlow.getValue(), z2, false, cart2, cartFullErrorMessage2, map, 2));
    }

    public static void y6(CartViewModel cartViewModel, Map map, Function0 function0, au.com.woolworths.sdui.common.alert.a aVar, int i) {
        BuildersKt.c(ViewModelKt.a(cartViewModel), null, null, new CartViewModel$updateProductsWithCustomResponse$1(map, cartViewModel, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : aVar, null), 3);
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void O3(CartProductCard product) {
        Intrinsics.h(product, "product");
        String str = product.f8679a;
        String str2 = product.b;
        String str3 = product.c;
        Integer num = product.f;
        boolean z = product.e;
        CartProductQuantityInfo cartProductQuantityInfo = product.h;
        double d = cartProductQuantityInfo.f8683a;
        double d2 = cartProductQuantityInfo.b;
        double d3 = cartProductQuantityInfo.c;
        double d4 = cartProductQuantityInfo.d;
        String str4 = cartProductQuantityInfo.e;
        double d5 = product.d;
        this.l.k(new CartContract.Actions.OpenQuantitySelector(new ProductCard(str, str2, str3, null, num, null, null, null, null, z, false, null, null, null, null, new ProductTrolleyData(d, d2, d3, d4, Double.valueOf(d5), str4, ProductTileButtonType.UPDATE, "", null, null), null, new ProductShoppingList(cartProductQuantityInfo.f8683a, cartProductQuantityInfo.b, cartProductQuantityInfo.c, cartProductQuantityInfo.d, cartProductQuantityInfo.e), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -165400, 255, null)));
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void S1(CartProductCard product, double d) {
        Intrinsics.h(product, "product");
        LinkedHashMap linkedHashMapR6 = r6();
        if (d < 0.0d) {
            d = 0.0d;
        }
        linkedHashMapR6.put(product, Double.valueOf(d));
        x6(this, this.n, false, null, null, linkedHashMapR6, 7);
        this.p.f(new Object());
    }

    @Override // au.com.woolworths.shop.cart.ui.CartSectionOptionsListener
    public final void b5(String sectionTitle, boolean z) {
        ArrayList arrayList;
        Double dValueOf = Double.valueOf(0.0d);
        Intrinsics.h(sectionTitle, "sectionTitle");
        final String title = "Remove " + sectionTitle + " items";
        final CartAnalytics.Cart.Action action = new CartAnalytics.Cart().f;
        action.getClass();
        Intrinsics.h(title, "title");
        this.g.g(new Event(action, title) { // from class: au.com.woolworths.analytics.supers.cart.CartAnalytics$Cart$Action$removeSection$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4032a.e);
                spreadBuilder.a(new Pair("event.Category", "cart"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                androidx.constraintlayout.core.state.a.y("event.Label", title, spreadBuilder);
                ArrayList arrayList2 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "cart_remove_many";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "cart_remove_many".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        this.l.k(CartContract.Actions.DismissCartSectionOptionsDialog.f10463a);
        boolean zC = this.h.c(ShopCartFeature.f);
        MutableStateFlow mutableStateFlow = this.n;
        if (zC) {
            LinkedHashMap linkedHashMapR6 = r6();
            ArrayList arrayListQ6 = q6();
            if (arrayListQ6 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayListQ6.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    CartProductCard cartProductCard = (CartProductCard) next;
                    if (z) {
                        if (cartProductCard.j != null) {
                            arrayList2.add(next);
                        }
                    } else if (cartProductCard.j == null) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    linkedHashMapR6.put((CartProductCard) it2.next(), dValueOf);
                }
            }
            x6(this, mutableStateFlow, false, null, null, linkedHashMapR6, 7);
            this.p.f(new Object());
            return;
        }
        LinkedHashMap linkedHashMapR62 = r6();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = linkedHashMapR62.entrySet().iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            arrayList = this.r;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            if (!arrayList.contains((CartProductCard) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        x6(this, mutableStateFlow, false, null, null, linkedHashMap, 7);
        int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH);
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            linkedHashMap2.put(next2, dValueOf);
        }
        y6(this, linkedHashMap2, new androidx.work.impl.utils.c(21, this, arrayList, sectionTitle), null, 4);
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void e6(String str, boolean z) {
        CartAnalytics.Cart cart;
        Event event;
        if (z) {
            cart = new CartAnalytics.Cart();
            event = (Event) cart.f.o.getD();
        } else {
            cart = new CartAnalytics.Cart();
            event = (Event) cart.f.n.getD();
        }
        this.g.g(event);
        if (!this.h.c(ShopCartFeature.f)) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            ArrayList arrayListQ6 = q6();
            if (arrayListQ6 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayListQ6.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    CartProductCard cartProductCard = (CartProductCard) next;
                    if (z) {
                        if (cartProductCard.j != null) {
                            arrayList2.add(next);
                        }
                    } else if (cartProductCard.j == null) {
                        arrayList2.add(next);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        this.l.k(new CartContract.Actions.ShowCartSectionOptionsDialog(str, z));
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void i6(CartPromotionInfo promotionInfo) {
        Intrinsics.h(promotionInfo, "promotionInfo");
        this.g.g(CartAnalytics.Cart.Action.h);
        this.l.k(new CartContract.Actions.ShowPromotionInfoTooltip(promotionInfo));
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void p3(CartProductCard product) {
        Double dValueOf = Double.valueOf(0.0d);
        Intrinsics.h(product, "product");
        boolean zC = this.h.c(ShopCartFeature.f);
        MutableStateFlow mutableStateFlow = this.n;
        if (!zC) {
            LinkedHashMap linkedHashMapR6 = r6();
            linkedHashMapR6.remove(product);
            x6(this, mutableStateFlow, false, null, null, linkedHashMapR6, 7);
            y6(this, MapsKt.i(new Pair(product, dValueOf)), new au.com.woolworths.sdui.common.alert.a(20, this, product), null, 4);
            return;
        }
        LinkedHashMap linkedHashMapR62 = r6();
        linkedHashMapR62.put(product, dValueOf);
        x6(this, mutableStateFlow, false, null, null, linkedHashMapR62, 7);
        this.p.f(new Object());
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void q3(CartPromotionInfo info) {
        Intrinsics.h(info, "info");
        if (info.f8686a) {
            return;
        }
        this.l.k(CartContract.Actions.OpenRewardsSetup.f10471a);
    }

    public final ArrayList q6() {
        Cart cart = ((CartContract.ViewState) this.n.getValue()).c;
        if (cart != null) {
            return CartViewModelKt.a(cart);
        }
        return null;
    }

    @Override // au.com.woolworths.shop.cart.ui.ProductSectionItemListener
    public final void r0(CartProductCard product) {
        Intrinsics.h(product, "product");
        this.g.i(CartAnalytics.Cart.Action.i, ProductTrackingValueKt.a(CollectionsKt.Q(CartAnalyticsExtKt.b(product, null, null))));
        this.l.k(new CartContract.Actions.OpenProductDetails(product.f8679a));
    }

    public final LinkedHashMap r6() {
        return MapsKt.s(((CartContract.ViewState) this.n.getValue()).e);
    }

    public final void s6() {
        Event event = (Event) new CartAnalytics.Cart().f.q.getD();
        AnalyticsManager analyticsManager = this.g;
        analyticsManager.g(event);
        this.l.k(CartContract.Actions.ShowMoreMenu.f10480a);
        analyticsManager.g((Event) new CartAnalytics.Cart().f.r.getD());
    }

    public final void t6(boolean z, Function0 function0) {
        while (true) {
            MutableStateFlow mutableStateFlow = this.n;
            Object value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.d(value, CartContract.ViewState.a((CartContract.ViewState) value, false, z2, null, null, null, 29))) {
                BuildersKt.c(ViewModelKt.a(this), null, null, new CartViewModel$refreshCart$3(this, function0, null), 3);
                return;
            }
            z = z2;
        }
    }

    public final void u6(Cart cart, List list) {
        CartAnalytics.Cart.Action action;
        ArrayList arrayListA = CartViewModelKt.a(cart);
        ArrayList arrayList = cart.d;
        List list2 = list;
        AnalyticsManager analyticsManager = this.g;
        if (list2 != null && !list2.isEmpty() && !arrayListA.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = CollectionsKt.c0(this.q, arrayListA).iterator();
            while (it.hasNext()) {
                CartProductCard cartProductCard = (CartProductCard) it.next();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((CartProductQuantityUpdated) obj).f8684a.equals(cartProductCard.f8679a)) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    CartProductQuantityUpdated cartProductQuantityUpdated = (CartProductQuantityUpdated) it2.next();
                    CartProductQuantityAction cartProductQuantityAction = cartProductQuantityUpdated.g;
                    int i = cartProductQuantityAction == null ? -1 : WhenMappings.f10494a[cartProductQuantityAction.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            action = CartAnalytics.Cart.Action.j;
                        } else if (i == 2) {
                            action = CartAnalytics.Cart.Action.e;
                        } else if (i == 3) {
                            action = CartAnalytics.Cart.Action.f;
                        } else if (i != 4 && i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Double d = cartProductQuantityUpdated.e;
                        ProductTrackingValue productTrackingValueB = CartAnalyticsExtKt.b(cartProductCard, d != null ? Float.valueOf((float) d.doubleValue()) : null, cartProductQuantityUpdated.f);
                        Object arrayList3 = linkedHashMap.get(action);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(action, arrayList3);
                        }
                        ((List) arrayList3).add(productTrackingValueB);
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                analyticsManager.i((Event) entry.getKey(), ProductTrackingValueKt.a((List) entry.getValue()));
            }
        }
        analyticsManager.i(CartAnalytics.Cart.Action.d, CartAnalyticsExtKt.a(arrayListA));
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((CartSection) it3.next()) instanceof CartImageTextBanner) {
                        analyticsManager.g((Event) new CartAnalytics.Cart().f.w.getD());
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        CartAnalytics.Cart.Action action2 = CartAnalytics.Cart.Action.w;
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayListA.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            MemberPricePromotionInfo memberPricePromotionInfo = ((CartProductCard) next).m;
            if (memberPricePromotionInfo != null && memberPricePromotionInfo.c) {
                arrayList4.add(next);
            }
        }
        w6(action2, arrayList4);
        CartAnalytics.Cart.Action action3 = CartAnalytics.Cart.Action.v;
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayListA.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            MemberPricePromotionInfo memberPricePromotionInfo2 = ((CartProductCard) next2).m;
            if (memberPricePromotionInfo2 != null && !memberPricePromotionInfo2.c) {
                arrayList5.add(next2);
            }
        }
        w6(action3, arrayList5);
        CartAnalytics.Cart.Action action4 = CartAnalytics.Cart.Action.y;
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayListA.iterator();
        while (it6.hasNext()) {
            Object next3 = it6.next();
            MultiBuyPromotionInfo multiBuyPromotionInfo = ((CartProductCard) next3).o;
            if (multiBuyPromotionInfo != null && multiBuyPromotionInfo.c) {
                arrayList6.add(next3);
            }
        }
        w6(action4, arrayList6);
        CartAnalytics.Cart.Action action5 = CartAnalytics.Cart.Action.x;
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayListA.iterator();
        while (it7.hasNext()) {
            Object next4 = it7.next();
            MultiBuyPromotionInfo multiBuyPromotionInfo2 = ((CartProductCard) next4).o;
            if (multiBuyPromotionInfo2 != null && !multiBuyPromotionInfo2.c) {
                arrayList7.add(next4);
            }
        }
        w6(action5, arrayList7);
        ArrayList arrayList8 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof CartBanner) {
                arrayList8.add(obj2);
            }
        }
        Iterator it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            AnalyticsData analytics = ((CartBanner) it8.next()).f8673a.getAnalytics();
            if (analytics != null) {
                final String eventLabel = analytics.getEventLabel();
                final String eventDescription = analytics.getEventDescription();
                final String eventValue = analytics.getEventValue();
                if (eventLabel == null || eventDescription == null || eventValue == null) {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Missing analytics.eventLabel, eventDescription and/or eventValue from BFF for cart banner", null, 12);
                } else {
                    final CartAnalytics.Cart.Action action6 = new CartAnalytics.Cart().f;
                    action6.getClass();
                    analyticsManager.g(new Event(action6, eventLabel, eventDescription, eventValue) { // from class: au.com.woolworths.analytics.supers.cart.CartAnalytics$Cart$Action$reviewProductsBanner$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                            spreadBuilder.b(action6.f4032a.e);
                            spreadBuilder.a(new Pair("event.Category", "notification"));
                            spreadBuilder.a(new Pair("event.Action", "impression"));
                            spreadBuilder.a(new Pair("event.Label", eventLabel));
                            spreadBuilder.a(new Pair("event.Description", eventDescription));
                            androidx.constraintlayout.core.state.a.y("event.Value", eventValue, spreadBuilder);
                            ArrayList arrayList9 = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList9.toArray(new Pair[arrayList9.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getD() {
                            return "notification_impression";
                        }

                        public final boolean equals(Object obj3) {
                            if (!(obj3 instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj3;
                            return "notification_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                }
            }
        }
        Iterator it9 = cart.j.iterator();
        while (it9.hasNext()) {
            analyticsManager.g(AnalyticsDataKt.b(new CartAnalytics.Cart(), (AnalyticsData) it9.next()));
        }
        CartAlert cartAlert = cart.k;
        if (cartAlert != null) {
            analyticsManager.g(AnalyticsDataKt.b(new CartAnalytics.Cart(), cartAlert.d));
        }
    }

    public final void v6(CartBanner cartBanner) {
        AnalyticsData analytics = cartBanner.f8673a.getAnalytics();
        if (analytics != null) {
            final String eventLabel = analytics.getEventLabel();
            final String eventDescription = analytics.getEventDescription();
            if (eventLabel == null || eventDescription == null) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Missing analytics.eventLabel and/or eventDescription from BFF for cart banner", null, 12);
            } else {
                final CartAnalytics.Cart.Action action = new CartAnalytics.Cart().f;
                action.getClass();
                this.g.g(new Event(action, eventLabel, eventDescription) { // from class: au.com.woolworths.analytics.supers.cart.CartAnalytics$Cart$Action$reviewProducts$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(action.f4032a.e);
                        spreadBuilder.a(new Pair("event.Category", "notification"));
                        spreadBuilder.a(new Pair("event.Action", "click"));
                        androidx.constraintlayout.core.state.a.z("event.Label", eventLabel, spreadBuilder, "event.Description", eventDescription);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "notification_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "notification_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
        }
    }

    public final void w6(CartAnalytics.Cart.Action action, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.g.i(action, CartAnalyticsExtKt.a(arrayList));
    }

    @Override // au.com.woolworths.promotion.banner.ui.PromotionBannerListener
    public final void z3(PromotionBanner promotionBanner) {
        PromotionBannerAction promotionBannerAction = promotionBanner.b;
        boolean z = promotionBannerAction instanceof PromotionBannerAction.Link;
        BufferedChannel bufferedChannel = this.l;
        if (z) {
            bufferedChannel.k(new CartContract.Actions.OpenUrl(((PromotionBannerAction.Link) promotionBannerAction).d));
        } else if (promotionBannerAction instanceof PromotionBannerAction.LaunchPromotionDetails) {
            bufferedChannel.k(new CartContract.Actions.ShowPromotionScreen(((PromotionBannerAction.LaunchPromotionDetails) promotionBannerAction).d));
        } else if (!promotionBannerAction.equals(PromotionBannerAction.None.d)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
