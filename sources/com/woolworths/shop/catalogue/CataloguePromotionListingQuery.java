package com.woolworths.shop.catalogue;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.adapter.CataloguePromotionListingQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Data;", "Data", "CataloguePromotionListing", "Header", "Item", "OnProductCard", "OnProductHeroCard", "ProductHeroCardProduct", "OnCataloguePromotionGroup", "CataloguePromotionGroupBadge", "CataloguePromotionGroupItem", "OnProductCard1", "OnProductHeroCard1", "ProductHeroCardProduct1", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CataloguePromotionListingQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21685a;
    public final ShoppingModeType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final boolean k;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$CataloguePromotionGroupBadge;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CataloguePromotionGroupBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f21686a;
        public final String b;

        public CataloguePromotionGroupBadge(String str, String str2) {
            this.f21686a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CataloguePromotionGroupBadge)) {
                return false;
            }
            CataloguePromotionGroupBadge cataloguePromotionGroupBadge = (CataloguePromotionGroupBadge) obj;
            return Intrinsics.c(this.f21686a, cataloguePromotionGroupBadge.f21686a) && Intrinsics.c(this.b, cataloguePromotionGroupBadge.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21686a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("CataloguePromotionGroupBadge(altText=", this.f21686a, ", imageUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$CataloguePromotionGroupItem;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CataloguePromotionGroupItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21687a;
        public final OnProductCard1 b;
        public final OnProductHeroCard1 c;

        public CataloguePromotionGroupItem(String __typename, OnProductCard1 onProductCard1, OnProductHeroCard1 onProductHeroCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f21687a = __typename;
            this.b = onProductCard1;
            this.c = onProductHeroCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CataloguePromotionGroupItem)) {
                return false;
            }
            CataloguePromotionGroupItem cataloguePromotionGroupItem = (CataloguePromotionGroupItem) obj;
            return Intrinsics.c(this.f21687a, cataloguePromotionGroupItem.f21687a) && Intrinsics.c(this.b, cataloguePromotionGroupItem.b) && Intrinsics.c(this.c, cataloguePromotionGroupItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21687a.hashCode() * 31;
            OnProductCard1 onProductCard1 = this.b;
            int iHashCode2 = (iHashCode + (onProductCard1 == null ? 0 : onProductCard1.hashCode())) * 31;
            OnProductHeroCard1 onProductHeroCard1 = this.c;
            return iHashCode2 + (onProductHeroCard1 != null ? onProductHeroCard1.f21696a.hashCode() : 0);
        }

        public final String toString() {
            return "CataloguePromotionGroupItem(__typename=" + this.f21687a + ", onProductCard=" + this.b + ", onProductHeroCard=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$CataloguePromotionListing;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CataloguePromotionListing {

        /* renamed from: a, reason: collision with root package name */
        public final Header f21688a;
        public final ArrayList b;

        public CataloguePromotionListing(Header header, ArrayList arrayList) {
            this.f21688a = header;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CataloguePromotionListing)) {
                return false;
            }
            CataloguePromotionListing cataloguePromotionListing = (CataloguePromotionListing) obj;
            return Intrinsics.c(this.f21688a, cataloguePromotionListing.f21688a) && this.b.equals(cataloguePromotionListing.b);
        }

        public final int hashCode() {
            Header header = this.f21688a;
            return this.b.hashCode() + ((header == null ? 0 : header.hashCode()) * 31);
        }

        public final String toString() {
            return "CataloguePromotionListing(header=" + this.f21688a + ", items=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CataloguePromotionListing f21689a;

        public Data(CataloguePromotionListing cataloguePromotionListing) {
            this.f21689a = cataloguePromotionListing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21689a, ((Data) obj).f21689a);
        }

        public final int hashCode() {
            CataloguePromotionListing cataloguePromotionListing = this.f21689a;
            if (cataloguePromotionListing == null) {
                return 0;
            }
            return cataloguePromotionListing.hashCode();
        }

        public final String toString() {
            return "Data(cataloguePromotionListing=" + this.f21689a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Header;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f21690a;
        public final String b;
        public final String c;

        public Header(String str, String str2, String str3) {
            this.f21690a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f21690a, header.f21690a) && Intrinsics.c(this.b, header.b) && Intrinsics.c(this.c, header.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21690a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Header(title=", this.f21690a, ", backgroundImageUrl=", this.b, ", backgroundColor="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21691a;
        public final OnProductCard b;
        public final OnProductHeroCard c;
        public final OnCataloguePromotionGroup d;

        public Item(String __typename, OnProductCard onProductCard, OnProductHeroCard onProductHeroCard, OnCataloguePromotionGroup onCataloguePromotionGroup) {
            Intrinsics.h(__typename, "__typename");
            this.f21691a = __typename;
            this.b = onProductCard;
            this.c = onProductHeroCard;
            this.d = onCataloguePromotionGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21691a, item.f21691a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21691a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            int iHashCode2 = (iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnProductHeroCard onProductHeroCard = this.c;
            int iHashCode3 = (iHashCode2 + (onProductHeroCard == null ? 0 : onProductHeroCard.f21695a.hashCode())) * 31;
            OnCataloguePromotionGroup onCataloguePromotionGroup = this.d;
            return iHashCode3 + (onCataloguePromotionGroup != null ? onCataloguePromotionGroup.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21691a + ", onProductCard=" + this.b + ", onProductHeroCard=" + this.c + ", onCataloguePromotionGroup=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnCataloguePromotionGroup;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCataloguePromotionGroup {

        /* renamed from: a, reason: collision with root package name */
        public final CataloguePromotionGroupBadge f21692a;
        public final String b;
        public final List c;

        public OnCataloguePromotionGroup(CataloguePromotionGroupBadge cataloguePromotionGroupBadge, String str, List list) {
            this.f21692a = cataloguePromotionGroupBadge;
            this.b = str;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCataloguePromotionGroup)) {
                return false;
            }
            OnCataloguePromotionGroup onCataloguePromotionGroup = (OnCataloguePromotionGroup) obj;
            return Intrinsics.c(this.f21692a, onCataloguePromotionGroup.f21692a) && Intrinsics.c(this.b, onCataloguePromotionGroup.b) && Intrinsics.c(this.c, onCataloguePromotionGroup.c);
        }

        public final int hashCode() {
            CataloguePromotionGroupBadge cataloguePromotionGroupBadge = this.f21692a;
            int iHashCode = (cataloguePromotionGroupBadge == null ? 0 : cataloguePromotionGroupBadge.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCataloguePromotionGroup(cataloguePromotionGroupBadge=");
            sb.append(this.f21692a);
            sb.append(", cataloguePromotionGroupBackgroundColor=");
            sb.append(this.b);
            sb.append(", cataloguePromotionGroupItems=");
            return android.support.v4.media.session.a.t(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21693a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21693a = str;
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
            return Intrinsics.c(this.f21693a, onProductCard.f21693a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21693a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21693a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductCard1;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21694a;
        public final ProductCard b;

        public OnProductCard1(String str, ProductCard productCard) {
            this.f21694a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard1)) {
                return false;
            }
            OnProductCard1 onProductCard1 = (OnProductCard1) obj;
            return Intrinsics.c(this.f21694a, onProductCard1.f21694a) && Intrinsics.c(this.b, onProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21694a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard1(__typename=", this.f21694a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductHeroCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductHeroCard {

        /* renamed from: a, reason: collision with root package name */
        public final ProductHeroCardProduct f21695a;

        public OnProductHeroCard(ProductHeroCardProduct productHeroCardProduct) {
            this.f21695a = productHeroCardProduct;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductHeroCard) && Intrinsics.c(this.f21695a, ((OnProductHeroCard) obj).f21695a);
        }

        public final int hashCode() {
            return this.f21695a.hashCode();
        }

        public final String toString() {
            return "OnProductHeroCard(productHeroCardProduct=" + this.f21695a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$OnProductHeroCard1;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductHeroCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final ProductHeroCardProduct1 f21696a;

        public OnProductHeroCard1(ProductHeroCardProduct1 productHeroCardProduct1) {
            this.f21696a = productHeroCardProduct1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductHeroCard1) && Intrinsics.c(this.f21696a, ((OnProductHeroCard1) obj).f21696a);
        }

        public final int hashCode() {
            return this.f21696a.hashCode();
        }

        public final String toString() {
            return "OnProductHeroCard1(productHeroCardProduct=" + this.f21696a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$ProductHeroCardProduct;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductHeroCardProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f21697a;
        public final ProductCard b;

        public ProductHeroCardProduct(String str, ProductCard productCard) {
            this.f21697a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductHeroCardProduct)) {
                return false;
            }
            ProductHeroCardProduct productHeroCardProduct = (ProductHeroCardProduct) obj;
            return Intrinsics.c(this.f21697a, productHeroCardProduct.f21697a) && Intrinsics.c(this.b, productHeroCardProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21697a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("ProductHeroCardProduct(__typename=", this.f21697a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CataloguePromotionListingQuery$ProductHeroCardProduct1;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductHeroCardProduct1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21698a;
        public final ProductCard b;

        public ProductHeroCardProduct1(String str, ProductCard productCard) {
            this.f21698a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductHeroCardProduct1)) {
                return false;
            }
            ProductHeroCardProduct1 productHeroCardProduct1 = (ProductHeroCardProduct1) obj;
            return Intrinsics.c(this.f21698a, productHeroCardProduct1.f21698a) && Intrinsics.c(this.b, productHeroCardProduct1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21698a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("ProductHeroCardProduct1(__typename=", this.f21698a, ", productCard=", this.b, ")");
        }
    }

    public CataloguePromotionListingQuery(Optional.Present present, ShoppingModeType shoppingModeType, Optional.Present present2, Optional.Present present3, Optional.Present present4, Optional.Present present5, boolean z) {
        this.f21685a = present;
        this.b = shoppingModeType;
        this.c = present2;
        this.d = present3;
        this.e = present4;
        this.f = present5;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.g = absent;
        this.h = absent;
        this.i = absent;
        this.j = absent;
        this.k = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CataloguePromotionListingQuery_ResponseAdapter.Data.f21737a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CataloguePromotionListing($storeId: String, $mode: ShoppingModeType!, $pageSize: Int, $pageNumber: Int, $requestSource: String, $pagePath: String, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { cataloguePromotionListing(storeId: $storeId, mode: $mode, pageSize: $pageSize, pageNumber: $pageNumber, requestSource: $requestSource, pagePath: $pagePath) { header { title backgroundImageUrl backgroundColor } items { __typename ... on ProductCard { __typename ...productCard } ... on ProductHeroCard { productHeroCardProduct { __typename ...productCard } } ... on CataloguePromotionGroup { cataloguePromotionGroupBadge { altText imageUrl } cataloguePromotionGroupBackgroundColor cataloguePromotionGroupItems { __typename ... on ProductCard { __typename ...productCard } ... on ProductHeroCard { productHeroCardProduct { __typename ...productCard } } } } } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CataloguePromotionListingQuery)) {
            return false;
        }
        CataloguePromotionListingQuery cataloguePromotionListingQuery = (CataloguePromotionListingQuery) obj;
        return Intrinsics.c(this.f21685a, cataloguePromotionListingQuery.f21685a) && this.b == cataloguePromotionListingQuery.b && Intrinsics.c(this.c, cataloguePromotionListingQuery.c) && Intrinsics.c(this.d, cataloguePromotionListingQuery.d) && Intrinsics.c(this.e, cataloguePromotionListingQuery.e) && Intrinsics.c(this.f, cataloguePromotionListingQuery.f) && Intrinsics.c(this.g, cataloguePromotionListingQuery.g) && Intrinsics.c(this.h, cataloguePromotionListingQuery.h) && Intrinsics.c(this.i, cataloguePromotionListingQuery.i) && Intrinsics.c(this.j, cataloguePromotionListingQuery.j) && this.k == cataloguePromotionListingQuery.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.j, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.i, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.h, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.g, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, (this.b.hashCode() + (this.f21685a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3b2dc2dcc5b0e4350018ebe8e569e5822deeac5b695d12b034f3616e78ca0b24";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CataloguePromotionListing";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21685a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("mode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("pageSize");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("pageNumber");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("requestSource");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        }
        Optional optional5 = this.f;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("pagePath");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        }
        Optional optional6 = this.g;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional7 = this.h;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional8 = this.i;
        if (optional8 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional8);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional9 = this.j;
        if (optional9 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional9);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.k));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CataloguePromotionListingQuery(storeId=");
        sb.append(this.f21685a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", pageSize=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", pageNumber=", this.d, ", requestSource=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.e, ", pagePath=", this.f, ", includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.g, ", includeProductAvailabilityStates=", this.h, ", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.i, ", includePricingFootnote=", this.j, ", includeLowestPrice14Days=");
        return a.k(")", sb, this.k);
    }
}
