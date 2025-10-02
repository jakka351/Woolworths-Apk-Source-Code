package com.woolworths.shop.buyagain;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import au.com.woolworths.shop.graphql.type.adapter.ChipsProductListInputArgs_InputAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.buyagain.adapter.BuyAgainProductListQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Data;", "Data", "BuyAgainProductList", "Header", "Footer", "SaveToListBtn", "AddToCartBtn", "BuyAgainProducts", "ProductsFeed", "OnProductCard", "Chip", "Text", "FilterStatus", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuyAgainProductListQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21494a;
    public final ShoppingModeId b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final boolean h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$AddToCartBtn;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToCartBtn {

        /* renamed from: a, reason: collision with root package name */
        public final String f21495a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public AddToCartBtn(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f21495a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddToCartBtn)) {
                return false;
            }
            AddToCartBtn addToCartBtn = (AddToCartBtn) obj;
            return Intrinsics.c(this.f21495a, addToCartBtn.f21495a) && Intrinsics.c(this.b, addToCartBtn.b) && this.c == addToCartBtn.c && this.d == addToCartBtn.d;
        }

        public final int hashCode() {
            int iHashCode = this.f21495a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return a.n(YU.a.v("AddToCartBtn(label=", this.f21495a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$BuyAgainProductList;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BuyAgainProductList {

        /* renamed from: a, reason: collision with root package name */
        public final Header f21496a;
        public final Footer b;
        public final BuyAgainProducts c;
        public final FilterStatus d;

        public BuyAgainProductList(Header header, Footer footer, BuyAgainProducts buyAgainProducts, FilterStatus filterStatus) {
            this.f21496a = header;
            this.b = footer;
            this.c = buyAgainProducts;
            this.d = filterStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyAgainProductList)) {
                return false;
            }
            BuyAgainProductList buyAgainProductList = (BuyAgainProductList) obj;
            return Intrinsics.c(this.f21496a, buyAgainProductList.f21496a) && Intrinsics.c(this.b, buyAgainProductList.b) && Intrinsics.c(this.c, buyAgainProductList.c) && Intrinsics.c(this.d, buyAgainProductList.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f21496a.f21502a.hashCode() * 31)) * 31)) * 31;
            FilterStatus filterStatus = this.d;
            return iHashCode + (filterStatus == null ? 0 : filterStatus.hashCode());
        }

        public final String toString() {
            return "BuyAgainProductList(header=" + this.f21496a + ", footer=" + this.b + ", buyAgainProducts=" + this.c + ", filterStatus=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$BuyAgainProducts;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BuyAgainProducts {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f21497a;
        public final Integer b;
        public final ArrayList c;
        public final List d;

        public BuyAgainProducts(Integer num, Integer num2, ArrayList arrayList, List list) {
            this.f21497a = num;
            this.b = num2;
            this.c = arrayList;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyAgainProducts)) {
                return false;
            }
            BuyAgainProducts buyAgainProducts = (BuyAgainProducts) obj;
            return Intrinsics.c(this.f21497a, buyAgainProducts.f21497a) && Intrinsics.c(this.b, buyAgainProducts.b) && this.c.equals(buyAgainProducts.c) && Intrinsics.c(this.d, buyAgainProducts.d);
        }

        public final int hashCode() {
            Integer num = this.f21497a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c);
            List list = this.d;
            return iB + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = d.v("BuyAgainProducts(totalNumberOfProducts=", this.f21497a, ", nextPage=", this.b, ", productsFeed=");
            sbV.append(this.c);
            sbV.append(", chips=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Chip;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Chip {

        /* renamed from: a, reason: collision with root package name */
        public final String f21498a;
        public final boolean b;
        public final Text c;
        public final Integer d;

        public Chip(String str, boolean z, Text text, Integer num) {
            this.f21498a = str;
            this.b = z;
            this.c = text;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return Intrinsics.c(this.f21498a, chip.f21498a) && this.b == chip.b && Intrinsics.c(this.c, chip.c) && Intrinsics.c(this.d, chip.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.e(this.f21498a.hashCode() * 31, 31, this.b)) * 31;
            Integer num = this.d;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("Chip(id=", this.f21498a, ", isSelected=", ", text=", this.b);
            sbQ.append(this.c);
            sbQ.append(", count=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final BuyAgainProductList f21499a;

        public Data(BuyAgainProductList buyAgainProductList) {
            this.f21499a = buyAgainProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21499a, ((Data) obj).f21499a);
        }

        public final int hashCode() {
            return this.f21499a.hashCode();
        }

        public final String toString() {
            return "Data(buyAgainProductList=" + this.f21499a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$FilterStatus;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FilterStatus {

        /* renamed from: a, reason: collision with root package name */
        public final String f21500a;
        public final ArrayList b;

        public FilterStatus(String str, ArrayList arrayList) {
            this.f21500a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterStatus)) {
                return false;
            }
            FilterStatus filterStatus = (FilterStatus) obj;
            return Intrinsics.c(this.f21500a, filterStatus.f21500a) && this.b.equals(filterStatus.b);
        }

        public final int hashCode() {
            String str = this.f21500a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("FilterStatus(message=", this.f21500a, ", revertedFilterChipIds=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Footer;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final SaveToListBtn f21501a;
        public final AddToCartBtn b;

        public Footer(SaveToListBtn saveToListBtn, AddToCartBtn addToCartBtn) {
            this.f21501a = saveToListBtn;
            this.b = addToCartBtn;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f21501a, footer.f21501a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            SaveToListBtn saveToListBtn = this.f21501a;
            int iHashCode = (saveToListBtn == null ? 0 : saveToListBtn.hashCode()) * 31;
            AddToCartBtn addToCartBtn = this.b;
            return iHashCode + (addToCartBtn != null ? addToCartBtn.hashCode() : 0);
        }

        public final String toString() {
            return "Footer(saveToListBtn=" + this.f21501a + ", addToCartBtn=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Header;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f21502a;

        public Header(String str) {
            this.f21502a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Header) && Intrinsics.c(this.f21502a, ((Header) obj).f21502a);
        }

        public final int hashCode() {
            return this.f21502a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Header(totalProductsText=", this.f21502a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$OnProductCard;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21503a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21503a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard)) {
                return false;
            }
            OnProductCard onProductCard = (OnProductCard) obj;
            return Intrinsics.c(this.f21503a, onProductCard.f21503a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21503a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21503a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$ProductsFeed;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f21504a;
        public final OnProductCard b;

        public ProductsFeed(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f21504a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) obj;
            return Intrinsics.c(this.f21504a, productsFeed.f21504a) && Intrinsics.c(this.b, productsFeed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21504a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "ProductsFeed(__typename=" + this.f21504a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$SaveToListBtn;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToListBtn {

        /* renamed from: a, reason: collision with root package name */
        public final String f21505a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public SaveToListBtn(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f21505a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveToListBtn)) {
                return false;
            }
            SaveToListBtn saveToListBtn = (SaveToListBtn) obj;
            return Intrinsics.c(this.f21505a, saveToListBtn.f21505a) && Intrinsics.c(this.b, saveToListBtn.b) && this.c == saveToListBtn.c && this.d == saveToListBtn.d;
        }

        public final int hashCode() {
            int iHashCode = this.f21505a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return a.n(YU.a.v("SaveToListBtn(label=", this.f21505a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/buyagain/BuyAgainProductListQuery$Text;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        /* renamed from: a, reason: collision with root package name */
        public final String f21506a;
        public final String b;

        public Text(String str, String str2) {
            this.f21506a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.c(this.f21506a, text.f21506a) && Intrinsics.c(this.b, text.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21506a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Text(text=", this.f21506a, ", altText=", this.b, ")");
        }
    }

    public BuyAgainProductListQuery(Optional.Present present, ShoppingModeId shoppingModeId, Optional.Present present2, Optional optional, boolean z) {
        this.f21494a = present;
        this.b = shoppingModeId;
        this.c = present2;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.d = absent;
        this.e = absent;
        this.f = absent;
        this.g = optional;
        this.h = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(BuyAgainProductListQuery_ResponseAdapter.Data.f21511a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query BuyAgainProductList($storeId: String, $shoppingMode: ShoppingModeId!, $chips: ChipsProductListInputArgs, $includeAvailabilityInfoStatus: Boolean = false , $includeProductAvailabilityStates: Boolean = false , $includeOfferMinimumSpend: Boolean = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { buyAgainProductList(storeId: $storeId, shoppingMode: $shoppingMode, chips: $chips) { header { totalProductsText } footer { saveToListBtn { label action style enabled } addToCartBtn { label action style enabled } } buyAgainProducts { totalNumberOfProducts nextPage productsFeed { __typename ... on ProductCard { __typename ...productCard } } chips { id isSelected text { text altText } count } } filterStatus { message revertedFilterChipIds } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyAgainProductListQuery)) {
            return false;
        }
        BuyAgainProductListQuery buyAgainProductListQuery = (BuyAgainProductListQuery) obj;
        return Intrinsics.c(this.f21494a, buyAgainProductListQuery.f21494a) && this.b == buyAgainProductListQuery.b && Intrinsics.c(this.c, buyAgainProductListQuery.c) && Intrinsics.c(this.d, buyAgainProductListQuery.d) && Intrinsics.c(this.e, buyAgainProductListQuery.e) && Intrinsics.c(this.f, buyAgainProductListQuery.f) && Intrinsics.c(this.g, buyAgainProductListQuery.g) && this.h == buyAgainProductListQuery.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, (this.b.hashCode() + (this.f21494a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f826793b89c2c04b68de406faf1c7476ee9bc173ce79e3b2596dff840dd8a655";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "BuyAgainProductList";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21494a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("shoppingMode");
        ShoppingModeId_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("chips");
            Adapters.d(Adapters.b(Adapters.c(ChipsProductListInputArgs_InputAdapter.f12054a, false))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional6 = this.g;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuyAgainProductListQuery(storeId=");
        sb.append(this.f21494a);
        sb.append(", shoppingMode=");
        sb.append(this.b);
        sb.append(", chips=");
        a.x(sb, this.c, ", includeAvailabilityInfoStatus=", this.d, ", includeProductAvailabilityStates=");
        a.x(sb, this.e, ", includeOfferMinimumSpend=", this.f, ", includePricingFootnote=");
        sb.append(this.g);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
