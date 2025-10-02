package com.woolworths.shop.checkout;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.OrderConfirmationQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001c\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Data;", "Data", "OrderConfirmation", "Content", "OnOrderConfirmationBannerImage", "OnOrderConfirmationHeader", "Order", "OnCheckoutOrderAddresses", "AddressSection", "OnCheckoutOrderGroceryAddress", "OnCheckoutOrderMarketAddress", "SellerInfo", "InsetBanner", "OnCheckoutOrderSummary", "Section", "Message", "OnIconTextBanner", "OnOrderConfirmationFooterText", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnOrderConfirmationCMOBroadcastBanner", "Banner", "OrderInfo", "ProductsInfo", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OrderConfirmationQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21844a;
    public final Optional b;
    public final Optional c;
    public final boolean d;
    public final boolean e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$AddressSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddressSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21845a;
        public final OnCheckoutOrderGroceryAddress b;
        public final OnCheckoutOrderMarketAddress c;

        public AddressSection(String __typename, OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress, OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress) {
            Intrinsics.h(__typename, "__typename");
            this.f21845a = __typename;
            this.b = onCheckoutOrderGroceryAddress;
            this.c = onCheckoutOrderMarketAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressSection)) {
                return false;
            }
            AddressSection addressSection = (AddressSection) obj;
            return Intrinsics.c(this.f21845a, addressSection.f21845a) && Intrinsics.c(this.b, addressSection.b) && Intrinsics.c(this.c, addressSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21845a.hashCode() * 31;
            OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutOrderGroceryAddress == null ? 0 : onCheckoutOrderGroceryAddress.hashCode())) * 31;
            OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = this.c;
            return iHashCode2 + (onCheckoutOrderMarketAddress != null ? onCheckoutOrderMarketAddress.hashCode() : 0);
        }

        public final String toString() {
            return "AddressSection(__typename=" + this.f21845a + ", onCheckoutOrderGroceryAddress=" + this.b + ", onCheckoutOrderMarketAddress=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Banner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21846a;
        public final String b;
        public final BroadcastBannerType c;
        public final String d;
        public final String e;
        public final String f;
        public final Boolean g;

        public Banner(BroadcastBannerType broadcastBannerType, Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.f21846a = str;
            this.b = str2;
            this.c = broadcastBannerType;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return Intrinsics.c(this.f21846a, banner.f21846a) && Intrinsics.c(this.b, banner.b) && this.c == banner.c && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e) && Intrinsics.c(this.f, banner.f) && Intrinsics.c(this.g, banner.g);
        }

        public final int hashCode() {
            int iHashCode = this.f21846a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Banner(title=", this.f21846a, ", subtitle=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", imageUrl=");
            sbV.append(this.d);
            sbV.append(", analyticsLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", bannerId=", this.f, ", dismissible=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Content;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f21847a;
        public final OnOrderConfirmationBannerImage b;
        public final OnOrderConfirmationHeader c;
        public final OnCheckoutOrderAddresses d;
        public final OnCheckoutOrderSummary e;
        public final OnIconTextBanner f;
        public final OnOrderConfirmationFooterText g;
        public final OnActionableCard h;
        public final OnGoogleAdBannerCard i;
        public final OnUniversalInventoryContainer j;
        public final OnOrderConfirmationCMOBroadcastBanner k;

        public Content(String __typename, OnOrderConfirmationBannerImage onOrderConfirmationBannerImage, OnOrderConfirmationHeader onOrderConfirmationHeader, OnCheckoutOrderAddresses onCheckoutOrderAddresses, OnCheckoutOrderSummary onCheckoutOrderSummary, OnIconTextBanner onIconTextBanner, OnOrderConfirmationFooterText onOrderConfirmationFooterText, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnUniversalInventoryContainer onUniversalInventoryContainer, OnOrderConfirmationCMOBroadcastBanner onOrderConfirmationCMOBroadcastBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f21847a = __typename;
            this.b = onOrderConfirmationBannerImage;
            this.c = onOrderConfirmationHeader;
            this.d = onCheckoutOrderAddresses;
            this.e = onCheckoutOrderSummary;
            this.f = onIconTextBanner;
            this.g = onOrderConfirmationFooterText;
            this.h = onActionableCard;
            this.i = onGoogleAdBannerCard;
            this.j = onUniversalInventoryContainer;
            this.k = onOrderConfirmationCMOBroadcastBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f21847a, content.f21847a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && Intrinsics.c(this.f, content.f) && Intrinsics.c(this.g, content.g) && Intrinsics.c(this.h, content.h) && Intrinsics.c(this.i, content.i) && Intrinsics.c(this.j, content.j) && Intrinsics.c(this.k, content.k);
        }

        public final int hashCode() {
            int iHashCode = this.f21847a.hashCode() * 31;
            OnOrderConfirmationBannerImage onOrderConfirmationBannerImage = this.b;
            int iHashCode2 = (iHashCode + (onOrderConfirmationBannerImage == null ? 0 : onOrderConfirmationBannerImage.hashCode())) * 31;
            OnOrderConfirmationHeader onOrderConfirmationHeader = this.c;
            int iHashCode3 = (iHashCode2 + (onOrderConfirmationHeader == null ? 0 : onOrderConfirmationHeader.hashCode())) * 31;
            OnCheckoutOrderAddresses onCheckoutOrderAddresses = this.d;
            int iHashCode4 = (iHashCode3 + (onCheckoutOrderAddresses == null ? 0 : onCheckoutOrderAddresses.hashCode())) * 31;
            OnCheckoutOrderSummary onCheckoutOrderSummary = this.e;
            int iHashCode5 = (iHashCode4 + (onCheckoutOrderSummary == null ? 0 : onCheckoutOrderSummary.hashCode())) * 31;
            OnIconTextBanner onIconTextBanner = this.f;
            int iHashCode6 = (iHashCode5 + (onIconTextBanner == null ? 0 : onIconTextBanner.hashCode())) * 31;
            OnOrderConfirmationFooterText onOrderConfirmationFooterText = this.g;
            int iHashCode7 = (iHashCode6 + (onOrderConfirmationFooterText == null ? 0 : onOrderConfirmationFooterText.f21863a.hashCode())) * 31;
            OnActionableCard onActionableCard = this.h;
            int iHashCode8 = (iHashCode7 + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnGoogleAdBannerCard onGoogleAdBannerCard = this.i;
            int iHashCode9 = (iHashCode8 + (onGoogleAdBannerCard == null ? 0 : onGoogleAdBannerCard.hashCode())) * 31;
            OnUniversalInventoryContainer onUniversalInventoryContainer = this.j;
            int iHashCode10 = (iHashCode9 + (onUniversalInventoryContainer == null ? 0 : onUniversalInventoryContainer.hashCode())) * 31;
            OnOrderConfirmationCMOBroadcastBanner onOrderConfirmationCMOBroadcastBanner = this.k;
            return iHashCode10 + (onOrderConfirmationCMOBroadcastBanner != null ? onOrderConfirmationCMOBroadcastBanner.hashCode() : 0);
        }

        public final String toString() {
            return "Content(__typename=" + this.f21847a + ", onOrderConfirmationBannerImage=" + this.b + ", onOrderConfirmationHeader=" + this.c + ", onCheckoutOrderAddresses=" + this.d + ", onCheckoutOrderSummary=" + this.e + ", onIconTextBanner=" + this.f + ", onOrderConfirmationFooterText=" + this.g + ", onActionableCard=" + this.h + ", onGoogleAdBannerCard=" + this.i + ", onUniversalInventoryContainer=" + this.j + ", onOrderConfirmationCMOBroadcastBanner=" + this.k + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OrderConfirmation f21848a;

        public Data(OrderConfirmation orderConfirmation) {
            this.f21848a = orderConfirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21848a, ((Data) obj).f21848a);
        }

        public final int hashCode() {
            OrderConfirmation orderConfirmation = this.f21848a;
            if (orderConfirmation == null) {
                return 0;
            }
            return orderConfirmation.hashCode();
        }

        public final String toString() {
            return "Data(orderConfirmation=" + this.f21848a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$GoogleAdBannerCard;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21849a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final AdBannerNativeSize f;
        public final GoogleAdCustomTargeting g;
        public final String h;
        public final Boolean i;

        public GoogleAdBannerCard(String str, String str2, String str3, boolean z, String str4, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str5, Boolean bool) {
            this.f21849a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = adBannerNativeSize;
            this.g = googleAdCustomTargeting;
            this.h = str5;
            this.i = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleAdBannerCard)) {
                return false;
            }
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) obj;
            return Intrinsics.c(this.f21849a, googleAdBannerCard.f21849a) && Intrinsics.c(this.b, googleAdBannerCard.b) && Intrinsics.c(this.c, googleAdBannerCard.c) && this.d == googleAdBannerCard.d && Intrinsics.c(this.e, googleAdBannerCard.e) && this.f == googleAdBannerCard.f && Intrinsics.c(this.g, googleAdBannerCard.g) && Intrinsics.c(this.h, googleAdBannerCard.h) && Intrinsics.c(this.i, googleAdBannerCard.i);
        }

        public final int hashCode() {
            int iE = b.e(b.c(b.c(this.f21849a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            int iHashCode = (this.f.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.g;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str2 = this.h;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.i;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("GoogleAdBannerCard(__typename=", this.f21849a, ", adUnit=", this.b, ", nativeCustomTemplateId=");
            d.A(this.c, ", iabSpec=", ", iabSize=", sbV, this.d);
            sbV.append(this.e);
            sbV.append(", height=");
            sbV.append(this.f);
            sbV.append(", targeting=");
            sbV.append(this.g);
            sbV.append(", correlator=");
            sbV.append(this.h);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$InsetBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f21850a;
        public final String b;

        public InsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f21850a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner)) {
                return false;
            }
            InsetBanner insetBanner = (InsetBanner) obj;
            return this.f21850a == insetBanner.f21850a && Intrinsics.c(this.b, insetBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21850a.hashCode() * 31);
        }

        public final String toString() {
            return "InsetBanner(displayType=" + this.f21850a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Message;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f21851a;
        public final String b;

        public Message(String str, String str2) {
            this.f21851a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.c(this.f21851a, message.f21851a) && Intrinsics.c(this.b, message.b);
        }

        public final int hashCode() {
            String str = this.f21851a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("Message(title=", this.f21851a, ", body=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$NextBestAction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21852a;
        public final OnActionableCard1 b;

        public NextBestAction(String __typename, OnActionableCard1 onActionableCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f21852a = __typename;
            this.b = onActionableCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) obj;
            return Intrinsics.c(this.f21852a, nextBestAction.f21852a) && Intrinsics.c(this.b, nextBestAction.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21852a.hashCode() * 31;
            OnActionableCard1 onActionableCard1 = this.b;
            return iHashCode + (onActionableCard1 == null ? 0 : onActionableCard1.hashCode());
        }

        public final String toString() {
            return "NextBestAction(__typename=" + this.f21852a + ", onActionableCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnActionableCard;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21853a;
        public final String b;
        public final String c;
        public final String d;
        public final CardHeight e;
        public final TealiumAnalytics f;
        public final Boolean g;

        public OnActionableCard(String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f21853a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cardHeight;
            this.f = tealiumAnalytics;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f21853a, onActionableCard.f21853a) && Intrinsics.c(this.b, onActionableCard.b) && Intrinsics.c(this.c, onActionableCard.c) && Intrinsics.c(this.d, onActionableCard.d) && this.e == onActionableCard.e && Intrinsics.c(this.f, onActionableCard.f) && Intrinsics.c(this.g, onActionableCard.g);
        }

        public final int hashCode() {
            int iB = d.b(this.e, b.c(b.c(b.c(this.f21853a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnActionableCard(__typename=", this.f21853a, ", link=", this.b, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", altText=", this.d, ", cardHeight=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnActionableCard1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21854a;
        public final String b;
        public final String c;
        public final String d;
        public final CardHeight e;
        public final TealiumAnalytics f;
        public final Boolean g;

        public OnActionableCard1(String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f21854a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cardHeight;
            this.f = tealiumAnalytics;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) obj;
            return Intrinsics.c(this.f21854a, onActionableCard1.f21854a) && Intrinsics.c(this.b, onActionableCard1.b) && Intrinsics.c(this.c, onActionableCard1.c) && Intrinsics.c(this.d, onActionableCard1.d) && this.e == onActionableCard1.e && Intrinsics.c(this.f, onActionableCard1.f) && Intrinsics.c(this.g, onActionableCard1.g);
        }

        public final int hashCode() {
            int iB = d.b(this.e, b.c(b.c(b.c(this.f21854a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnActionableCard1(__typename=", this.f21854a, ", link=", this.b, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", altText=", this.d, ", cardHeight=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderAddresses;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderAddresses {

        /* renamed from: a, reason: collision with root package name */
        public final String f21855a;
        public final ArrayList b;
        public final InsetBanner c;

        public OnCheckoutOrderAddresses(String str, ArrayList arrayList, InsetBanner insetBanner) {
            this.f21855a = str;
            this.b = arrayList;
            this.c = insetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderAddresses)) {
                return false;
            }
            OnCheckoutOrderAddresses onCheckoutOrderAddresses = (OnCheckoutOrderAddresses) obj;
            return this.f21855a.equals(onCheckoutOrderAddresses.f21855a) && this.b.equals(onCheckoutOrderAddresses.b) && Intrinsics.c(this.c, onCheckoutOrderAddresses.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f21855a.hashCode() * 31, 31, this.b);
            InsetBanner insetBanner = this.c;
            return iB + (insetBanner == null ? 0 : insetBanner.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnCheckoutOrderAddresses(title=", this.f21855a, ", addressSections=", ", insetBanner=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderGroceryAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderGroceryAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f21856a;
        public final String b;
        public final String c;
        public final String d;

        public OnCheckoutOrderGroceryAddress(String str, String str2, String str3, String str4) {
            this.f21856a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderGroceryAddress)) {
                return false;
            }
            OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = (OnCheckoutOrderGroceryAddress) obj;
            return Intrinsics.c(this.f21856a, onCheckoutOrderGroceryAddress.f21856a) && Intrinsics.c(this.b, onCheckoutOrderGroceryAddress.b) && Intrinsics.c(this.c, onCheckoutOrderGroceryAddress.c) && Intrinsics.c(this.d, onCheckoutOrderGroceryAddress.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f21856a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnCheckoutOrderGroceryAddress(title=", this.f21856a, ", addressText=", this.b, ", imageUrl="), this.c, ", fulfilmentWindow=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderMarketAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderMarketAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f21857a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public OnCheckoutOrderMarketAddress(String str, String str2, String str3, ArrayList arrayList) {
            this.f21857a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderMarketAddress)) {
                return false;
            }
            OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = (OnCheckoutOrderMarketAddress) obj;
            return this.f21857a.equals(onCheckoutOrderMarketAddress.f21857a) && this.b.equals(onCheckoutOrderMarketAddress.b) && this.c.equals(onCheckoutOrderMarketAddress.c) && this.d.equals(onCheckoutOrderMarketAddress.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f21857a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutOrderMarketAddress(title=", this.f21857a, ", addressText=", this.b, ", imageUrl=");
            sbV.append(this.c);
            sbV.append(", sellerInfo=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnCheckoutOrderSummary;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f21858a;
        public final String b;
        public final ArrayList c;

        public OnCheckoutOrderSummary(String str, String str2, ArrayList arrayList) {
            this.f21858a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderSummary)) {
                return false;
            }
            OnCheckoutOrderSummary onCheckoutOrderSummary = (OnCheckoutOrderSummary) obj;
            return this.f21858a.equals(onCheckoutOrderSummary.f21858a) && Intrinsics.c(this.b, onCheckoutOrderSummary.b) && this.c.equals(onCheckoutOrderSummary.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21858a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnCheckoutOrderSummary(title=", this.f21858a, ", summaryText=", this.b, ", sections="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnGoogleAdBannerCard;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21859a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final AdBannerNativeSize f;
        public final GoogleAdCustomTargeting g;
        public final Boolean h;

        public OnGoogleAdBannerCard(String str, String str2, boolean z, String str3, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str4, Boolean bool) {
            this.f21859a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = adBannerNativeSize;
            this.g = googleAdCustomTargeting;
            this.h = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGoogleAdBannerCard)) {
                return false;
            }
            OnGoogleAdBannerCard onGoogleAdBannerCard = (OnGoogleAdBannerCard) obj;
            return Intrinsics.c(this.f21859a, onGoogleAdBannerCard.f21859a) && Intrinsics.c(this.b, onGoogleAdBannerCard.b) && Intrinsics.c(this.c, onGoogleAdBannerCard.c) && this.d == onGoogleAdBannerCard.d && Intrinsics.c(this.e, onGoogleAdBannerCard.e) && this.f == onGoogleAdBannerCard.f && Intrinsics.c(this.g, onGoogleAdBannerCard.g) && Intrinsics.c(this.h, onGoogleAdBannerCard.h);
        }

        public final int hashCode() {
            int iE = b.e(b.c(b.c(this.f21859a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            int iHashCode = (this.f.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.g;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            Boolean bool = this.h;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnGoogleAdBannerCard(__typename=", this.f21859a, ", adUnit=", this.b, ", nativeCustomTemplateId=");
            d.A(this.c, ", iabSpec=", ", iabSize=", sbV, this.d);
            sbV.append(this.e);
            sbV.append(", height=");
            sbV.append(this.f);
            sbV.append(", targeting=");
            sbV.append(this.g);
            sbV.append(", _excluded=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnIconTextBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnIconTextBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21860a;
        public final String b;

        public OnIconTextBanner(String str, String str2) {
            this.f21860a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnIconTextBanner)) {
                return false;
            }
            OnIconTextBanner onIconTextBanner = (OnIconTextBanner) obj;
            return Intrinsics.c(this.f21860a, onIconTextBanner.f21860a) && Intrinsics.c(this.b, onIconTextBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21860a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnIconTextBanner(imageUrl=", this.f21860a, ", title=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationBannerImage;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderConfirmationBannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f21861a;
        public final String b;

        public OnOrderConfirmationBannerImage(String str, String str2) {
            this.f21861a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderConfirmationBannerImage)) {
                return false;
            }
            OnOrderConfirmationBannerImage onOrderConfirmationBannerImage = (OnOrderConfirmationBannerImage) obj;
            return Intrinsics.c(this.f21861a, onOrderConfirmationBannerImage.f21861a) && Intrinsics.c(this.b, onOrderConfirmationBannerImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21861a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnOrderConfirmationBannerImage(imageUrl=", this.f21861a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationCMOBroadcastBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderConfirmationCMOBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Banner f21862a;

        public OnOrderConfirmationCMOBroadcastBanner(Banner banner) {
            this.f21862a = banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOrderConfirmationCMOBroadcastBanner) && Intrinsics.c(this.f21862a, ((OnOrderConfirmationCMOBroadcastBanner) obj).f21862a);
        }

        public final int hashCode() {
            Banner banner = this.f21862a;
            if (banner == null) {
                return 0;
            }
            return banner.hashCode();
        }

        public final String toString() {
            return "OnOrderConfirmationCMOBroadcastBanner(banner=" + this.f21862a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationFooterText;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderConfirmationFooterText {

        /* renamed from: a, reason: collision with root package name */
        public final String f21863a;

        public OnOrderConfirmationFooterText(String str) {
            this.f21863a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOrderConfirmationFooterText) && Intrinsics.c(this.f21863a, ((OnOrderConfirmationFooterText) obj).f21863a);
        }

        public final int hashCode() {
            return this.f21863a.hashCode();
        }

        public final String toString() {
            return a.h("OnOrderConfirmationFooterText(text=", this.f21863a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnOrderConfirmationHeader;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderConfirmationHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f21864a;
        public final String b;
        public final ArrayList c;

        public OnOrderConfirmationHeader(String str, String str2, ArrayList arrayList) {
            this.f21864a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderConfirmationHeader)) {
                return false;
            }
            OnOrderConfirmationHeader onOrderConfirmationHeader = (OnOrderConfirmationHeader) obj;
            return this.f21864a.equals(onOrderConfirmationHeader.f21864a) && this.b.equals(onOrderConfirmationHeader.b) && this.c.equals(onOrderConfirmationHeader.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21864a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnOrderConfirmationHeader(title=", this.f21864a, ", subtitle=", this.b, ", order="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OnUniversalInventoryContainer;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUniversalInventoryContainer {

        /* renamed from: a, reason: collision with root package name */
        public final GoogleAdBannerCard f21865a;
        public final NextBestAction b;

        public OnUniversalInventoryContainer(GoogleAdBannerCard googleAdBannerCard, NextBestAction nextBestAction) {
            this.f21865a = googleAdBannerCard;
            this.b = nextBestAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUniversalInventoryContainer)) {
                return false;
            }
            OnUniversalInventoryContainer onUniversalInventoryContainer = (OnUniversalInventoryContainer) obj;
            return Intrinsics.c(this.f21865a, onUniversalInventoryContainer.f21865a) && Intrinsics.c(this.b, onUniversalInventoryContainer.b);
        }

        public final int hashCode() {
            GoogleAdBannerCard googleAdBannerCard = this.f21865a;
            int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
            NextBestAction nextBestAction = this.b;
            return iHashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0);
        }

        public final String toString() {
            return "OnUniversalInventoryContainer(googleAdBannerCard=" + this.f21865a + ", nextBestAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Order;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Order {

        /* renamed from: a, reason: collision with root package name */
        public final String f21866a;
        public final CheckoutSummaryValueType b;
        public final String c;
        public final CheckoutSummaryValueType d;
        public final String e;

        public Order(String str, CheckoutSummaryValueType checkoutSummaryValueType, String str2, CheckoutSummaryValueType checkoutSummaryValueType2, String str3) {
            this.f21866a = str;
            this.b = checkoutSummaryValueType;
            this.c = str2;
            this.d = checkoutSummaryValueType2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Order)) {
                return false;
            }
            Order order = (Order) obj;
            return Intrinsics.c(this.f21866a, order.f21866a) && this.b == order.b && Intrinsics.c(this.c, order.c) && this.d == order.d && Intrinsics.c(this.e, order.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c((this.b.hashCode() + (this.f21866a.hashCode() * 31)) * 31, 31, this.c)) * 31;
            String str = this.e;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Order(title=");
            sb.append(this.f21866a);
            sb.append(", titleType=");
            sb.append(this.b);
            sb.append(", value=");
            sb.append(this.c);
            sb.append(", valueType=");
            sb.append(this.d);
            sb.append(", imageUrl=");
            return a.o(sb, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OrderConfirmation;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderConfirmation {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21867a;
        public final String b;
        public final OrderInfo c;

        public OrderConfirmation(ArrayList arrayList, String str, OrderInfo orderInfo) {
            this.f21867a = arrayList;
            this.b = str;
            this.c = orderInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderConfirmation)) {
                return false;
            }
            OrderConfirmation orderConfirmation = (OrderConfirmation) obj;
            return this.f21867a.equals(orderConfirmation.f21867a) && Intrinsics.c(this.b, orderConfirmation.b) && this.c.equals(orderConfirmation.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21867a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "OrderConfirmation(content=" + this.f21867a + ", buttonTitle=" + this.b + ", orderInfo=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$OrderInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderInfo {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21868a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final boolean k;
        public final String l;
        public final boolean m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final boolean r;
        public final String s;
        public final String t;
        public final String u;
        public final String v;
        public final String w;
        public final String x;
        public final String y;

        public OrderInfo(ArrayList arrayList, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7, boolean z5, String str8, String str9, String str10, String str11, boolean z6, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
            this.f21868a = arrayList;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = str5;
            this.j = str6;
            this.k = z4;
            this.l = str7;
            this.m = z5;
            this.n = str8;
            this.o = str9;
            this.p = str10;
            this.q = str11;
            this.r = z6;
            this.s = str12;
            this.t = str13;
            this.u = str14;
            this.v = str15;
            this.w = str16;
            this.x = str17;
            this.y = str18;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderInfo)) {
                return false;
            }
            OrderInfo orderInfo = (OrderInfo) obj;
            return this.f21868a.equals(orderInfo.f21868a) && this.b == orderInfo.b && this.c == orderInfo.c && this.d == orderInfo.d && this.e.equals(orderInfo.e) && this.f.equals(orderInfo.f) && this.g.equals(orderInfo.g) && this.h.equals(orderInfo.h) && this.i.equals(orderInfo.i) && this.j.equals(orderInfo.j) && this.k == orderInfo.k && this.l.equals(orderInfo.l) && this.m == orderInfo.m && this.n.equals(orderInfo.n) && this.o.equals(orderInfo.o) && this.p.equals(orderInfo.p) && this.q.equals(orderInfo.q) && this.r == orderInfo.r && this.s.equals(orderInfo.s) && this.t.equals(orderInfo.t) && this.u.equals(orderInfo.u) && this.v.equals(orderInfo.v) && this.w.equals(orderInfo.w) && this.x.equals(orderInfo.x) && this.y.equals(orderInfo.y);
        }

        public final int hashCode() {
            return this.y.hashCode() + b.c(b.c(b.c(b.c(b.c(b.c(b.e(b.c(b.c(b.c(b.c(b.e(b.c(b.e(b.c(b.c(b.c(b.c(b.c(b.c(b.e(b.e(b.e(this.f21868a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrderInfo(productsInfo=");
            sb.append(this.f21868a);
            sb.append(", isDeliveryNow=");
            sb.append(this.b);
            sb.append(", isDirectToBootNow=");
            au.com.woolworths.android.onesite.a.D(sb, this.c, ", isDeliveryUnlimited=", this.d, ", shopperID=");
            androidx.constraintlayout.core.state.a.B(sb, this.e, ", orderNumber=", this.f, ", orderTotal=");
            androidx.constraintlayout.core.state.a.B(sb, this.g, ", deliveryFee=", this.h, ", deliveryCity=");
            androidx.constraintlayout.core.state.a.B(sb, this.i, ", deliveryMethod=", this.j, ", isCrowdSourced=");
            au.com.woolworths.android.onesite.a.y(", packagingFeeLabel=", this.l, ", hasRewards=", sb, this.k);
            au.com.woolworths.android.onesite.a.y(", orderDiscount=", this.n, ", subtotal=", sb, this.m);
            androidx.constraintlayout.core.state.a.B(sb, this.o, ", rewardsCreditsUsed=", this.p, ", fulfilmentMethod=");
            d.A(this.q, ", isEditedOrder=", ", orderReference=", sb, this.r);
            androidx.constraintlayout.core.state.a.B(sb, this.s, ", rewardsDollarsAmount=", this.t, ", storeCreditAmount=");
            androidx.constraintlayout.core.state.a.B(sb, this.u, ", promoCodeCreditAmount=", this.v, ", discountSavingsTotal=");
            androidx.constraintlayout.core.state.a.B(sb, this.w, ", storeCreditCode=", this.x, ", promoCodeValue=");
            return a.o(sb, this.y, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$ProductsInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f21869a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final boolean f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;

        public ProductsInfo(String str, String str2, double d, double d2, double d3, boolean z, String str3, String str4, String str5, String str6) {
            this.f21869a = str;
            this.b = str2;
            this.c = d;
            this.d = d2;
            this.e = d3;
            this.f = z;
            this.g = str3;
            this.h = str4;
            this.i = str5;
            this.j = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsInfo)) {
                return false;
            }
            ProductsInfo productsInfo = (ProductsInfo) obj;
            return Intrinsics.c(this.f21869a, productsInfo.f21869a) && Intrinsics.c(this.b, productsInfo.b) && Double.compare(this.c, productsInfo.c) == 0 && Double.compare(this.d, productsInfo.d) == 0 && Double.compare(this.e, productsInfo.e) == 0 && this.f == productsInfo.f && Intrinsics.c(this.g, productsInfo.g) && Intrinsics.c(this.h, productsInfo.h) && Intrinsics.c(this.i, productsInfo.i) && Intrinsics.c(this.j, productsInfo.j);
        }

        public final int hashCode() {
            int iE = b.e(android.support.v4.media.session.a.a(this.e, android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, b.c(this.f21869a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f);
            String str = this.g;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.h;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.j;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductsInfo(productId=", this.f21869a, ", productName=", this.b, ", price=");
            sbV.append(this.c);
            au.com.woolworths.android.onesite.a.z(sbV, ", quantity=", this.d, ", subtotal=");
            sbV.append(this.e);
            sbV.append(", isAvailable=");
            sbV.append(this.f);
            androidx.constraintlayout.core.state.a.B(sbV, ", sellerName=", this.g, ", brandName=", this.h);
            androidx.constraintlayout.core.state.a.B(sbV, ", dispatchNote=", this.i, ", source=", this.j);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$Section;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f21870a;
        public final CheckoutSummaryValueType b;
        public final String c;
        public final CheckoutSummaryValueType d;
        public final String e;
        public final Message f;

        public Section(String str, CheckoutSummaryValueType checkoutSummaryValueType, String str2, CheckoutSummaryValueType checkoutSummaryValueType2, String str3, Message message) {
            this.f21870a = str;
            this.b = checkoutSummaryValueType;
            this.c = str2;
            this.d = checkoutSummaryValueType2;
            this.e = str3;
            this.f = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f21870a, section.f21870a) && this.b == section.b && Intrinsics.c(this.c, section.c) && this.d == section.d && Intrinsics.c(this.e, section.e) && Intrinsics.c(this.f, section.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c((this.b.hashCode() + (this.f21870a.hashCode() * 31)) * 31, 31, this.c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Message message = this.f;
            return iHashCode2 + (message != null ? message.hashCode() : 0);
        }

        public final String toString() {
            return "Section(title=" + this.f21870a + ", titleType=" + this.b + ", value=" + this.c + ", valueType=" + this.d + ", imageUrl=" + this.e + ", message=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/OrderConfirmationQuery$SellerInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SellerInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f21871a;
        public final String b;

        public SellerInfo(String str, String str2) {
            this.f21871a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellerInfo)) {
                return false;
            }
            SellerInfo sellerInfo = (SellerInfo) obj;
            return Intrinsics.c(this.f21871a, sellerInfo.f21871a) && Intrinsics.c(this.b, sellerInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21871a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("SellerInfo(sellerName=", this.f21871a, ", dispatchNote=", this.b, ")");
        }
    }

    public OrderConfirmationQuery(String orderId, Optional optional, Optional optional2, boolean z, boolean z2) {
        Intrinsics.h(orderId, "orderId");
        this.f21844a = orderId;
        this.b = optional;
        this.c = optional2;
        this.d = z;
        this.e = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OrderConfirmationQuery_ResponseAdapter.Data.f21984a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OrderConfirmation($orderId: String!, $shoppingMode: ShoppingModeType, $supportedLinks: [String!], $includeUniversalInventoryFallback: Boolean!, $includeCmoBanner: Boolean!) { orderConfirmation(orderId: $orderId, shoppingMode: $shoppingMode, supportedLinks: $supportedLinks) { content { __typename ... on OrderConfirmationBannerImage { imageUrl altText } ... on OrderConfirmationHeader { title subtitle order { title titleType value valueType imageUrl } } ... on CheckoutOrderAddresses { title addressSections { __typename ... on CheckoutOrderGroceryAddress { title addressText imageUrl fulfilmentWindow } ... on CheckoutOrderMarketAddress { title addressText imageUrl sellerInfo { sellerName dispatchNote } } } insetBanner { displayType message } } ... on CheckoutOrderSummary { title summaryText sections { title titleType value valueType imageUrl message { title body } } } ... on IconTextBanner { imageUrl title } ... on OrderConfirmationFooterText { text } ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } ... on GoogleAdBannerCard @skip(if: $includeUniversalInventoryFallback) { __typename adUnit nativeCustomTemplateId iabSpec iabSize height targeting _excluded } ... on UniversalInventoryContainer @include(if: $includeUniversalInventoryFallback) { googleAdBannerCard { __typename adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } nextBestAction { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } } } ... on OrderConfirmationCMOBroadcastBanner @include(if: $includeCmoBanner) { banner { title subtitle type imageUrl analyticsLabel bannerId dismissible } } } buttonTitle orderInfo { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote source } isDeliveryNow isDirectToBootNow isDeliveryUnlimited shopperID orderNumber orderTotal deliveryFee deliveryCity deliveryMethod isCrowdSourced packagingFeeLabel hasRewards orderDiscount subtotal rewardsCreditsUsed fulfilmentMethod isEditedOrder orderReference rewardsDollarsAmount storeCreditAmount promoCodeCreditAmount discountSavingsTotal storeCreditCode promoCodeValue } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderConfirmationQuery)) {
            return false;
        }
        OrderConfirmationQuery orderConfirmationQuery = (OrderConfirmationQuery) obj;
        return Intrinsics.c(this.f21844a, orderConfirmationQuery.f21844a) && Intrinsics.c(this.b, orderConfirmationQuery.b) && Intrinsics.c(this.c, orderConfirmationQuery.c) && this.d == orderConfirmationQuery.d && this.e == orderConfirmationQuery.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f21844a.hashCode() * 31, 31), 31), 31, this.d);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "015957968adca9100787d871c9b732ffd1550ee89d094de10f571a1270f95689";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OrderConfirmation";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.f21844a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("shoppingMode");
            Adapters.d(Adapters.b(ShoppingModeType_ResponseAdapter.f12118a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(adapters$StringAdapter$1))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        jsonWriter.F1("includeUniversalInventoryFallback");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeCmoBanner");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("OrderConfirmationQuery(orderId=", this.f21844a, ", shoppingMode=", this.b, ", supportedLinks=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sbR, this.c, ", includeUniversalInventoryFallback=", this.d, ", includeCmoBanner=");
        return a.k(")", sbR, this.e);
    }
}
