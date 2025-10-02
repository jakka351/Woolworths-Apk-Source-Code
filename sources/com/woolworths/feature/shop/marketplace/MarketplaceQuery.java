package com.woolworths.feature.shop.marketplace;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName;
import au.com.woolworths.shop.graphql.type.adapter.MarketplaceLandingPageName_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.marketplace.adapter.MarketplaceQuery_ResponseAdapter;
import com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment;
import com.woolworths.feature.shop.marketplace.fragment.SectionItem;
import com.woolworths.feature.shop.marketplace.fragment.TileItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Data;", "Data", "Marketplace", "Header", "Item", "Footer", "Tab", "Section", "OnMarketplacePersonalised", "Item1", "OnPromotionBanner", "OnMarketplaceHorizontalList", "Item2", "OnProductCard", "OnCategories", "Item3", "OnBrands", "Item4", "OnSellers", "Item5", "Companion", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f19795a;
    public final boolean b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final boolean g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Marketplace f19796a;

        public Data(Marketplace marketplace) {
            this.f19796a = marketplace;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19796a, ((Data) obj).f19796a);
        }

        public final int hashCode() {
            return this.f19796a.hashCode();
        }

        public final String toString() {
            return "Data(marketplace=" + this.f19796a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Footer;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f19797a;
        public final String b;
        public final String c;

        public Footer(String str, String str2, String str3) {
            this.f19797a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f19797a, footer.f19797a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19797a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Footer(title=", this.f19797a, ", subtitle=", this.b, ", linkUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Header;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f19798a;
        public final ArrayList b;
        public final Footer c;

        public Header(String str, ArrayList arrayList, Footer footer) {
            this.f19798a = str;
            this.b = arrayList;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return this.f19798a.equals(header.f19798a) && this.b.equals(header.b) && Intrinsics.c(this.c, header.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f19798a.hashCode() * 31, 31, this.b);
            Footer footer = this.c;
            return iB + (footer == null ? 0 : footer.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("Header(title=", this.f19798a, ", items=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f19799a;
        public final String b;
        public final String c;

        public Item(String str, String str2, String str3) {
            this.f19799a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f19799a, item.f19799a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19799a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Item(title=", this.f19799a, ", description=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item1;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19800a;
        public final OnPromotionBanner b;
        public final OnMarketplaceHorizontalList c;

        public Item1(String __typename, OnPromotionBanner onPromotionBanner, OnMarketplaceHorizontalList onMarketplaceHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            this.f19800a = __typename;
            this.b = onPromotionBanner;
            this.c = onMarketplaceHorizontalList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f19800a, item1.f19800a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19800a.hashCode() * 31;
            OnPromotionBanner onPromotionBanner = this.b;
            int iHashCode2 = (iHashCode + (onPromotionBanner == null ? 0 : onPromotionBanner.hashCode())) * 31;
            OnMarketplaceHorizontalList onMarketplaceHorizontalList = this.c;
            return iHashCode2 + (onMarketplaceHorizontalList != null ? onMarketplaceHorizontalList.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f19800a + ", onPromotionBanner=" + this.b + ", onMarketplaceHorizontalList=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item2;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19801a;
        public final OnProductCard b;

        public Item2(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f19801a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) obj;
            return Intrinsics.c(this.f19801a, item2.f19801a) && Intrinsics.c(this.b, item2.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19801a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "Item2(__typename=" + this.f19801a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item3;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19802a;
        public final String b;
        public final boolean c;
        public final String d;
        public final TileItem e;

        public Item3(String str, String str2, boolean z, String str3, TileItem tileItem) {
            this.f19802a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = tileItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item3)) {
                return false;
            }
            Item3 item3 = (Item3) obj;
            return Intrinsics.c(this.f19802a, item3.f19802a) && Intrinsics.c(this.b, item3.b) && this.c == item3.c && Intrinsics.c(this.d, item3.d) && Intrinsics.c(this.e, item3.e);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f19802a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item3(__typename=", this.f19802a, ", id=", this.b, ", isFinalLevel=");
            au.com.woolworths.android.onesite.a.y(", source=", this.d, ", tileItem=", sbV, this.c);
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item4;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19803a;
        public final String b;
        public final TileItem c;

        public Item4(String str, String str2, TileItem tileItem) {
            this.f19803a = str;
            this.b = str2;
            this.c = tileItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item4)) {
                return false;
            }
            Item4 item4 = (Item4) obj;
            return Intrinsics.c(this.f19803a, item4.f19803a) && Intrinsics.c(this.b, item4.b) && Intrinsics.c(this.c, item4.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19803a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item4(__typename=", this.f19803a, ", logoUrl=", this.b, ", tileItem=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Item5;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19804a;
        public final TileItem b;

        public Item5(String str, TileItem tileItem) {
            this.f19804a = str;
            this.b = tileItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item5)) {
                return false;
            }
            Item5 item5 = (Item5) obj;
            return Intrinsics.c(this.f19804a, item5.f19804a) && Intrinsics.c(this.b, item5.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19804a.hashCode() * 31);
        }

        public final String toString() {
            return "Item5(__typename=" + this.f19804a + ", tileItem=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Marketplace;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Marketplace {

        /* renamed from: a, reason: collision with root package name */
        public final String f19805a;
        public final Header b;
        public final ArrayList c;
        public final ArrayList d;

        public Marketplace(String str, Header header, ArrayList arrayList, ArrayList arrayList2) {
            this.f19805a = str;
            this.b = header;
            this.c = arrayList;
            this.d = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Marketplace)) {
                return false;
            }
            Marketplace marketplace = (Marketplace) obj;
            return Intrinsics.c(this.f19805a, marketplace.f19805a) && Intrinsics.c(this.b, marketplace.b) && this.c.equals(marketplace.c) && this.d.equals(marketplace.d);
        }

        public final int hashCode() {
            String str = this.f19805a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Header header = this.b;
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode + (header != null ? header.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            return "Marketplace(buttonTitle=" + this.f19805a + ", header=" + this.b + ", tabs=" + this.c + ", sections=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnBrands;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBrands {

        /* renamed from: a, reason: collision with root package name */
        public final String f19806a;
        public final MarketplaceLandingPageName b;
        public final ArrayList c;
        public final SectionItem d;

        public OnBrands(String str, MarketplaceLandingPageName marketplaceLandingPageName, ArrayList arrayList, SectionItem sectionItem) {
            this.f19806a = str;
            this.b = marketplaceLandingPageName;
            this.c = arrayList;
            this.d = sectionItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBrands)) {
                return false;
            }
            OnBrands onBrands = (OnBrands) obj;
            return this.f19806a.equals(onBrands.f19806a) && this.b == onBrands.b && this.c.equals(onBrands.c) && this.d.equals(onBrands.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((this.b.hashCode() + (this.f19806a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnBrands(__typename=" + this.f19806a + ", pageName=" + this.b + ", items=" + this.c + ", sectionItem=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnCategories;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCategories {

        /* renamed from: a, reason: collision with root package name */
        public final String f19807a;
        public final MarketplaceLandingPageName b;
        public final String c;
        public final ArrayList d;
        public final SectionItem e;

        public OnCategories(String str, MarketplaceLandingPageName marketplaceLandingPageName, String str2, ArrayList arrayList, SectionItem sectionItem) {
            this.f19807a = str;
            this.b = marketplaceLandingPageName;
            this.c = str2;
            this.d = arrayList;
            this.e = sectionItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCategories)) {
                return false;
            }
            OnCategories onCategories = (OnCategories) obj;
            return this.f19807a.equals(onCategories.f19807a) && this.b == onCategories.b && this.c.equals(onCategories.c) && this.d.equals(onCategories.d) && this.e.equals(onCategories.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c((this.b.hashCode() + (this.f19807a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "OnCategories(__typename=" + this.f19807a + ", pageName=" + this.b + ", displayName=" + this.c + ", items=" + this.d + ", sectionItem=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnMarketplaceHorizontalList;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMarketplaceHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19808a;
        public final String b;
        public final ArrayList c;

        public OnMarketplaceHorizontalList(String str, String str2, ArrayList arrayList) {
            this.f19808a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMarketplaceHorizontalList)) {
                return false;
            }
            OnMarketplaceHorizontalList onMarketplaceHorizontalList = (OnMarketplaceHorizontalList) obj;
            return this.f19808a.equals(onMarketplaceHorizontalList.f19808a) && Intrinsics.c(this.b, onMarketplaceHorizontalList.b) && this.c.equals(onMarketplaceHorizontalList.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19808a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnMarketplaceHorizontalList(title=", this.f19808a, ", subtitle=", this.b, ", items="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnMarketplacePersonalised;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMarketplacePersonalised {

        /* renamed from: a, reason: collision with root package name */
        public final MarketplaceLandingPageName f19809a;
        public final String b;
        public final ArrayList c;

        public OnMarketplacePersonalised(MarketplaceLandingPageName marketplaceLandingPageName, String str, ArrayList arrayList) {
            this.f19809a = marketplaceLandingPageName;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMarketplacePersonalised)) {
                return false;
            }
            OnMarketplacePersonalised onMarketplacePersonalised = (OnMarketplacePersonalised) obj;
            return this.f19809a == onMarketplacePersonalised.f19809a && this.b.equals(onMarketplacePersonalised.b) && this.c.equals(onMarketplacePersonalised.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19809a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnMarketplacePersonalised(pageName=");
            sb.append(this.f19809a);
            sb.append(", displayName=");
            sb.append(this.b);
            sb.append(", items=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnProductCard;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19810a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f19810a = str;
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
            return Intrinsics.c(this.f19810a, onProductCard.f19810a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19810a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f19810a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnPromotionBanner;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f19811a;
        public final PromotionBannerFragment b;

        public OnPromotionBanner(String str, PromotionBannerFragment promotionBannerFragment) {
            this.f19811a = str;
            this.b = promotionBannerFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionBanner)) {
                return false;
            }
            OnPromotionBanner onPromotionBanner = (OnPromotionBanner) obj;
            return Intrinsics.c(this.f19811a, onPromotionBanner.f19811a) && Intrinsics.c(this.b, onPromotionBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19811a.hashCode() * 31);
        }

        public final String toString() {
            return "OnPromotionBanner(__typename=" + this.f19811a + ", promotionBannerFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$OnSellers;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSellers {

        /* renamed from: a, reason: collision with root package name */
        public final String f19812a;
        public final MarketplaceLandingPageName b;
        public final ArrayList c;
        public final SectionItem d;

        public OnSellers(String str, MarketplaceLandingPageName marketplaceLandingPageName, ArrayList arrayList, SectionItem sectionItem) {
            this.f19812a = str;
            this.b = marketplaceLandingPageName;
            this.c = arrayList;
            this.d = sectionItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSellers)) {
                return false;
            }
            OnSellers onSellers = (OnSellers) obj;
            return this.f19812a.equals(onSellers.f19812a) && this.b == onSellers.b && this.c.equals(onSellers.c) && this.d.equals(onSellers.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((this.b.hashCode() + (this.f19812a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnSellers(__typename=" + this.f19812a + ", pageName=" + this.b + ", items=" + this.c + ", sectionItem=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Section;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f19813a;
        public final OnMarketplacePersonalised b;
        public final OnCategories c;
        public final OnBrands d;
        public final OnSellers e;

        public Section(String __typename, OnMarketplacePersonalised onMarketplacePersonalised, OnCategories onCategories, OnBrands onBrands, OnSellers onSellers) {
            Intrinsics.h(__typename, "__typename");
            this.f19813a = __typename;
            this.b = onMarketplacePersonalised;
            this.c = onCategories;
            this.d = onBrands;
            this.e = onSellers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f19813a, section.f19813a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d) && Intrinsics.c(this.e, section.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19813a.hashCode() * 31;
            OnMarketplacePersonalised onMarketplacePersonalised = this.b;
            int iHashCode2 = (iHashCode + (onMarketplacePersonalised == null ? 0 : onMarketplacePersonalised.hashCode())) * 31;
            OnCategories onCategories = this.c;
            int iHashCode3 = (iHashCode2 + (onCategories == null ? 0 : onCategories.hashCode())) * 31;
            OnBrands onBrands = this.d;
            int iHashCode4 = (iHashCode3 + (onBrands == null ? 0 : onBrands.hashCode())) * 31;
            OnSellers onSellers = this.e;
            return iHashCode4 + (onSellers != null ? onSellers.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f19813a + ", onMarketplacePersonalised=" + this.b + ", onCategories=" + this.c + ", onBrands=" + this.d + ", onSellers=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/MarketplaceQuery$Tab;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tab {

        /* renamed from: a, reason: collision with root package name */
        public final MarketplaceLandingPageName f19814a;
        public final String b;

        public Tab(MarketplaceLandingPageName marketplaceLandingPageName, String str) {
            this.f19814a = marketplaceLandingPageName;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            return this.f19814a == tab.f19814a && Intrinsics.c(this.b, tab.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19814a.hashCode() * 31);
        }

        public final String toString() {
            return "Tab(pageName=" + this.f19814a + ", title=" + this.b + ")";
        }
    }

    public MarketplaceQuery(Optional optional, boolean z, boolean z2) {
        this.f19795a = optional;
        this.b = z;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = absent;
        this.g = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(MarketplaceQuery_ResponseAdapter.Data.f19815a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query Marketplace($pageNames: [MarketplaceLandingPageName!], $isHowItWorksEnabled: Boolean!, $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { marketplace(pageNames: $pageNames) { buttonTitle @include(if: $isHowItWorksEnabled) header @include(if: $isHowItWorksEnabled) { title items { title description imageUrl } footer { title subtitle linkUrl } } tabs { pageName title } sections { __typename ... on MarketplacePersonalised { pageName displayName items { __typename ... on PromotionBanner { __typename ...promotionBannerFragment } ... on MarketplaceHorizontalList { title subtitle items { __typename ... on ProductCard { __typename ...productCard } } } } } ... on Categories { __typename ...sectionItem pageName displayName items { __typename id isFinalLevel source ...tileItem } } ... on Brands { __typename ...sectionItem pageName items { __typename ...tileItem logoUrl } } ... on Sellers { __typename ...sectionItem pageName items { __typename ...tileItem } } } } }  fragment promotionBannerFragment on PromotionBanner { banner { displayType message iconUrl bannerTitle: title action { placement type label url } } promotionContent { __typename ... on PromotionMarkdownContent { promotionMarkdownTitle promotionMarkdownText } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment sectionItem on MarketplaceSectionItem { displayName channel facet }  fragment tileItem on MarketplaceItem { title imageUrl }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceQuery)) {
            return false;
        }
        MarketplaceQuery marketplaceQuery = (MarketplaceQuery) obj;
        return this.f19795a.equals(marketplaceQuery.f19795a) && this.b == marketplaceQuery.b && this.c.equals(marketplaceQuery.c) && this.d.equals(marketplaceQuery.d) && this.e.equals(marketplaceQuery.e) && this.f.equals(marketplaceQuery.f) && this.g == marketplaceQuery.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, b.e(this.f19795a.hashCode() * 31, 31, this.b), 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c0aa8e71393e28542d17e25ba152f6e44f391a6bb7c1b33e87976b7effb6113c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "Marketplace";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f19795a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("pageNames");
            Adapters.d(Adapters.b(Adapters.a(MarketplaceLandingPageName_ResponseAdapter.f12085a))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("isHowItWorksEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketplaceQuery(pageNames=");
        sb.append(this.f19795a);
        sb.append(", isHowItWorksEnabled=");
        sb.append(this.b);
        sb.append(", includeProductAvailabilityStates=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeOfferMinimumSpend=", this.d, ", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.e, ", includePricingFootnote=", this.f, ", includeLowestPrice14Days=");
        return a.k(")", sb, this.g);
    }
}
