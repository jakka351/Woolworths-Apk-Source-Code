package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CataloguePromotionDetailsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CataloguePromotionDetailsInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11160a;
    public final ShoppingModeType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;

    public CataloguePromotionDetailsInput(Optional optional, ShoppingModeType shoppingModeType, Optional optional2, Optional optional3, Optional.Present present, Optional.Present present2, Optional optional4) {
        this.f11160a = optional;
        this.b = shoppingModeType;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.c = absent;
        this.d = absent;
        this.e = optional2;
        this.f = optional3;
        this.g = present;
        this.h = present2;
        this.i = optional4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CataloguePromotionDetailsInput)) {
            return false;
        }
        CataloguePromotionDetailsInput cataloguePromotionDetailsInput = (CataloguePromotionDetailsInput) obj;
        return Intrinsics.c(this.f11160a, cataloguePromotionDetailsInput.f11160a) && this.b == cataloguePromotionDetailsInput.b && Intrinsics.c(this.c, cataloguePromotionDetailsInput.c) && Intrinsics.c(this.d, cataloguePromotionDetailsInput.d) && Intrinsics.c(this.e, cataloguePromotionDetailsInput.e) && Intrinsics.c(this.f, cataloguePromotionDetailsInput.f) && Intrinsics.c(this.g, cataloguePromotionDetailsInput.g) && Intrinsics.c(this.h, cataloguePromotionDetailsInput.h) && Intrinsics.c(this.i, cataloguePromotionDetailsInput.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + a.c(this.h, a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, (this.b.hashCode() + (this.f11160a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CataloguePromotionDetailsInput(storeId=");
        sb.append(this.f11160a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", pagePath=");
        a.x(sb, this.c, ", sneakWarningPath=", this.d, ", productId=");
        a.x(sb, this.e, ", offerId=", this.f, ", pageSize=");
        a.x(sb, this.g, ", pageNumber=", this.h, ", requestSource=");
        return a.o(sb, this.i, ")");
    }
}
