package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.OrderHelpItemType;
import au.com.woolworths.shop.graphql.type.OrderPaymentDetailsItemAmountStyle;
import au.com.woolworths.shop.graphql.type.OrderProductListProductPriceStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.GetYourGroceriesQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0019\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Data;", "Data", "OrderProductList", "Filter", "Item", "Feed", "OnOrderProductListProductCategory", "OnOrderProductListProduct", "Substitution", "OnOrderProductListFulfilmentStatus", "OnBroadcastBanner", "PaymentDetails", "Total", "SubTotal", "MarketSubtotal", "SavingsAndReward", "PaymentMethod", "Discount", "Refund", "RefundTotal", "HelpList", "Item1", "HelpItem", "ContactTimes", "ContactItem", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetYourGroceriesQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f19979a;
    public final Optional b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$ContactItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19980a;
        public final String b;

        public ContactItem(String str, String str2) {
            this.f19980a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactItem)) {
                return false;
            }
            ContactItem contactItem = (ContactItem) obj;
            return Intrinsics.c(this.f19980a, contactItem.f19980a) && Intrinsics.c(this.b, contactItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19980a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("ContactItem(day=", this.f19980a, ", time=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$ContactTimes;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactTimes {

        /* renamed from: a, reason: collision with root package name */
        public final String f19981a;
        public final String b;
        public final ArrayList c;

        public ContactTimes(String str, String str2, ArrayList arrayList) {
            this.f19981a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactTimes)) {
                return false;
            }
            ContactTimes contactTimes = (ContactTimes) obj;
            return this.f19981a.equals(contactTimes.f19981a) && this.b.equals(contactTimes.b) && this.c.equals(contactTimes.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19981a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("ContactTimes(title=", this.f19981a, ", subTitle=", this.b, ", contactItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OrderProductList f19982a;

        public Data(OrderProductList orderProductList) {
            this.f19982a = orderProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19982a, ((Data) obj).f19982a);
        }

        public final int hashCode() {
            return this.f19982a.hashCode();
        }

        public final String toString() {
            return "Data(orderProductList=" + this.f19982a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Discount;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Discount {

        /* renamed from: a, reason: collision with root package name */
        public final String f19983a;
        public final String b;

        public Discount(String str, String str2) {
            this.f19983a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            return Intrinsics.c(this.f19983a, discount.f19983a) && Intrinsics.c(this.b, discount.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19983a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Discount(title=", this.f19983a, ", amount=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Feed;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f19984a;
        public final OnOrderProductListProductCategory b;
        public final OnOrderProductListProduct c;
        public final OnOrderProductListFulfilmentStatus d;
        public final OnBroadcastBanner e;

        public Feed(String __typename, OnOrderProductListProductCategory onOrderProductListProductCategory, OnOrderProductListProduct onOrderProductListProduct, OnOrderProductListFulfilmentStatus onOrderProductListFulfilmentStatus, OnBroadcastBanner onBroadcastBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f19984a = __typename;
            this.b = onOrderProductListProductCategory;
            this.c = onOrderProductListProduct;
            this.d = onOrderProductListFulfilmentStatus;
            this.e = onBroadcastBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f19984a, feed.f19984a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c) && Intrinsics.c(this.d, feed.d) && Intrinsics.c(this.e, feed.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19984a.hashCode() * 31;
            OnOrderProductListProductCategory onOrderProductListProductCategory = this.b;
            int iHashCode2 = (iHashCode + (onOrderProductListProductCategory == null ? 0 : onOrderProductListProductCategory.f19994a.hashCode())) * 31;
            OnOrderProductListProduct onOrderProductListProduct = this.c;
            int iHashCode3 = (iHashCode2 + (onOrderProductListProduct == null ? 0 : onOrderProductListProduct.hashCode())) * 31;
            OnOrderProductListFulfilmentStatus onOrderProductListFulfilmentStatus = this.d;
            int iHashCode4 = (iHashCode3 + (onOrderProductListFulfilmentStatus == null ? 0 : onOrderProductListFulfilmentStatus.hashCode())) * 31;
            OnBroadcastBanner onBroadcastBanner = this.e;
            return iHashCode4 + (onBroadcastBanner != null ? onBroadcastBanner.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f19984a + ", onOrderProductListProductCategory=" + this.b + ", onOrderProductListProduct=" + this.c + ", onOrderProductListFulfilmentStatus=" + this.d + ", onBroadcastBanner=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Filter;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19985a;

        public Filter(ArrayList arrayList) {
            this.f19985a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Filter) && this.f19985a.equals(((Filter) obj).f19985a);
        }

        public final int hashCode() {
            return this.f19985a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("Filter(items=", ")", this.f19985a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$HelpItem;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HelpItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19986a;
        public final String b;
        public final String c;
        public final String d;
        public final OrderHelpItemType e;

        public HelpItem(String str, String str2, String str3, String str4, OrderHelpItemType orderHelpItemType) {
            this.f19986a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = orderHelpItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpItem)) {
                return false;
            }
            HelpItem helpItem = (HelpItem) obj;
            return Intrinsics.c(this.f19986a, helpItem.f19986a) && Intrinsics.c(this.b, helpItem.b) && Intrinsics.c(this.c, helpItem.c) && Intrinsics.c(this.d, helpItem.d) && this.e == helpItem.e;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f19986a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("HelpItem(iconUrl=", this.f19986a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", url=", this.d, ", itemType=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$HelpList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HelpList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19987a;
        public final String b;
        public final String c;
        public final List d;
        public final ContactTimes e;

        public HelpList(ArrayList arrayList, String str, String str2, List list, ContactTimes contactTimes) {
            this.f19987a = arrayList;
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = contactTimes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpList)) {
                return false;
            }
            HelpList helpList = (HelpList) obj;
            return this.f19987a.equals(helpList.f19987a) && Intrinsics.c(this.b, helpList.b) && Intrinsics.c(this.c, helpList.c) && Intrinsics.c(this.d, helpList.d) && Intrinsics.c(this.e, helpList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19987a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.d;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            ContactTimes contactTimes = this.e;
            return iHashCode4 + (contactTimes != null ? contactTimes.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HelpList(items=");
            sb.append(this.f19987a);
            sb.append(", imageUrl=");
            sb.append(this.b);
            sb.append(", helpTitle=");
            au.com.woolworths.android.onesite.a.B(sb, this.c, ", helpItems=", this.d, ", contactTimes=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Item;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f19988a;
        public final String b;
        public final boolean c;
        public final int d;

        public Item(String str, int i, String str2, boolean z) {
            this.f19988a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f19988a, item.f19988a) && Intrinsics.c(this.b, item.b) && this.c == item.c && this.d == item.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + b.e(b.c(this.f19988a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item(key=", this.f19988a, ", title=", this.b, ", isApplied=");
            sbV.append(this.c);
            sbV.append(", count=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Item1;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19989a;
        public final String b;
        public final String c;
        public final String d;
        public final OrderHelpItemType e;

        public Item1(String str, String str2, String str3, String str4, OrderHelpItemType orderHelpItemType) {
            this.f19989a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = orderHelpItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f19989a, item1.f19989a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c) && Intrinsics.c(this.d, item1.d) && this.e == item1.e;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f19989a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item1(iconUrl=", this.f19989a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", url=", this.d, ", itemType=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$MarketSubtotal;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketSubtotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f19990a;
        public final String b;

        public MarketSubtotal(String str, String str2) {
            this.f19990a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketSubtotal)) {
                return false;
            }
            MarketSubtotal marketSubtotal = (MarketSubtotal) obj;
            return Intrinsics.c(this.f19990a, marketSubtotal.f19990a) && Intrinsics.c(this.b, marketSubtotal.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19990a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("MarketSubtotal(title=", this.f19990a, ", amount=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnBroadcastBanner;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f19991a;
        public final String b;
        public final String c;
        public final BroadcastBannerType d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;
        public final String i;

        public OnBroadcastBanner(String str, String str2, String str3, BroadcastBannerType broadcastBannerType, String str4, String str5, String str6, Boolean bool, String str7) {
            this.f19991a = str;
            this.b = str2;
            this.c = str3;
            this.d = broadcastBannerType;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = bool;
            this.i = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBroadcastBanner)) {
                return false;
            }
            OnBroadcastBanner onBroadcastBanner = (OnBroadcastBanner) obj;
            return Intrinsics.c(this.f19991a, onBroadcastBanner.f19991a) && Intrinsics.c(this.b, onBroadcastBanner.b) && Intrinsics.c(this.c, onBroadcastBanner.c) && this.d == onBroadcastBanner.d && Intrinsics.c(this.e, onBroadcastBanner.e) && Intrinsics.c(this.f, onBroadcastBanner.f) && Intrinsics.c(this.g, onBroadcastBanner.g) && Intrinsics.c(this.h, onBroadcastBanner.h) && Intrinsics.c(this.i, onBroadcastBanner.i);
        }

        public final int hashCode() {
            int iHashCode = this.f19991a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iC = b.c((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e);
            String str3 = this.f;
            int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.h;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str5 = this.i;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnBroadcastBanner(title=", this.f19991a, ", subtitle=", this.b, ", deeplink=");
            sbV.append(this.c);
            sbV.append(", type=");
            sbV.append(this.d);
            sbV.append(", imageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", actionLabel=", this.f, ", analyticsLabel=");
            au.com.woolworths.android.onesite.a.A(sbV, this.g, ", dismissible=", this.h, ", bannerId=");
            return a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnOrderProductListFulfilmentStatus;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderProductListFulfilmentStatus {

        /* renamed from: a, reason: collision with root package name */
        public final String f19992a;
        public final String b;

        public OnOrderProductListFulfilmentStatus(String str, String str2) {
            this.f19992a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderProductListFulfilmentStatus)) {
                return false;
            }
            OnOrderProductListFulfilmentStatus onOrderProductListFulfilmentStatus = (OnOrderProductListFulfilmentStatus) obj;
            return Intrinsics.c(this.f19992a, onOrderProductListFulfilmentStatus.f19992a) && Intrinsics.c(this.b, onOrderProductListFulfilmentStatus.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19992a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("OnOrderProductListFulfilmentStatus(title=", this.f19992a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnOrderProductListProduct;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderProductListProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f19993a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final OrderProductListProductPriceStyle g;
        public final ArrayList h;

        public OnOrderProductListProduct(String str, String str2, String str3, String str4, String str5, String str6, OrderProductListProductPriceStyle orderProductListProductPriceStyle, ArrayList arrayList) {
            this.f19993a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = orderProductListProductPriceStyle;
            this.h = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderProductListProduct)) {
                return false;
            }
            OnOrderProductListProduct onOrderProductListProduct = (OnOrderProductListProduct) obj;
            return this.f19993a.equals(onOrderProductListProduct.f19993a) && this.b.equals(onOrderProductListProduct.b) && Intrinsics.c(this.c, onOrderProductListProduct.c) && this.d.equals(onOrderProductListProduct.d) && this.e.equals(onOrderProductListProduct.e) && this.f.equals(onOrderProductListProduct.f) && this.g == onOrderProductListProduct.g && this.h.equals(onOrderProductListProduct.h);
        }

        public final int hashCode() {
            int iC = b.c(this.f19993a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.h.hashCode() + ((this.g.hashCode() + b.c(b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnOrderProductListProduct(productId=", this.f19993a, ", name=", this.b, ", productImage=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", quantityTitle=", this.d, ", quantityValue=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", priceLabel=", this.f, ", priceStyle=");
            sbV.append(this.g);
            sbV.append(", substitutions=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OnOrderProductListProductCategory;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderProductListProductCategory {

        /* renamed from: a, reason: collision with root package name */
        public final String f19994a;

        public OnOrderProductListProductCategory(String str) {
            this.f19994a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOrderProductListProductCategory) && Intrinsics.c(this.f19994a, ((OnOrderProductListProductCategory) obj).f19994a);
        }

        public final int hashCode() {
            return this.f19994a.hashCode();
        }

        public final String toString() {
            return a.h("OnOrderProductListProductCategory(title=", this.f19994a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$OrderProductList;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderProductList {

        /* renamed from: a, reason: collision with root package name */
        public final Filter f19995a;
        public final ArrayList b;
        public final String c;
        public final String d;
        public final String e;
        public final PaymentDetails f;
        public final HelpList g;

        public OrderProductList(Filter filter, ArrayList arrayList, String str, String str2, String str3, PaymentDetails paymentDetails, HelpList helpList) {
            this.f19995a = filter;
            this.b = arrayList;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = paymentDetails;
            this.g = helpList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderProductList)) {
                return false;
            }
            OrderProductList orderProductList = (OrderProductList) obj;
            return Intrinsics.c(this.f19995a, orderProductList.f19995a) && this.b.equals(orderProductList.b) && this.c.equals(orderProductList.c) && this.d.equals(orderProductList.d) && this.e.equals(orderProductList.e) && this.f.equals(orderProductList.f) && Intrinsics.c(this.g, orderProductList.g);
        }

        public final int hashCode() {
            Filter filter = this.f19995a;
            int iHashCode = (this.f.hashCode() + b.c(b.c(b.c(androidx.compose.ui.input.pointer.a.b((filter == null ? 0 : filter.f19985a.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
            HelpList helpList = this.g;
            return iHashCode + (helpList != null ? helpList.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrderProductList(filter=");
            sb.append(this.f19995a);
            sb.append(", feed=");
            sb.append(this.b);
            sb.append(", countLabel=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", totalLabel=", this.d, ", totalValue=");
            sb.append(this.e);
            sb.append(", paymentDetails=");
            sb.append(this.f);
            sb.append(", helpList=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$PaymentDetails;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentDetails {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19996a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;
        public final ArrayList g;
        public final ArrayList h;
        public final String i;

        public PaymentDetails(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, String str) {
            this.f19996a = arrayList;
            this.b = arrayList2;
            this.c = arrayList3;
            this.d = arrayList4;
            this.e = arrayList5;
            this.f = arrayList6;
            this.g = arrayList7;
            this.h = arrayList8;
            this.i = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentDetails)) {
                return false;
            }
            PaymentDetails paymentDetails = (PaymentDetails) obj;
            return this.f19996a.equals(paymentDetails.f19996a) && this.b.equals(paymentDetails.b) && this.c.equals(paymentDetails.c) && this.d.equals(paymentDetails.d) && this.e.equals(paymentDetails.e) && this.f.equals(paymentDetails.f) && this.g.equals(paymentDetails.g) && this.h.equals(paymentDetails.h) && Intrinsics.c(this.i, paymentDetails.i);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(this.f19996a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            String str = this.i;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentDetails(total=");
            sb.append(this.f19996a);
            sb.append(", subTotal=");
            sb.append(this.b);
            sb.append(", marketSubtotal=");
            sb.append(this.c);
            sb.append(", savingsAndRewards=");
            sb.append(this.d);
            sb.append(", paymentMethods=");
            sb.append(this.e);
            sb.append(", discounts=");
            sb.append(this.f);
            sb.append(", refunds=");
            sb.append(this.g);
            sb.append(", refundTotal=");
            sb.append(this.h);
            sb.append(", disclaimer=");
            return a.o(sb, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$PaymentMethod;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f19997a;
        public final String b;
        public final String c;

        public PaymentMethod(String str, String str2, String str3) {
            this.f19997a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return Intrinsics.c(this.f19997a, paymentMethod.f19997a) && Intrinsics.c(this.b, paymentMethod.b) && Intrinsics.c(this.c, paymentMethod.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19997a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.o(a.v("PaymentMethod(title=", this.f19997a, ", icon=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Refund;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Refund {

        /* renamed from: a, reason: collision with root package name */
        public final String f19998a;
        public final OrderPaymentDetailsItemAmountStyle b;
        public final String c;

        public Refund(String str, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle, String str2) {
            this.f19998a = str;
            this.b = orderPaymentDetailsItemAmountStyle;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj;
            return Intrinsics.c(this.f19998a, refund.f19998a) && this.b == refund.b && Intrinsics.c(this.c, refund.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19998a.hashCode() * 31;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.b;
            return this.c.hashCode() + ((iHashCode + (orderPaymentDetailsItemAmountStyle == null ? 0 : orderPaymentDetailsItemAmountStyle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Refund(amount=");
            sb.append(this.f19998a);
            sb.append(", amountStyle=");
            sb.append(this.b);
            sb.append(", title=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$RefundTotal;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefundTotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f19999a;
        public final OrderPaymentDetailsItemAmountStyle b;
        public final String c;

        public RefundTotal(String str, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle, String str2) {
            this.f19999a = str;
            this.b = orderPaymentDetailsItemAmountStyle;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefundTotal)) {
                return false;
            }
            RefundTotal refundTotal = (RefundTotal) obj;
            return Intrinsics.c(this.f19999a, refundTotal.f19999a) && this.b == refundTotal.b && Intrinsics.c(this.c, refundTotal.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19999a.hashCode() * 31;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.b;
            return this.c.hashCode() + ((iHashCode + (orderPaymentDetailsItemAmountStyle == null ? 0 : orderPaymentDetailsItemAmountStyle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RefundTotal(amount=");
            sb.append(this.f19999a);
            sb.append(", amountStyle=");
            sb.append(this.b);
            sb.append(", title=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$SavingsAndReward;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavingsAndReward {

        /* renamed from: a, reason: collision with root package name */
        public final String f20000a;
        public final String b;
        public final String c;
        public final OrderPaymentDetailsItemAmountStyle d;

        public SavingsAndReward(String str, String str2, String str3, OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle) {
            this.f20000a = str;
            this.b = str2;
            this.c = str3;
            this.d = orderPaymentDetailsItemAmountStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsAndReward)) {
                return false;
            }
            SavingsAndReward savingsAndReward = (SavingsAndReward) obj;
            return Intrinsics.c(this.f20000a, savingsAndReward.f20000a) && Intrinsics.c(this.b, savingsAndReward.b) && Intrinsics.c(this.c, savingsAndReward.c) && this.d == savingsAndReward.d;
        }

        public final int hashCode() {
            int iC = b.c(this.f20000a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = this.d;
            return iHashCode + (orderPaymentDetailsItemAmountStyle != null ? orderPaymentDetailsItemAmountStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("SavingsAndReward(title=", this.f20000a, ", amount=", this.b, ", amountIcon=");
            sbV.append(this.c);
            sbV.append(", amountStyle=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$SubTotal;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubTotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f20001a;
        public final String b;

        public SubTotal(String str, String str2) {
            this.f20001a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubTotal)) {
                return false;
            }
            SubTotal subTotal = (SubTotal) obj;
            return Intrinsics.c(this.f20001a, subTotal.f20001a) && Intrinsics.c(this.b, subTotal.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20001a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("SubTotal(title=", this.f20001a, ", amount=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Substitution;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Substitution {

        /* renamed from: a, reason: collision with root package name */
        public final String f20002a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final boolean k;

        public Substitution(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, boolean z2) {
            this.f20002a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Substitution)) {
                return false;
            }
            Substitution substitution = (Substitution) obj;
            return Intrinsics.c(this.f20002a, substitution.f20002a) && Intrinsics.c(this.b, substitution.b) && Intrinsics.c(this.c, substitution.c) && Intrinsics.c(this.d, substitution.d) && this.e == substitution.e && Intrinsics.c(this.f, substitution.f) && Intrinsics.c(this.g, substitution.g) && Intrinsics.c(this.h, substitution.h) && Intrinsics.c(this.i, substitution.i) && Intrinsics.c(this.j, substitution.j) && this.k == substitution.k;
        }

        public final int hashCode() {
            int iHashCode = this.f20002a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.k) + b.c(b.c(b.c(b.c(b.c(b.e(b.c(b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Substitution(productId=", this.f20002a, ", productImage=", this.b, ", title=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", priceLabel=", this.d, ", priceMatched=");
            au.com.woolworths.android.onesite.a.y(", productName=", this.f, ", productLabel=", sbV, this.e);
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", priceMatchedLabel=", this.h, ", quantityTitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.i, ", quantityValue=", this.j, ", showRating=");
            return a.k(")", sbV, this.k);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/GetYourGroceriesQuery$Total;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Total {

        /* renamed from: a, reason: collision with root package name */
        public final String f20003a;
        public final String b;

        public Total(String str, String str2) {
            this.f20003a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Total)) {
                return false;
            }
            Total total = (Total) obj;
            return Intrinsics.c(this.f20003a, total.f20003a) && Intrinsics.c(this.b, total.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20003a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Total(title=", this.f20003a, ", amount=", this.b, ")");
        }
    }

    public GetYourGroceriesQuery(Optional optional, String orderId, boolean z) {
        Intrinsics.h(orderId, "orderId");
        this.f19979a = orderId;
        this.b = optional;
        this.c = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(GetYourGroceriesQuery_ResponseAdapter.Data.f20152a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query getYourGroceries($orderId: ID!, $fulfilmentFilterKey: String, $includeAsyncChat: Boolean!) { orderProductList(orderId: $orderId, fulfilmentFilterKey: $fulfilmentFilterKey) { filter { items { key title isApplied count } } feed { __typename ... on OrderProductListProductCategory { title } ... on OrderProductListProduct { productId name productImage quantityTitle quantityValue priceLabel priceStyle substitutions { productId productImage title priceLabel priceMatched productName productLabel priceMatchedLabel quantityTitle quantityValue showRating } } ... on OrderProductListFulfilmentStatus { title message } ... on BroadcastBanner { title subtitle deeplink type imageUrl actionLabel analyticsLabel dismissible bannerId } } countLabel totalLabel totalValue paymentDetails { total { title amount } subTotal { title amount } marketSubtotal { title amount } savingsAndRewards { title amount amountIcon amountStyle } paymentMethods { title icon amount } discounts { title amount } refunds { amount amountStyle title } refundTotal { amount amountStyle title } disclaimer } helpList: help { items { iconUrl title subtitle url itemType } imageUrl @include(if: $includeAsyncChat) helpTitle @include(if: $includeAsyncChat) helpItems @include(if: $includeAsyncChat) { iconUrl title subtitle url itemType } contactTimes @include(if: $includeAsyncChat) { title subTitle contactItems { day time } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetYourGroceriesQuery)) {
            return false;
        }
        GetYourGroceriesQuery getYourGroceriesQuery = (GetYourGroceriesQuery) obj;
        return Intrinsics.c(this.f19979a, getYourGroceriesQuery.f19979a) && Intrinsics.c(this.b, getYourGroceriesQuery.b) && this.c == getYourGroceriesQuery.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f19979a.hashCode() * 31, 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "1b1727c016e9252ee4af04099758f578a8bfa3b1175f677dcc225e60970c38d2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "getYourGroceries";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("orderId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f19979a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("fulfilmentFilterKey");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("includeAsyncChat");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
    }

    public final String toString() {
        return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.r("GetYourGroceriesQuery(orderId=", this.f19979a, ", fulfilmentFilterKey=", this.b, ", includeAsyncChat="), this.c);
    }
}
