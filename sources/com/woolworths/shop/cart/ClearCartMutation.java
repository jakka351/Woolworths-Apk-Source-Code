package com.woolworths.shop.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.cart.data.common.fragment.Cart;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.ClearCartMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/ClearCartMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/cart/ClearCartMutation$Data;", "Data", "ClearCart", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ClearCartMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21527a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ClearCartMutation$ClearCart;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClearCart {

        /* renamed from: a, reason: collision with root package name */
        public final String f21528a;
        public final Cart b;

        public ClearCart(String str, Cart cart) {
            this.f21528a = str;
            this.b = cart;
        }

        /* renamed from: a, reason: from getter */
        public final Cart getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClearCart)) {
                return false;
            }
            ClearCart clearCart = (ClearCart) obj;
            return Intrinsics.c(this.f21528a, clearCart.f21528a) && Intrinsics.c(this.b, clearCart.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21528a.hashCode() * 31);
        }

        public final String toString() {
            return "ClearCart(__typename=" + this.f21528a + ", cart=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/ClearCartMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ClearCartMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ClearCart f21529a;

        public Data(ClearCart clearCart) {
            this.f21529a = clearCart;
        }

        /* renamed from: a, reason: from getter */
        public final ClearCart getF21529a() {
            return this.f21529a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21529a, ((Data) obj).f21529a);
        }

        public final int hashCode() {
            return this.f21529a.hashCode();
        }

        public final String toString() {
            return "Data(clearCart=" + this.f21529a + ")";
        }
    }

    public ClearCartMutation(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f21527a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ClearCartMutation_ResponseAdapter.Data.f21589a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ClearCart($isSpecialSavingLabelsEnabled: Boolean!, $everydayMarketFreightRePlatformEnabled: Boolean!, $isCartBundlesEnabled: Boolean!, $isPanelMarkdownEnabled: Boolean!, $isQuickAddEnabled: Boolean!) { clearCart { __typename ...cart } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment cartProductCard on CartProductCard { productId title imageUrl quantity isAvailable unitPrice totalPrice quantityInfo { minimum maximum increment defaultValue: default unit } disclaimer { displayType message bannerTitle: title } marketplace { sellerName brandName } saving @include(if: $isSpecialSavingLabelsEnabled) wasPrice @include(if: $isSpecialSavingLabelsEnabled) memberPricePromotionInfo @skip(if: $isQuickAddEnabled) { title subtitle isApplied } singleMemberPricePromotionInfo @include(if: $isQuickAddEnabled) { title subtitle isApplied } multiBuyPromotionInfo @skip(if: $isQuickAddEnabled) { title subtitle isApplied } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } availableLimit bundlePromotionInfo @include(if: $isCartBundlesEnabled) { title isApplied bundleType isShowBanner } buyMoreSaveMorePromotionInfo @include(if: $isQuickAddEnabled) { offerId title action isApplied type clickAnalytics { __typename ...analyticsFields } } }  fragment cartProductCategory on CartProductCategory { title }  fragment cart on CartResponse { totalProducts header { subtotalInclDelivery savingsOnCart { label amount } cartCheckoutBtn { label action style enabled } subtitle } rewardsInfo { imageUrl title } cartSections { __typename ... on CouponBanner { couponBannerColorTheme couponBannerCouponCode couponBannerDescription couponBannerImage couponBannerMinimumSpend couponBannerTermsAndConditions { url title } } ... on InlineMessage { displayType message } ... on CartAvailableProductSection { title sectionHeader { title imageUrl } products { __typename ... on CartProductCard { __typename ...cartProductCard } ... on CartProductCategory { __typename ...cartProductCategory } } } ... on CartPromotionSection { promotionSectionTitle: title promotionId info { active imageUrl description tooltipMessage { title message } } products { __typename ... on CartProductCard { __typename ...cartProductCard } ... on CartProductCategory { __typename ...cartProductCategory } } } ... on CartMarketProductSection { sectionHeader { title imageUrl } cartTracker @skip(if: $everydayMarketFreightRePlatformEnabled) { title freeShippingPercentage description } shippingMessageBanner { __typename ... on PromotionBanner { banner { displayType message iconUrl bannerTitle: title action { placement type label url } } promotionContent { __typename ... on PromotionMarkdownContent { promotionMarkdownTitle promotionMarkdownText } } } } sellerGroups { sellerName dispatchNote products { __typename ... on CartProductCard { __typename ...cartProductCard } ... on CartProductCategory { __typename ...cartProductCategory } } } } ... on ImageTextBanner { imageUrl message } ... on CartBanner { banner { displayType message iconUrl bannerTitle: title analytics { eventLabel eventDescription eventValue } action { placement type label url } } type } } footer { button { label action style enabled } totalLabel totalAmount totalDescription panelMarkdown @include(if: $isPanelMarkdownEnabled) savings } requiresProductReview requiresFulfilmentWindow requiresHaveYouForgotten requiresFulfilmentAddress analytics { __typename ...analyticsFields } requiredAlert { title message buttonTitle analytics { __typename ...analyticsFields } } cartProductQuantities { productId quantity } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearCartMutation)) {
            return false;
        }
        ClearCartMutation clearCartMutation = (ClearCartMutation) obj;
        return this.f21527a == clearCartMutation.f21527a && this.b == clearCartMutation.b && this.c == clearCartMutation.c && this.d == clearCartMutation.d && this.e == clearCartMutation.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.e(b.e(b.e(Boolean.hashCode(this.f21527a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c8cc5e5b798326e50de6c4193de2495b03f71556042d16e8e94da40175dd69d6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ClearCart";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isSpecialSavingLabelsEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f21527a, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "everydayMarketFreightRePlatformEnabled");
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isCartBundlesEnabled");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPanelMarkdownEnabled");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isQuickAddEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sbV = b.v("ClearCartMutation(isSpecialSavingLabelsEnabled=", ", everydayMarketFreightRePlatformEnabled=", ", isCartBundlesEnabled=", this.f21527a, this.b);
        a.D(sbV, this.c, ", isPanelMarkdownEnabled=", this.d, ", isQuickAddEnabled=");
        return YU.a.k(")", sbV, this.e);
    }
}
