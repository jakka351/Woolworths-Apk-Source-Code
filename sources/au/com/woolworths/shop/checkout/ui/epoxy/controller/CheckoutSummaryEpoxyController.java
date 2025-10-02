package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.checkout.ItemCheckoutOrderAddressBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutOrderAddressMarketSellerBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutRewardsRegisteredBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutRewardsRegisteredRedeemableBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutRewardsUnregisteredBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutSectionTitleBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutSummaryBillingAddressBindingModel_;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionCode;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscounts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddress;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddressEmpty;
import au.com.woolworths.shop.checkout.domain.model.CheckoutTermsConditions;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerInfo;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddress;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressGrocery;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddressMarket;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddresses;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderSummaryTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewards;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsUnregistered;
import au.com.woolworths.shop.checkout.ui.components.BillingAddressEmptyEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode_;
import au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.SectionDividerEpoxyModel;
import au.com.woolworths.shop.checkout.ui.components.TermsAndConditionsEpoxyModel_;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutRewardsAndDiscountsUiKt;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutSectionTitleKt;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentData;
import au.com.woolworths.shop.checkout.ui.details.c;
import au.com.woolworths.shop.checkout.ui.epoxy.view.EditOrderBannerEpoxyView;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\u0014H\u0002J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u000e\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\u0018H\u0002J\u0016\u0010\u000e\u001a\u00020\f*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0016\u0010\u000e\u001a\u00020\f*\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\u001dH\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\u001eH\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/controller/CheckoutSummaryEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentData;", "checkoutSummaryListener", "Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryListener;", "isRewardsUpliftEnabled", "", "cmoBannerEventHandler", "Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;", "<init>", "(Lau/com/woolworths/shop/checkout/ui/summary/CheckoutSummaryListener;ZLau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;)V", "buildModels", "", "data", "buildUi", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutSummaryBillingAddress;", "index", "", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutSummaryBillingAddressEmpty;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsUnregistered;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewards;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment$Registered;", "Lau/com/woolworths/shop/checkout/domain/model/rewards/CheckoutSummaryRewardsSegment$RegisteredRedeemable;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutTermsConditions;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddresses;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddressGrocery;", "inserBannerApiData", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lau/com/woolworths/shop/checkout/domain/model/address/OrderAddressMarket;", "Lau/com/woolworths/shop/checkout/domain/model/breakdown/OrderSummaryTotalDetails;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromotionCode;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscounts;", "buildCmoBanner", "shouldShowCmoBanner", "eventHandler", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSummaryEpoxyController extends TypedEpoxyController<CheckoutContentData> {
    public static final int $stable = 8;

    @NotNull
    private final CheckoutSummaryListener checkoutSummaryListener;

    @NotNull
    private final EditOrderEventHandler cmoBannerEventHandler;
    private final boolean isRewardsUpliftEnabled;

    public CheckoutSummaryEpoxyController(@NotNull CheckoutSummaryListener checkoutSummaryListener, boolean z, @NotNull EditOrderEventHandler cmoBannerEventHandler) {
        Intrinsics.h(checkoutSummaryListener, "checkoutSummaryListener");
        Intrinsics.h(cmoBannerEventHandler, "cmoBannerEventHandler");
        this.checkoutSummaryListener = checkoutSummaryListener;
        this.isRewardsUpliftEnabled = z;
        this.cmoBannerEventHandler = cmoBannerEventHandler;
    }

    private final void buildCmoBanner(boolean shouldShowCmoBanner, EditOrderEventHandler eventHandler) {
        if (shouldShowCmoBanner) {
            EditOrderBannerEpoxyView editOrderBannerEpoxyView = new EditOrderBannerEpoxyView(eventHandler);
            editOrderBannerEpoxyView.p("edit_order_banner");
            addInternal(editOrderBannerEpoxyView);
        }
    }

    private final void buildUi(CheckoutSummaryRewards checkoutSummaryRewards) {
        int i = 0;
        for (Object obj : checkoutSummaryRewards.f10654a) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            CheckoutSummaryRewardsSegment checkoutSummaryRewardsSegment = (CheckoutSummaryRewardsSegment) obj;
            if (checkoutSummaryRewardsSegment instanceof CheckoutSummaryRewardsSegment.Registered) {
                buildUi((CheckoutSummaryRewardsSegment.Registered) checkoutSummaryRewardsSegment, i);
            } else {
                if (!(checkoutSummaryRewardsSegment instanceof CheckoutSummaryRewardsSegment.RegisteredRedeemable)) {
                    throw new NoWhenBranchMatchedException();
                }
                buildUi((CheckoutSummaryRewardsSegment.RegisteredRedeemable) checkoutSummaryRewardsSegment, i);
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildUi$lambda$3$lambda$2(CheckoutSummaryEpoxyController checkoutSummaryEpoxyController, CheckoutSummaryBillingAddressEmpty checkoutSummaryBillingAddressEmpty) {
        checkoutSummaryEpoxyController.checkoutSummaryListener.n0(checkoutSummaryBillingAddressEmpty.c);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildUi$lambda$9$lambda$8(CheckoutSummaryEpoxyController checkoutSummaryEpoxyController, String str) {
        CheckoutSummaryListener checkoutSummaryListener = checkoutSummaryEpoxyController.checkoutSummaryListener;
        Intrinsics.e(str);
        checkoutSummaryListener.A2(str);
        return Unit.f24250a;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull CheckoutContentData data) {
        List list;
        Intrinsics.h(data, "data");
        buildCmoBanner(data.c, this.cmoBannerEventHandler);
        Checkout checkout = data.f10756a;
        if (checkout == null || (list = checkout.b) == null) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (obj instanceof CheckoutSummaryBillingAddress) {
                buildUi((CheckoutSummaryBillingAddress) obj, i);
            } else if (obj instanceof CheckoutSummaryBillingAddressEmpty) {
                buildUi((CheckoutSummaryBillingAddressEmpty) obj, i);
            } else if (obj instanceof CheckoutSummaryRewards) {
                buildUi((CheckoutSummaryRewards) obj);
            } else if (obj instanceof CheckoutSummaryRewardsUnregistered) {
                buildUi((CheckoutSummaryRewardsUnregistered) obj, i);
            } else if (obj instanceof CheckoutTermsConditions) {
                buildUi((CheckoutTermsConditions) obj, i);
            } else if (obj instanceof OrderAddresses) {
                buildUi((OrderAddresses) obj);
            } else if (obj instanceof OrderSummaryTotalDetails) {
                buildUi((OrderSummaryTotalDetails) obj);
            } else if (obj instanceof CheckoutPromotionCode) {
                buildUi((CheckoutPromotionCode) obj);
            } else if (obj instanceof CheckoutRewardsAndDiscounts) {
                buildUi((CheckoutRewardsAndDiscounts) obj);
            }
            i = i2;
        }
    }

    private final void buildUi(final CheckoutRewardsAndDiscounts checkoutRewardsAndDiscounts) {
        String strConcat = "rewards_and_discounts_".concat(checkoutRewardsAndDiscounts.f10582a);
        ArrayList arrayList = checkoutRewardsAndDiscounts.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((CheckoutRewardsAndDiscount) it.next()).hashCode()));
        }
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutSummaryEpoxyController.buildUi.19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    CheckoutSummaryListener checkoutSummaryListener = this.checkoutSummaryListener;
                    composer.o(5004770);
                    boolean zI = composer.I(checkoutSummaryListener);
                    Object objG = composer.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        objG = new CheckoutSummaryEpoxyController$buildUi$19$1$1(1, checkoutSummaryListener, CheckoutSummaryListener.class, "onClickRewardsAndDiscountTile", "onClickRewardsAndDiscountTile(Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount;)V", 0);
                        composer.A(objG);
                    }
                    composer.l();
                    CheckoutRewardsAndDiscountsUiKt.b(checkoutRewardsAndDiscounts, (Function1) ((KFunction) objG), composer, 0);
                }
                return Unit.f24250a;
            }
        }, true, 1952058730);
        ComposeEpoxyModel composeEpoxyModel = new ComposeEpoxyModel(Arrays.copyOf(new Object[]{arrayList2}, 1), composableLambdaImpl);
        composeEpoxyModel.p(strConcat);
        add(composeEpoxyModel);
    }

    private final void buildUi(final CheckoutPromotionCode checkoutPromotionCode) {
        if (this.isRewardsUpliftEnabled) {
            String str = checkoutPromotionCode.f10577a;
            EpoxyModel<?> composeEpoxyModel = new ComposeEpoxyModel(Arrays.copyOf(new Object[0], 0), new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutSummaryEpoxyController.buildUi.15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final CheckoutPromotionCode checkoutPromotionCode2 = checkoutPromotionCode;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-1707871442, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutSummaryEpoxyController.buildUi.15.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    CheckoutSectionTitleKt.a(checkoutPromotionCode2.f10577a, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -1868461450));
            composeEpoxyModel.p(str);
            add(composeEpoxyModel);
        }
        ItemCheckoutPromotionCode_ itemCheckoutPromotionCode_ = new ItemCheckoutPromotionCode_();
        itemCheckoutPromotionCode_.L("promotion_code_".concat(checkoutPromotionCode.f10577a));
        itemCheckoutPromotionCode_.t();
        itemCheckoutPromotionCode_.n = checkoutPromotionCode;
        CheckoutSummaryListener checkoutSummaryListener = this.checkoutSummaryListener;
        itemCheckoutPromotionCode_.t();
        itemCheckoutPromotionCode_.o = checkoutSummaryListener;
        add(itemCheckoutPromotionCode_);
    }

    private final void buildUi(CheckoutSummaryBillingAddress checkoutSummaryBillingAddress, int i) {
        ItemCheckoutSummaryBillingAddressBindingModel_ itemCheckoutSummaryBillingAddressBindingModel_ = new ItemCheckoutSummaryBillingAddressBindingModel_();
        itemCheckoutSummaryBillingAddressBindingModel_.M("billing_address_" + i);
        itemCheckoutSummaryBillingAddressBindingModel_.t();
        itemCheckoutSummaryBillingAddressBindingModel_.n = checkoutSummaryBillingAddress;
        add(itemCheckoutSummaryBillingAddressBindingModel_);
    }

    private final void buildUi(CheckoutSummaryBillingAddressEmpty checkoutSummaryBillingAddressEmpty, int i) {
        BillingAddressEmptyEpoxyModel_ billingAddressEmptyEpoxyModel_ = new BillingAddressEmptyEpoxyModel_();
        billingAddressEmptyEpoxyModel_.K("billing_address_empty_" + i);
        billingAddressEmptyEpoxyModel_.t();
        billingAddressEmptyEpoxyModel_.n = checkoutSummaryBillingAddressEmpty;
        c cVar = new c(4, this, checkoutSummaryBillingAddressEmpty);
        billingAddressEmptyEpoxyModel_.t();
        billingAddressEmptyEpoxyModel_.o = cVar;
        add(billingAddressEmptyEpoxyModel_);
    }

    private final void buildUi(CheckoutSummaryRewardsUnregistered checkoutSummaryRewardsUnregistered, int i) {
        ItemCheckoutRewardsUnregisteredBindingModel_ itemCheckoutRewardsUnregisteredBindingModel_ = new ItemCheckoutRewardsUnregisteredBindingModel_();
        itemCheckoutRewardsUnregisteredBindingModel_.M("rewards_unregistered_" + i);
        itemCheckoutRewardsUnregisteredBindingModel_.t();
        itemCheckoutRewardsUnregisteredBindingModel_.n = checkoutSummaryRewardsUnregistered;
        CheckoutSummaryListener checkoutSummaryListener = this.checkoutSummaryListener;
        itemCheckoutRewardsUnregisteredBindingModel_.t();
        itemCheckoutRewardsUnregisteredBindingModel_.o = checkoutSummaryListener;
        add(itemCheckoutRewardsUnregisteredBindingModel_);
    }

    private final void buildUi(CheckoutSummaryRewardsSegment.Registered registered, int i) {
        ItemCheckoutRewardsRegisteredBindingModel_ itemCheckoutRewardsRegisteredBindingModel_ = new ItemCheckoutRewardsRegisteredBindingModel_();
        itemCheckoutRewardsRegisteredBindingModel_.M("rewards_registered_" + i);
        itemCheckoutRewardsRegisteredBindingModel_.t();
        itemCheckoutRewardsRegisteredBindingModel_.n = registered;
        add(itemCheckoutRewardsRegisteredBindingModel_);
    }

    private final void buildUi(CheckoutSummaryRewardsSegment.RegisteredRedeemable registeredRedeemable, int i) {
        ItemCheckoutRewardsRegisteredRedeemableBindingModel_ itemCheckoutRewardsRegisteredRedeemableBindingModel_ = new ItemCheckoutRewardsRegisteredRedeemableBindingModel_();
        itemCheckoutRewardsRegisteredRedeemableBindingModel_.M("rewards_registered_redeemable_" + i);
        itemCheckoutRewardsRegisteredRedeemableBindingModel_.t();
        itemCheckoutRewardsRegisteredRedeemableBindingModel_.n = registeredRedeemable;
        CheckoutSummaryListener checkoutSummaryListener = this.checkoutSummaryListener;
        itemCheckoutRewardsRegisteredRedeemableBindingModel_.t();
        itemCheckoutRewardsRegisteredRedeemableBindingModel_.o = checkoutSummaryListener;
        add(itemCheckoutRewardsRegisteredRedeemableBindingModel_);
    }

    private final void buildUi(CheckoutTermsConditions checkoutTermsConditions, int i) {
        TermsAndConditionsEpoxyModel_ termsAndConditionsEpoxyModel_ = new TermsAndConditionsEpoxyModel_();
        termsAndConditionsEpoxyModel_.K("terms_and_conditions_" + i);
        termsAndConditionsEpoxyModel_.t();
        termsAndConditionsEpoxyModel_.n = checkoutTermsConditions;
        d dVar = new d(this, 16);
        termsAndConditionsEpoxyModel_.t();
        termsAndConditionsEpoxyModel_.o = dVar;
        add(termsAndConditionsEpoxyModel_);
    }

    private final void buildUi(OrderAddresses orderAddresses) {
        ItemCheckoutSectionTitleBindingModel_ itemCheckoutSectionTitleBindingModel_ = new ItemCheckoutSectionTitleBindingModel_();
        String str = orderAddresses.f10644a;
        InsetBannerApiData insetBannerApiData = orderAddresses.c;
        itemCheckoutSectionTitleBindingModel_.M("section_header_".concat(str));
        String str2 = orderAddresses.f10644a;
        itemCheckoutSectionTitleBindingModel_.t();
        itemCheckoutSectionTitleBindingModel_.n = str2;
        add(itemCheckoutSectionTitleBindingModel_);
        for (OrderAddress orderAddress : orderAddresses.b) {
            if (orderAddress instanceof OrderAddressGrocery) {
                buildUi((OrderAddressGrocery) orderAddress, insetBannerApiData);
            } else {
                if (!(orderAddress instanceof OrderAddressMarket)) {
                    throw new NoWhenBranchMatchedException();
                }
                buildUi((OrderAddressMarket) orderAddress, insetBannerApiData);
            }
        }
    }

    private final void buildUi(OrderAddressGrocery orderAddressGrocery, InsetBannerApiData insetBannerApiData) {
        ItemCheckoutOrderAddressBindingModel_ itemCheckoutOrderAddressBindingModel_ = new ItemCheckoutOrderAddressBindingModel_();
        itemCheckoutOrderAddressBindingModel_.M("order_address_grocery_".concat(orderAddressGrocery.f10642a));
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.n = orderAddressGrocery;
        String str = orderAddressGrocery.d;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.p = str;
        InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.o = uiModel;
        add(itemCheckoutOrderAddressBindingModel_);
    }

    private final void buildUi(OrderAddressMarket orderAddressMarket, InsetBannerApiData insetBannerApiData) {
        ItemCheckoutOrderAddressBindingModel_ itemCheckoutOrderAddressBindingModel_ = new ItemCheckoutOrderAddressBindingModel_();
        itemCheckoutOrderAddressBindingModel_.M("order_address_market_".concat(orderAddressMarket.f10643a));
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.n = orderAddressMarket;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.p = null;
        InsetBannerData uiModel = insetBannerApiData != null ? InsetBannerApiDataExtKt.toUiModel(insetBannerApiData) : null;
        itemCheckoutOrderAddressBindingModel_.t();
        itemCheckoutOrderAddressBindingModel_.o = uiModel;
        add(itemCheckoutOrderAddressBindingModel_);
        for (MarketSellerInfo marketSellerInfo : orderAddressMarket.d) {
            ItemCheckoutOrderAddressMarketSellerBindingModel_ itemCheckoutOrderAddressMarketSellerBindingModel_ = new ItemCheckoutOrderAddressMarketSellerBindingModel_();
            itemCheckoutOrderAddressMarketSellerBindingModel_.M("order_address_seller_".concat(marketSellerInfo.f10622a));
            itemCheckoutOrderAddressMarketSellerBindingModel_.t();
            itemCheckoutOrderAddressMarketSellerBindingModel_.n = marketSellerInfo;
            add(itemCheckoutOrderAddressMarketSellerBindingModel_);
        }
    }

    private final void buildUi(OrderSummaryTotalDetails orderSummaryTotalDetails) {
        ItemCheckoutSectionTitleBindingModel_ itemCheckoutSectionTitleBindingModel_ = new ItemCheckoutSectionTitleBindingModel_();
        itemCheckoutSectionTitleBindingModel_.M("section_header_" + orderSummaryTotalDetails.getTitle());
        String title = orderSummaryTotalDetails.getTitle();
        itemCheckoutSectionTitleBindingModel_.t();
        itemCheckoutSectionTitleBindingModel_.n = title;
        add(itemCheckoutSectionTitleBindingModel_);
        int i = 0;
        for (Object obj : orderSummaryTotalDetails.getSections()) {
            int i2 = i + 1;
            if (i >= 0) {
                for (OrderTotalDetailsSection orderTotalDetailsSection : (List) obj) {
                    OrderTotalSectionEpoxyModel_ orderTotalSectionEpoxyModel_ = new OrderTotalSectionEpoxyModel_();
                    orderTotalSectionEpoxyModel_.M("details_" + orderTotalDetailsSection.hashCode());
                    orderTotalSectionEpoxyModel_.t();
                    orderTotalSectionEpoxyModel_.n = orderTotalDetailsSection;
                    CheckoutSummaryListener checkoutSummaryListener = this.checkoutSummaryListener;
                    orderTotalSectionEpoxyModel_.t();
                    orderTotalSectionEpoxyModel_.o = checkoutSummaryListener;
                    add(orderTotalSectionEpoxyModel_);
                }
                if (i < CollectionsKt.I(orderSummaryTotalDetails.getSections())) {
                    EpoxyModel<?> epoxyModel = SectionDividerEpoxyModel.Solid.p;
                    epoxyModel.p("divider_section_" + orderSummaryTotalDetails.getTitle() + "_" + i);
                    add(epoxyModel);
                }
                i = i2;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
    }
}
