package com.woolworths.shop.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantitiesInput;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantityFailedReason;
import au.com.woolworths.shop.graphql.type.adapter.UpdateCartProductQuantitiesInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.UpdateCartProductQuantitiesMutation_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Data;", "Data", "UpdateCartProductQuantities", "UpdatedProductQuantity", "Error", "Cart", "ErrorPrompt", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateCartProductQuantitiesMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final UpdateCartProductQuantitiesInput f21559a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Cart;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cart {

        /* renamed from: a, reason: collision with root package name */
        public final String f21560a;
        public final au.com.woolworths.shop.cart.data.common.fragment.Cart b;

        public Cart(String str, au.com.woolworths.shop.cart.data.common.fragment.Cart cart) {
            this.f21560a = str;
            this.b = cart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cart)) {
                return false;
            }
            Cart cart = (Cart) obj;
            return Intrinsics.c(this.f21560a, cart.f21560a) && Intrinsics.c(this.b, cart.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21560a.hashCode() * 31);
        }

        public final String toString() {
            return "Cart(__typename=" + this.f21560a + ", cart=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartProductQuantities f21561a;

        public Data(UpdateCartProductQuantities updateCartProductQuantities) {
            this.f21561a = updateCartProductQuantities;
        }

        /* renamed from: a, reason: from getter */
        public final UpdateCartProductQuantities getF21561a() {
            return this.f21561a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21561a, ((Data) obj).f21561a);
        }

        public final int hashCode() {
            return this.f21561a.hashCode();
        }

        public final String toString() {
            return "Data(updateCartProductQuantities=" + this.f21561a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$Error;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateCartProductQuantityFailedReason f21562a;
        public final String b;

        public Error(UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason, String str) {
            this.f21562a = updateCartProductQuantityFailedReason;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f21562a == error.f21562a && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21562a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(reason=" + this.f21562a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$ErrorPrompt;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorPrompt {

        /* renamed from: a, reason: collision with root package name */
        public final String f21563a;
        public final Prompts b;

        public ErrorPrompt(String str, Prompts prompts) {
            this.f21563a = str;
            this.b = prompts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorPrompt)) {
                return false;
            }
            ErrorPrompt errorPrompt = (ErrorPrompt) obj;
            return Intrinsics.c(this.f21563a, errorPrompt.f21563a) && Intrinsics.c(this.b, errorPrompt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21563a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorPrompt(__typename=" + this.f21563a + ", prompts=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$UpdateCartProductQuantities;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCartProductQuantities {

        /* renamed from: a, reason: collision with root package name */
        public final int f21564a;
        public final int b;
        public final ArrayList c;
        public final Cart d;
        public final ErrorPrompt e;

        public UpdateCartProductQuantities(int i, int i2, ArrayList arrayList, Cart cart, ErrorPrompt errorPrompt) {
            this.f21564a = i;
            this.b = i2;
            this.c = arrayList;
            this.d = cart;
            this.e = errorPrompt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCartProductQuantities)) {
                return false;
            }
            UpdateCartProductQuantities updateCartProductQuantities = (UpdateCartProductQuantities) obj;
            return this.f21564a == updateCartProductQuantities.f21564a && this.b == updateCartProductQuantities.b && this.c.equals(updateCartProductQuantities.c) && this.d.equals(updateCartProductQuantities.d) && Intrinsics.c(this.e, updateCartProductQuantities.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + a.b(b.a(this.b, Integer.hashCode(this.f21564a) * 31, 31), 31, this.c)) * 31;
            ErrorPrompt errorPrompt = this.e;
            return iHashCode + (errorPrompt == null ? 0 : errorPrompt.hashCode());
        }

        public final String toString() {
            StringBuilder sbQ = YU.a.q(this.f21564a, this.b, "UpdateCartProductQuantities(productCount=", ", totalProductCount=", ", updatedProductQuantities=");
            sbQ.append(this.c);
            sbQ.append(", cart=");
            sbQ.append(this.d);
            sbQ.append(", errorPrompt=");
            sbQ.append(this.e);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/UpdateCartProductQuantitiesMutation$UpdatedProductQuantity;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedProductQuantity {

        /* renamed from: a, reason: collision with root package name */
        public final String f21565a;
        public final double b;
        public final boolean c;
        public final Error d;
        public final Double e;
        public final String f;
        public final CartProductQuantityAction g;

        public UpdatedProductQuantity(String str, double d, boolean z, Error error, Double d2, String str2, CartProductQuantityAction cartProductQuantityAction) {
            this.f21565a = str;
            this.b = d;
            this.c = z;
            this.d = error;
            this.e = d2;
            this.f = str2;
            this.g = cartProductQuantityAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatedProductQuantity)) {
                return false;
            }
            UpdatedProductQuantity updatedProductQuantity = (UpdatedProductQuantity) obj;
            return Intrinsics.c(this.f21565a, updatedProductQuantity.f21565a) && Double.compare(this.b, updatedProductQuantity.b) == 0 && this.c == updatedProductQuantity.c && Intrinsics.c(this.d, updatedProductQuantity.d) && Intrinsics.c(this.e, updatedProductQuantity.e) && Intrinsics.c(this.f, updatedProductQuantity.f) && this.g == updatedProductQuantity.g;
        }

        public final int hashCode() {
            int iE = b.e(android.support.v4.media.session.a.a(this.b, this.f21565a.hashCode() * 31, 31), 31, this.c);
            Error error = this.d;
            int iHashCode = (iE + (error == null ? 0 : error.hashCode())) * 31;
            Double d = this.e;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.f;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            CartProductQuantityAction cartProductQuantityAction = this.g;
            return iHashCode3 + (cartProductQuantityAction != null ? cartProductQuantityAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "UpdatedProductQuantity(productId=", this.f21565a, ", updatedQuantity=");
            sbR.append(", success=");
            sbR.append(this.c);
            sbR.append(", error=");
            sbR.append(this.d);
            sbR.append(", deltaQuantity=");
            sbR.append(this.e);
            sbR.append(", deltaSubtotal=");
            sbR.append(this.f);
            sbR.append(", productQuantityAction=");
            sbR.append(this.g);
            sbR.append(")");
            return sbR.toString();
        }
    }

    public UpdateCartProductQuantitiesMutation(UpdateCartProductQuantitiesInput updateCartProductQuantitiesInput, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f21559a = updateCartProductQuantitiesInput;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateCartProductQuantitiesMutation_ResponseAdapter.Data.f21616a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateCartProductQuantities($input: UpdateCartProductQuantitiesInput!, $isSpecialSavingLabelsEnabled: Boolean!, $everydayMarketFreightRePlatformEnabled: Boolean!, $isCartBundlesEnabled: Boolean!, $isPanelMarkdownEnabled: Boolean!, $isQuickAddEnabled: Boolean!, $isPromptEnabled: Boolean!) { updateCartProductQuantities(updateCartProductQuantitiesInput: $input) { productCount totalProductCount updatedProductQuantities { productId updatedQuantity success error { reason message } deltaQuantity deltaSubtotal productQuantityAction } cart { __typename ...cart } errorPrompt @include(if: $isPromptEnabled) { __typename ...prompts } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment cartProductCard on CartProductCard { productId title imageUrl quantity isAvailable unitPrice totalPrice quantityInfo { minimum maximum increment defaultValue: default unit } disclaimer { displayType message bannerTitle: title } marketplace { sellerName brandName } saving @include(if: $isSpecialSavingLabelsEnabled) wasPrice @include(if: $isSpecialSavingLabelsEnabled) memberPricePromotionInfo @skip(if: $isQuickAddEnabled) { title subtitle isApplied } singleMemberPricePromotionInfo @include(if: $isQuickAddEnabled) { title subtitle isApplied } multiBuyPromotionInfo @skip(if: $isQuickAddEnabled) { title subtitle isApplied } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } availableLimit bundlePromotionInfo @include(if: $isCartBundlesEnabled) { title isApplied bundleType isShowBanner } buyMoreSaveMorePromotionInfo @include(if: $isQuickAddEnabled) { offerId title action isApplied type clickAnalytics { __typename ...analyticsFields } } }  fragment cartProductCategory on CartProductCategory { title }  fragment cart on CartResponse { totalProducts header { subtotalInclDelivery savingsOnCart { label amount } cartCheckoutBtn { label action style enabled } subtitle } rewardsInfo { imageUrl title } cartSections { __typename ... on CouponBanner { couponBannerColorTheme couponBannerCouponCode couponBannerDescription couponBannerImage couponBannerMinimumSpend couponBannerTermsAndConditions { url title } } ... on InlineMessage { displayType message } ... on CartAvailableProductSection { title sectionHeader { title imageUrl } products { __typename ... on CartProductCard { __typename ...cartProductCard } ... on CartProductCategory { __typename ...cartProductCategory } } } ... on CartPromotionSection { promotionSectionTitle: title promotionId info { active imageUrl description tooltipMessage { title message } } products { __typename ... on CartProductCard { __typename ...cartProductCard } ... on CartProductCategory { __typename ...cartProductCategory } } } ... on CartMarketProductSection { sectionHeader { title imageUrl } cartTracker @skip(if: $everydayMarketFreightRePlatformEnabled) { title freeShippingPercentage description } shippingMessageBanner { __typename ... on PromotionBanner { banner { displayType message iconUrl bannerTitle: title action { placement type label url } } promotionContent { __typename ... on PromotionMarkdownContent { promotionMarkdownTitle promotionMarkdownText } } } } sellerGroups { sellerName dispatchNote products { __typename ... on CartProductCard { __typename ...cartProductCard } ... on CartProductCategory { __typename ...cartProductCategory } } } } ... on ImageTextBanner { imageUrl message } ... on CartBanner { banner { displayType message iconUrl bannerTitle: title analytics { eventLabel eventDescription eventValue } action { placement type label url } } type } } footer { button { label action style enabled } totalLabel totalAmount totalDescription panelMarkdown @include(if: $isPanelMarkdownEnabled) savings } requiresProductReview requiresFulfilmentWindow requiresHaveYouForgotten requiresFulfilmentAddress analytics { __typename ...analyticsFields } requiredAlert { title message buttonTitle analytics { __typename ...analyticsFields } } cartProductQuantities { productId quantity } }  fragment prompts on Prompt { __typename ... on BottomSheet { bottomSheetTitle bottomSheetBody bottomSheetButtons { coreButtonStyle coreButtonLabel coreButtonAction { type action } coreButtonEnabled } } ... on PromptAlert { alertTitle alertBody alertPrimaryCta { label action { type action } } alertSecondaryCta { label action { type action } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCartProductQuantitiesMutation)) {
            return false;
        }
        UpdateCartProductQuantitiesMutation updateCartProductQuantitiesMutation = (UpdateCartProductQuantitiesMutation) obj;
        return Intrinsics.c(this.f21559a, updateCartProductQuantitiesMutation.f21559a) && this.b == updateCartProductQuantitiesMutation.b && this.c == updateCartProductQuantitiesMutation.c && this.d == updateCartProductQuantitiesMutation.d && this.e == updateCartProductQuantitiesMutation.e && this.f == updateCartProductQuantitiesMutation.f && this.g == updateCartProductQuantitiesMutation.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + b.e(b.e(b.e(b.e(b.e(this.f21559a.f11992a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "2f4e12d8f272cf95631493e98dbd3def3a8c2436155d4abc3f32a703fa877681";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateCartProductQuantities";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(UpdateCartProductQuantitiesInput_InputAdapter.f12134a, false).toJson(jsonWriter, customScalarAdapters, this.f21559a);
        jsonWriter.F1("isSpecialSavingLabelsEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "everydayMarketFreightRePlatformEnabled");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isCartBundlesEnabled");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPanelMarkdownEnabled");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isQuickAddEnabled");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPromptEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateCartProductQuantitiesMutation(input=");
        sb.append(this.f21559a);
        sb.append(", isSpecialSavingLabelsEnabled=");
        sb.append(this.b);
        sb.append(", everydayMarketFreightRePlatformEnabled=");
        au.com.woolworths.android.onesite.a.D(sb, this.c, ", isCartBundlesEnabled=", this.d, ", isPanelMarkdownEnabled=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", isQuickAddEnabled=", this.f, ", isPromptEnabled=");
        return YU.a.k(")", sb, this.g);
    }
}
