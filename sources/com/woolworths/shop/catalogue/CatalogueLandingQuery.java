package com.woolworths.shop.catalogue;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.adapter.CatalogueLandingQuery_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueActionableCard;
import com.woolworths.shop.catalogue.fragment.CatalogueLandingCard;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$Data;", "Data", "CatalogueLanding", "Item", "OnCatalogueLandingHeader", "OnCatalogueLandingCategoryCard", "OnActionableCard", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueLandingQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f21664a;
    public final ShoppingModeType b;
    public final boolean c;
    public final Optional.Present d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$CatalogueLanding;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CatalogueLanding {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21665a;

        public CatalogueLanding(ArrayList arrayList) {
            this.f21665a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CatalogueLanding) && this.f21665a.equals(((CatalogueLanding) obj).f21665a);
        }

        public final int hashCode() {
            return this.f21665a.hashCode();
        }

        public final String toString() {
            return a.k("CatalogueLanding(items=", ")", this.f21665a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CatalogueLanding f21666a;

        public Data(CatalogueLanding catalogueLanding) {
            this.f21666a = catalogueLanding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21666a, ((Data) obj).f21666a);
        }

        public final int hashCode() {
            CatalogueLanding catalogueLanding = this.f21666a;
            if (catalogueLanding == null) {
                return 0;
            }
            return catalogueLanding.f21665a.hashCode();
        }

        public final String toString() {
            return "Data(catalogueLanding=" + this.f21666a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21667a;
        public final OnCatalogueLandingHeader b;
        public final OnCatalogueLandingCategoryCard c;
        public final OnActionableCard d;

        public Item(String __typename, OnCatalogueLandingHeader onCatalogueLandingHeader, OnCatalogueLandingCategoryCard onCatalogueLandingCategoryCard, OnActionableCard onActionableCard) {
            Intrinsics.h(__typename, "__typename");
            this.f21667a = __typename;
            this.b = onCatalogueLandingHeader;
            this.c = onCatalogueLandingCategoryCard;
            this.d = onActionableCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21667a, item.f21667a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21667a.hashCode() * 31;
            OnCatalogueLandingHeader onCatalogueLandingHeader = this.b;
            int iHashCode2 = (iHashCode + (onCatalogueLandingHeader == null ? 0 : onCatalogueLandingHeader.f21670a.hashCode())) * 31;
            OnCatalogueLandingCategoryCard onCatalogueLandingCategoryCard = this.c;
            int iHashCode3 = (iHashCode2 + (onCatalogueLandingCategoryCard == null ? 0 : onCatalogueLandingCategoryCard.hashCode())) * 31;
            OnActionableCard onActionableCard = this.d;
            return iHashCode3 + (onActionableCard != null ? onActionableCard.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21667a + ", onCatalogueLandingHeader=" + this.b + ", onCatalogueLandingCategoryCard=" + this.c + ", onActionableCard=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$OnActionableCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21668a;
        public final CatalogueActionableCard b;

        public OnActionableCard(String str, CatalogueActionableCard catalogueActionableCard) {
            this.f21668a = str;
            this.b = catalogueActionableCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f21668a, onActionableCard.f21668a) && Intrinsics.c(this.b, onActionableCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21668a.hashCode() * 31);
        }

        public final String toString() {
            return "OnActionableCard(__typename=" + this.f21668a + ", catalogueActionableCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$OnCatalogueLandingCategoryCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueLandingCategoryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21669a;
        public final String b;
        public final CatalogueLandingCard c;

        public OnCatalogueLandingCategoryCard(String str, String str2, CatalogueLandingCard catalogueLandingCard) {
            this.f21669a = str;
            this.b = str2;
            this.c = catalogueLandingCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueLandingCategoryCard)) {
                return false;
            }
            OnCatalogueLandingCategoryCard onCatalogueLandingCategoryCard = (OnCatalogueLandingCategoryCard) obj;
            return Intrinsics.c(this.f21669a, onCatalogueLandingCategoryCard.f21669a) && Intrinsics.c(this.b, onCatalogueLandingCategoryCard.b) && Intrinsics.c(this.c, onCatalogueLandingCategoryCard.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21669a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCatalogueLandingCategoryCard(__typename=", this.f21669a, ", id=", this.b, ", catalogueLandingCard=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueLandingQuery$OnCatalogueLandingHeader;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueLandingHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f21670a;

        public OnCatalogueLandingHeader(String str) {
            this.f21670a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCatalogueLandingHeader) && Intrinsics.c(this.f21670a, ((OnCatalogueLandingHeader) obj).f21670a);
        }

        public final int hashCode() {
            return this.f21670a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCatalogueLandingHeader(headerImage=", this.f21670a, ")");
        }
    }

    public CatalogueLandingQuery(Optional.Present present, ShoppingModeType shoppingModeType, boolean z, Optional.Present present2) {
        this.f21664a = present;
        this.b = shoppingModeType;
        this.c = z;
        this.d = present2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CatalogueLandingQuery_ResponseAdapter.Data.f21717a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CatalogueLanding($storeId: String, $shoppingMode: ShoppingModeType!, $includeActionableCard: Boolean!, $supportedLinks: [String!]) { catalogueLanding(storeId: $storeId, mode: $shoppingMode, supportedLinks: $supportedLinks) { items { __typename ... on CatalogueLandingHeader { headerImage } ... on CatalogueLandingCategoryCard { __typename ...catalogueLandingCard id } ... on ActionableCard @include(if: $includeActionableCard) { __typename ...catalogueActionableCard } } } }  fragment catalogueLandingCard on CatalogueLandingCard { title image }  fragment catalogueActionableCard on ActionableCard { image altText cardHeight link }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueLandingQuery)) {
            return false;
        }
        CatalogueLandingQuery catalogueLandingQuery = (CatalogueLandingQuery) obj;
        return this.f21664a.equals(catalogueLandingQuery.f21664a) && this.b == catalogueLandingQuery.b && this.c == catalogueLandingQuery.c && this.d.equals(catalogueLandingQuery.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.e((this.b.hashCode() + (this.f21664a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "41561d95b17558f39a3f9d8cb6cfe286c5d919da7c79870c0f6088ba36e6e2e5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CatalogueLanding";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("storeId");
        Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, this.f21664a);
        jsonWriter.F1("shoppingMode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("includeActionableCard");
        d.B(this.c, Adapters.f, jsonWriter, customScalarAdapters, "supportedLinks");
        Adapters.d(Adapters.b(Adapters.a(Adapters.f13493a))).toJson(jsonWriter, customScalarAdapters, this.d);
    }

    public final String toString() {
        return "CatalogueLandingQuery(storeId=" + this.f21664a + ", shoppingMode=" + this.b + ", includeActionableCard=" + this.c + ", supportedLinks=" + this.d + ")";
    }
}
