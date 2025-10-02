package au.com.woolworths.product.addtocart;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.local.QuantitySelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAction;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityAction;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityUpdated;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetRepository;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.offers.ProductsBoostViewListener;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewAnalyticsListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "Lau/com/woolworths/product/offers/ProductsBoostViewListener;", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewAnalyticsListener;", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddToCartViewModel extends ViewModel implements HorizontalSelectorViewListener, ProductsBoostViewListener, HorizontalSelectorViewAnalyticsListener {
    public final CartUpdateInteractor e;
    public final AnalyticsManager f;
    public final ShopAccountInteractor g;
    public final EducationBottomSheetRepository h;
    public final ShopAppRegionInteractor i;
    public final LegacyShoppingModeRepository j;
    public final FeatureToggleManager k;
    public AddToCartBottomSheetFragment.ProductBottomSheetHostScreen l;
    public final MutableLiveData m;
    public final SharedFlowImpl n;
    public final Flow o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartViewModel$Companion;", "", "", "ANIMATION_END_DELAY", "J", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9249a;

        static {
            int[] iArr = new int[CartProductQuantityAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction = CartProductQuantityAction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction2 = CartProductQuantityAction.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction3 = CartProductQuantityAction.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CartProductQuantityAction cartProductQuantityAction4 = CartProductQuantityAction.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9249a = iArr;
            int[] iArr2 = new int[ProductBottomSheetActionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ProductBottomSheetActionType productBottomSheetActionType = ProductBottomSheetActionType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ProductBottomSheetActionType productBottomSheetActionType2 = ProductBottomSheetActionType.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public AddToCartViewModel(CartUpdateInteractor addToCartInteractor, AnalyticsManager analyticsManager, ShopAccountInteractor accountInteractor, EducationBottomSheetRepository educationBottomSheetRepository, ShopAppRegionInteractor shopAppRegionInteractor, LegacyShoppingModeRepository shoppingModeRepository, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(addToCartInteractor, "addToCartInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = addToCartInteractor;
        this.f = analyticsManager;
        this.g = accountInteractor;
        this.h = educationBottomSheetRepository;
        this.i = shopAppRegionInteractor;
        this.j = shoppingModeRepository;
        this.k = featureToggleManager;
        this.m = new MutableLiveData();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.n = sharedFlowImplB;
        this.o = FlowKt.a(sharedFlowImplB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.product.addtocart.AddToCartViewModel r7, au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r8, au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof au.com.woolworths.product.addtocart.AddToCartViewModel$replaceTrolleyItem$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.product.addtocart.AddToCartViewModel$replaceTrolleyItem$1 r0 = (au.com.woolworths.product.addtocart.AddToCartViewModel$replaceTrolleyItem$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.product.addtocart.AddToCartViewModel$replaceTrolleyItem$1 r0 = new au.com.woolworths.product.addtocart.AddToCartViewModel$replaceTrolleyItem$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r8 = r0.p
            kotlin.ResultKt.b(r10)
            goto L5a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r10)
            androidx.lifecycle.MutableLiveData r10 = r7.m
            java.lang.Object r2 = r10.e()
            au.com.woolworths.product.addtocart.AddToCartContract$ViewState r2 = (au.com.woolworths.product.addtocart.AddToCartContract.ViewState) r2
            r4 = 0
            if (r2 == 0) goto L46
            r5 = 127(0x7f, float:1.78E-43)
            r6 = 0
            au.com.woolworths.product.addtocart.AddToCartContract$ViewState r4 = au.com.woolworths.product.addtocart.AddToCartContract.ViewState.a(r2, r4, r6, r6, r5)
        L46:
            r10.m(r4)
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r10 = r7.e
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras[] r9 = new au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras[]{r8, r9}
            r0.p = r8
            r0.s = r3
            java.lang.Object r10 = r10.c(r9, r0)
            if (r10 != r1) goto L5a
            return r1
        L5a:
            au.com.woolworths.shop.cart.domain.interactor.CartProductQuantitiesBoostResult r10 = (au.com.woolworths.shop.cart.domain.interactor.CartProductQuantitiesBoostResult) r10
            float r9 = r8.e
            au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType r8 = r8.f
            r7.t6(r9, r8, r10, r3)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.addtocart.AddToCartViewModel.p6(au.com.woolworths.product.addtocart.AddToCartViewModel, au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras, au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q6(au.com.woolworths.product.addtocart.AddToCartViewModel r7, au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof au.com.woolworths.product.addtocart.AddToCartViewModel$updateTrolleyItem$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.product.addtocart.AddToCartViewModel$updateTrolleyItem$1 r0 = (au.com.woolworths.product.addtocart.AddToCartViewModel$updateTrolleyItem$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.product.addtocart.AddToCartViewModel$updateTrolleyItem$1 r0 = new au.com.woolworths.product.addtocart.AddToCartViewModel$updateTrolleyItem$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r8 = r0.p
            kotlin.ResultKt.b(r9)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.b(r9)
            androidx.lifecycle.MutableLiveData r9 = r7.m
            java.lang.Object r2 = r9.e()
            au.com.woolworths.product.addtocart.AddToCartContract$ViewState r2 = (au.com.woolworths.product.addtocart.AddToCartContract.ViewState) r2
            r5 = 0
            if (r2 == 0) goto L46
            r6 = 127(0x7f, float:1.78E-43)
            au.com.woolworths.product.addtocart.AddToCartContract$ViewState r5 = au.com.woolworths.product.addtocart.AddToCartContract.ViewState.a(r2, r5, r3, r3, r6)
        L46:
            r9.m(r5)
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r9 = r7.e
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras[] r2 = new au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras[]{r8}
            r0.p = r8
            r0.s = r4
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            au.com.woolworths.shop.cart.domain.interactor.CartProductQuantitiesBoostResult r9 = (au.com.woolworths.shop.cart.domain.interactor.CartProductQuantitiesBoostResult) r9
            float r0 = r8.e
            au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType r8 = r8.f
            r7.t6(r0, r8, r9, r3)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.addtocart.AddToCartViewModel.q6(au.com.woolworths.product.addtocart.AddToCartViewModel, au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewAnalyticsListener
    public final void Q5() {
    }

    @Override // au.com.woolworths.product.offers.ProductsBoostViewListener
    public final void d() {
        Timber.Forest forest = Timber.f27013a;
        forest.s("AddToCartVM");
        forest.m("Dismiss from Boosting", new Object[0]);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToCartViewModel$onAnimationEnd$1(this, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewAnalyticsListener
    public final void d5() {
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int f5() {
        Integer numP = ProductCardExtKt.p(((AddToCartContract.ViewState) LiveDataExtKt.a(this.m)).f9248a);
        if (numP != null) {
            return numP.intValue();
        }
        return -1;
    }

    public final void r6() {
        ShopAppRegionInteractor shopAppRegionInteractor = this.i;
        Region regionB = shopAppRegionInteractor.b();
        Region region = Region.j;
        if (regionB == region && !this.g.d()) {
            s6(AddToCartContract.Actions.ShowSignInPrompt.f9247a);
            return;
        }
        if (shopAppRegionInteractor.b() == region && this.j.m() == null) {
            s6(AddToCartContract.Actions.ShowAddDeliveryAddressBottomSheet.f9245a);
            return;
        }
        AddToCartContract.ViewState viewState = (AddToCartContract.ViewState) LiveDataExtKt.a(this.m);
        ProductCard productCard = viewState.f9248a;
        ProductCard productCard2 = viewState.b;
        v6();
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToCartViewModel$addToCart$1(productCard2, this, productCard, viewState, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void s4() {
        AddToCartContract.ViewState viewState = (AddToCartContract.ViewState) this.m.e();
        if (viewState != null) {
            Integer numP = ProductCardExtKt.p(viewState.f9248a);
            if (numP == null) {
                r6();
                return;
            }
            if (numP.intValue() == viewState.e) {
                u6();
            } else {
                x6();
            }
        }
    }

    public final void s6(AddToCartContract.Actions actions) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToCartViewModel$emitAction$1(this, actions, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t6(float r15, au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType r16, au.com.woolworths.shop.cart.domain.interactor.CartProductQuantitiesBoostResult r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.addtocart.AddToCartViewModel.t6(float, au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType, au.com.woolworths.shop.cart.domain.interactor.CartProductQuantitiesBoostResult, boolean):void");
    }

    public final void u6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToCartViewModel$removeFromCart$1(this, ((AddToCartContract.ViewState) LiveDataExtKt.a(this.m)).f9248a, null), 3);
    }

    public final void v6() {
        AddToCartContract.ViewState viewState = (AddToCartContract.ViewState) this.m.e();
        if (viewState == null || !viewState.d) {
            return;
        }
        EducationBottomSheetRepository educationBottomSheetRepository = this.h;
        if (educationBottomSheetRepository.f8753a.getBoolean("education_bottom_sheet", true)) {
            a.v(educationBottomSheetRepository.f8753a, "education_bottom_sheet", false);
        }
    }

    public final void w6(List list, ProductId productId, Boolean bool, ProductCard productCard, TrackingMetadata trackingMetadata) {
        Object next;
        Event event;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.c(ProductId.INSTANCE.create(((CartProductQuantityUpdated) next).f8684a), productId)) {
                    break;
                }
            }
        }
        CartProductQuantityUpdated cartProductQuantityUpdated = (CartProductQuantityUpdated) next;
        if (cartProductQuantityUpdated == null) {
            return;
        }
        AddToCartBottomSheetFragment.ProductBottomSheetHostScreen productBottomSheetHostScreen = this.l;
        if (productBottomSheetHostScreen == null) {
            Intrinsics.p("screen");
            throw null;
        }
        String str = productBottomSheetHostScreen.d;
        if (productBottomSheetHostScreen == null) {
            Intrinsics.p("screen");
            throw null;
        }
        QuantitySelectorAnalytics.QuantitySelector quantitySelector = new QuantitySelectorAnalytics.QuantitySelector(str, productBottomSheetHostScreen.e);
        CartProductQuantityAction cartProductQuantityAction = cartProductQuantityUpdated.g;
        int i = cartProductQuantityAction == null ? -1 : WhenMappings.f9249a[cartProductQuantityAction.ordinal()];
        if (i != -1) {
            QuantitySelectorAnalytics.QuantitySelector.Action action = quantitySelector.h;
            if (i == 1) {
                event = (Event) action.b.getD();
            } else if (i == 2) {
                event = (Event) action.f.getD();
            } else if (i == 3) {
                event = (Event) action.d.getD();
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                event = (Event) action.e.getD();
            }
            ProductCard productCardK = ProductAnalyticsExtKt.k(productCard, Intrinsics.c(bool, Boolean.TRUE) ? RewardsOfferAction.f : Intrinsics.c(bool, Boolean.FALSE) ? RewardsOfferAction.g : null);
            Double d = cartProductQuantityUpdated.e;
            TrackingMetadata trackingMetadataE = ProductAnalyticsExtKt.e(productCardK, Float.valueOf(d != null ? (float) d.doubleValue() : BitmapDescriptorFactory.HUE_RED), cartProductQuantityUpdated.f, null);
            if (trackingMetadata != null) {
                trackingMetadataE.a(trackingMetadata);
            }
            this.f.i(event, trackingMetadataE);
        }
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final int x4() {
        double defaultValue;
        ProductCard productCard = ((AddToCartContract.ViewState) LiveDataExtKt.a(this.m)).f9248a;
        ProductTrolleyData trolley = productCard.getTrolley();
        Intrinsics.e(trolley);
        if (ProductCardExtKt.r(productCard)) {
            Double inTrolley = trolley.getInTrolley();
            Intrinsics.e(inTrolley);
            defaultValue = inTrolley.doubleValue();
            if (Double.compare(defaultValue, trolley.getMaximum()) > 0) {
                defaultValue = trolley.getMaximum();
            }
        } else {
            defaultValue = trolley.getDefaultValue();
        }
        return ProductQuantityHelper.INSTANCE.getIndexFromQuantity(defaultValue, trolley.getMinimum(), trolley.getIncrement());
    }

    public final void x6() {
        AddToCartContract.ViewState viewState = (AddToCartContract.ViewState) LiveDataExtKt.a(this.m);
        ProductCard productCard = viewState.f9248a;
        v6();
        BuildersKt.c(ViewModelKt.a(this), null, null, new AddToCartViewModel$updateCart$1(this, productCard, viewState, null), 3);
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final String y1(int i, Context context) {
        Intrinsics.h(context, "context");
        ProductCard productCard = ((AddToCartContract.ViewState) LiveDataExtKt.a(this.m)).f9248a;
        Intrinsics.h(productCard, "<this>");
        ProductQuantityHelper productQuantityHelper = ProductQuantityHelper.INSTANCE;
        ProductTrolleyData trolley = productCard.getTrolley();
        Intrinsics.e(trolley);
        String quantityLabel = productQuantityHelper.getQuantityLabel(i, trolley.getIncrement(), productCard.getTrolley().getUnitLabel());
        Integer numP = ProductCardExtKt.p(productCard);
        return (numP == null ? new ResWithArgText(R.string.add_to_cart_description, quantityLabel) : numP.intValue() == i ? new ResText(R.string.remove_from_cart_description) : new ResWithArgText(R.string.update_cart_description, quantityLabel)).getText(context).toString();
    }

    @Override // au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener
    public final void z2(int i) {
        MutableLiveData mutableLiveData = this.m;
        AddToCartContract.ViewState viewState = (AddToCartContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? AddToCartContract.ViewState.a(viewState, null, i, 0, 223) : null);
    }
}
